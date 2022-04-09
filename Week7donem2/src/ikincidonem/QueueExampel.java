package ikincidonem;
import java.util.*;
public class QueueExampel {

	public static void main(String[] args) {
		String data[] = {"Java","Php", "Paython","C","C++"};
		     Queue <String> q = new LinkedList<String>();
		     for(String word : data)
		       q.add(word);
		     System.out.println("Queue = " +q);
		     System.out.println("Peek = "+q.peek());
		     System.out.println(q.size());
		     
	}

}
