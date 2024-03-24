package bj_24_03_24_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_cnt = sc.nextInt();
        int[] num = new int[input_cnt];

        for (int i = 0; i < input_cnt; i++) {
            num[i] = sc.nextInt();
        }

        num = sort(num);
        arithmetic_mean(input_cnt, num);
        median(input_cnt, num);
        mode(input_cnt, num);
        range(input_cnt, num);
    }

    private static void arithmetic_mean(int input_cnt, int[] num) {
        int sum = 0;
        float result = 0;

        for (int i = 0; i < input_cnt; i++) {
            sum += num[i];
        }

        result = (float) sum / input_cnt;

        int roundedMean;
        if (result < 0){
            roundedMean = (int) (result - 0.5);
        }else {
            roundedMean = (int) (result + 0.5);
        }
        System.out.println(roundedMean);

    }

    private static void median(int inputCnt, int[] num) {
        System.out.println(num[inputCnt / 2]);
    }

    private static void mode(int inputCnt, int[] num) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int n : num) {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        }

        int max_cnt = 0;
        int mostFrequentElement = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int currentCount = entry.getValue();
            if (currentCount > max_cnt) {
                max_cnt = currentCount;
                mostFrequentElement = entry.getKey();
            }
        }

        if (Collections.frequency(countMap.values(), max_cnt) > 1) {
            List<Integer> mostFrequentElementList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == max_cnt) {
                    mostFrequentElementList.add(entry.getKey());
                }
            }
            Collections.sort(mostFrequentElementList);
            mostFrequentElement = mostFrequentElementList.get(1);
        }
        System.out.println(mostFrequentElement);
    }

    private static void range(int inputCnt, int[] num) {
        int result = num[inputCnt - 1] - num[0];

        System.out.println(result);
    }

    private static int[] sort(int[] arr) {
        sort(arr, arr.length);

        return arr;
    }

    private static void sort(int[] arr, int size) {
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

    private static int getParent(int child) {
        return (child - 1) / 2;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void heapify(int[] a, int parentIdx, int lastIdx) {

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
