package Test;

import com.company.ChatBot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatBotTest {


    @Test
    void testGetQuestion() {
        ChatBot chatBot = new ChatBot();
        String q0 = chatBot.getQuestion(0);
        assertEquals("What is your name?", q0);
        String q20 = chatBot.getQuestion(20);
        assertEquals("I can't think of another question", q20);

    }

    @Test
    void getStatement() {
    }

    @Test
    void testGetStatement() {
    }

    @Test
    void setQuestions() {
    }

    @Test
    void askByName() {
    }

    @Test
    void getPeople() {
    }
}