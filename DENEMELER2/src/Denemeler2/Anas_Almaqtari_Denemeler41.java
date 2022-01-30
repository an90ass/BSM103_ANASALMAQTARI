package Denemeler2;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler41 {

	public static void main(String[] args) {
		/* LUTFEN BIR SAYI GIRINIZ : 353
		
		 Output:
		 
		TOPLAM = 11
*/
   Scanner sc = new Scanner(System.in);
  System.out.println("LUTFEN BIR SAYI GIRINIZ : ");
 int sayi = sc.nextInt();
	
   sayi = Math.abs(sayi);
   int sum = 0;
   
   while(sayi > 0 ) {
	   sum = sum + (sayi % 10 );
	   sayi = sayi / 10;
	   
   }
   System.out.println("TOPLAM = " + sum);
	}

}
