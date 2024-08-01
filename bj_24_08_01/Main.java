package bj_24_08_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String a = br.readLine();
        String b = br.readLine();
        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");

        BigInteger ai = new BigInteger(a);
        BigInteger bi = new BigInteger(b);

        if (ai.compareTo(bi) < 0) {
            System.out.println(ai);
        } else {
            System.out.println(bi);
        }
    }
}
