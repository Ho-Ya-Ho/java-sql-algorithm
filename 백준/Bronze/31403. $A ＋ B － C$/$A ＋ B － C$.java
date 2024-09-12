import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());

        String stA = Integer.toString(A);
        String stB = Integer.toString(B);
        int intValue = Integer.parseInt(stA + stB);

        System.out.println(A + B - C);
        System.out.println(intValue - C);

        bw.flush();
        bw.close();
    }
}
