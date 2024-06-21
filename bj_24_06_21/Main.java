package bj_24_06_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            } else {
                System.out.print(input + " ");
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < input.length(); i++) {
                    list.add(Integer.parseInt(String.valueOf(input.charAt(i))));
                }
                while (true) {
                    int output = 1;
                    if (list.size() == 1) {
                        break;
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            output *= list.get(i);
                        }
                        System.out.print(output + " ");
                        input = String.valueOf(output);
                        list.clear();
                        for (int i = 0; i < input.length(); i++) {
                            list.add(Integer.parseInt(String.valueOf(input.charAt(i))));
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
