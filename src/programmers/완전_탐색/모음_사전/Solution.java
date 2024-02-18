package programmers.완전_탐색.모음_사전;

class Solution {

    static final String wordsList = "AEIOU";
    static final int[] value = {781, 156, 31, 6, 1};

    public int solution(String word) {
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            answer += value[i] * wordsList.indexOf(word.charAt(i));
        }

        return answer + word.length();
    }
}
