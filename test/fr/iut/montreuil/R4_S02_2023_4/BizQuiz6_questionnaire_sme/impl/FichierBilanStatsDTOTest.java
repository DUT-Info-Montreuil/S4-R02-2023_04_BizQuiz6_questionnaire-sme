package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import static org.junit.jupiter.api.Assertions.*;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.BilanStatDTO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;
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
    	
    	QuestionnaireBO questionnaire = new QuestionnaireBO();
    	QuestionDto q1 = new QuestionDto(5,1,"FR","Quelle est la capitale de la France ?","Paris",1,"La capitale de la France est Paris.","https://fr.wikipedia.org/wiki/Paris");
    	questionnaire.addQuestion(q1);
    	//id = 5
    	questionnaire.setIdQuestionnaire(5);
    	//nbJouer = 8
    	questionnaire.setNbJouerQuestionnaire(8);
    	//nbCorrecte de la question = 1
    	questionnaire.getListeDeQuestion().get(0).getStatsQuestionDTO().incrementerNbCorrecte();
    	//nbJouer de la question = 2
    	questionnaire.getListeDeQuestion().get(0).getStatsQuestionDTO().incrementerNbJouer();
    	questionnaire.getListeDeQuestion().get(0).getStatsQuestionDTO().incrementerNbJouer();   	
    	//Bilan du Mock
    	BilanStatDTO bilanAttendu = qsi.transmettreStat(questionnaire);
    	

		
		//test
		assertEquals(bilanAttendu.getIdQuestionnaire(), 5);
		assertEquals(bilanAttendu.getNbJouer(), 8);
		assertEquals(bilanAttendu.getListStatsQuestionDTO().size(), 1);
		assertEquals(bilanAttendu.getListStatsQuestionDTO().get(0).getNbCorrecte(), 1);
		assertEquals(bilanAttendu.getListStatsQuestionDTO().get(0).getNbJouerQuestion(), 2);		
    }

}
