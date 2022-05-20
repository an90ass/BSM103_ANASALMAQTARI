package ikincidonem;
public class Search {
	public static void main(String[] args) {
          int[] numbers = {24,19,15,61,73,29,89,90,20};
          int index =indexOf(numbers,90);
          if(index != -1) 
        	  System.out.println("Eleman indexsi: "+index);
          else
        	  System.out.println("Eleman bulunmadi");
	}
          public static int indexOf(int [] numbers, int number) {
        	  for (int i = 0; i < numbers.length; i++) {
				if(numbers[i] == number) 
					return i;	
        	  }
				 return -1 ;
          }
        }
