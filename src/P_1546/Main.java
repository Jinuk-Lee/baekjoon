package P_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double max = Double.MIN_VALUE;
        double sum = 0;
        int[] score = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            sum += score[i];

            if (max < score[i])
                max = score[i];
        }

        sum = sum / max * 100;
        System.out.println(sum / N);
    }
}
