package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto;

public class StatsQuestionDTO {
	private int nbJouerQuestion;
	private int nbCorrecte;
	
	public StatsQuestionDTO() {
		
	}
	
	public int nbJouerQuestion() {
		return this.nbJouerQuestion;
	}
	
	public int getNbCorrecte() {
		return this.nbCorrecte;
	}
	
	public void incrementerNbJouer() {
		nbJouerQuestion++;
	}
	
	public void incrementerNbCorrecte() {
		nbCorrecte++;
	}
	
	
}

