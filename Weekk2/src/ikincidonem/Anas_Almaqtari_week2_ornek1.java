package ikincidonem;

import java.util.Iterator;

public class Anas_Almaqtari_week2_ornek1 {

	public static void main(String[] args) {
	int[] array = {3,2,8,9,10};
	isUnique(array);
	
	}
	public static boolean isUnique(int[] array) {
		for ( int sayac = 0; sayac<array.length-1 ; sayac++) {
			for (int sutun = sayac + 1; sutun < array.length; sutun++) {
				if (array[sayac]!= array[sutun]) {
					return true;
			}
			}
		}
	return false;
	}}
			


