package OdevlerHafta12;
import java.util.*;
public class Anas_Almaqtari_ornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int [] arr = new int[4];
		x = x+1;
		mystery (x,arr);
		System.out.println(x + " " + Arrays.toString(arr));
		x = x + 1 ;
		mystery (x,arr);
	System.out.println(x + " " + Arrays.toString(arr));
		}
		
		public static void mystery(int x , int[] arr) {
		x = x+1;
		arr[x] = arr[x] + 1 ;
		System.out.println(x + " " + Arrays.toString(arr));
		}

	}
