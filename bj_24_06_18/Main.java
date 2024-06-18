package bj_24_06_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (!isSorted(arr)) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    printArray(arr);
                }
            }
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}