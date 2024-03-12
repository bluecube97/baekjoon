package bj_24_03_12_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();
        int reach = 0;
        int cnt;

        for (cnt = 1; ; cnt++) {
            reach += up;
            if (reach >= height){
                System.out.println(cnt);
                return;
            }
            reach -= down;
        }
    }
}
