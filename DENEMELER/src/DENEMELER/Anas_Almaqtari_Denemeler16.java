package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler16 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
		 
	 
	        System.out.println("How many rows you want in this pattern?");
	 
	        int rows = sc.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        for (int i = 1; i <= rows; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(i+" ");
	            }
	 
	            System.out.println();
	        }
	 
	 
	    }
	

	}


