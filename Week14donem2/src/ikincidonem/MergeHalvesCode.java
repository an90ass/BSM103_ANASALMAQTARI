package ikincidonem;
import java.util.*;
public class MergeHalvesCode {

	public static void main(String[] args) {

		int [] a = {3,8,2,22,12,11};
		System.out.println("Befor Sorting :"+Arrays.toString(a));
		mergeSort(a);
		System.out.println("After Sorting :"+Arrays.toString(a));

	}
	public static void merge(int[] result, int[] left, int[] right) {
			int i1 = 0; // index into left array
			int i2 = 0; // index into right array
			for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length ||
			(i1 < left.length && left[i1] <= right[i2])) {
			result[i] = left[i1]; // take from left
			i1++;
			} else {
			result[i] = right[i2]; // take from right
			i2++;
			}}
			
			}
			
			public static void mergeSort(int[] a) {
				// split array into two halves
				int[] left = Arrays.copyOfRange(a, 0, a.length/2);
				int[] right = Arrays.copyOfRange(a, a.length/2, a.length);
				// sort the two halves
		
				// merge the sorted halves into a sorted whole
				merge(a, left, right);
			 	}

			}


