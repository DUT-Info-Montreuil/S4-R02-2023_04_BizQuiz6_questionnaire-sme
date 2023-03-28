package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import static org.junit.jupiter.api.Assertions.*;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.BilanStatDTO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl.ServiceQuestionnaireImpl;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl.Mock.TransmettreStatsDTOMockOk;

public class FichierBilanStatsDTOTest {
	private IServiceQuestionnaire qsi;
	
	@BeforeEach
    void setUp() {
        ServiceQuestionnaireImpl service = new ServiceQuestionnaireImpl();
    }
	
	@Test
    public void fichierQuestionnaireChargementCorrectLecture2emeQuestionTest() {
    	qsi = new TransmettreStatsDTOMockOk();	
    	//Bilan du Mock
    	QuestionnaireBO questionnaire = new QuestionnaireBO();
    	questionnaire.setIdQuestionnaire(5);
    	questionnaire.setNbJouerQuestionnaire(8);
    	BilanStatDTO bilanAttendu = qsi.transmettreStat(questionnaire);
    	
    	
    	//Bilan du resulat
    	BilanStatDTO bilanResult = new BilanStatDTO(5, 8);
    	StatsQuestionDTO stat1 = new StatsQuestionDTO();
		StatsQuestionDTO stat2 = new StatsQuestionDTO();
		stat1.incrementerNbCorrecte();
		stat1.incrementerNbCorrecte();
		stat1.incrementerNbJouer();
		bilanResult.addStatsQuestionDTO(stat2);
		bilanResult.addStatsQuestionDTO(stat1);
		
		//test
		assertEquals(bilanAttendu.getIdQuestionnaire(), bilanResult.getIdQuestionnaire());
		assertEquals(bilanAttendu.getNbJouer(), bilanResult.getNbJouer());
		assertEquals(bilanAttendu.getListStatsQuestionDTO().size(), bilanResult.getListStatsQuestionDTO().size());
		assertEquals(bilanAttendu.getListStatsQuestionDTO().get(0).getNbCorrecte(), stat1.getNbCorrecte());
		assertEquals(bilanAttendu.getListStatsQuestionDTO().get(1).getNbCorrecte(), stat2.getNbCorrecte());
		assertEquals(bilanAttendu.getListStatsQuestionDTO().get(0).getNbJouerQuestion(), stat1.getNbJouerQuestion());
		assertEquals(bilanAttendu.getListStatsQuestionDTO().get(1).getNbJouerQuestion(), stat2.getNbJouerQuestion());		
    	
    }

}
