package bj_24_08_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int people = 0;
        int maxPeople = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int output = Integer.parseInt(st.nextToken());
            int input = Integer.parseInt(st.nextToken());

            people -= output;
            people += input;

            maxPeople = Math.max(maxPeople, people);
        }

        System.out.println(maxPeople);
    }
}
