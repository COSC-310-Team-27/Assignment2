package com.company;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Parse {
    Scanner sc;
    public Parse() {
        sc = new Scanner(System.in);
    }

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
}
