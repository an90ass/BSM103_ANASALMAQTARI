package exampeles;

import java.util.LinkedList;
import java.util.Queue;

public class queueExampel2 {

	public static void main(String[] args) {
		Queue<Integer> st = new LinkedList<Integer>();
		   st.add(31);
		   st.add(3);
		   st.add(6);
		   System.out.println(st.peek()); // 31
		   System.out.println(st.remove()); // 31
			
	}

}
