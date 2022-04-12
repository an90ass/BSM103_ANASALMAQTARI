package ikincidonem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ornek {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("data.txt"));
		while (input.hasNext()) {
		String word = input.next();
		allWords.add(word);
		}
		System.out.println(allWords);
		// remove all plural words
		for (int i = 0; i < allWords.size(); i++) {
		String word = allWords.get(i);
		if (word.endsWith("s")) {
		allWords.remove(i);
		i--;
		}
		
		}


	}
	}
