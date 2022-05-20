package ikincidonem;

public class Search4 {

	public static void main(String[] args) {
		 int[] numbers2 = {15,19,24,29,40,50,61,73,89,90};
	        int index =binarySearchA(numbers2,61,0,numbers2.length-1);
	        if(index != -1) 
	      	  System.out.println("Eleman indexsi: "+index);
	        else
	      	  System.out.println("Eleman bulunmadi");
		}
	      public static int binarySearchA(int[]numbers , int number, int min , int max) {
	    	  if(min > max)
	    		  return -1;
	    		  else {
	    			  int mid = (min + max)/2;
	    			  if(numbers[mid] == number)
	    				  return mid;
	    			  else if (numbers[mid] < number)
	    				  return binarySearchA(numbers , number , mid +1 , max);
	    			  else 
	    				  return binarySearchA(numbers , number , min , mid -1);	
	}
	      }
}
