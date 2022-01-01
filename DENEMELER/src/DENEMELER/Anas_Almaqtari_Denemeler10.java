package DENEMELER;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.print("Dizi Boyutunu Girin :");
int DiziBoyutunu = sc.nextInt();
int [] dizi = new int [DiziBoyutunu];

for (int index = 0; index < dizi.length; index++) {
    System.out.print(" Dizi elemenlerini Girin :");
    dizi[index] = sc.nextInt();
    
}

System.out.print("Eklemek İstediğiniz elemen Girin :");
int  İstediğinizelemen = sc.nextInt();


System.out.print(" Eklenecek Konumu Girin :");
int Konumu = sc.nextInt();


 
 for (int index = dizi.length ; index  >= Konumu; index --) {
     dizi[index] = dizi[index - 1];
    
 
    dizi ++;
 
     dizi[Konumu - 1] = İstediğinizelemen;
 
     for (index = 0; index < dizi.length; index++) {
    	 System.out.print("Dizideki Tüm Değerler :" +  dizi[index]);
 } 
	}

	}}
