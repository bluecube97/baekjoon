package bj_24_08_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int multiTab = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = 0; i < multiTab; i++) {
            int plug = Integer.parseInt(br.readLine());
            result += plug - 1;
        }

        System.out.println(result);
    }
}
