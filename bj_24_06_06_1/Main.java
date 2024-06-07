package bj_24_06_06_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Matrix{
        int N;
        int M;
        int[][] matrix;

        public Matrix() {
        }

        public Matrix(int N, int M){
            this.N = N;
            this.M = M;
            this.matrix = new int[N][M];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Matrix A = new Matrix(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        for (int i = 0; i < A.N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < A.M; j++) {
                A.matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        Matrix B = new Matrix(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        for (int i = 0; i < B.N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B.M; j++) {
                B.matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Matrix C = new Matrix(A.N, B.M);
        for (int i = 0; i < A.N; i++) {
            for (int j = 0; j < B.M; j++) {
                for (int k = 0; k < A.M; k++) {
                    C.matrix[i][j] += A.matrix[i][k] * B.matrix[k][j];
                }
            }
        }

        for (int i = 0; i < C.N; i++) {
            for (int j = 0; j < C.M; j++) {
                System.out.print(C.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
