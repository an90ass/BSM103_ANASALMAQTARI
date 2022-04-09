package ikincidonem;
import java.util.*;
public class StackExampel {
	public static void main(String[] args) {
		String data[] = {"Java","Php", "Paython","C","C++"};
	     Stack <String> s = new Stack<String>();	
     for(String word: data) {
    	 s.push(word);
   }
	     System.out.println("Stack = "+s);
	     System.out.println(s.peek());
	     System.out.println(s.pop());
	     System.out.println("Stack = "+s);
	     System.out.println("______________________________________________________");
	     System.out.println(s.isEmpty());
	    
	while(!s.isEmpty()) {
		System.out.println(s.pop());
		System.out.println("Stack = "+s);
	}
	}}
