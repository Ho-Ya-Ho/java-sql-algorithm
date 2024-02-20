import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[][] dp = new int[count + 1][count + 1];

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = sc.nextInt();
                if (i == 1) {
                    dp[i][j] = dp[i][j] + dp[i - 1][j];
                } else if (i == j) {
                    dp[i][j] = dp[i][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j] + Math.max(dp[i - 1][j - 1], dp[i-1][j]);
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= count; i++) {
            answer = Math.max(answer, dp[count][i]);
        }

        System.out.println(answer);
    }
}
