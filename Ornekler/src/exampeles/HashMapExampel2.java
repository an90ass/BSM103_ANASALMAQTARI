package exampeles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExampel2 {

	public static void main(String[] args) {
		
		   Map <Integer, String> hashMap = new HashMap <Integer , String >();
		    hashMap.put(8, "Bartin");
		    hashMap.put(1, "Universite");
		    hashMap.put(5, "BilgisayarMu");
		     System.out.println("hashMap : "+ hashMap);
		   
		      boolean isKey = hashMap.containsKey(1);
		        System.out.println(" key 1 var mu yok mu ? " + isKey+ " var ");
		        isKey = hashMap.containsKey(7);
		        System.out.println(" key 7 var mu yok mu ? " + isKey+" yok ");
		
		    }
	}
/*
  OutPut:
 hashMap : {1=Universite, 5=BilgisayarMu, 8=Bartin}
 key 1 var mu yok mu ? true var 
 key 7 var mu yok mu ? false yok 
 
 */
