package Denemeler;

import java.util.Scanner;

public class Anas_Almaqtari_Denemeler5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[4][4];
        int SOD = 0;                     // SAD değişkeni, öğeleri Diagonal1'de depolayacaktır.

        int SAD = 0;                     // SAD değişkeni, Diagonal'in üzerindeki öğeleri depolayacaktır.

        int SUD = 0;                     //  SAD değişkeni, Diagonal'in altindaki öğeleri depolayacaktır
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                do
                {
                    System.out.print("Enter matrix["+i+"]["+j+"]: ");
                    matrix[i][j] = input.nextInt();
                }
                while( matrix[i][j] < 0 );
            }
            System.out.print("\n");
        }
 
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
 
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                if ( i == j )
                {
                    SOD = SOD + matrix[i][j];
                }
                else if ( i < j )
                {
                    SAD = SAD + matrix[i][j];
                }
                else if ( i > j )
                {
                    SUD = SUD + matrix[i][j];
                }
            }
        }
 
        System.out.print("\n");
        System.out.print("The sum of elements above the diagonal is: " +SAD+ "\n");
        System.out.print("The sum of elements on the diagonal is: " +SOD+ "\n");
        System.out.print("The sum of elements under the diagonal is: " +SUD+ "\n");
 
    }
 


		    
	

}
