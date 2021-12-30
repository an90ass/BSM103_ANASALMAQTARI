package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler13 {

	public static void main(String[] args) {
		// azalan düzende sıralama
				 Scanner sc = new Scanner(System.in);
		
		System.out.print("Dizi Boyutunu Girin :");
	       int DiziBoyutunu = sc.nextInt();
	       
	        System.out.println("Girdiginiz dizi boyutu :" + DiziBoyutunu);

	        int[] dizi= new int[DiziBoyutunu];
	     
	        for (int i = 0; i < dizi.length; i++) {
		        System.out.print(" Dizi elemenleri Girin :");
	            dizi[i] = sc.nextInt();
	        }
	        for (int i = 0; i < dizi.length; i++) {
	            for (int j = 1 + i; j < dizi.length; j++) {
	                if (dizi[i] < dizi[j])  {
	                    int temp = dizi[i];
	                    dizi[i] = dizi[j];
	                    dizi[j] = temp;
	                }
	            }
	        }
	        for (int i = 0; i <dizi.length; i++) {
	            System.out.println("Siralamadan Sonra Dizi : " +dizi[i]);
	        }
	       
	 
	    }
	

}
