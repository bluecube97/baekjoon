package bj_24_03_10_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int word_cnt = sc.nextInt();
		List<String> word = new ArrayList<String>();
		List<Integer> word_size = new ArrayList<Integer>();

		for (int i = 0; i < word_cnt; i++) {
			word.add(sc.next());
		}

		word = word.stream().distinct().sorted().collect(Collectors.toList());
		word_cnt = word.size();

		for (int i = 0; i < word_cnt; i++) {
			word_size.add(word.get(i).length());
		}

		String temp_str;
		int temp_int;

		for (int i = 0; i < word_cnt - 1; i++) {
			for (int j = i + 1; j < word_cnt; j++) {
				if (word_size.get(i) > word_size.get(j)) {
					temp_str = word.get(i);
					word.set(i, word.get(j));
					word.set(j, temp_str);

					temp_int = word_size.get(i);
					word_size.set(i, word_size.get(j));
					word_size.set(j, temp_int);
				}
			}
		}

		for (int i = 0; i < word_cnt; i++) {
			System.out.println(word.get(i));
		}

	}

}
