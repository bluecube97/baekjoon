package bj_24_08_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subject = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int kor = 0;
        int math = 0;
        int eng = 0;
        int sci = 0;
        int jp = 0;

        if (st.hasMoreTokens()) kor = Integer.parseInt(st.nextToken());
        if (st.hasMoreTokens()) math = Integer.parseInt(st.nextToken());
        if (st.hasMoreTokens()) eng = Integer.parseInt(st.nextToken());
        if (st.hasMoreTokens()) sci = Integer.parseInt(st.nextToken());
        if (st.hasMoreTokens()) jp = Integer.parseInt(st.nextToken());

        int a = 0;
        int b = 0;
        int c = 0;

        if (kor > eng) a = (kor - eng) * 508;
        else a = (eng - kor) * 108;

        if (math > sci) b = (math - sci) * 212;
        else b = (sci - math) * 305;

        c = jp * 707;

        int stdNum = (a + b + c) * 4763;
        System.out.println(stdNum);
    }
}
