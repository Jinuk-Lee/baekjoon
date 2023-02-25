package P_2443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int count = 1;
        for (int i = a; i >= 0; i--) {
            for (int j = 1; j < count; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
