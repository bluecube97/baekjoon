package bj_24_04_29_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while (true) {
            if (!(input.contains("1") || input.contains("2") || input.contains("3") || input.contains("5") || input.contains("6") || input.contains("8") || input.contains("9") || input.contains("0"))) {
                System.out.println(input);
                break;
            }
            input = String.valueOf((Integer.parseInt(input) - 1));
        }
    }
}
