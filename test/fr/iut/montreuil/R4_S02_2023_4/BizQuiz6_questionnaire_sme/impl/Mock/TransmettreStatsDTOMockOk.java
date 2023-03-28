package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl.Mock;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.BilanStatDTO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles.IServiceQuestionnaire;

public class TransmettreStatsDTOMockOk implements IServiceQuestionnaire{
	
	

	@Override
	public QuestionnaireBO chargerListeQuestion(String chemin) {
		return null;
	}

	@Override
	public QuestionnaireBO fournirQuestionnaire10(QuestionnaireBO q) {
		return null;
	}

	
	


	@Override
	public BilanStatDTO transmettreStat(QuestionnaireBO qbo) {
		BilanStatDTO bilan = new BilanStatDTO(qbo.getIdQuestionnaire(), qbo.getNbJouerQuestionnaire()); 
		StatsQuestionDTO stat1 = new StatsQuestionDTO();
		StatsQuestionDTO stat2 = new StatsQuestionDTO();
		stat1.incrementerNbCorrecte();
		stat1.incrementerNbCorrecte();
		stat1.incrementerNbJouer();
		bilan.addStatsQuestionDTO(stat1);
		bilan.addStatsQuestionDTO(stat2);
		return bilan;
	}

}
