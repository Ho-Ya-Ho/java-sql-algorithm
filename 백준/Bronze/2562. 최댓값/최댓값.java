import java.io.*;
import java.util.*;

public class Main {

    static final int arraySize = 10;
    static final int inputValue = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numberArray = new int[arraySize];

        // 입력
        for (int number = 1; number <= inputValue; number++) {
            numberArray[number] = Integer.parseInt(bf.readLine());
        }

        int maxValue = getMaxValue(numberArray);
        int index = getIndex(maxValue, numberArray);

        System.out.println(maxValue);
        System.out.println(index);

        bw.flush();
        bw.close();
    }

    private static int getIndex(int maxValue, int[] numberArray) {
        for (int index = 1; index <= inputValue; index++) {
            if (maxValue == numberArray[index]) {
                return index;
            }
        }

        return 0;
    }

    private static int getMaxValue(int[] numberArray) {
        return Arrays.stream(numberArray).max().getAsInt();
    }
}
