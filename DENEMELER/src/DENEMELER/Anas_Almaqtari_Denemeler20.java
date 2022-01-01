package DENEMELER;

import java.util.Scanner;

public class Anas_Almaqtari_Denemeler20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		do {
		    System.out.print("Enter the number of lines: ");
		    n = input.nextInt();
		}
		while (n < 1 || n > 9);

		for (int i = 1; i <= n; i++)
		{
		    for (int j = 1; j <= n; j++)
		    {
		        if (j == 1 || j == i || i == n)
		        {
		            System.out.print(j + " ");
		        }
		        else 
		        {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		
		}
		


	}

}
