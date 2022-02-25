package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Scalar;

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
            System.out.println("Distance"+ row);
            System.out.println(distances[row]);
        }
        return distances;
    }
    public String getTop() {
        return generas[index];
    }

}