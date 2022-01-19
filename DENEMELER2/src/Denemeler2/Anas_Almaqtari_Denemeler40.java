package Denemeler2;
import java.util.Scanner;

public class Anas_Almaqtari_Denemeler40 {

	public static void main(String[] args) {
		// Girdi olarak negatif olmayan bir tamsayı alan ve sayı bir palindrom ise true döndüren bir yöntem yazacağım ; aksi halde false döndürür

		
		        Scanner sc = new Scanner(System.in);
		     
		        int num;

		        System.out.print("Bir Sayi giriniz: ");
		        num = sc.nextInt();
		        
		        if(Palindrom(num))
		        {
		            System.out.println("Sayi palindromdur ");
		        }
		        else
		        {
		            System.out.println("Sayi palindrom değil ");
		        }
		    }


		    public static boolean Palindrom(int number)
		    {
		        int temp = number;
		        int kalan;
		        int tersi = 0;
		        
		        while(temp > 0)
			{
		        	kalan = temp % 10;
		            temp = temp / 10;
		            tersi = tersi * 10 + tersi;
			}
		        
		        return tersi == number;
		    }
	

	}

