package com.example.courceproj2;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.implementations.ExaminerServiceImpl;
import com.example.courceproj2.service.ExaminerService;
import com.example.courceproj2.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.courceproj2.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    QuestionService mock;
    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void getQuestionTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION1);
        assertEquals(TEST_Q_SET_2, out.getQuestions(1));
    }
}
