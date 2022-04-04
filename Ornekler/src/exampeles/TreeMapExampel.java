package exampeles;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExampel {

	public static void main(String[] args) {
		 Map <Integer, String> treeMap = new TreeMap <Integer , String >();
		   treeMap.put(8, "Bartin");
		    treeMap.put(1, "Universite");
		    treeMap.put(5, "BilgisayarMu");
		     System.out.println("Tree : "+ treeMap);
		   
		      boolean isKey = treeMap.containsKey(1);
		        System.out.println("key 1 var mu yok mu ? " + isKey+ " var ");
		        isKey = treeMap.containsKey(7);
		        System.out.println("key 7 var mu yok mu ? " + isKey+" yok ");
	}
	}
/*
OutPut :
Tree : {1=Universite, 5=BilgisayarMu, 8=Bartin}
key 1 var mu yok mu ? true var 
key 7 var mu yok mu ? false yok 

*/

