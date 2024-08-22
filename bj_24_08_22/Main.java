package bj_24_08_22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(",");

        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
        sc.close();
    }
}
