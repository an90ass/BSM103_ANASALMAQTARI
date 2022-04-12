package ikincidonem;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
     List <Integer>  IntegerList = new ArrayList<Integer>();
     IntegerList.add(5);
     IntegerList.add(35);
     IntegerList.add(75);
     IntegerList.add(105);
       Iterator <Integer> it =IntegerList.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       System.out.println("________________");
	   System.out.println(IntegerList.indexOf(35));
	   System.out.println(IntegerList.contains(105));
	   System.out.println(IntegerList.contains(20));
	}
}
/*
  
  OutPut:
 
 5
35
75
105
________________
1
true
false
*/