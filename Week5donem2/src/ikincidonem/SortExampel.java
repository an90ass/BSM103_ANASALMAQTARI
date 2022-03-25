package ikincidonem;

import java.util.ArrayList;
import java.util.Collections;

public class SortExampel {

	public static void main(String[] args) {
		
	     ArrayList<String> words = new ArrayList<String>();
         words.add("kalem");
         words.add("bilgisayar");
         words.add("bartin");
         words.add("kitap");
         System.out.println("siralamadan once :"+words);
         System.out.println(words.get(0));
         // a-z ye siralama
         Collections.sort(words);
         System.out.println("siralamadan sonra :"+words);

	}
	

}
