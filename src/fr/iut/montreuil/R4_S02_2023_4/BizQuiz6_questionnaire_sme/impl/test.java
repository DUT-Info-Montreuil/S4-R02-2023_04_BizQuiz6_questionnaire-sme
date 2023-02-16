package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class test {
	public static void main (String[] args) {
		FileReader fileReader;
		CSVReader fileCSV;
		try {
			fileReader = new FileReader("/home/etudiants/info/psolanki/prive/S4/QD/questionsQuizz_V1.1.csv");
			fileCSV = new CSVReader(fileReader);
			String[] record;
			
			while ((record = fileCSV.readNext()) != null) {
				for(String token: record){
                    System.out.print(token + "\t*********");
                }
                System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("oui");
		} catch (CsvValidationException e) {
			System.out.println("oui2222");
		} catch (IOException e) {
			System.out.println("oui33333");
		}
		
		
	
	}
}
