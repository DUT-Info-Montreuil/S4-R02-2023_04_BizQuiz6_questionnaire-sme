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

	@Override
	public String toString() {
		String q="";
		for(QuestionDto question : this.listeDeQuestion) {
			q = q+"\n"+question.toString();
		}
		return q;
	}
	
}
