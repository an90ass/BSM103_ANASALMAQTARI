package ikincidonem;

public class deneme2 {

	public static void main(String[] args) {
		int[] data = {17, 29, 11, 4, 20, 8};
		System.out.println(range(data));
	}
	
		public static int range(int[] numbers) {
		    int max = numbers[0];     // find max/min values
		    int min = max;
		    for (int i = 1; i < numbers.length; i++) {
		        if (numbers[i] < min) {
		            min = numbers[i];
		        }
		        if (numbers[i] > max) {
		            max = numbers[i];
		        }
		    }
		    return max - min;

	}

}
// outPut : 25
