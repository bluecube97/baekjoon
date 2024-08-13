package bj_24_08_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static List<Integer> getPrimesUpTo(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger secretKey = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> primes = getPrimesUpTo(k);

        for (int prime : primes) {
            // secretKey를 현재 소수로 나누어 떨어지는지 확인
            if (secretKey.mod(BigInteger.valueOf(prime)).equals(BigInteger.ZERO)) {
                System.out.print("BAD " + prime);
                return;
            }
        }

        // 만약 모든 소수로 나누어 떨어지지 않으면 GOOD 출력
        System.out.print("GOOD");
    }
}