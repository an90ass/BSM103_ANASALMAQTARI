package ikincidonem;
import java.util.*;
public class Deneme {
	public static void main(String[] args) {
		String[] words = {"foo", "Bar", "baZ", "ball"};
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		// [Bar, baZ, ball, foo]

		List<String> words2 = new ArrayList<String>();
		for (String word : words) {
		words2.add(word);
		}
		Collections.sort(words2);
		System.out.println(words2);
		// [Bar, baZ, ball, foo]

	}
}
