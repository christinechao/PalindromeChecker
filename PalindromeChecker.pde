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


