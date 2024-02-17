package programmers.완전_탐색.소수_찾기;

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> numberSet = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        numberSet = findNumbers("", numbers);

        for (Integer number : numberSet) {
            if (isPrime(number)) {
                answer++;
            }
        }

        return answer;
    }

    private Set<Integer> findNumbers(String comb, String others) {
        if (!comb.isBlank()) {
            numberSet.add(Integer.valueOf(comb));
        }
        for (int i = 0; i < others.length(); i++) {
            findNumbers(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
        return numberSet;
    }

    private boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
