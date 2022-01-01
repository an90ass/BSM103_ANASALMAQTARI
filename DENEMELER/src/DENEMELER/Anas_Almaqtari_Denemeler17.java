package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler17 {

	public static void main(String[] args) {
		// eger 5 sayi kunllanci dan girildi bu sonuc cikacak
		/* 1 
		   1 2 
		   1 2 3 
		   1 2 3 4 
		   1 2 3 4 5 
		   1 2 3 4 
		   1 2 3 
		   1 2 
		   1           */      


        Scanner sc = new Scanner(System.in);
 
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
 
        for (int satir  = 1; satir <= rows; satir++) {
     
            for (int sutun = 1; sutun <= satir; sutun++){
             System.out.print(sutun +" " );
            } 
 
            System.out.println();
	}
        
        for  (int satir = rows -1; satir >= 1 ; satir--) {
        	for  (int sutun = 1 ; sutun <= satir ; sutun++) {
        		System.out.print(sutun +" ");
				
			}
            System.out.println();

		}

}
}