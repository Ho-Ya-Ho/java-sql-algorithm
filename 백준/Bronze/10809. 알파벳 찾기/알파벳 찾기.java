import java.io.*;
import java.util.*;

public class Main {

    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String s = st.nextToken();
        int[] result = new int[alphabet.length()];

        Arrays.fill(result, -1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (s.charAt(i) == alphabet.charAt(j) && result[j] == -1) {
                    result[j] = i;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }

    }
}
