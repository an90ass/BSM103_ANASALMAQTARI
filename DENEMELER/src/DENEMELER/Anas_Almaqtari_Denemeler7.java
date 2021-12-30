package DENEMELER;
import java.util.Scanner;

public class Anas_Almaqtari_Denemeler7 {

	public static void main(String[] args) {
		// dizideki çift ve tek sayilar bulmaya calısan bir java programdir
        Scanner sc = new Scanner(System.in);
        System.out.print( "Bir Sayi Girin :");
        int girilenSayi = sc.nextInt();

	         
	        int arr[] = new int[girilenSayi];
	 
	        for (int i = 0; i < arr.length; i++) {
		        System.out.print( " Sayilar Girin :");

	            arr[i] = sc.nextInt();
	        }
	 
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                System.out.println(" CIFT SAYILAR :" + arr[i]);
	            }
	        }
	 
	         
	        for ( int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 != 0) {
	                System.out.println(" TEK SAYILAR :" + arr[i]);
	            }
	        }
	 
	    }
	}


