package OdevlerHafta12;
import java.util.Scanner;
public class Anas_Almaqtari_ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print("Bir Kelime giriniz: ");
		String kelime = sc.nextLine();
		System.out.println("Gerelen kelime = " + kelime);
		System.out.println("Kelminin tersten yazilmis hali : "+ tersten(kelime));
		      }
			public static String tersten(String kelime) {
				
				String ters = "";
				for(int  index = kelime.length(); index > 0 ;index--) {
					ters += kelime.substring(index-1,index);
				}
			 
				return ters;	
				
			}

}