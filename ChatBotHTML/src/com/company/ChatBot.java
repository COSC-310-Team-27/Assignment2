package com.company;
import java.util.*;

public class ChatBot {
	/*
	private String s1 = "Hello, my name is chat bot";
	private String s2 = "May I suggest %s";
	private String s3 = "Can I suggest something in our %s section?";

	private String s4= "I'm sorry, maybe you could try %s ...?";
	private String s5 = "Okay, let me find some %s books for you";
	private String s6 = "I'm not sure I understand ...?";

	private String q0 = "What is your name?";
	private String q1 = "How old are you %s?";
	private String q2 = "What is your occupation %s?";
	private String q3 = "What is your favorite genera?";
	private String q4 = "What is your favorite book?";
	private String q5 = "What is your favorite genera?";
	private String q6 = "What is your favorite book?";

	private Person person;
	private ArrayList<String> statements = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));
	private ArrayList<String> questions = new ArrayList<>(Arrays.asList(q0,q1,q2,q3,q4,q5,q6));
	*/
	private ArrayList<String> statements = new ArrayList<>();
	private ArrayList<question> questions = new ArrayList<question>();



	public String testReaction(String reply, Person user) {

		if(reply.toLowerCase().contains("no")) {
			return "no";
		}
		if(reply.toLowerCase().contains("yes")) {
			return "yes";
		}
		else {
			return "unsure";
		}

	}
	public String getQuestion(int i,String s) {
		String q = "";

		if (questions.size() >i ) {
			q = questions.get(i).content;
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
			q = questions.get(i).content;
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

	public void setQuestions() {
		statements.add("Hello, my name is index");
		statements.add("May I suggest %s?");
		statements.add("Can I suggest something in our %s section?");
		statements.add("I'm sorry, maybe you could try %s?");
		statements.add("Okay, let me find some %s books for you.");
		statements.add("I'm not sure I understand.");
		statements.add("Your chosen book(s) have been bookmarked.");
		statements.add("Do you have any further inquiries?");
		questions.add(new question("generic", 0, "What is your name?"));
		questions.add(new question("generic", 0, "How old are you %s?"));
		questions.add(new question("generic", 0, "What is your occupation %s?"));
		questions.add(new question("generic", 0, "What is your favourite genera?"));
		questions.add(new question("generic", 0, "What is your favourite book?"));
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

