package ikincidonem;

public class Anas_Almaqtari_week2_ornek4 {

	public static void main(String[] args) {
	//Bir n tamsayı parametresini kabul eden ve ilk n karşılığının toplamını döndüren sumTo adında yinelemeli fonksiyonu yazın. sumTo(n) (1 + 1/2 + 1/3 + 1/4 + ... + 1/n) 

		System.out.println("Sonuc :" + sumTo((3)));
		
	}

	public static double sumTo(int n) {
		if (n < 0 )
     throw new IllegalArgumentException();
		
		if (n == 0)
			return 0.0 ;
		
		return (double)sumTo(n-1) + 1.0/n;
		
} }
