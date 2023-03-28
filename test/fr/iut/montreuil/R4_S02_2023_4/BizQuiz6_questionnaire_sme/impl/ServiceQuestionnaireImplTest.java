package fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.R4_S02_2023_4.BizQuiz6_questionnaire_sme.impl.ServiceQuestionnaireImpl;

class ServiceQuestionnaireImplTest {
    private ServiceQuestionnaireImpl service;
    private String validCsvPath;
    private String invalidCsvPath;

    @BeforeEach
    void setUp() {
        service = new ServiceQuestionnaireImpl();

        validCsvPath = "a changer";
        invalidCsvPath = "a changer";
    }

    @Test
    void testChargerListeQuestion_ValidCsv() {
        QuestionnaireBO questionnaire = service.chargerListeQuestion(validCsvPath);
        
        int nbQuestionPrevu = 10;
        assertEquals(nbQuestionPrevu, questionnaire.getListeDeQuestion().size());
    }

    @Test
    void testChargerListeQuestion_InvalidCsv() {
        assertThrows(IOException.class, () -> {
            service.chargerListeQuestion(invalidCsvPath);
        });
    }

    @Test
    void testFournirQuestionnaire10() {
        QuestionnaireBO questionnaire = service.chargerListeQuestion(validCsvPath);
        QuestionnaireBO questionnaire10 = service.fournirQuestionnaire10(questionnaire);
        assertEquals(10, questionnaire10.getListeDeQuestion().size());
    }
}