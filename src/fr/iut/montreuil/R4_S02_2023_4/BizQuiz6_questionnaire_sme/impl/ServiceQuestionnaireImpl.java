package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles.IServiceQuestionnaire;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

	@Override
	public QuestionnaireBO chargerListeQuestion(String chemin)  {
		QuestionnaireBO questionnaire = new QuestionnaireBO(); //creation d'un questionnaire
		String line=""; //correspond a une ligne du fichier CSV
		try {
			BufferedReader br = new BufferedReader(new FileReader(chemin));
			String[] elements;	//contient tout les elements de la question		
			while ((line=br.readLine()) != null) {
				elements = line.split(";");
                questionnaire.addQuestion(new QuestionDto(1, Integer.parseInt(elements[1]), elements[2], elements[3],elements[4],Integer.parseInt(elements[5]),elements[6],elements[7]));
                //ajout d'une nouvelle question dans le questionnaire
			}
		} catch (FileNotFoundException e) {
			System.out.println("fichier non trouver");
		} catch (IOException e) {
			System.out.println("erreur de lecture du fichier");
		}
		return questionnaire;
	}
	
	public QuestionnaireBO fournirQuestionnaire10(QuestionnaireBO q) {
		Collections.shuffle(q.getListeDeQuestion());
		QuestionnaireBO questionnaire10 = new QuestionnaireBO();
		for(int i=0 ; i<10 ; i++) {
			questionnaire10.addQuestion(q.getListeDeQuestion().get(i));;
		}	
		return questionnaire10;
		
	}

}
