package programmers.dfs_bfs.단어_변환;

import java.util.*;

class Solution {

    static List<String> noVisited;
    static Queue<String> queue;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {

        noVisited = new ArrayList<>(Arrays.asList(words));
        queue = new LinkedList<>();

        // 변환할 수 없는 경우 0 반환
        if(!Arrays.asList(words).contains(target)) {
            return 0;
        }

        bfs(begin, target);

        return answer;
    }

    private void bfs(String begin, String target) {
        queue.add(begin);

        while(!queue.isEmpty()) {
            for(int i =0; i<queue.size(); i++) {
                String currentWord = queue.poll();
                noVisited.remove(currentWord);

                if (currentWord.equals(target)) {
                    return;
                }

                checkSimilarWords(currentWord, noVisited);
            }
            answer++;
        }
    }

    private void checkSimilarWords(String currentWord, List<String> noVisited) {
        List<String> toRemove = new ArrayList<>();
        for (String nv : noVisited) {
            if (isSimilar(currentWord, nv)) {
                queue.add(nv);
                toRemove.add(nv);
            }
        }
        noVisited.removeAll(toRemove);
    }

    private boolean isSimilar(String currentWord, String targetWord) {
        int diffCount = 0;
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) != targetWord.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
        }
        return diffCount == 1;
    }
}
