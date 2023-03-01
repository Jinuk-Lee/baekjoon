package P_3460.firstTry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int j = 0; j < Case; j++) {
            int n = 0;
            int count = 0;
            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            }
            while (n > 0) {
                if (n % 2 == 1)
                    System.out.print(count + " ");
                count++;
                n = n / 2;
            }
            System.out.println();

        }

    }
}
