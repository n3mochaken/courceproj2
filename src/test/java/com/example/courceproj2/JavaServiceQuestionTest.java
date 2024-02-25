package com.example.courceproj2;

import com.example.courceproj2.implementations.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;

import static com.example.courceproj2.Constants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class JavaServiceQuestionTest {
    public final JavaQuestionService out = new JavaQuestionService();
    @Test
    void shouldAddQuest(){
        out.add(QUESTION1,ANSWER1);
        assertTrue(out.getAll().contains(FULL_QUESTION1));
    }
    @Test
    void shouldRemoveQ(){
        out.remove(QUESTION1, ANSWER1);
        assertFalse(out.getAll().contains(FULL_QUESTION1));
    }
    @Test
    void getAllQ(){
        out.add(QUESTION1, ANSWER1);
        out.add(QUESTION2, ANSWER2);
        out.add(QUESTION3, ANSWER3);

        assertTrue(out.getAll().containsAll(List.of(FULL_QUESTION1,FULL_QUESTION2,FULL_QUESTION3)));

    }

    @Test
    void getRandom() {
        out.add(QUESTION1,ANSWER1);
        out.add(QUESTION2,ANSWER2);
        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(1);
        out.serRandom(random);
        assertEquals(FULL_QUESTION1, out.getRandomQuestion());
    }
}
