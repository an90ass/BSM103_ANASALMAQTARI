package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		// ((((((bir dizideki asal sayıları bulma)))))

		
	        System.out.print("Dizi Uzunlugu Girin :");
	     int DiziUzunlugu = sc.nextInt();
	        int arr[] = new int[DiziUzunlugu];

	        for (int index= 0; index < arr.length ; index++) {
		        System.out.print("Dizi Elamanlarini Girin :");
	            arr[index] = sc.nextInt();
	        }
	 
	        System.out.print(" Dizideki tüm asal sayılar :");
	        
	        for ( int index = 0; index < arr.length ;index++) {
	        	
	           int  j = 2;
	           int  p = 1;
	            while (j < arr[index]) {
	                if (arr[index] % j == 0) {
	                    p = 0;
	                    break;
	                }
	                j++;
	            }
	            if  (p == 1) { 
 
	                System.out.print(" " + arr[index]);
	            }
	        }
	 
	    }
}
	


