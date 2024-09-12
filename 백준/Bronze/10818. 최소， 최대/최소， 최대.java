import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer value = new StringTokenizer(bf.readLine());
        List<Integer> valueList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            valueList.add(Integer.valueOf(value.nextToken()));
        }

        int maxValue = valueList.stream().max(Integer::compareTo).get();
        int minValue = valueList.stream().min(Integer::compareTo).get();

        System.out.println(minValue);
        System.out.println(maxValue);

        bw.flush();
        bw.close();
    }
}
