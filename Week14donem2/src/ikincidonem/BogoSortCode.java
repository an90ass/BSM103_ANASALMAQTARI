package ikincidonem;
import java.util.*;
public class BogoSortCode {
	public static void main(String[] args) {
		int[] a = {12,131,14,51,198,10};
		System.out.println("Befor Sorting :" + isSorted(a));
		System.out.println(Arrays.toString(a));
		bogoSort(a);
		System.out.println("After Sorting :" + isSorted(a));
		System.out.println(Arrays.toString(a));
	}
		public static void bogoSort(int[] a) {
			while (!isSorted(a)) {
			shuffle(a);
			}
			}
		public static void shuffle(int[] a) {
			for (int i = 0; i < a.length - 1; i++) {
		int range = a.length - 1 - (i + 1) + 1;
			int j = (int) (Math.random() * range + (i + 1));
			swap(a, i, j);
			}
			}
			public static void swap(int[] a, int i, int j) {
			if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}      			
		}
			public static boolean isSorted(int[] a) {
			for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
			return false;
			}
			}
			return true;
			}
	}
/* OutPut: 
 
 Befor Sorting :false
[12, 131, 14, 51, 198, 10]
After Sorting :true
[10, 12, 14, 51, 131, 198]

*/
