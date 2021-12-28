package Denemeler;
import java.util.*;
public class Anas_Almaqtari_Hafta11_2 {

	public static void main(String[] args) {
   Random rand = new Random ();
    int tries = 0 ;
    int sum = 0 ; 
    while (sum != 7 ) {
int sayi1 = rand.nextInt(6) + 1 ;
int sayi2 = rand.nextInt(6) + 1 ;
  sum = sayi1 + sayi2 ;
  System.out.println( sayi1 + "+" + sayi2 +  "=" + sum);
  
    }
    System.out.println("Tebrikler " + tries+ "deneme bulundu..." );
	}

}
