package ikincidonem;
import java.util.*;
public class ParentThesisMatching {
	public static void main(String[] args) {
		// (a+(b*c)-d) -> dengeli
		// (a*((d-e)+b -> dengesiz
     Scanner input = new Scanner(System.in);
         System.out.println("Kontrol etmek istediginiz ifadeyi diriniz");
         String exp = input.next();
		if(isMaching(exp))
			System.out.println("Dengeledir");
		else
			System.out.println("Dengeli degildir");
	} //(a+b) //  exp = "Bartin" charAt(0) ->( //({[{)}]
	public static boolean isMaching(String exp) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i) == '(')
				s.push(exp.charAt(i));
			else if(exp.charAt(i)==')')
		     if(!s.isEmpty())
				s.pop();
		     else 
		    	 return false;
		}
		return(s.isEmpty());		
		}		
	}



