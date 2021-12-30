package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler15 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (((((Bir tamsayı dizisinde belirtilen bir sayıdan küçük kaç tane sayı olduğunu bulan Java programdir)))))
        
		int sayac=0;
        System.out.println("Kac Elemanli Bir Dizi Olusturmak İstiyorsunuz ? :");
         int girilenSayi = sc.nextInt();
        int[] dizi = new int[girilenSayi];
        
        for(int i=0; i< dizi.length;i++){
            System.out.println("Dizinin Elemanlarını Giriniz :");
             dizi[i] = sc.nextInt();
        }
        
        System.out.println(" Bir sayi girin :");
        int sayi = sc.nextInt();
        
        
        System.out.println(sayi+" Değerinden Küçük Olan Elemanlar : " );


        for(int j=0 ; j<dizi.length; j++){
            if(dizi[j]<sayi){
            	 System.out.println(dizi[j]);
                sayac++;
            }       
            
        }
        System.out.println(sayi+" Degerinden Kucuk "+sayac+" Eleman Var. ");
    }

}
