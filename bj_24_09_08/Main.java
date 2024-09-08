package bj_24_09_08;

public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 10001; i++) {
            String duodecimal = Integer.toString(i, 12);
            String hexadecimal = Integer.toHexString(i);

            int decimalSum = 0;
            int duodecimalSum = 0;
            int hexadecimalSum = 0;

            for (int j = 0; j < Integer.toString(i).length(); j++) {
                decimalSum += Integer.parseInt(Integer.toString(i).substring(j, j + 1));
            }
            for (int j = 0; j < duodecimal.length(); j++) {
                duodecimalSum += Integer.parseInt(duodecimal.substring(j, j + 1), 12);
            }
            for (int j = 0; j < hexadecimal.length(); j++) {
                hexadecimalSum += Integer.parseInt(hexadecimal.substring(j, j + 1), 16);
            }
            if (decimalSum == duodecimalSum && duodecimalSum == hexadecimalSum) {
                System.out.println(i);
            }
        }
    }
}
