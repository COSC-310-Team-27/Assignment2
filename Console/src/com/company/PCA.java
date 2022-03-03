package com.company;
import java.util.*;


public class PCA {
    String [] generas = new String[] {"sci-fi","Romance","Action","Comedy", "Education","Classic","Horror"};
    /*
    TODO
     generate pca matrix from online db
     normalise / mean center the utility and user data
     */
    int [][] utility = new int [][] {{10,1,10,0,5,2,2},{0,10,1,10,5,2,2},{0,1,1,0,10,10,2},{8,1,1,1,5,4,8}};//standard user matrix reduced via PCA in python
    int[] user;
    int [] distances = new int[utility.length];
    int index = 0;
    int value = 1000;

    public PCA(int[] user) {
        this.user = user;
    }

    //function finds the standard user vector that is closest using euclidean distance
    //the smallest distance gives a column vector that can be used to recommend generas
    public int [] getDistances(int [] user, int [][]utility) {
        for (int row = 0; row < utility.length; ++row)
        {
            //System.out.println("Typical"+row + "  user");
            distances[row] = 0;
            for (int col = 0; col < utility[row].length; ++col) {
                distances[row] += Math.pow((user[col]-utility[row][col]),2.0);
                //System.out.println("    "+utility[row][col] +"    \t"+user[col]+"    \t");
            }
            if (distances[row]<value) {
                //value is the minimum distance
                value = distances[row];
                //index is the index of min == index of corresponding string in genera array
                index = row;
            }
        }
        return distances;
    }


    public int [] getStandardUser() {
        //System.out.println("In getStandardUser");
        int [] standard = Arrays.copyOfRange(utility[index],0,utility[index].length);
        return standard;
    }

    public ArrayList<String> getTopThree() {
        //System.out.println("In gettopthree");
        int [] indices = new int [] {0,0,0};
        ArrayList<String> values = new ArrayList<>();
        int row = index;
        int [] su = getStandardUser();
        for (int i = 0; i < su.length; i++) {
            if (su[i]> indices[0]) {
                values.add(generas[i]);
                indices[0] = i;
                //System.out.println("genera 0" + values[0]);
            }
            else if (su[i]> indices[1] && su[i] != indices[0]) {
                values.add(generas[i]);
                indices[1] = i;
                //System.out.println("genera 1" + values[1]);
            }
            else if (su[i]> indices[2] && su[i] != indices[1]) {

                values.add(generas[i]);
                indices[2] = i;
                //System.out.println("genera 2" + values[2]);
            }
        }
        return values;
    }
    public ArrayList<String> remainingOptions(ArrayList<String> top3) {

        ArrayList<String> remaining = new ArrayList<>();
        for (String g:generas) {
            boolean add = true;
            for (String s: top3) {
                if(s==g){
                    add = false;
                }
            }
            if(add) {
                remaining.add(g);
            }
        }
        return remaining;
    }

}