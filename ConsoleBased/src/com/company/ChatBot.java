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
		statements.add("eg. Random recommendation, or by favourite book, or favourite genre. Or search for a book by title, page, author. Or set of books by author, genre, page.");
		statements.add("By: ");
		statements.add("I would recommend the following book(s): ");
		statements.add("I found %d books by that title: ");
		statements.add("I found %d books by that author: ");
		statements.add("I found %d books in that genre: ");
		statements.add("I found %d books of that length: ");
		statements.add("Error, no by that title...");
		statements.add("Error, no books by that author...");
		statements.add("Error, no books in that genre...");
		statements.add("Error, no books of that length...");
		statements.add("Error, no books to return..."); //Variations: No book by that title, no books by that author, no books of that genre, no books of that length
		//statements.add("Are you a first time user?");
		//statements.add("Welcome back %s how may I help you today?"); no need to output example of services statement b/c user is not new.
		statements.add("May I suggest %s");
		questions.add(new question("generic", 0, "What is your name?"));
		questions.add(new question("generic", 0, "How old are you %s?"));
		questions.add(new question("generic", 0, "What is your occupation %s?"));
		questions.add(new question("generic", 0, "What is your favourite book %s?"));
		questions.add(new question("generic", 0, "What is your favourite genre %s?"));
		//questions.add(new question("generic", 0, "What service can I provide? "));  //considering to add two more elements, two to indicate the statement(s) index(s)
		questions.add(new question("loop", 0, "What should I base my recommendation on? "));
		questions.add(new question("loop", 1, "Would you require additional service?"));

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
