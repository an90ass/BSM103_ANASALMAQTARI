package Denemeler2;

public class Anas_Almaqtari_Denemeler32 {

	public static void main(String[] args) {
		// OZYINLEME
		int x = faktoriyel(5);
		System.out.println(x);
		
	}
        public static int faktoriyel(int n) {
        	 
        	if (n == 1)
        		return 1;
        	else 
        		return n * faktoriyel (n -1 );
        	
        	
        }
}
