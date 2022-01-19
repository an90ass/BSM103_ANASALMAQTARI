package Denemeler2;

public class Anas_Almaqtari_Denemeler39 {

	public static void main(String[] args) {
		/*ÇIKIŞ :
		 
		kar 1 : 1
		kar 2 : 4
		kar 3 : 9
		kar 4 : 16
		kar 5 : 25 
		
		*/
		
		 for (int i = 1; i <= 5; i++) {

		      int result = karealma(i);
		      System.out.println("kar " + i + " : " + result);
		    }
		  }
		

			  private static int karealma(int x){
			    return x * x;
			  }

		   

}
