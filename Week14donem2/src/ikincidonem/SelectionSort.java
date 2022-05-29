package ikincidonem;
public class SelectionSort {
	public static void main(String[] args) {
		int [] array = {11,12,99,88,44,90};
		SelectionSort o = new SelectionSort();
		System.out.print("Sirasiz Dizi : ");
		o.PrintArray(array);
		o.sort(array); 
		System.out.print("Sirali Dizi : ");
		o.PrintArray(array);
	}
		void sort (int[]array) {
			for (int index = 0; index < array.length-1; index++) {
				int min_index=index;
			for (int j = index+1 ; j < array.length; j++) {
				if(array [j] < array[min_index]) {
					min_index=j;		
				}
			}
			
			int tmp= array [min_index];
			array[min_index ]= array[index];
			array[index]=tmp;
		    }
		}
	  void PrintArray(int []array ) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
					}
		System.out.println();	
	}
}


