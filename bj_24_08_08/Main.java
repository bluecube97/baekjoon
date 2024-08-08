package bj_24_08_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[i] = str;
        }

        String firstStr = arr[0];
        int[] difIndex = new int[firstStr.length()];

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < firstStr.length(); j++) {
                if (arr[i].charAt(j) != arr[i + 1].charAt(j)) {
                    difIndex[j]++;
                }
            }
        }

        for (int i = 0; i < firstStr.length(); i++) {
            System.out.print(difIndex[i] > 0 ? "?" : firstStr.charAt(i));
        }
    }
}
