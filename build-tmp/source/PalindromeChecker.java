import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palindrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String wordTwo = new String();
  for(int i =0; i < word.length(); i++){
    if (Character.isLetter(word.charAt(i)) == true){
       wordTwo = wordTwo+ word.charAt(i) ; 
    }
  }
  wordTwo = wordTwo.toLowerCase();
  
    for(int i=0; i<wordTwo.length()/2; i++){
      if(wordTwo.charAt(i) != wordTwo.charAt(wordTwo.length()-(i+1))){
        return false;
      }
    }
    return true;
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
