package ikincidonem;

import java.util.*;

public class collections {

	public static void main(String[] args) {
  List<String> s1 = new ArrayList<>();
     s1.add("a");
     s1.add("b");
     s1.add("c");
     List<String> s2 = s1.subList(0,2);
     System.out.println("s2 = "+s2);
     s2.add("d");
     System.out.println("s1 = "+s1);
     System.out.println("s2 = "+s2);

	}

}

/*

OutPut:
s2 = [a, b]
s1 = [a, b, d, c]
s2 = [a, b, d]

*/