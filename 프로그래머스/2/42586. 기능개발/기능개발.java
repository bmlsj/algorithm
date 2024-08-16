import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> ans = new ArrayList<>();
		int idx  = 0;
		
		while (true) {
			for (int i = idx; i < progresses.length; i++) {
				progresses[i] += speeds[i];
			}
			
			int tmp = 0;
			for (int i = idx; i < speeds.length; i++) {
				if (progresses[i] >= 100) {
					idx++;
					tmp++;
				} else break;
			}
			
			if (tmp > 0) {
				ans.add(tmp);
			}
			if (idx == progresses.length) {
				break;
			}
		}
		int[] res = new int[ans.size()];
		for (int i = 0; i < ans.size();i++) {
			res[i] = ans.get(i);
		}
		return res;
    }
}