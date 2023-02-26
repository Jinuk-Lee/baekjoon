package P_2576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            if (a[i] % 2 == 1) {
                sum += a[i];
                count++;
                if (min > a[i]) {
                    min = a[i];
                }
            }
        }
        if (count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
