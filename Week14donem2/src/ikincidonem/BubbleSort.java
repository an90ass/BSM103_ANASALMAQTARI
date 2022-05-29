package ikincidonem;
public class BubbleSort {
    void BubbleSort(int [] arr) {
    	for (int i = 0; i < arr.length -1; i++) {
			for (int index = 0; index < arr.length -i-1; index++) {
				if(arr[index] > arr[index +1 ] ) {
					int tmp = arr[index];
					arr[index] = arr[index +1];
					arr[index+1] = tmp;				
				}}}}
		void printArry(int []arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
	}
			System.out.println();
		}
    public static void main(String[] args) {
    	int [] arr = {-1,131,141,2,14,0};
    	BubbleSort bb = new BubbleSort();
    	bb.BubbleSort(arr);
    	bb.printArry(arr);
    }
    
}
 