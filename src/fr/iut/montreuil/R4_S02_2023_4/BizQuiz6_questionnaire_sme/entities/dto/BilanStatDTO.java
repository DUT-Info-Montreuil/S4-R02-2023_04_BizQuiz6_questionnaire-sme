package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto;

import java.util.ArrayList;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;

public class BilanStatDTO {
	private ArrayList<StatsQuestionDTO> statsQuestions;
	private int idQuestionnaire;
	private int nbJouer;
	
	public BilanStatDTO(int idQuestionnaire, int nbJouer) {
		this.statsQuestions = new ArrayList<StatsQuestionDTO>();
		this.idQuestionnaire = idQuestionnaire;
		this.nbJouer = nbJouer;
	}
	
	public void addStatsQuestionDTO(StatsQuestionDTO stat){
		//ajoute un StatsQuestionDTO à la liste de statsQuestions
		statsQuestions.add(stat);
	}
	
	
	
	public ArrayList<StatsQuestionDTO> getListStatsQuestionDTO() {
		return statsQuestions;
	}
	
	public int getIdQuestionnaire() {
		return this.idQuestionnaire;
	}
	
	public int getNbJouer() {
		return this.nbJouer;
	}
	
	@Override
	public String toString() {
		return "BilanStatDTO [idQuestionnaire=" + idQuestionnaire + ", nbJouer=" + nbJouer + ", statsQuestions=" + statsQuestions.toString() + "]";
	}

	
}