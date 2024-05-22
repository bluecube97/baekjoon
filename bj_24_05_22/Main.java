package bj_24_05_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxCard = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> cardList = new LinkedList<>();
        for (int i = 0; i < maxCard; i++) {
            cardList.add(i + 1);
        }

        while (cardList.size() > 1) {
            sb.append(cardList.poll()).append(" ");
            cardList.add(cardList.poll());
        }
        sb.append(cardList.poll());
        System.out.println(sb);
    }
}
