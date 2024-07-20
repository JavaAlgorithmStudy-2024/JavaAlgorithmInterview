package ch06;

import java.util.*;

public class GroupAnagrams49 {

    public static void main(String[] args) {
        String[] strs = { "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat" };
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] tmp = str.toCharArray();
            Arrays.sort(tmp);
            String key = String.valueOf(tmp);

            // 만약 기존에 없던 키라면 빈 리스트를 삽입
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // 키에 해당히는 리스트에 추가
            map.get(key).add(str);
        }

        // 문제에서 요구하는 출력 값 형태로 변경
        return new ArrayList<>(map.values());
    }
}
