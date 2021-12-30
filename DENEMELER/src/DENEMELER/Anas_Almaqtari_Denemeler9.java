package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler9 {
	public static void main(String[] args) {
		// dizide en büyük ikinci sayıyı bulma
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Girin :");
        int DiziBoyutunu = sc.nextInt();
        
        int[] arr  = new int[DiziBoyutunu];
     
        int  enbuyuk = 0, enbuyuk2 = -1;
 
		for (int index = 0; index < arr.length; index++) {
            System.out.print("Dizi Elemanlarini Girin :");
            arr[index] = sc.nextInt();
        }
        
        
        for (int index = 0; index < arr.length ; index++) {
            if (enbuyuk <= arr[index]) {
                enbuyuk = arr[index];
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if ( enbuyuk2 <= arr[index] && arr[index] < enbuyuk) {
                enbuyuk2 = arr[index];
            }
        }
 
        System.out.print(" İkinci En Buyuk Sayi :" + enbuyuk2);        
    }

	}


