import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        for (int i = 0; i < n; i++) {
            int nextToken = Integer.parseInt(st2.nextToken());
            if (nextToken < x) {
                list.add(nextToken);
            }
        }

        list.forEach(value -> System.out.print(value + " "));
    }
}
