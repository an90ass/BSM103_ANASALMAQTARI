package ikincidonem;

import java.util.*;

public class ornek2 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3); // [1, 2, 3]
		System.out.println(q);
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) { 
		s.push(q.remove());
		}
		while (!s.isEmpty()) { 
		q.add(s.pop());
		}
		System.out.println(q); // [3, 2, 1]

	}
        
}
