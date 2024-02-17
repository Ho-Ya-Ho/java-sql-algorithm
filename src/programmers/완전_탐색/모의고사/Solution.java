package programmers.완전_탐색.모의고사;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> result = new ArrayList<>();

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        // 정답 개수 Counting
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) scores[0]++;
            if (answers[i] == person2[i % person2.length]) scores[1]++;
            if (answers[i] == person3[i % person3.length]) scores[2]++;
        }

        // maxScore 찾고 점수 높은 사람만 result 에 add
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        for (int i = 0; i < scores.length; i++) {
            if (maxScore == scores[i]) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
