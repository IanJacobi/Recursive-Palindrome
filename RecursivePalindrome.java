import java.util.*;
public class RecursivePalindrome
{
   
   public static boolean isPal(String s)
   {
      
      s = removeAll(s); //ignore punctuation and spaces by removing them.
      int length = s.length();
      if(length == 0 || length == 1)
         return true; //check if all letters are same
      //System.out.println(s.substring(1, length-1));
      if(s.charAt(0) == s.charAt(length-1)) //  check firs and las characters of sring, if they are same then repeat for subsring.
      {
         return isPal(s.substring(1, length-1));        //return so that a new String derived from the old will be checked in this method
      }
      if(s.charAt(0) != s.charAt(length-1))
      {
         if(capital(s.charAt(0), s.charAt(length-1)) == true)
         {
            return isPal(s.substring(1, length-1));
         }
         
      }
      return false;
   }   
   public void input()
   {
      System.out.println("Enter a word to test if it is a Palindrome; or enter 'q' to quit");
      Scanner in = new Scanner(System.in);
      String original = "";
      original = in.nextLine();
      if(original.equals("q"))
         System.out.println();
      else
      {
         if(isPal(original))
            System.out.println(original + " is a palindrome");
         else
            System.out.println(original + " is not a palindrome");
         input();
      }
   }
   public static boolean capital(char s, char c)
   {
      if(Character.toLowerCase(s) == Character.toLowerCase(c))
         return true;
      else
         return false;
   }
   public static String removeAll(String s)
   {
      s = s.replaceAll("\\s","");
      s = s.replaceAll("\\,", "");
      s = s.replaceAll("\\.", "");
      s = s.replaceAll("\\[", "");
      s = s.replaceAll("\\]", "");
      s = s.replaceAll("\\/", "");
      s = s.replaceAll("\\\\", "");
      s = s.replaceAll("\\!", "");
      s = s.replaceAll("\\@", "");
      s = s.replaceAll("\\#", "");
      s = s.replaceAll("\\$", "");
      s = s.replaceAll("\\%", "");
      s = s.replaceAll("\\^", "");
      s = s.replaceAll("\\&", "");
      s = s.replaceAll("\\*", "");
      s = s.replaceAll("\\(", "");
      s = s.replaceAll("\\)", "");
      s = s.replaceAll("\\-", "");
      s = s.replaceAll("\\_", "");
      s = s.replaceAll("\\'", "");
      s = s.replaceAll("\\;", "");
      s = s.replaceAll("\\:", "");
      s = s.replaceAll("\\{", "");
      s = s.replaceAll("\\}", "");
      s = s.replaceAll("\\`", "");
      s = s.replaceAll("\\~", "");
      s = s.replaceAll("\\+", "");
      s = s.replaceAll("\\\"", "");
      s = s.replaceAll("\\?", "");
      s = s.replaceAll("\\<", "");
      s = s.replaceAll("\\>", "");
      s = s.replaceAll("\\|", "");
      return s;
   }
}