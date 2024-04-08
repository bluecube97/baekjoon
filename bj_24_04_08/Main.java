package bj_24_04_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j += 2) {
                sb.append(Integer.parseInt(input[j]) + Integer.parseInt(input[j + 1])).append(" ");
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
