package bj_24_07_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sums = new int[N];

        for (int i = 0; i < N; i++) {
            sums[i] = scanner.nextInt();
        }

        // 학생들이 가질 수 있는 최대 사탕 수
        final int MAX_CANDIES = 100000;

        // 브루트포스 탐색
        for (int a1 = 0; a1 <= MAX_CANDIES; a1++) {
            int prevCandy = a1;
            int firstCandy = a1;
            boolean valid = true;

            // 각 학생의 사탕 개수를 순차적으로 구하며 유효성을 검사
            for (int i = 1; i < N; i++) {
                int currentCandy = sums[i - 1] - prevCandy;
                if (currentCandy < 0 || currentCandy > MAX_CANDIES) {
                    valid = false;
                    break;
                }
                prevCandy = currentCandy;
            }

            // 마지막 학생과 첫 번째 학생의 사탕 수를 체크
            if (valid && sums[N - 1] == prevCandy + firstCandy) {
                prevCandy = firstCandy;
                System.out.println(prevCandy); // 첫 번째 학생의 사탕 수

                // 나머지 학생들의 사탕 수 출력
                for (int i = 1; i < N; i++) {
                    int currentCandy = sums[i - 1] - prevCandy;
                    System.out.println(currentCandy);
                    prevCandy = currentCandy;
                }
                break;
            }
        }

        scanner.close();
    }
}
