package exampeles;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class iteratorExampel3 {

	public static void main(String[] args) {
		Collection <String> col = new LinkedList <String>();
	     col.add("bartin");
	     col.add("Universite");
	     col.add("bilgisayar");
	     col.add("muhendisligi");
	     col.add("Anas");
	       Iterator <String> it = col.iterator();
    	   System.out.println(it.next().toUpperCase());
    	   it.remove();
	    	  System.out.println("BARTIN : It has not removed form the list ");
	    	  System.out.println("____________");

	       while (it.hasNext()) {
	    	   
	    	   System.out.println(it.next().toUpperCase());
	    	   it.remove();
	       }
	       System.out.println("BARTIN : It has removed form the list ");
		}
	}

/*
 OutPut:
	 
	 
	 BARTIN
	 BARTIN : It has not removed form the list 
	 ____________
	 UNIVERSITE
	 BILGISAYAR
	 MUHENDISLIGI
	 ANAS
	 BARTIN : It has removed form the list 
	 
*/