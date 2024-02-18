package baekjoon.dfs_bfs.DFS와_BFS;

import java.util.*;

public class Main {
    static int node;
    static int edge;
    static int startNode;
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        node = sc.nextInt();
        edge = sc.nextInt();
        startNode = sc.nextInt();

        graph = new int[node + 1][node + 1];
        visited = new boolean[node + 1];

        // Graph Edge 생성
        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(startNode);
        sb.append("\n");

        visited = new boolean[node + 1];
        bfs(startNode);

        System.out.println(sb);
    }

    private static void dfs(int startNode) {
        visited[startNode] = true;
        sb.append(startNode).append(" ");

        for (int i = 1; i <= node; i++) {
            if (!visited[i] && graph[startNode][i] == 1) {
                dfs(i);
            }
        }
    }

    private static void bfs(int startNode) {
        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            startNode = queue.poll();
            sb.append(startNode).append(" ");

            for (int i = 1; i <= node; i++) {
                if (!visited[i] && graph[startNode][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
