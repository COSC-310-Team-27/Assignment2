package com.company;
import java.util.*;

public class ChatBot {
	private ArrayList<String> statements = new ArrayList<>();
	private ArrayList<question> questions = new ArrayList<question>();
	private Person person;

	//Setting arraylist of prompts, by constructor
	//Option 1:

	public ChatBot(){
		statements.add("Hello, my name is chat bot your personal library assistant");
		statements.add("eg. Random recommendation, or by favourite book, or favourite genre");
		//statements.add("Are you a first time user?");
		//statements.add("Welcome back %s how may I help you today?");
		statements.add("May I suggest %s");
		questions.add(new question("generic", 0, "What is your name?"));
		questions.add(new question("generic", 0, "How old are you %s?"));
		questions.add(new question("generic", 0, "What is your occupation %s?"));
		questions.add(new question("generic", 0, "What service can I provide? "));

	}
	/*Setting arraylist of prompts, by setters
	Option 2:
	public void setStatements(){

	}
	public void setQuestions(){

	}
	*/



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
			return "Goodbye";
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
			return "Goodbye";
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

	public void setQuestions(ArrayList<question> questions) {
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
