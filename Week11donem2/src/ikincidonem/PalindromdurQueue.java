package ikincidonem;

import java.util.*;
public class PalindromdurQueue {

	public static void main(String[] args) {
        System.out.println("Enter Your Word : ");
	      Scanner input = new Scanner(System.in);
	       String word = input.nextLine();
	       Queue queue = new LinkedList();
	       for (int i = word.length()-1; i >=0; i--) {
	    	   queue.add(word.charAt(i));
		}
	       String space = "";
      while(!queue.isEmpty()) {
    	  space = space + queue.remove();  
      }
      if(word.equals(space)){ 
    	  System.out.println("The Word Is A Palindromdur");
      }
      else      System.out.println("The Word Is Not A Palindromdur");
	
	}
}
