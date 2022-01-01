package DENEMELER;

public class Anas_Almaqtari_Denemeler27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 1 , 3, 6, 7,12 };
		System.out.println(MinimumSayi(list));
	
	}
	
	public static int MinimumSayi (int [] list) {
		if (list.length < 2 )
			return 0 ;
		int min = list[1] - list [0];
		for (int sayac = 2 ; sayac < list.length ; sayac ++) {
			int gap = list [ sayac] - list [sayac -1];
			if (gap < min )
				min = gap;
			
		}
		return min ;
	}

}
