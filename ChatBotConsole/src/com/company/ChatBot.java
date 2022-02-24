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
