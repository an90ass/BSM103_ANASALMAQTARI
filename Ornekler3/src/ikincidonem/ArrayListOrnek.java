package ikincidonem;

import java.util.*;

public class ArrayListOrnek {

	public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("AHMED");
      list.add("ANAS");
      list.add("ALI");
      list.add("ANAS");
 
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("AHMED");
      list2.add("SALEH");
      list2.add("ABDULLAH");
      list2.add("ANAS");
     list.retainAll(list2);
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}
	/*
	  
	  OutPut:
	 
AHMED
ANAS
ANAS

	*/

}
