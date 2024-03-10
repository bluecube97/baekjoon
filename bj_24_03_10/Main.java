package bj_24_03_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int card_cnt = sc.nextInt();
		int card_max = sc.nextInt();

		List<Integer> card_deck = new ArrayList<Integer>();
		for (int i = 0; i < card_cnt; i++) {
			card_deck.add(sc.nextInt());
		}

		int closeSum = 0;

		for (int i = 0; i < card_deck.size() - 2; i++) {
			for (int j = i + 1; j < card_deck.size() - 1; j++) {
				for (int k = j + 1; k < card_deck.size(); k++) {
					int result = card_deck.get(i) + card_deck.get(j) + card_deck.get(k);

					if (result > closeSum && result <= card_max) {
						closeSum = result;
					}
				}
			}
		}
		
		System.out.println(closeSum);

	}

}
