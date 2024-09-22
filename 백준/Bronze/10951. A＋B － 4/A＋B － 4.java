import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";
//        StringTokenizer st = new StringTokenizer(br.readLine());

        while ((line = br.readLine()) != null) {
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            System.out.println(a + b);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
