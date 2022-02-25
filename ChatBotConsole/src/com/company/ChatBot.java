package com.company;
import java.util.*;

public class ChatBot {
	Animals[] animals = new Animal["Rabbit","Owl", "Beaver", "Tiger", "Unicorn"];
	int animal_Id = (int)(Math.random()* animals.length);
	private String greeting = "Hello, my I am the Book,concat(animals[animal_Id)])";
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
	private ArrayList<String> statements = new ArrayList<>(Arrays.asList(s1,s2));
	private ArrayList<String> questions = new ArrayList<>(Arrays.asList(q0,q1,q2,q3,q4));
	public String getQuestion(int i,String s) {
		String q = "";

		if (questions.size() >i ) {
			q = questions.get(i);
			if (q.contains("%s")) {
				q = String.format(q,s);
			}
			return q;

		}
		else
			return " Goodbye";
	}
	public String getQuestion(int i) {
		String q = "";

		if (questions.size() >i ) {
			q = questions.get(i);
			if (q.contains("%s")) {
				q = String.format(q,"");
			}
			return q;

		}
		else
			return " Goodbye";
	}
	public String getStatement(int i,String s) {
		String q = "";

		if (statements.size() >i ) {
			q = statements.get(i);
			if (q.contains("%s")) {
				q = String.format(q,s);
			}
			return q;

		}
		else
			return " Goodbye";
	}
	public String getStatement(int i) {
		String q = "";

		if (statements.size() >i ) {
			q = statements.get(i);
			if (q.contains("%s")) {
				q = String.format(q,"");
			}
			return q;

		}
		else
			return " Goodbye";
	}

	public void setQuestions(ArrayList<String> questions) {
		this.questions = questions;
	}


	private ArrayList<Person> people = new ArrayList<>();

	public String askByName(String question, String name) {
		String out = String.format(question,name);
		return out;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}




}
