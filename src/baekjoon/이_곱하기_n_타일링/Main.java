package baekjoon.이_곱하기_n_타일링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < count; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) %10007;
        }

        System.out.println(dp[count - 1]);
    }
}
