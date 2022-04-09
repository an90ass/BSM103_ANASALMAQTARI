package ikincidonem;
import java.util.*;
public class Stutter {
public static void main(String[] args) {
    int[] data = {5,2,8,9,10};
       Queue<Integer> s =new LinkedList<Integer>();
       for(int n : data)
    	s.add(n);
       System.out.println(s);
	  stutter(s);
	  System.out.println(s);
	}
	public static void stutter(Queue<Integer> s) {
		int size = s.size();
		while( size > 0) {
			int temp = s.remove();
			s.add(temp);
			s.add(temp);
            size --;        
		}
	}
}

