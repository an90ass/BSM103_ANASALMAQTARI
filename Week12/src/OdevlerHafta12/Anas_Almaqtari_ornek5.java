package OdevlerHafta12;
import java.util.Scanner;
public class Anas_Almaqtari_ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

				// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("BIR KELIME GIRINIZ : ");
		String inputStr = sc.nextLine();
		System.out.println("Bir Sayi Giriniz : ");
		int inputInt = sc.nextInt();

		 splitter(inputStr, inputInt);
		}
			
			 public static void splitter(String str, int n) {
				 int index = 0;
				 for (  int i =0; i <str.length() /n; i++) {
					 System.out.println(str.substring(index , str.length()));
					 index = index + n;
					 
					 
				 }
				 
			 }

		}
