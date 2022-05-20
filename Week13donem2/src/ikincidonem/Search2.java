package ikincidonem;

public class Search2 {

	public static void main(String[] args) {
	    int[] numbers2 = {15,19,24,29,40,50,61,73,89,90};
       int index =indexOf2(numbers2,40);
        if(index != -1) 
      	  System.out.println("Eleman indexsi: "+index);
        else
      	  System.out.println("Eleman bulunmadi");
	}
        public static int indexOf2(int [] numbers, int number) {
        	int i =0;
        	while(i<numbers.length && numbers[i] <= number) {
        		if (numbers[i] == number)
        			return i ;
        		else i++;
        	}
      	  return -1;
        }
}


	


