package bj_24_09_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isFBI = false;

        for (int i = 0; i < 5; i++) {
            String name = br.readLine();
            if (name.contains("FBI")) {
                System.out.print(i + 1 + " ");
                isFBI = true;
            }
        }
        if (!isFBI) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
