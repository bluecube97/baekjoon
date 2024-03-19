package bj_24_03_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        List<Integer> num_list = new ArrayList<>();
        num_list.add(2);

        for (int i = 3; i < 1000000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                num_list.add(i);
            }
        }

        for (int i = 0; i < num_list.size(); i++) {
            if (num_list.get(i) >= min && num_list.get(i) <= max){
                System.out.println(num_list.get(i));
            }
        }

    }
}
