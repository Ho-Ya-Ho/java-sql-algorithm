package programmers.hash.베스트앨범;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1. 각 장르별로 HashMap 에 넣어서 각 장르별 우선순위 체크
 * 2. 각 장르별 sort stream 돌면서 최상위 2개 반환
 * 3.
 */
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, List<Integer>> hashMap = new HashMap<>();

		// 값 넣기
        for (int i = 0; i < genres.length; i++) {
			List<Integer> list = hashMap.getOrDefault(genres[i], new ArrayList<>());
	        list.add(plays[i]);
	        hashMap.put(genres[i], list);
        }

		// 정렬
	    hashMap.values().forEach(list -> list.sort(Collections.reverseOrder()));

		// 장르별 합이
	    HashMap<String, Integer> sumHashMap = new HashMap<>();
		hashMap.forEach((key, value) -> sumHashMap.put(key, value.stream().reduce(Integer::sum).get()));



	    System.out.println("hashMap = " + hashMap);
	    System.out.println("sumHashMap = " + sumHashMap);

        return answer;
    }

}

