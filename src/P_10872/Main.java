package P_10872;

import java.io.*;

public class Main {

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 1;
        if (num ==0){}
        else {
            for (int i = num; i > 0; i--) {
                sum = sum * i;
            }
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}
