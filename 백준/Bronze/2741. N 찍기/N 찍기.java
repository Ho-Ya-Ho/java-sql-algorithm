import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //읽는 라인
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력 라인

        int n = Integer.parseInt(bf.readLine());

        for (int value = 1; value <= n; value++) {
            System.out.println(value);
        }

        bw.flush();
        bw.close();
    }
}
