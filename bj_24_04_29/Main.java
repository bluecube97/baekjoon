package bj_24_04_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            arr2.add(arr[i] % 42);
        }

        int result = 0;

        for (int i = 0; i < 42; i++) {
            if (arr2.contains(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
