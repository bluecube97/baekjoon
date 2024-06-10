package bj_24_06_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double S = Integer.parseInt(st.nextToken());
        double M = Integer.parseInt(st.nextToken());
        double L = Integer.parseInt(st.nextToken());
        double XL = Integer.parseInt(st.nextToken());
        double XXL = Integer.parseInt(st.nextToken());
        double XXXL = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        double TCnt = Math.ceil(S / T) +  Math.ceil(M / T) +  Math.ceil(L / T) +  Math.ceil(XL / T) +  Math.ceil(XXL / T) +  Math.ceil(XXXL / T);

        System.out.println((int) TCnt);
        System.out.print(people / P + " ");
        System.out.println(people % P);
    }
}
