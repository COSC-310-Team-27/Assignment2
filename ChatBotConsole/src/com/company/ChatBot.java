package com.company;
import java.util.*;

public class ChatBot {
	private String greeting = "Hello, my name is chat bot";
	private String q1 = "What is your name?";
	private String q2 = "How old are you %s?";
	private String q3 = "What is your occupation %s?";
	private String q4 = "What are some of your hobbies and interests %s?";
	private String q5 = "What can i help you with %s?";
	//If user responds that they like all of the following questions, recommend any of the manga/light novel genre. If they like especially space and mechas and star wars then recommend the one book in manga. 
	private String q6 = "Do you like comics %s?";
	private String q7 = "Are you interested in stories of reincarnation %s?";
	private String q8 = "Do you like reading about mechas or mechanical related materials %s?";
	private String q9 = "Do you like Star Wars %s?";
	private String q10 = "Do you like action and fantasy genre %s?";
	private String q11 = "Do you like books about space %s?";
	private Person person;
	private ArrayList<String> actionHobbies = new ArrayList<>(Arrays.asList("climbing, hiking, skiing, paintball, "));
	private ArrayList<String> nerdOccupations = new ArrayList<>(Arrays.asList("programming", "engineer", "scientist"));
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
		if (nerdOccupations.contains(person.getOccupation())) {
			return "sci-fi";
		}
		return " ";
	}
}
