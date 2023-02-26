package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;

public class test {
	public static void main (String[] args) {
		String chemin = "C:\\eclipse/questionsQuizz_V1.1.csv";
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
		Collections.shuffle(questionnaire.getListeDeQuestion());
		QuestionnaireBO questionnaire10 = new QuestionnaireBO();
		for(int i=0 ; i<10 ; i++) {
			questionnaire10.addQuestion(questionnaire.getListeDeQuestion().get(i));;
		}	
		System.out.println(questionnaire10);
	}
}
