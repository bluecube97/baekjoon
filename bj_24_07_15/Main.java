package bj_24_07_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (char c : str.toCharArray()) {
                if (c > 96 && c < 123) {
                    numList.add(c - 65);
                }
            }
        }
    }
}
