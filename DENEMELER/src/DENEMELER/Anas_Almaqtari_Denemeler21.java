package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler21 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int toplam = 0;
		int sayac = 0;
		
		System.out.println("ogrencilerin notu giriniz : ");
		int not = sc.nextInt();
		
		while (not != -1) {
		if (not > 0 && not <= 100) {
			toplam = toplam + not;
			sayac++;
		}
		else {
		System.out.println("yanlis not girdiniz");
		}
		
		System.out.println("ogrencilerin Notu giriniz");
		not = sc.nextInt();
		
		}
		if (sayac != 0) {
         double ortalama =  (double) toplam / sayac;
	       System.out.println(" ogrenci sayisi " + sayac);
	       System.out.println(" ogrenci ortalama " + ortalama);

		}
		else {
		       System.out.println("Hic bir not girmediniz !!!!");

		}}
}