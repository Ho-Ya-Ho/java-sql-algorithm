package baekjoon.one_two_three_더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] answer = new int[11];

        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 4;

        for (int i = 3; i < 11; i++) {
            answer[i] = answer[i - 1] + answer[i - 2] + answer[i - 3];
        }

        for (int i = 0; i < count; i++) {
            int n = sc.nextInt();
            System.out.println(answer[n-1]);
        }
    }
}
