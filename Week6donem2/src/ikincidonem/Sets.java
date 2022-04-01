package ikincidonem;
import java.util.*;
public class Sets {

	public static void main(String[] args) {
         ArrayList<String> lists = new ArrayList <String>();
         lists.add("kalem");
         lists.add("masa");
         lists.add("bilgisayar");
         lists.add("defter");
         lists.add(3,"dolap");
         lists.add("kalem");
         lists.add("masa");
     System.out.println(lists);
     
     Set<String> sets = new HashSet<String>();
       sets.add("kalem");
       sets.add("masa");
       sets.add("bilgisayar");
       sets.add("defter");
       sets.add("kalem");
       sets.add("masa");
        System.out.println(sets);
        System.out.println(sets.size());
        //"dolap" kelimesi varsa true, yoksa false dondurur.
        System.out.println(sets.contains("dolap"));   
        
        sets.clear();
        System.out.println(sets);
        sets.addAll(lists);
        // [masa, dolap, defter, bilgisayar, kalem]
        System.out.println(sets);
        System.out.println(lists.get(2));
        
	}

}
/*
 output: 
 [kalem, masa, bilgisayar, dolap, defter, kalem, masa]
 [masa, defter, bilgisayar, kalem]
 4
 false
 []
 [masa, dolap, defter, bilgisayar, kalem]
 bilgisayar
*/ 
