package com.example.ChatBot;

import java.util.ArrayList;
import java.util.Scanner;

public class Parse {
    Scanner sc;
    public Parse() {
        sc = new Scanner(System.in);
    }
    //return the first integer from user input
    public int getInt()  {
        int value = 0;
        String s = sc.nextLine();
        sc = new Scanner(s);
        sc.useDelimiter("[^\\d]+");
        boolean searching = true;
        while (sc.hasNext() && searching) {
            value = sc.nextInt();
            if(value!=0) {
                searching = false;
            }
        }
        System.out.println(value);
        return value;
    }
    //return the first double from user input
    public double getDouble() {
        double value = 0;
        String s = sc.nextLine();
        sc = new Scanner(s);
        sc.useDelimiter("[^\\d]+");
        boolean searching = true;
        while (sc.hasNext() && searching) {
            value = sc.nextDouble();
            if(value!=0) {
                searching = false;
            }
        }
        System.out.println(value);
        return value;
    }
    //take line of input and return a string array of words
    public ArrayList<String> getStringArray() {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean reading = true;
        while (sc.hasNext() &&  reading) {
            String token = sc.nextLine();
            String [] line = token.split(" ");
            if(token.equalsIgnoreCase("exit")||token.contains("."));
            reading = false;
            System.out.println(token);
            for (String s:line) {
                list.add(s);
            }
        }
        System.out.println(list);

        return list;

    }
    public String getWord() {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        return word;
    }
    //return the first noun in a line of user input
    public String getNoun(ArrayList<String> list) {

        return null;
    }

}
