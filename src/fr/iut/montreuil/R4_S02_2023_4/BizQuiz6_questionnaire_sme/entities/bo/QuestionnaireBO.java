package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo;

import java.util.ArrayList;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;

public class QuestionnaireBO {
	private ArrayList<QuestionDto> listeDeQuestion;
	
	public QuestionnaireBO() {
		this.listeDeQuestion = new ArrayList<QuestionDto>();
	}
	
	public void addQuestion(QuestionDto question ) {
		this.listeDeQuestion.add(question);
	}

	public ArrayList<QuestionDto> getListeDeQuestion() {
		return listeDeQuestion;
	}

	@Override
	public String toString() {
		return "QuestionnaireBO [listeDeQuestion=" + listeDeQuestion + "]";
	}
	
}
