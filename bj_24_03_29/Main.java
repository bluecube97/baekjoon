package bj_24_03_29;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numList.add(sc.nextInt());
        }

        int M = sc.nextInt();
        List<Integer> testCaseList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            testCaseList.add(sc.nextInt());
        }

        ListIterator<Integer> iterator = testCaseList.listIterator();



        /*for (Integer e : testCaseList) {
            if (numList.contains(e)) {
                System.out.println(1);
            } else System.out.println(0);
        }*/


    }
}
