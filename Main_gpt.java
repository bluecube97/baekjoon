package bj_24_03_10_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main_gpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int word_cnt = sc.nextInt();
		String[] words = new String[word_cnt];

		for (int i = 0; i < word_cnt; i++) {
			words[i] = sc.next();
		}
		
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
		String[] result_words = hashSet.toArray(new String[0]);

		Arrays.sort(result_words, (a, b) -> {
			if (a.length() == b.length()) {
				return a.compareTo(b);
			}
			return Integer.compare(a.length(), b.length());
		});

		for (String word : result_words) {
			System.out.println(word);
		}

	}
}
