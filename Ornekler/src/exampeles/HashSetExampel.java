package exampeles;

import java.util.Map;
import java.util.*;

public class HashSetExampel {

	public static void main(String[] args) {
		 Set <Integer> hashSet = new HashSet <Integer>();
		 hashSet.add(7);
		 hashSet.add(8);
		 hashSet.add(1);
		 hashSet.add(5);
		 hashSet.add(9);

		     System.out.println("Tree : "+ hashSet);
		   
		      boolean isKey = hashSet.contains(1);
		        System.out.println("key 1 var mu yok mu ? " + isKey);
		        isKey = hashSet.contains(7);
		        System.out.println("key 8 var mu yok mu ? " + isKey);
	}

	}
/*
 * 
OutPut :
Tree : [1, 5, 7, 8, 9]
key 1 var mu yok mu ? true
key 8 var mu yok mu ? true

*/
