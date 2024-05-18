package bj_24_05_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int tac = 2; tac <= input; tac += 2) { // 택희가 받는 사탕의 수 (짝수)
            for (int young = 1; young < input; young++) { // 영훈이가 받는 사탕의 수
                int nam = input - tac - young; // 남규가 받는 사탕의 수
                if (nam > 0 && nam >= young + 2) { // 남규는 영훈이보다 2개 이상 많은 사탕을 가져야 한다.
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
