import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quizCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < quizCount; i++) {
            String testCase = br.readLine();
            int result = 0;
            int defaultScore = 1;

            for (int j = 0; j < testCase.length(); j++) {

                if (testCase.charAt(j) == 'O') {
                    result = result + defaultScore;
                    defaultScore++;
                } else {
                    defaultScore = 1;
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}
