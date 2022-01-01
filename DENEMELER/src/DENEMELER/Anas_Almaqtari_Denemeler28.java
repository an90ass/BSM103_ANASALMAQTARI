package DENEMELER;

public class Anas_Almaqtari_Denemeler28 {

	public static void main(String[] args) {
		// çarpıma işlemi kullanmadan klavyeden girilen 2 tam sayıyı çarpan recursive metodu yazacagım... 
 System.out.println(carpmaIslemi(6,4));
 
	}
	
 public static int carpmaIslemi(int sayi1 , int sayi2) {
	 if (sayi2 ==0)
		 return 0 ;
	 return sayi1 + carpmaIslemi(sayi1 , sayi2-1);
	 
 }
}
