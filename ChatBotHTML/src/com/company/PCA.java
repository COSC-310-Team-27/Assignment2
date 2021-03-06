package com.company;
import java.util.*;


public class PCA {
    String [] generas = new String[] {"sci-fi","Romance","Action","Comedy", "Education","Classic","Horror"};
    int [][] utility = new int [][] {{10,1,10,0,5,2,2},{0,10,1,10,5,2,2},{0,1,1,0,10,10,2},{8,1,1,1,5,4,8}};//standard user matrix reduced via PCA in python
    int[] user = new int [utility[0].length];
    int [] distances = new int[utility.length];
    int index = 0;
    int value = 1000;
    //ArrayList<Integer> dist = new ArrayList(Arrays.asList( distances));
    public PCA(int[] user) {
        this.user = user;
    }

    //function finds the standard user vector that is closest using euclidian distance
    //the smallest distance gives a column vector that can be used to recommend geners
    public int [] getDistances() {

        for (int row = 0; row < utility.length; ++row)
        {
            System.out.println("Typical"+row + "  user");
            distances[row] = 0;
            for (int col = 0; col < utility[row].length; ++col) {
                distances[row] += Math.pow((user[col]-utility[row][col]),2.0);
                System.out.println("    "+utility[row][col] +"    \t"+user[col]+"    \t");
            }
            if (distances[row]<value) {
                //value is the minimum distance
                value = distances[row];
                //index is the index of min == index of corresponding string in genera array
                index = row;
            }
//            System.out.println("Distance"+ row);
//            System.out.println(distances[row]);
        }
        return distances;
    }


    public int [] getStandardUser() {
        int [] standard = Arrays.copyOfRange(utility[index],0,utility[index].length);
        return standard;
    }

    public String [] getTopThree() {

        int [] indices = new int [] {0,0,0};
        String [] values = new String [] {"","",""};
        int row = index;
        int [] su = getStandardUser();
        for (int i = 0; i < su.length; i++) {
            if (su[i]> indices[0]) {
                values[0] = generas[i];
                indices[0] = i;
                //System.out.println("genera 0" + values[0]);
            }
            else if (su[i]> indices[1] && su[i] != indices[0]) {
                System.out.println("1");
                values[1] = generas[i];
                indices[1] = i;
                //System.out.println("genera 1" + values[1]);
            }
            else if (su[i]> indices[2] && su[i] != indices[1]) {

                values[2] = generas[i];
                indices[2] = i;
                //System.out.println("genera 2" + values[2]);
            }
        }

        return values;
    }

}