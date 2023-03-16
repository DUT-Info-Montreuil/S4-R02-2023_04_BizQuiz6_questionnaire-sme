package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl.Mock;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.dto.QuestionDto;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl.ServiceQuestionnaireImpl;

@ExtendWith(MockitoExtension.class)
class ServiceQuestionnaireImplMock {

    @InjectMocks
    private ServiceQuestionnaireImpl serviceQuestionnaire;

    @Mock
    private BufferedReader bufferedReader;

    private String chemin = "path/to/your/csv/file.csv";

    @BeforeEach
    void setUp() throws IOException {
        when(bufferedReader.readLine())
            .thenReturn("1;1;FR;Quelle est la capitale de la France ?;Paris;1;La capitale de la France est Paris.;https://fr.wikipedia.org/wiki/Paris")
            .thenReturn(null);
    }

    @Test
    void testChargerListeQuestion() throws IOException {
        QuestionnaireBO questionnaire = serviceQuestionnaire.chargerListeQuestion(chemin);

        assertNotNull(questionnaire);
        List<QuestionDto> questions = questionnaire.getListeDeQuestion();
        assertEquals(1, questions.size());

        QuestionDto question = questions.get(0);
        assertEquals(1, question.getIdQuestionnaire());
        assertEquals(1, question.getNumQuestion());
        assertEquals("FR", question.getLangue());
        assertEquals("Quelle est la capitale de la France ?", question.getLibelleQuestion());
        assertEquals("Paris", question.getReponse());
        assertEquals(1, question.getDifficulte());
        assertEquals("La capitale de la France est Paris.", question.getExplication());
        assertEquals("https://fr.wikipedia.org/wiki/Paris", question.getReference());

        verify(bufferedReader, times(2)).readLine();
    }
}