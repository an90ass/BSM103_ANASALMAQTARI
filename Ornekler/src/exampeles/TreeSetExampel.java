package exampeles;

import java.util.HashSet;
import java.util.*;

public class TreeSetExampel {

	public static void main(String[] args) {
		 Set <Integer> hashSet = new TreeSet <Integer>();
		 hashSet.add(1);
		 hashSet.add(5);
		 hashSet.add(8);
		 hashSet.add(9);
		 hashSet.add(11);

		     System.out.println("Tree : "+ hashSet);
		   
		      boolean isKey = hashSet.contains(1);
		        System.out.println("key 1 var mu yok mu ? " + isKey);
		        isKey = hashSet.contains(7);
		        System.out.println("key 8 var mu yok mu ? " + isKey);
	}
}
/*
OutPut :

Tree : [1, 5, 8, 9, 11]
key 1 var mu yok mu ? true
key 8 var mu yok mu ? false

*/