package ikincidonem;

public class deneme {

	public static void main(String[] args) {
		
		int[] data = {10,12,13,18,20,26};
		System.out.println(binarySearch(data,20));
	}
		public static int binarySearch(int[] a, int target) {
		    int min = 0;
		    int max = a.length - 1;

		    while (min <= max) {
		        int mid = (min + max) / 2;
		        if (a[mid] < target) {
		            min = mid + 1;
		        } else if (a[mid] > target) {
		            max = mid - 1;
		        } else {
		            return mid;   // target found
		        }
		    }

		    return -(min + 1); 
	}
}
