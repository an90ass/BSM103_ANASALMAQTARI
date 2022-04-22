package ikincidonem;
import java.util.*;
public class validParanttheses {
  public static boolean validParanttheses(String str) {
		Stack <Character> s = new Stack <Character> ();
		for( char x : str.toCharArray()) {
			if (x == '{' || x == '[' || x == '(' ) {
				s.push(x);
			}
				else if (!s.isEmpty() &&(x == ']' && s.peek() == '[' || x == '}' && s.peek() == '{' ||
						x == ')' && s.peek() =='(')) {
					s.pop();
					
				}
				else {
					return false;
				}
			}
		return s.isEmpty();
  }	}

