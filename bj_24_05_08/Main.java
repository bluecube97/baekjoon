package bj_24_05_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cardCounts = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < testcase; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }

        int haveCard = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < haveCard; i++) {
            int card = Integer.parseInt(st.nextToken());
            sb.append(cardCounts.getOrDefault(card, 0)).append(" ");
        }
        System.out.println(sb);
    }
}