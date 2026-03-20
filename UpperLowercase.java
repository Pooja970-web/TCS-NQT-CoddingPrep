/*🔹 Problem Statement:

👉 Given a string word, check whether it follows correct capital usage.

Return true if any of the following conditions are satisfied:

All letters are uppercase
Example: "USA"

All letters are lowercase
Example: "leetcode"

Only the first letter is uppercase and the rest are lowercase
Example: "Google"

👉 Otherwise, return false
*/
import java.util.*;
class UpperLowercase{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a word: ");
  String word = sc.nextLine();
  if(allCapital(word) || allSmall(word)||allSmall(word.substring(1))){
    System.out.println("True");
  }
  else{
    System.out.println("False");
  }
}
public static boolean allCapital(String word){
  for (char ch:word.toCharArray()){
    if(ch<'A' || ch>'Z'){
      return false;
    }
  }return true;
}
public static boolean allSmall(String word){
  for (char ch:word.toCharArray()){
    if(ch<'a' || ch>'z'){
      return false;
    }
  }return true;
}}