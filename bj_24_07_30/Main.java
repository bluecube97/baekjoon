package bj_24_07_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String[] arrA = a.split("");
            String b = st.nextToken();
            String[] arrB = b.split("");
            Arrays.sort(arrA);
            Arrays.sort(arrB);

            if (Arrays.equals(arrA, arrB)) {
                System.out.println(a + " & " + b + " are anagrams.");
            } else {
                System.out.println(a + " & " + b + " are NOT anagrams.");
            }
        }
    }
}
