package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo;

import java.util.ArrayList;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;

public class QuestionnaireBO {
	private ArrayList<QuestionDto> listeDeQuestion;
	private int nbJouerQuestionnaire;
	private int idQuestionnaire;
	private static int idActuel = 0;

	
	public QuestionnaireBO() {
		this.listeDeQuestion = new ArrayList<QuestionDto>();
		this.idQuestionnaire = idActuel++;
		this.nbJouerQuestionnaire = 0;
	}
	
	public void addQuestion(QuestionDto question ) {
		this.listeDeQuestion.add(question);
	}

	public ArrayList<QuestionDto> getListeDeQuestion() {
		return listeDeQuestion;
	}
	
	public int getIdQuestionnaire() {
		return this.idQuestionnaire;
	}
	
	public int getNbJouerQuestionnaire() {
		return this.nbJouerQuestionnaire;
	}
	
	public void implementsNbJouerQuestionnaire() {
		this.nbJouerQuestionnaire++;
	}

	public void setListeDeQuestion(ArrayList<QuestionDto> listeDeQuestion) {
		this.listeDeQuestion = listeDeQuestion;
	}

	public void setNbJouerQuestionnaire(int nbJouerQuestionnaire) {
		this.nbJouerQuestionnaire = nbJouerQuestionnaire;
	}

	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}

	public static void setIdActuel(int idActuel) {
		QuestionnaireBO.idActuel = idActuel;
	}

	@Override
	public String toString() {
		String q="";
		for(QuestionDto question : this.listeDeQuestion) {
			q = q+"\n"+question.toString();
		}
		return q;
	}
	
}
