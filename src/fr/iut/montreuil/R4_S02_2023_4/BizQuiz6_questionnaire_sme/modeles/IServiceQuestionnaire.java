package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles;

import java.io.File;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;

public interface IServiceQuestionnaire {

	public QuestionnaireBO chargerListeQuestion(String chemin); 
	
	public QuestionnaireBO fournirQuestionnaire10(QuestionnaireBO q);
	
	Public BilanStatDTO transmettreStat(QuestionnaireBO qbo);

}
