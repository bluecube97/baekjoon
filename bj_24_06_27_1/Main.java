package bj_24_06_27_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 77) {
                inputArr[i] = (char) (input.charAt(i) + 13);
            } else if (input.charAt(i) >= 78 && input.charAt(i) <= 90) {
                inputArr[i] = (char) (input.charAt(i) - 13);
            } else if (input.charAt(i) >= 97 && input.charAt(i) <= 109) {
                inputArr[i] = (char) (input.charAt(i) + 13);
            } else if (input.charAt(i) >= 110 && input.charAt(i) <= 122) {
                inputArr[i] = (char) (input.charAt(i) - 13);
            }
        }

        input = String.valueOf(inputArr);
        System.out.println(input);
    }
}
