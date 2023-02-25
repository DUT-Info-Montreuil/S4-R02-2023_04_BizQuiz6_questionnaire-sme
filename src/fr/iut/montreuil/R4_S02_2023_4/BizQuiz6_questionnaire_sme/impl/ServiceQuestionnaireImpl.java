package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles.IServiceQuestionnaire;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

	@Override
	public QuestionnaireBO chargerListeQuestion(String chemin)  {
		QuestionnaireBO questionnaire = new QuestionnaireBO();
		String line="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(chemin));
			String[] elements;			
			while ((line=br.readLine()) != null) {
				elements = line.split(";");
                questionnaire.addQuestion(new QuestionDto(1, Integer.parseInt(elements[1]), elements[2], elements[3],elements[4],Integer.parseInt(elements[5]),elements[6],elements[7]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("fichier non trouvé");
		} catch (IOException e) {
			System.out.println("erreur de lecture du fichier");
		}
		return questionnaire;
	}

}
