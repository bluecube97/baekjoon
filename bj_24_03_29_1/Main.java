package bj_24_03_29_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.replaceAll(" ", "");
        int[] inputArr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            inputArr[i] = Integer.parseInt(input.substring(i, i + 1));
        }

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = inputArr[i] * inputArr[i];
        }

        int result = 0;

        for (int i = 0; i < inputArr.length; i++) {
            result += inputArr[i];
        }

        System.out.println(result % 10);
    }
}
