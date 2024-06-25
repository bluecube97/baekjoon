package bj_24_06_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String direction = br.readLine();
        String st = br.readLine();
        String A = String.valueOf(st.charAt(0)); // 0, 0
        String B = String.valueOf(st.charAt(1)); // 0, 1
        st = br.readLine();
        String C = String.valueOf(st.charAt(0)); // 1, 0
        String D = String.valueOf(st.charAt(1)); // 1, 1

        String T = ".OP.";
        String F = "I..P";
        String Lz = "O..P";

        String test = "";

        switch (direction) {
            case "E":
                test = C + A + D + B;
                Testing(T, F, Lz, test);
                break;
            case "W":
                test = B + D + A + C;
                Testing(T, F, Lz, test);
                break;
            case "S":
                test = A + B + C + D;
                Testing(T, F, Lz, test);
                break;
            case "N":
                test = D + C + B + A;
                Testing(T, F, Lz, test);
                break;
        }
    }

    private static void Testing(String t, String f, String lz, String test) {
        if (test.equals(t)){
            System.out.println("T");
        } else if (test.equals(f)) {
            System.out.println("F");
        } else if (test.equals(lz)) {
            System.out.println("Lz");
        } else {
            System.out.println("?");
        }
    }
}
