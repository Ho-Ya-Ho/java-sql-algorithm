package programmers.hash.베스트앨범;

import java.util.HashMap;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Song> hashMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], new Song(plays[i], i));
        }

        System.out.println("hashMap = " + hashMap);

        return answer;
    }


    public static class Song {
        private int play;
        private int primaryKey;

        public Song(int play, int primaryKey) {
            this.play = play;
            this.primaryKey = primaryKey;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "play=" + play +
                    ", primaryKey=" + primaryKey +
                    '}';
        }

        public int getPlay() {
            return play;
        }

        public void setPlay(int play) {
            this.play = play;
        }

        public int getPrimaryKey() {
            return primaryKey;
        }

        public void setPrimaryKey(int primaryKey) {
            this.primaryKey = primaryKey;
        }
    }
}

