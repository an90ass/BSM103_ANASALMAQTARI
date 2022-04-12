package ikincidonem;

import java.util.*;

public class StackExcample {

	public static void main(String[] args) {
		// 18,4,3,9,4,2;   //18,3,9,2
		// removeAll(Stack , value)
		int data [] = {18,4,3,9,4,2};
		Stack<Integer> q = new Stack<Integer>();
		for(int n : data)
			q.add(n);
		System.out.println("Stack = " +q);
	  removeAll(q,4);
		System.out.println("Stack = " +q);
	} 

	 public static void removeAll(Stack<Integer>q, int value) {
		 int size = q.size();
		 for (int i = size; i<0 ; i++) {
			int n = q.pop();
			System.out.println(n+" Current Stack = "+q);
			if(n!= value) {
				q.push(n);
				System.out.println(n+" Elemani eklendi");
			}

		}
		 
	 }



	}

