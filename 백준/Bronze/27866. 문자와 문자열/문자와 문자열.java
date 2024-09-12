import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int number = Integer.parseInt(bf.readLine());

        char result = word.charAt(number - 1);

        System.out.println(result);
    }
}
