package bj_24_03_30_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int cnt = 0;

        if (input.equals(" ")) {
            System.out.println(0);

        } else {
            input = input.trim();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == ' ') {
                    cnt++;
                }
            }
            System.out.println(cnt + 1);
        }
    }
}
