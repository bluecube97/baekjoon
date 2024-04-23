package bj_24_04_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = st.countTokens();
            String[] arr = new String[cnt];

            for (int j = 0; j < cnt; j++) {
                arr[j] = st.nextToken();
            }

            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = cnt - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
