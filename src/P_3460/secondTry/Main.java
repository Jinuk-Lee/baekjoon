package P_3460.secondTry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine());

        for (int j = 0; j < Case; j++) {

            int n = 0;
            int count = 0;
            n= Integer.parseInt(br.readLine());

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
