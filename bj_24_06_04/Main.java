package bj_24_06_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int oneHand = Integer.parseInt(st.nextToken());
        int noLook = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());
        int club = Integer.parseInt(br.readLine());

        int champion = 0;

        for (int i = 0; i < club; i++) {
            int point = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                point += a * oneHand + b * noLook + c * pawn;
            }
            champion = Math.max(champion, point);
        }

        System.out.println(champion);
    }
}
