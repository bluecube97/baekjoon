package bj_24_03_11_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> primeList = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            getPrime(i, primeList);
        }
        int cnt = sc.nextInt();
        int[] primeArr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            primeArr[i] = sc.nextInt();
        }

        int primeCnt = 0;
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < primeList.size(); j++) {
                if (primeArr[i] == primeList.get(j)) {
                    primeCnt++;
                }
            }
        }
        System.out.println(primeCnt);

    }

    private static void getPrime(int num, List<Integer> primeList) {
        double a = Math.sqrt(num);

        for (int i = 2; i <= a; i++) {
            if (num % i == 0) {
                return;
            }
        }
        primeList.add(num);
    }
}
