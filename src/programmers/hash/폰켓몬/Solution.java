package programmers.hash.폰켓몬;

import java.util.Arrays;

class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int previousPonCatMon = Integer.MAX_VALUE;
		int choicePonCatMonCount = nums.length / 2;

		// 정렬
		Arrays.sort(nums);

		// loop 돌면서 이전에 다른 폰켓몬이 있다면 answer +1
		for (int num : nums) {
			if (previousPonCatMon != num) {
				previousPonCatMon = num;
				answer++;
			}
			if (choicePonCatMonCount == answer) {
				break;
			}
		}

		return answer;
	}
}
