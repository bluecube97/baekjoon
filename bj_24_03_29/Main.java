package bj_24_03_29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] testCaseArr = new int[M];


        for (int i = 0; i < M; i++) {
            testCaseArr[i] = sc.nextInt();
        }

        heapsort(numArr);

        for (int i = 0; i < M; i++) {
            int mid = findDownMid(numArr.length);
            binarySearch(numArr, testCaseArr[i], mid);
        }

    }

    private static void binarySearch(int[] arr, int searchValue, int mid) {
        if (mid < 0 || mid >= arr.length) {
            System.out.println(0);
        } else if (arr[mid] == searchValue) {
            System.out.println(1);
        } else if (arr[mid] > searchValue) {
            mid = findDownMid(mid);
            binarySearch(arr, searchValue, mid);
        } else {
            mid = findUpMid(mid);
            binarySearch(arr, searchValue, mid);

        }
    }

    private static int findDownMid(int num) {
        if (num % 2 == 0) {
            return num / 2 - 1;
        } else {
            return num / 2;
        }
    }

    private static int findUpMid(int num) {
        if (num % 2 == 0) {
            return (num * 2) - (num / 2);
        } else {
            return num * 2 - (num / 2 + 1);
        }
    }

    public static void heapsort(int[] arr) {
        int size = arr.length;
        if (size < 2) {
            return;
        }

        int parentIdx = getParent(size - 1);

        for (int i = parentIdx; i >= 0; i--) {
            heapify(arr, i, size - 1);
        }

        for (int i = size - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i - 1);
        }
    }

    public static int getParent(int child) {
        return (child - 1) / 2;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void heapify(int[] a, int parentIdx, int lastIdx) {
        int leftChildIdx;
        int rightChildIdx;
        int largestIdx;

        while ((parentIdx * 2) + 1 <= lastIdx) {
            leftChildIdx = (parentIdx * 2) + 1;
            rightChildIdx = (parentIdx * 2) + 2;
            largestIdx = parentIdx;

            if (a[leftChildIdx] > a[largestIdx]) {
                largestIdx = leftChildIdx;
            }

            if (rightChildIdx <= lastIdx && a[rightChildIdx] > a[largestIdx]) {
                largestIdx = rightChildIdx;
            }

            if (largestIdx != parentIdx) {
                swap(a, parentIdx, largestIdx);
                parentIdx = largestIdx;
            } else {
                return;
            }
        }
    }
}
