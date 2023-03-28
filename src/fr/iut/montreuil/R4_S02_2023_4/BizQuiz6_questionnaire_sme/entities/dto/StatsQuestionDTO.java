package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto;

public class StatsQuestionDTO {
	private int nbJouerQuestion;
	private int nbCorrecte;
	
	public StatsQuestionDTO() {
		 this.nbCorrecte = 0;
		 this.nbJouerQuestion = 0;
	}
	
	public int getNbJouerQuestion() {
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

