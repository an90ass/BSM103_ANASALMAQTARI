package Denemeler2;

public class Anas_Almaqtari_Denemeler37 {

	public static void main(String[] args) {
		//Bölme kullanmadan iki sayıyı bölme

      int deger = bolme(8,2);
        System.out.println(deger);
	}
        public static int bolme(int sayi1 , int sayi2) {
        	if (sayi2 == 0) {
        		return 0 ;
        	}
        	
        	if (sayi1 - sayi2 == 0)
        		return 1 ;
        	
        	if (sayi1 < sayi2)
        		return 0 ;
        	return 1 + bolme(sayi1 - sayi2 , sayi2 );
        	
        	
        	
        }
}
