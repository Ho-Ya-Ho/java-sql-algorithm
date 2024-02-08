package programmers.hash.의상;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 각 의상 별로 count + 1 (옷 입지 않는 경우 포함) 해서 다 곱하고
 * 완전 입지 않는 경우를 제외
 */
class Solution {
	public int solution(String[][] clothes) {
		int answer = 0;

		// 옷 종류 별로 hashMap 에 데이터 삽입
		HashMap<String, Integer> hashMap = new HashMap<>();
		Arrays.stream(clothes).forEach(clothe -> hashMap.put(clothe[1], hashMap.getOrDefault(clothe[1], 0) + 1));

		Integer count = hashMap.values().stream().reduce((a, b) -> a * b).get();

		if (hashMap.size() == 1) {
			answer = clothes.length;
		} else {
			answer = count + clothes.length;
		}

		return answer;
	}
}
