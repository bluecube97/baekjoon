package bj_24_03_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < cnt; i++) {
            if (arr[i] < x){
                System.out.println(arr[i]);
            }
        }
    }
}
