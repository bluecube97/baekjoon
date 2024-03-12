package bj_24_03_12_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();

        int result = (int) Math.ceil((double) (height - down) / (up - down));

        System.out.println(result);

    }
}
