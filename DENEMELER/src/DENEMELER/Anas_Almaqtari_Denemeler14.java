package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler14 {

	public static void main(String[] args) {
		// Bir dizi tüm elemenlerini Java’daki başka bir diziye kopyalam
		 Scanner sc = new Scanner(System.in);

        System.out.print(" Dizi Boyutunu Girin :");
       int DiziBoyutunu = sc.nextInt();
       
        int[] BirinciDizi = new int[DiziBoyutunu];
        int[] IkinciDizi= new int[DiziBoyutunu];


        for (int index = 0; index < BirinciDizi.length ; index++) {
         System.out.print(" Baska bir diziye kopyalama istediginiz rakamlar giriniz :");
     	BirinciDizi[index] = sc.nextInt();

        }
 
        for (int index = 0; index < BirinciDizi.length; index++) {
        	IkinciDizi[index] = BirinciDizi[index];

        }    
     
   	 System.out.print(" IkinciDizi DiziYazdır : ");

        for (int index = 0; index < BirinciDizi.length; index++) {
        System.out.print( " " + IkinciDizi[index]);

        }
    
    }

	}


