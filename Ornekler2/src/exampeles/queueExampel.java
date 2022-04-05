package exampeles;

import java.util.*;

public class queueExampel {

	public static void main(String[] args) {
		 Queue<Integer> st = new LinkedList<Integer>();
		   st.add(31);
		   st.add(3);
		   st.add(6);
		   System.out.println(st.remove()); // 31
			System.out.println(st.peek()); // 3
	}

}
