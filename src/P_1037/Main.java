package P_1037;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(st.nextToken());
            if (max < N)
                max = N;
            if (min > N)
                min = N;
        }
        System.out.println(max * min);

    }
}
