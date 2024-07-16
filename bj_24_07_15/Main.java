package bj_24_07_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<BigInteger> numPq = new PriorityQueue<>();
        String numStr = "";

        for (int i = 0; i < N; i++) {
            if (!numStr.isEmpty()) {
                numPq.add(new BigInteger(numStr));
                numStr = "";
            }

            String str = br.readLine();

            for (char c : str.toCharArray()) {
                if (c > 47 && c < 58) {
                    numStr += c;
                } else if (!numStr.isEmpty()) {
                    numPq.add(new BigInteger(numStr));
                    numStr = "";
                }
            }
        }

        if (!numStr.isEmpty()) {
            numPq.add(new BigInteger(numStr));
        }

        int numPqSize = numPq.size();

        for (int i = 0; i < numPqSize; i++) {
            System.out.println(numPq.poll());
        }
    }
}
