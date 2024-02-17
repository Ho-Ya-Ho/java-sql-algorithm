package programmers.완전_탐색.카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sumColor = brown + yellow;

        for (int i = 3; i < sumColor; i++) {
            int width = sumColor / i;
            if (width >= i) {
                if ((i - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }
}
