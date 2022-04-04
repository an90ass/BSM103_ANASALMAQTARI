package exampeles;
import java.util.*;

public class HashMapExampel {

	public static void main(String[] args) {
    Map <Integer, String> hashMap = new HashMap <Integer , String >();
    hashMap.put(1, " Bartin ");
    hashMap.put(2, " Universite ");
    hashMap.put(5, " BilgisayarMu ");
     System.out.println("hashMap : "+ hashMap);
     Scanner input = new Scanner(System.in);
     int a = input.nextInt();
     System.out.println(a + " " +     hashMap.containsKey(a));

    }
}
/*
 OutPut :
 
hashMap : {1= Bartin , 2= Universite , 5= BilgisayarMu }

*/
