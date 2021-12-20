package OdevlerHafta12;
import java.util.*;
public class Anas_Almaqtari_ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        
        System.out.println("kac ogrencinin notu girilecek ? ");
        int ogrenciSayisi = input.nextInt();
        
       System.out.println(ogrenciSayisi + " tane ogrencinin notu girilicektir ");
        //Ortalama hesaplamak için
        double ortalama []  = new double [ogrenciSayisi];
        
                // Kullanıcıdan sayı alıyoruz
        for(int i =1 ; i <= ogrenciSayisi; i++) {
        	System.out.println( i +  "ogrencinin vize notu girininz : ");
        	int vizeNotu = input.nextInt();
        	System.out.println(i + "ogrencinin final notu girininz : ");
        	int finalNotu = input.nextInt();
        	
        	//i-1 yazdık Çünkü diziler sıfırdan başlıyor
        	ortalama [i-1] = ortalama(vizeNotu, finalNotu);
        }
        System.out.println("Tum ogrencilerin gecme puani ");
        System.out.println(Arrays.toString(ortalama));

        	
        } 
                           //Parametre sırası önemli (vizeNotu,finalNotu)
    public static double ortalama(int vizeNotu, int finalNotu) {
    	                   // Fonksiyonu çağırıyoruz
    	vizeNotu = (int)  vizeNotuHesaplama( vizeNotu);
    	finalNotu = (int) finalNotuHesaplama( finalNotu);
    	double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
         
    	return ortalama;
        	}
        	
public static double vizeNotuHesaplama(int vizeNotu) {
	double not = 0.0;
	if (vizeNotu >= 80) {
		not = vizeNotu * 1.10;
	}
	else if (vizeNotu >= 60) {
		not = vizeNotu * 0.5;
	}
	if (not > 100)
	    not = 100;
	return not;
		
}

public static double finalNotuHesaplama(int finalNotu) {
	double not = 0.0;
	if (finalNotu >= 70) {
		not = finalNotu * 1.10;
	}
	else if (finalNotu >= 40) {
		not = finalNotu * 0.5;
	}
	if (not > 100)
	    not = 100;
	return not;
		
}

}

