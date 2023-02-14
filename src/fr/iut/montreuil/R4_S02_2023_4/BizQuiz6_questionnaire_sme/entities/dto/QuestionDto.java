package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto;

public class QuestionDto {

	private int IdQuestionnaire;
	private int numQuestion;
	private String langue;
	private String libelleQuestion;
	private String reponse;
	private int difficulte;
	private String explication;
	private String reference;
	public QuestionDto(int idQuestionnaire, int numQuestion, String langue, String libelleQuestion, String reponse,
			int difficulte, String explication, String reference) {
		
		IdQuestionnaire = idQuestionnaire;
		this.numQuestion = numQuestion;
		this.langue = langue;
		this.libelleQuestion = libelleQuestion;
		this.reponse = reponse;
		this.difficulte = difficulte;
		this.explication = explication;
		this.reference = reference;
	}
	public int getIdQuestionnaire() {
		return IdQuestionnaire;
	}
	public int getNumQuestion() {
		return numQuestion;
	}
	public String getLangue() {
		return langue;
	}
	public String getLibelleQuestion() {
		return libelleQuestion;
	}
	public String getReponse() {
		return reponse;
	}
	public int getDifficulte() {
		return difficulte;
	}
	public String getExplication() {
		return explication;
	}
	public String getReference() {
		return reference;
	}
	public void setIdQuestionnaire(int idQuestionnaire) {
		IdQuestionnaire = idQuestionnaire;
	}
	public void setNumQuestion(int numQuestion) {
		this.numQuestion = numQuestion;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public void setLibelleQuestion(String libelleQuestion) {
		this.libelleQuestion = libelleQuestion;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
	}
	public void setExplication(String explication) {
		this.explication = explication;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
}
