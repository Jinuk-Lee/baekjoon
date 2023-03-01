package P_3460.firstTry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine());

        int[] N = new int[Case];

        for (int i = 0; i < Case; i++) {
            N[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < Case; j++) {
            int count = 0;
            while (N[j] > 0) {
                if (N[j] % 2 == 1)
                    System.out.print(count + " ");
                count++;
                N[j] = N[j] / 2;
            }
            System.out.println();

        }

    }
}
