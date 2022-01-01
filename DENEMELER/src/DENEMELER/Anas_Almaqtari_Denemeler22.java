package DENEMELER;
import java.util.*;
public class Anas_Almaqtari_Denemeler22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Istedigeniz Numara Giriniz");
		int sayi = sc.nextInt();
		
        for (int satir = 1 ; satir <= sayi; satir ++ ) {
        	for ( int sutun = 1 ; sutun <= satir; sutun ++ ) {
        		System.out.print("*");
        		
        	}
    		System.out.println();

        }
		
	}

}
