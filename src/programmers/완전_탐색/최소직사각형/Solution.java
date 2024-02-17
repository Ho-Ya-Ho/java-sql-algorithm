package programmers.완전_탐색.최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        int result1 = 0;
        int result2 = 0;

        // 배열 내에서 가장 큰 수를 result1 에 담는다.
        // 각 배열 내에서 가장 작은 수 중 가장 큰 값을 result2 에 담는다.
        for (int[] size : sizes) {
            int maxNumber = Math.max(size[0], size[1]);
            int minNumber = Math.min(size[0], size[1]);

            if (maxNumber > result1) {
                result1 = maxNumber;
            }

            if (minNumber > result2) {
                result2 = minNumber;
            }
        }

        return result1 * result2;
    }
}
