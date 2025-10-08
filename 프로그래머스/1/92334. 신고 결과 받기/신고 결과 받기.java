import java.util.*;
class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {

        HashMap<String, Integer> declar = new HashMap<>();
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++) {
            declar.put(id_list[i], 0);
            reportMap.put(id_list[i], new HashSet<>());
        }

        // 신고 관계 저장
        for(int i = 0; i < report.length; i++) {
            String[] re = report[i].split(" ");
            reportMap.get(re[0]).add(re[1]);
        }
                
        // 신고 당한 횟수 저장
        for(HashSet<String> reportedSet: reportMap.values()) {
            for(String reported: reportedSet) {
                declar.put(reported, declar.get(reported) + 1);
            }
        }
        
        HashMap<String, Integer> declarCnt = new HashMap<>();
        for(String key: reportMap.keySet()) {
            for(String name: reportMap.get(key)) {
                if (declar.get(name) >= k) {
                    declarCnt.put(key, declarCnt.getOrDefault(key, 0) + 1);
                }
            }
        }
        
        int[] result = new int[id_list.length];
        for(int i = 0; i< id_list.length; i++) {
            result[i] = declarCnt.getOrDefault(id_list[i], 0);
        }
		return result;
	}
}