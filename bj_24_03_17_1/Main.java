package bj_24_03_17_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long pact_num = pact(n);
        String pact_num_s = Long.toString(pact_num);
        int cnt = 0;

        for (int i = pact_num_s.length(); i > 0; i--) {
            if (pact_num_s.charAt(i - 1) != '0') {
                break;
            }
            cnt++;
        }

        System.out.println(cnt);

    }

    public static long pact(long n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else return n * pact(n - 1);
    }
}
