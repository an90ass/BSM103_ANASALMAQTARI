package Denemeler2;

public class Anas_Almaqtari_Denemeler36 {

	public static void main(String[] args) {
		int[] list = { 1 , 3, 6, 7,12 };
		System.out.println(MaksimumSayi(list));

	}
	
	public static int MaksimumSayi (int [] list) {
		if (list.length < 2 )
			return 0 ;
		int max = list[1] - list [0];
		for (int sayac = 1 ; sayac < list.length ; sayac ++) {
			int gap = list [ sayac] - list [sayac -1];
			if (gap > max )
				max = gap;
			
		}
		return max ;
	}


	

}

