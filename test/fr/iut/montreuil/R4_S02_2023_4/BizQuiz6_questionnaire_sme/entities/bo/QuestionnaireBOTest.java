package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;

class QuestionnaireBOTest {
    private QuestionnaireBO questionnaire;

    @BeforeEach
    void setUp() {
        questionnaire = new QuestionnaireBO();
    }

    @Test
    void testAddQuestion() {
        QuestionDto question = new QuestionDto(1, 1, "FR", "Quelle est la capitale de la France ?", "Paris", 1, "La capitale de la France est Paris.", "https://fr.wikipedia.org/wiki/Paris");
        questionnaire.addQuestion(question);
        assertEquals(1, questionnaire.getListeDeQuestion().size());
    }

    @Test
    void testToString() {
        QuestionDto question1 = new QuestionDto(1, 1, "FR", "Quelle est la capitale de la France ?", "Paris", 1, "La capitale de la France est Paris.", "https://fr.wikipedia.org/wiki/Paris");
        QuestionDto question2 = new QuestionDto(1, 2, "FR", "Quelle est la capitale de l'Espagne ?", "Madrid", 1, "La capitale de l'Espagne est Madrid.", "https://fr.wikipedia.org/wiki/Madrid");
        questionnaire.addQuestion(question1);
        questionnaire.addQuestion(question2);
        
        
        String StringPrevu = "\n" + question1.toString() + "\n" + question2.toString();
        assertEquals(StringPrevu, questionnaire.toString());
    }
}