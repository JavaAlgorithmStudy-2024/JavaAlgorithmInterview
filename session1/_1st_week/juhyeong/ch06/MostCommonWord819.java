package ch06;

import java.util.*;

public class MostCommonWord819 {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };

        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        // 문제의 조건에 맞게 전처리 작업 후 문자열을 단어 배열로 저장
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        // String 배열인 금지어 목록을 비교 메서드 contains()를 제공하는 List로 바꾸기
        List<String> ban = new ArrayList<>(Arrays.asList(banned));

        // 단어(Key) + 단어별 등장 횟수(Value) 저장
        Map<String, Integer> map = new HashMap<>();

        // 단어가 금지어 리스트에 없는 단어이면 map에 추가 및 등장 횟수 증가
        for (String word : words) {
            if (!ban.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // 등장 횟수가 가장 많은 단어 찾기
        String word = null;
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                word = entry.getKey();
                max = entry.getValue();
            }
        }

        return word;
    }
}
