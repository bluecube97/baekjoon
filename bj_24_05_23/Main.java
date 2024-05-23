package bj_24_05_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cardCnt = Integer.parseInt(br.readLine());
        int[] cards = new int[cardCnt];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cardCnt; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int haveCnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < haveCnt; i++) {
            int haveCard = Integer.parseInt(st.nextToken());

            if (Arrays.binarySearch(cards, haveCard) >= 0) {
                sb.append(1).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }
        System.out.println(sb);
    }
}
