package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Kullanıcı (10) sayısını girerse
		/*                                
	             	10 
                  9 10 9 
                8 9 10 9 8 
              7 8 9 10 9 8 7 
            6 7 8 9 10 9 8 7 6 
          5 6 7 8 9 10 9 8 7 6 5 
        4 5 6 7 8 9 10 9 8 7 6 5 4 
      3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 
    2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 
  1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 
                                                                      */
		
		//Kullanıcıdan noOfRows değeri alınması
 
        System.out.println(" Kaç Satır İstiyorsunuz?");
 
        int Rows = sc.nextInt();
        int Count = 1;
 
        for (int satir = Rows; satir >= 1; satir--)
        {
        	//Her satırın başında i çarpı 2 boşluk yazdıracğım 
            for (int bosluk = 1; bosluk <= satir*2; bosluk++)
            {
                System.out.print(" ");
            }
 
         // j değerinin i den Rows'a olacağı yerde j olacak
            for (int sutun = satir; sutun <= Rows ; sutun++)          
            {
                System.out.print(sutun+" ");
            }
 
            // j değerinin Rows-1 den i'ye olacağı yerde j olacak             
            for (int j = Rows-1; j >= satir; j--)
            {               
                System.out.print(j+" ");            
            }
             
            System.out.println();
 
            Count++;
        }
    }

	}


