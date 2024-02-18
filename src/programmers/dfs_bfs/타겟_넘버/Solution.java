package programmers.dfs_bfs.타겟_넘버;

class Solution {
    static int count = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }

    private void dfs(int[] numbers, int target, int result, int depth) {
        if (depth == numbers.length) {
            if (target == result) {
                count++;
            }
            return;
        }

        int plusNumber = result + numbers[depth];
        int minusNumber = result - numbers[depth];

        dfs(numbers, target, plusNumber, depth + 1);
        dfs(numbers, target, minusNumber, depth + 1);
    }
}
