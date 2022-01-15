package Denemeler2;

public class Anas_Almaqtari_Denemeler35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {11, 42, -5, 27, 0, 89};
		reverse(numbers);
		System.out.println(numbers);
	
	}
		public static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) 
		{
		int temp = numbers[i];
		numbers[i] = numbers[numbers.length - 1 
		- i];
		numbers[numbers.length - 1 - i] = temp; 
		}
		
	}

}
