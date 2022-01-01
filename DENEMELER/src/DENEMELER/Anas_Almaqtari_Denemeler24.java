package DENEMELER;

import java.util.Scanner;

public class Anas_Almaqtari_Denemeler24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Istedigeniz Numara Giriniz");
		int sayi = sc.nextInt();
		
		for (int satir = 1; satir <= sayi; satir ++) {
			for (int bosluk = satir -1 ; bosluk < sayi   ; bosluk ++ ) {
				System.out.print(" ");
			}
			
			for (int yildiz = 1; yildiz <= satir ; yildiz++) {
				System.out.print("*");

				
			}
			System.out.println();

		}
	}

}
