import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        while ((line = br.readLine()) != null) {
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            if (a == 0 & b == 0) {
                break;
            }

            System.out.println(a + b);
        }

        br.close();
    }
}
