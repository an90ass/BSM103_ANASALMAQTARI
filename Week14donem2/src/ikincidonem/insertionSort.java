package ikincidonem;
public class insertionSort {
	  public static void main(String[] args) {
    	  int[] arr = {-2,-1,100,31,41,45,3};
    	  insertionSort pp = new insertionSort();
    	  pp.insertionSort(arr);
    	  pp.printArr(arr);
      }
void insertionSort(int [] arr) {
for (int index = 1; index < arr.length; index++) {
	int anahtar = arr[index];
	int j = index -1 ; 
	while(j>= 0 && arr[j] > anahtar){
		arr[j+1] = arr[j];
		j --;
	}
	arr[j+1] = anahtar;		
}
}
  void printArr(int [] arr) {
 for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");	
}
 System.out.println();
  }
}
