import java.util.*;
class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {

		// 중복 신고를 제거하기 위한 HashSet
		HashSet<String> newReport = new HashSet<>(Arrays.asList(report));

		// 사용자 별 신고받은 횟수 저장
		HashMap<String, Integer> reportCnt = new HashMap<>();
		HashMap<String, HashSet<String>> reportMap = new HashMap<>();
		HashMap<String, HashSet<String>> declarMap = new HashMap<>();
		
		// 사용자에 대한 초기화
		for (String id : id_list) {
			reportMap.put(id, new HashSet<>());
			reportCnt.put(id, 0);
			declarMap.put(id, new HashSet<>());
		}

		for (String names : newReport) {
			String[] split = names.split(" ");

			String user = split[0]; // 이용자
			String declar = split[1]; // 신고자

			// 신고 당한 사람의 신고 횟수 증가
			reportCnt.put(declar, reportCnt.get(declar) + 1);
			// 신고자의 신고 목록에 신고당한 사람 추가
			reportMap.get(declar).add(user);
			declarMap.get(user).add(declar);

		}

		int[] result = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			String id = id_list[i];
			int quit = 0;

			for(String user: declarMap.get(id)) {
				// k번 이상 신고된 사람을 신고한 사람에게 결과 메일 전송
				if (reportCnt.get(user) >= k) {
					quit++;
				}
			}
			

			result[i] = quit;
		}

		return result;
	}
}