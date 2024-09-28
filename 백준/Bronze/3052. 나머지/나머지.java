import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> wait = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            wait.add(Integer.parseInt(br.readLine()));
        }

        long result = wait.stream().map(n -> n % 42).distinct().count();
        System.out.println(result);

        br.close();
    }
}
