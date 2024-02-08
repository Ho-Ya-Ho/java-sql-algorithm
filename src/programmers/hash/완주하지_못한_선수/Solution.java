package programmers.hash.완주하지_못한_선수;

import java.util.*;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hashMap = new HashMap<>();

		// hashMap 에 participant 값 넣기
		Arrays.stream(participant).forEach(people -> hashMap.put(people, hashMap.getOrDefault(people, 0) + 1));

		// hashMap 에 completion 값 빼기
		Arrays.stream(completion).forEach(people -> {
			if (hashMap.containsKey(people)) {
				hashMap.put(people, hashMap.get(people) - 1);
			}

			// value 가 0이면 삭제
			if (hashMap.get(people) == 0) {
				hashMap.remove(people);
			}
		});
		answer = hashMap.keySet().stream().findFirst().get();

		return answer;
	}
}
