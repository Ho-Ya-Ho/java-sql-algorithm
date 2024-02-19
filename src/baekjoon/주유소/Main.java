package baekjoon.주유소;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cityCount = sc.nextInt();
        int[] distances = new int[cityCount - 1];
        int[] citys = new int[cityCount];

        for (int i = 0; i < distances.length; i++) {
            distances[i] = sc.nextInt();
        }

        for (int i = 0; i < citys.length; i++) {
            citys[i] = sc.nextInt();
        }

        int answer =0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < distances.length; i++) {
            if (minPrice > citys[i]) {
                minPrice = citys[i];
            }
            answer += minPrice * distances[i];
        }

        System.out.println(answer);
    }
}
