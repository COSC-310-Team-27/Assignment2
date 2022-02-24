package com.example.chatbot;
import java.util.*;

public class ChatBot {
	private String greeting = "Hello, my name is chat bot";
	private String q1 = "What is your name?";
	private String q2 = "How old are you %s?";
	private String q3 = "What is your occupation %s?";
	private String q4 = "What are some of your hobbies and interests %s?";
	private String q5 = "What can I help you with %s?";
/* cooking - mahir */
	private String q6 = "Would you like to see baking or cooking recipes?";
	private String q7 = "What cuisine is your favourite?";
	private String q8 = "How experienced are you in the kitchen? (Beginner/Intermediate/Advanced)";
	private String q9 = "Do you know any famous chef authors?";
	private String q10 = "What flavour profile suits you best? (Sweet/Savoury/Spicy)";
/* humor - mahir */
	private String q11 = "What type of humor do you enjoy?";
	private String q12 = "Do you know any famous comedian authors?";
	private String q13 = "What cuisine is your favourite?";
/* art - mahir */
	private String q14 = "What type of Art do you enjoy?";
	private String q15 = "Do you know any famous artist authors?";
	private String q16 = "Do you prefer graphic design?";

	private Person person;
	private ArrayList<String> actionHobbies = new ArrayList<>(Arrays.asList("climbing, hiking, skiing, paintball, "));

	public String getQuestion(int i) {
		if (questions.size() >i ) {
			return questions.get(i);
		}
		else
			return " Goodbye";
	}

	public void setQuestions(ArrayList<String> questions) {
		this.questions = questions;
	}

	ArrayList<String> questions = new ArrayList<>(Arrays.asList(q1,q2,q3,q4,q5));

	private ArrayList<Person> people = new ArrayList<>();

	public String askByName(String question, String name) {
		String out = String.format(question,name);
		return out;
	}
	public String getGreeting() {
		return this.greeting;
	}
	public String getQ1() {
		return this.q1;
	}
	public String getQ2() {
		return this.q2;
	}
	public String getQ3() {
		return this.q3;
	}
	public ArrayList<Person> getPeople() {
		return people;
	}
	public String getPeopleString() {
		return people.toString();
	}
	public String findGenera(Person person) {

		if (actionHobbies.contains(person.getHobbies())) {

			return "action";

		}
		return "comedy";
	}
}
