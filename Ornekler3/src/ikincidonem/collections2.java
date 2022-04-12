package ikincidonem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collections2 {

	public static void main(String[] args) {
		ArrayList list1= new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
/*OutPut

[80, 70, 60, 50, 40, 30, 20, 10]
		
*/