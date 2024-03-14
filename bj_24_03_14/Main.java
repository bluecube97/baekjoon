package bj_24_03_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ten_a = new ArrayList<>();
        List<Integer> ten_b = new ArrayList<>();
        List<Integer> ten_c = new ArrayList<>();
        int cnt = 0;

        while (true) {

            ten_a.add(sc.nextInt());
            ten_b.add(sc.nextInt());
            ten_c.add(sc.nextInt());

            if (ten_a.get(cnt) == 0 && ten_b.get(cnt) == 0 && ten_c.get(cnt) == 0) {
                break;
            }
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            double ten_a_pow = Math.pow(ten_a.get(i), 2);
            double ten_b_pow = Math.pow(ten_b.get(i), 2);
            double ten_c_pow = Math.pow(ten_c.get(i), 2);

            if (ten_c_pow == ten_a_pow + ten_b_pow) {
                System.out.println("right");
            } else if (ten_b_pow == ten_a_pow + ten_c_pow) {
                System.out.println("right");
            } else if (ten_a_pow == ten_b_pow + ten_c_pow) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
}
