package DENEMELER;
import java.util.*;

public class Anas_Almaqtari_Denemeler23 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
			System.out.println("Istedigeniz Numara Giriniz");
			int sayi = sc.nextInt();
			
	        for (int satir = sayi ; satir >= 1 ; satir --) {
	        	for ( int sutun = 1 ; sutun <= satir ; sutun ++ ) {
	        		System.out.print("*");
	        		
	        	}
	    		System.out.println();
	
	        }
			
		}
	
	}


