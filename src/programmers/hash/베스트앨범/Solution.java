package programmers.hash.베스트앨범;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
		HashMap<String, Integer> sumHashMap = new HashMap<>();

		// 합 결과를 가지는 hashMap 생성
        for (int i = 0; i < genres.length; i++) {
			sumHashMap.put(genres[i], sumHashMap.getOrDefault(genres[i], 0) + plays[i]);
        }

		// 합 결과를 정렬한 keyList 생성
        ArrayList<String> keyList = new ArrayList<>(sumHashMap.keySet());
		keyList.sort(((o1, o2) -> sumHashMap.get(o2) - sumHashMap.get(o1)));

		// 정렬된 장르 순서대로 반복문 돌면서 개수만큼 추출
		for (String key : keyList) {
			ArrayList<Song> songList = new ArrayList<>();
			for (int i = 0; i < genres.length; i++) {
				if (key.equals(genres[i])) {
					songList.add(new Song(plays[i], i));
				}
			}

			List<Song> collect = songList.stream().sorted((s1, s2) -> Integer.compare(s2.play, s1.play)).collect(Collectors.toList());

			answer.add(collect.get(0).primaryKey);
			if (songList.size() != 1) {
				answer.add(collect.get(1).primaryKey);
			}
		}

        return answer.stream().mapToInt(i -> i).toArray();
    }

	public static class Song {
		int play;
		int primaryKey;

		public Song(int play, int primaryKey) {
			this.play = play;
			this.primaryKey = primaryKey;
		}
	}
}
