package bj_24_07_18_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int wordNum = 0;

        for (char c : word.toCharArray()) {
            if (c > 64 && c < 91)
                wordNum += c - 'A' + 27;
            else if (c > 96 && c < 123)
                wordNum += c - 'a' + 1;
        }

        if (isPrime(wordNum))
            System.out.println("It is a prime word.");
        else
            System.out.println("It is not a prime word.");
    }

    private static boolean isPrime(int wordNum) {
        if (wordNum == 1)
            return true;
        for (int i = 2; i <= Math.sqrt(wordNum); i++) {
            if (wordNum % i == 0)
                return false;
        }
        return true;
    }
}
