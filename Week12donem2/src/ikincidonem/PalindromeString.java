package ikincidonem;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		 System.out.println("Enter Your Word : ");
	      Scanner input = new Scanner(System.in);
	       String word = input.nextLine();
	      String space = "";
	      int length = word.length();
	      for (int index = length-1; index >= 0; index--) {
	    	  space =space + word.charAt(index);
	      }
	    	  if(word.equals(space)){ 
	        	  System.out.println("The Word Is A Palindromdur");
	          }
	          else   {   System.out.println("The Word Is Not A Palindromdur");
	    	
	          }}
	    }
		

