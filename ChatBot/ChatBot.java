package com.company;
import java.util.*;

public class ChatBot {
	private String greeting = "Hello, my name is chat bot";
	private String q1 = "What is your name?";
	private String q2 = "How old are you %s?";
	private String q3 = "What is your occupation %s?";
	private String q4 = "What are some of your hobbies and interests %s?";
	private String q5 = "What can i help you with %s?";
	private Person person;
	private ArrayList<Person> people = new ArrayList<>();

/*	public ChatBot() {
		
	}*/

	public Person createPerson() {
		person = new Person();
		getGreeting();

		Scanner sc= new Scanner(System.in); //System.in is a standard input stream

		System.out.print(q1);
		String name= sc.nextLine();              //reads string
		person.setName(name);

		System.out.print(personalize(q2,person.getName()));
		while (!sc.hasNextInt()){
			sc.nextLine();  // throw away the bad input
			System.out.println("Please enter a valid number");
		}
		int age = Integer.parseInt(sc.nextLine());
		person.setAge(age);

		System.out.print(personalize(q3,person.getName()));
		String occupation= sc.nextLine();              //reads string
		person.setOccupation(occupation);

		System.out.print(personalize(q4,person.getName()));
		String hobbies= sc.nextLine();              //reads string
		person.setHobbies(hobbies);

		System.out.print(personalize(q5,person.getName()));
		String query= sc.nextLine();              //reads string
		person.setQuery(query);

		people.add(person);

		return person;

	}
	public String personalize(String generic, String name) {
		return String.format(generic, name);
	}
	public String askByName(String name) {
		String out = String.format("Well %s, what can I help you with today?",name);
		System.out.println(out);
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
}
