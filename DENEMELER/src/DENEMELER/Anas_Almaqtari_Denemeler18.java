package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler18 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  System.out.println("Satir Sayisi giriniz : ");
  int rows = sc.nextInt();
  
  
		for (int satir = 1 ; satir <= rows; satir ++  ) {
			for (int sutun = rows ; sutun >= satir ; sutun--) {
				System.out.print(sutun);
				
			}
			System.out.println();

		}
		
		
		
		
		
		
	}

}
