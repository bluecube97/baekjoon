package bj_24_04_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            int seme = Integer.parseInt(br.readLine());
            String[] input = new String[seme * 2];
            int sumCredit = 0;
            float sumGPA = 0;
            for (int j = 0; j < input.length; j += 2) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                input[j] = st.nextToken();
                input[j + 1] = st.nextToken();
            }
            int _Credit = 0;
            for (int k = 0; k < input.length; k++) {
                if (k % 2 == 0) {
                    _Credit = Integer.parseInt(input[k]);
                    sumCredit += _Credit;
                } else {
                    sumGPA += Float.parseFloat(input[k]) * _Credit;
                }
            }
            sb.append(sumCredit).append(" ").append(Math.round(sumGPA / sumCredit * 10) / 10.0).append("\n");
        }
        System.out.println(sb);
    }
}
