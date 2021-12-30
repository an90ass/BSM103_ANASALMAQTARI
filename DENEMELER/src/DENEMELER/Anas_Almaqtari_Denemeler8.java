package DENEMELER;
import java.util.Scanner;

public class Anas_Almaqtari_Denemeler8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//   dizide öğelerini tersine çevirme

        System.out.print(" Bir Sayi Girin :");
       int girilenSayi = sc.nextInt();
       System.out.print(" girilen Sayi = " + girilenSayi);

       
        int arr[] = new int[girilenSayi];
 
 
        for (int index = 0; index < arr.length ; index++) {
        	System.out.print(" Sayilar Girin :");
            arr[index] = sc.nextInt();
        }
 
       int  j = girilenSayi - 1;
        for (int index = 0; index < j ; index++) {
           int  temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println(" Terse cevrilmis Dizi :");
        for (int index = 0; index <arr.length ;index++) {
            System.out.println(" " + arr[index]);
        }
 
    }

	}


