import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static boolean[][] visited;
    static Queue<Node> queue;
    static List<Integer> answer;
    static int[][] map;
    final static int[] dx = {-1, 0, 1, 0};
    final static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        int areaCount = 0;

        map = new int[mapSize][mapSize];
        visited = new boolean[mapSize][mapSize];
        queue = new LinkedList<>();
        answer = new ArrayList<>();

        for (int i = 0; i < mapSize; i++) {
            String row = sc.next();
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = row.charAt(j) - '0';
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    bfs(i, j);
                    areaCount++;
                }
            }
        }

        System.out.println(areaCount);
        List<Integer> sortedAnswer = answer.stream().sorted().collect(Collectors.toList());
        sortedAnswer.forEach(System.out::println);
    }

    private static void bfs(int x, int y) {
        queue.add(new Node(x, y));
        visited[x][y] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                int preX = node.x + dx[i];
                int preY = node.y + dy[i];
                if (preX >= 0 && preY >= 0 && preX < map.length && preY < map.length) {
                    if (!visited[preX][preY] && map[preX][preY] == 1) {
                        queue.add(new Node(preX, preY));
                        visited[preX][preY] = true;
                    }
                }
            }
        }

        answer.add(count);
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
