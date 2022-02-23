package com.example.chatbot2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChatBot {
	private String greeting = "Hello, my name is chat bot";
	private String q1 = "What is your name?";
	private String q2 = "How old are you %s?"; //use svm or basic logistic regression for age, occupation, interests
	private String q3 = "What is your occupation %s?";
	private String q4 = "What are some of your hobbies and interests %s?";
	private String q5 = "What is your favorite book?"; //use PCA for book and genera data
	private String q6 = "What is your favorite genera?";
	private String q7 = "...?";
	private String q8 = "...?";
	private String q9 = "...";

	private Person person;
	Map<String, String> map = new HashMap<>();
	private int questionNumber = 0;
				ArrayList<String> questions = new ArrayList<>(Arrays.asList(greeting, q1,q2,q3,q4,q5,q6,q7,q8,q9));

	public ChatBot() {
		person = new Person();

	}

	public String askByName(String question, String name) {
		String out = String.format(question,name);
		return out;
	}

	public String getQuestion() {
		String q = " ";
		String n = " buddy ";
		if(questionNumber>1) {
			n = person.getName();
		}
		q = askByName(questions.get(questionNumber),n);
		questionNumber++;
		return q;
	}
	public void setPersonData(String data) {
		switch (questionNumber) {
			case (1): person.setName(data);
			case (2): person.setAge(data);
			case (3): person.setOccupation(data);
			case (4): person.setHobbies(data);
			case (5): person.setQuery(data);

		}
	}


}
