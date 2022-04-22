package ikincidonem;
import java.util.ArrayList;
import java.util.Stack;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList <Integer> list = new ArrayList<Integer>();
         boolean tmp = validParanttheses("{(())");
         System.out.println(tmp);
	}
	public static boolean validParanttheses(String str) {
		Stack <Character> s = new Stack <Character> ();
		for( char x : str.toCharArray()) {
			if (x == '{' || x == '[' || x == '(' ) {
				s.push(x);
			}
				else if (!s.isEmpty() && (x == ']' && s.peek() == '[' || x == '}' && s.peek() == '{' ||
						x == ')' && s.peek() =='(')) {
					s.pop();
					
				}
				else {
					return false;
				}
			}
		return s.isEmpty();
  }	}
/* 
OutPut :

false 

*/

