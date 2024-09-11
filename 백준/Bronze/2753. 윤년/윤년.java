import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int years = Integer.parseInt(bf.readLine());
        int result = 0;

        if ((years % 4 == 0) && (years % 100 != 0 || years % 400 == 0)) {
            result = 1;
        }

        System.out.println(result);

        bw.flush();
        bw.close();
    }
}
