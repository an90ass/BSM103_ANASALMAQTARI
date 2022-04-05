package exampeles;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class iteratorExampel2 {

	public static void main(String[] args) {
		Set <Integer> col = new TreeSet <Integer>();
	     col.add(200);
	     col.add(100);
	     col.add(400);
	     col.add(300);
	     col.add(50);
	       Iterator <Integer> it = col.iterator();
	       while (it.hasNext()) {
	    	   int score = it.next();
	    	   System.out.println(score);
	    	   if(score < 150 ) {
	    		   it.remove();  
	    	   }}
    	   System.out.println(col);

	}
}
 /*
   OutPut:
	
	50
	100
	200
	300
	400
	[200, 300, 400]
*/
