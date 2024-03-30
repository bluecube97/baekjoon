package bj_24_03_30;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);

        int M = sc.nextInt();
        int[] testCaseArr = new int[M];

        for (int i = 0; i < M; i++) {
            testCaseArr[i] = sc.nextInt();
        }

//        for (int key : testCaseArr){
//            if (Arrays.binarySearch(numArr, key) >= 0){
//                System.out.println(1);
//            }else {
//                System.out.println(0);
//            }
//        }

        for (int key : testCaseArr) {
            if (binarySearch(numArr, key)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
