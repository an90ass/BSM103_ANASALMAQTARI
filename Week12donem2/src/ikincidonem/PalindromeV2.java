package ikincidonem;
import java.util.*;
public class PalindromeV2 {
	public static void main(String[] args) {
		 System.out.println("Enter Your Word : ");
	      Scanner input = new Scanner(System.in);
	       String word = input.nextLine();
	       System.out.println(isPalindrome(word));
	}
         public static boolean isPalindrome(String text) {
        	 if(text == null || !isAlpha(text)) {
        		 return false;
        	 }
        	 int left = 0;
        	 int right = text.length()-1;
        	 while(left < right) {
        		 if(text.charAt(left++) != text.charAt(right--)) {
        			 return false ; 
        		 }
        	 }
        	 return true;
         }
         public static boolean isAlpha (String a ) {
        	 char[] charArr = a.toCharArray();
        	 for (char s : charArr) {
        		 if(!Character.isLetter(s)) {
        			 return false ;
        		 }
        	 }
        	 return true ;
         } }
