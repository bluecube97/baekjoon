package bj_24_06_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String taiyaki = br.readLine();
            List<Character> taiyakiList = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                taiyakiList.add(taiyaki.charAt(j));
            }
            Collections.reverse(taiyakiList);

            for(char c : taiyakiList) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
