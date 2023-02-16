package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles.IServiceQuestionnaire;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

	@Override
	public QuestionnaireBO chargerListeQuestion(String chemin)  {
		FileReader fileReader;
		CSVReader fileCSV;
		try {
			fileReader = new FileReader(chemin);
			fileCSV = new CSVReader(fileReader);
			String[] record;
			
			while ((record = fileCSV.readNext()) != null) {
				for(String token: record){
                    System.out.print(token + "\t*********");
                }
                System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
