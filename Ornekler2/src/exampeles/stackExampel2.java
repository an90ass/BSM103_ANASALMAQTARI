package exampeles;

import java.util.*;

public class stackExampel2 {

	public static void main(String[] args) {
   Stack<Integer> st = new Stack<Integer>();
   st.push(31);
   st.push(3);
   st.push(6);
   System.out.println(st.pop()); // 6
	System.out.println(st.peek()); // 3
}
}

