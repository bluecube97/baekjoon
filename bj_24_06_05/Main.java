package bj_24_06_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int taiwan = Integer.parseInt(br.readLine());
        System.out.println(taiwan - 543);
    }
}
