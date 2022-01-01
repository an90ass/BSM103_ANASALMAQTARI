package DENEMELER;
import java.util.Scanner;

public class Anas_Almaqtari_Denemeler26 {

	public static void main(String[] args) {
		/*  
		 *    
	*	                            
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *                    */ 
   
		   Scanner sc = new Scanner(System.in);
		   
		 //Kullanıcıdan NanRows değeri alınması	  
	        System.out.println("Pirlantanizda Kas Sira İstiyorsunuz?");
	  
	        int NanRows = sc.nextInt();
	         
	         
	        int midRow = (NanRows)/2;
	  
	        // Satır 1 ile başlatılıyor	  
	        int row = 1;
	  
	        System.out.println("İste Pirlantaniz: ");
	  
	        //Elmasın üst yarısının yazdırılması
	         
	        for (int satir = midRow; satir> 0; satir--)
	        {
	            //Her satırın başındaki boşluklara yazdırma
	  
	            for (int bosluk = 1; bosluk <= satir; bosluk++)
	            {
	                System.out.print(" ");
	            }
	  
	            //Her satırın sonunda j *'leri yazdırma
	  
	            for (int bosluk = 1; bosluk <= row; bosluk++)
	            {
	                System.out.print(" * ");
	            }
	  
	            System.out.println();
	  
	            //Satırı artırma
	  
	            row++;
	        }
	         
	        //Elmasın alt yarısının basılması
	         
	        for (int satir2 = 0; satir2 <= midRow; satir2++) 
	        {
	            //Her satırın başındaki boşluklara yazdırma
	             
	            for (int bosluk2 = 1; bosluk2 <= satir2; bosluk2++) 
	            {
	                System.out.print(" ");
	            }
	             
	         // Her satırın sonunda j *'leri yazdırma
	            
	            for (int bosluk2 = row; bosluk2 > 0; bosluk2--) 
	            {
	                    System.out.print("* ");
	            }
	             
	            System.out.println();
	             
	         // Satırı azaltma	             
	            row--;
	        }
	    }
	
	

}
