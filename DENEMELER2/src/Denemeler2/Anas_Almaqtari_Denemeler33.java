package Denemeler2;

public class Anas_Almaqtari_Denemeler33 {

	public static void main(String[] args) {
		// OZYINLEME KULLANARAK FIBONACCI DIZISINI HESAPLAYAMA
       int x = fibonacci(11);
       System.out.println(x);
       
	}
    public static int fibonacci(int n) {
	 if (n <= 2)
		 return 1;
	 else 
		 return fibonacci(n-1)+ fibonacci(n -2);
	
}
}
