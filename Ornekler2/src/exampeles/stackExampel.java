package exampeles;

import java.util.*;

public class stackExampel {

	public static void main(String[] args) {
  Stack <Integer> io = new Stack<Integer>();
   io.push(14);
   io.push(151);
   io.push(11);
   io.push(8);
for (int i = 0; i < io.size(); i++) {
	   
 System.out.println(io.pop());
	}

}}
 /*   
OutPut:
	
	8
	11
*/