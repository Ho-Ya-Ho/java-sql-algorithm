import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] stairs = new int[301];
        int[] scores = new int[301];
        for (int i = 1; i <= N; i++)
            stairs[i] = sc.nextInt();

        scores[1] = stairs[1];
        scores[2] = stairs[1] + stairs[2];
        scores[3] = Math.max(stairs[1], stairs[2]) + stairs[3];

        for (int n = 4; n <= N; n++) {
            scores[n] = Math.max(scores[n - 3] + stairs[n - 1], scores[n - 2]) + stairs[n];
        }

        System.out.println(scores[N]);
    }
}
