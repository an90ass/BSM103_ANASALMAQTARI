package Denemeler;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

	// dizideki bir öğeyi arama
    	int i, f = 0, n;
        int arr[] = new int[5];

       
        for (i = 0; i < 5; i++) {
            System.out.print("5 Sayı Girin :");

            arr[i] = sc.nextInt();
            
        }

        System.out.print("Aranan Değeri Girin :");
        n = sc.nextInt();

        for (i = 0; i < 5; i++) {
            if (n == arr[i]) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.println(" Tebrikler Aranan Sayı Dizi İçinde Bulundu : " + n);
        } else {
            System.out.println("Aranan Sayı Dizi İçinde Bulunamadı:" + n);
        }

    }
}

	
