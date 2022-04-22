package ikincidonem;
public class ReferenceMystery {
public static void main(String[] args) {
		String isim = "Jenet";
		int para = 30;
		Account  a = new Account (isim , para); 

		mystery(isim, para, a);
		System.out.println(isim + " , " + para + " , "+ a);	

		para = para + 10 ; 
		a.isim  = "Biliy";

		mystery(isim, para, a);
		System.out.println(isim + " , " + para + " , "+ a);	
	}
		public static void mystery(String isim , int para , Account a ) {
			a.para ++;
			isim = "Susuan";
			System.out.println(isim + " , " + para + " , "+ a);	
		}
}
/*
OutPut:

Susuan , 30 , Jenet : $31
Jenet , 30 , Jenet : $31
Susuan , 40 , Biliy : $32
Jenet , 40 , Biliy : $32


*/

