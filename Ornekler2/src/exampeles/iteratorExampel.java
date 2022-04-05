package exampeles;
import java.util.*;

public class iteratorExampel {

	public static void main(String[] args) {
		Collection <String> col = new LinkedList <String>();
	     col.add("bartin");
	     col.add("Universite");
	     col.add("bilgisayar");
	     col.add("muhendisligi");
	     col.add("Anas");
	       Iterator <String> it = col.iterator();
	       while (it.hasNext()) {
	    	   System.out.println(it.next().toUpperCase());
	       }
		}
	}
/*
 OutPut:
	 
	 BARTIN
	 UNIVERSITE
	 BILGISAYAR
	 MUHENDISLIGI
	 ANAS

*/