package Denemeler;
import java.util.Scanner;
public class Anas_Almaqtari_Hafta11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("pleas Enter your number : ");
int number =sc. nextInt();
number = Math.abs(number);
int sum =0;
while (number > 0) {
	sum = sum + (number% 10);
	number = number / 10;
	
}

    System.out.println("TOPLAM = " + sum);
    
	}

}
