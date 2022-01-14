package Denemeler2;

import java.util.Scanner;

public class Anas_Almaqtari_Denemeler31 {

	public static void main(String[] args) {
		//Maksimum metodu üç rasyonel sayı (double) değerinden en büyüğünü buluyor ve ona dönüyor
		Scanner sc = new Scanner(System.in);
		     System.out.println("Uc Tane Sayi Giriniz : ");
		     double sayi1 = sc.nextInt();
		     double sayi2 = sc.nextInt();
		     double sayi3 = sc.nextInt();
		     double sonuc = maksimum(sayi1 , sayi2 , sayi3);
		     System.out.println("En Buyuk Sayi  = " + sonuc);

			}
		     public static double maksimum(double x , double y , double z) {
		      double enBuyuk = x; 
		     if (y > enBuyuk) 
		    	 enBuyuk = y;
		         if (z > enBuyuk) 
		        	 enBuyuk = z;
		return enBuyuk;

		         }}
		    	 

