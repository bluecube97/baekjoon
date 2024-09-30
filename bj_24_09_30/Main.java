package bj_24_09_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int top = Integer.parseInt(br.readLine());
        int mid = Integer.parseInt(br.readLine());
        int bot = Integer.parseInt(br.readLine());
        int cola = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());

        int set = 0;

        if (top < mid) {
            if (top < bot) {
                set += top;
            } else {
                set += bot;
            }
        } else {
            if (mid < bot) {
                set += mid;
            } else {
                set += bot;
            }
        }

        set += (cola < cider) ? cola : cider;

        System.out.println(set - 50);
    }
}
