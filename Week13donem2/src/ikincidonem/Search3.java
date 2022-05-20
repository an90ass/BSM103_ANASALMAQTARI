package ikincidonem;

public class Search3 {

	public static void main(String[] args) {
	    int[] numbers2 = {15,19,24,29,40,50,61,73,89,90};

        int index =binarySearch(numbers2,40);
        if(index != -1) 
      	  System.out.println("Eleman indexsi: "+index);
        else
      	  System.out.println("Eleman bulunmadi");
	}
      public static int binarySearch(int[]numbers , int number) {
    	  int min = 0;
    	  int max = numbers.length-1;
    	  while(min <= max) {
    		  int mid = (max + min)/2;
    		  if (numbers[mid] == number)
    			  return mid;
    		  else if (numbers[mid] < number)
    			  min = mid +1;
    		  else
    			  max = mid -1;
    	  }
      return -1;
}}
