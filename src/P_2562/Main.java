package P_2562;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[9];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.print(index);
    }
}
