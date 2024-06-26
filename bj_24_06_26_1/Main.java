package bj_24_06_26_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String binA = Integer.toBinaryString(A);
        String binB = Integer.toBinaryString(B);

        while (binA.length() < binB.length()) binA = "0" + binA;
        while (binB.length() < binA.length()) binB = "0" + binB;

        StringBuilder sbC = new StringBuilder();
        int len = binA.length();

        for (int i = 0; i < len; i++) {
            sbC.append((char) ('0' + ((binA.charAt(i) - '0') ^ (binB.charAt(i) - '0'))));
        }

        String binC = sbC.toString();
        System.out.println(Integer.parseInt(binC, 2));
    }
}
