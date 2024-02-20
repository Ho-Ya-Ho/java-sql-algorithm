package baekjoon.RGB거리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[][] dp = new int[count + 1][4];

        for (int i = 1; i <= count; i++) {
            dp[i][1] = sc.nextInt();
            dp[i][2] = sc.nextInt();
            dp[i][3] = sc.nextInt();
        }

        for (int i = 1; i <= count -1; i++) {
            dp[i+1][1] = Math.min(dp[i][2],dp[i][3]) + dp[i+1][1];
            dp[i+1][2] = Math.min(dp[i][1],dp[i][3]) + dp[i+1][2];
            dp[i+1][3] = Math.min(dp[i][1],dp[i][2]) + dp[i+1][3];
        }

        int answer = Math.min(Math.min(dp[dp.length - 1][1], dp[dp.length - 1][2]), dp[dp.length - 1][3]);
        System.out.println(answer);

    }
}
