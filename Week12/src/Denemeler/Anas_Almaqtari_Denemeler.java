package Denemeler;

import java.util.Scanner;

public class Anas_Almaqtari_Denemeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int a; 
		int b ;
		int [][] matrix;
		do { 
			System.out.print("Enter The Number Of Row : ");
			a =input.nextInt();

			} while ( a<=0);
		do { 
			System.out.print("Enter The Number Of columns : ");
			b =input.nextInt();

			} while ( b<=0);
		matrix = new int[a][b];
		System.out.print("\n");
			
			
			
		for (int i=0; i<a; i++) { 
			for (int j=0; j<b; j++) {
				 System.out.print("Enter matrix[" +i+ "][" +j+ "]: ");
		         matrix[i][j] = input.nextInt();
		     }
			System.out.print("\n");

		}for (int i=0; i<a; i++)
		{
		    for (int j=0; j<b; j++)
		    {
		        System.out.print(matrix[i][j] + "\t");
		    }
		    System.out.print("\n");
		}

		System.out.print("\n");

		}

		}

