package programmers.dfs_bfs.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    static final int[] dx = {1, 0, -1, 0};
    static final int[] dy = {0, 1, 0, -1};
    static Queue<Node> queue;
    static int[][] visited;

    public int solution(int[][] maps) {
        int answer = 0;
        visited = new int[maps.length][maps[0].length];
        bfs(maps);
        answer = visited[maps.length - 1][maps[0].length - 1];

        if (answer == 0) {
            return -1;
        }

        return answer;
    }

    private void bfs(int[][] maps) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        queue = new LinkedList<>();
        queue.add(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.x;
            y = node.y;

            // 주변에 있는 움직일 수 있는 칸을 queue 에 삽입
            for (int i = 0; i < 4; i++) {
                int preX = x + dx[i];
                int preY = y + dy[i];

                if (!validationMaps(preX, preY, maps)) {
                    continue;
                }

                if (visited[preX][preY] == 0 && maps[preX][preY] == 1) {
                    queue.add(new Node(preX, preY));
                    visited[preX][preY] = visited[x][y] + 1;
                }
            }
        }
    }

    private boolean validationMaps(int preX, int preY, int[][] maps) {
        if (preX > maps.length -1) {
            return false;
        }
        if (preX < 0) {
            return false;
        }
        if (preY > maps[0].length-1) {
            return false;
        }
        if (preY < 0) {
            return false;
        }
        return true;
    }

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
