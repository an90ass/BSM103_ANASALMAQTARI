package ikincidonem;
class MergeSort
{
	void merge(int arr[], int sol, int orta, int sag)
	{
		int sayi1 = orta - sol + 1;
		int sayi2 = sag - orta;
		int L[] = new int[sayi1];
		int R[] = new int[sayi2];

		for (int i = 0; i < sayi1; ++i)
			L[i] = arr[sol + i];
		for (int j = 0; j < sayi2; ++j)
			R[j] = arr[orta + 1 + j];

		int i = 0, j = 0;
		int k = sol;
		
		while (i < sayi1 && j < sayi2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < sayi1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < sayi2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int sol, int sag)
	{
		if (sol < sag) {
			int orta =sol+ (sag-sol)/2;
			sort(arr, sol, orta);
			sort(arr, orta + 1, sag);
			merge(arr, sol, orta, sag);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		MergeSort ob = new MergeSort();
		System.out.println("Sirasiz Dizi: ");
		printArray((arr));
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("Sirali Dizi: ");
		printArray((arr));
	}
}