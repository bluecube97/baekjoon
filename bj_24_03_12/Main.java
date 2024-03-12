package bj_24_03_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt(); // 입력값
        int[] con_arr; // 생성자의 각 자리를 분해하여 입력받는 배열

        for (int i = 1; i < input; i++) {
            String con = Integer.toString(i); // 0 ~ 입력값까지의 생성자를 문자열로 형변환
            int dis = 0; // 분해합
            int str_len = con.length(); // 생성자의 자릿수
            con_arr = new int[str_len]; // 초기화

            for (int j = 0; j < str_len; j++) {
                con_arr[j] = Integer.parseInt(con.substring(j, j + 1)); // 생성자의 각 자리를 정수형으로 형변환
            }

            // 분해합 계산
            for (int j = 0; j < str_len; j++) {
                dis += con_arr[j];
            }
            dis += Integer.parseInt(con);

            // 분해합이 입력값과 같으면 i를 리턴 후 프로그램 종료
            if (dis == input) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0); // 생성자가 없으면 0 출력

    }
}
