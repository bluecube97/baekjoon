package bj_24_08_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> reverseNum = new ArrayList<>();

        for (int i = 1; i <= K; i++) {
            int num = N * i;
            String strNum = String.valueOf(num);
            String reverseStrNum = new StringBuilder(strNum).reverse().toString();
            reverseNum.add(Integer.parseInt(reverseStrNum));
        }

        System.out.println(reverseNum.stream().max(Integer::compareTo).get());
    }
}
