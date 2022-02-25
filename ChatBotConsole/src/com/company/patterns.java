package com.company;
import java.util.*;
import java.lang.Math;
public class patterns{
  //Default agent greeting


  //Agent responds based on user's response
  public String getResponse(String sentence){
    if (findKeyword(response, ""))
  }




/*
This method is used to convert all letters withing a given word/phase to lowercase.
It checks a keyword is not being recognized as a sub string of another keyword.
eg. 'ok' being recognized in place of 'took'
*/

private int findKeyword(String sentence, String word, int startPos){
//removing white unnecessary white spaces in a sentence, for better sentence recognition
  String phrase = sentence.trim()
  //Idenifies the starting position of each word
  int position = phrase.toLowerCase().indexOf(word.toLowerCase(), startPos);

  //main loop to double check keyword substring mistakes
  while (position >= 0){
    //Find the string of length 1 before and after the keyword
    String before = " ", after = " ";
    if(position>0){
      before = phrase.substring(position-1, position).toLowerCase();
    }
    if(position+word.length() < phrase.length()){
      after = phase.substring(
              position+word.length(),
              position+word.length()+1).toLowerCase();
    }
    //If before and after are not substrings of a given word, it is the keyword enterd
    if(((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
      && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))){
        return position;
      }
      // Checking each word position within a sentence to ensure all words are verified
      position = phase.indexOf(word.toLowerCase(), position+1)
  }
  return -1;
}
//Searches for a specific word within a phrase.
// It aslo checks for substring conditions for the start to end of a given ohase
private int findKeyword(String sentence, String word){
    return findKeyword(sentence, word, 0);
}

}
