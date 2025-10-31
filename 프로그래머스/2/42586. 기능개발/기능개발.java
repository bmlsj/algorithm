import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deploy = new ArrayList<>();
        
        for(int i = 0; i < speeds.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) {
                day += 1;
            } 
            deploy.add(day);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < deploy.size(); i++) {
            int num = deploy.get(i);
            int cnt = 1;
            boolean found = false;
            for(int j = i + 1; j < deploy.size(); j++) {
                int next = deploy.get(j);
                if (num >= next) {
                    cnt++;
                } else {
                    i = j - 1;
                    ans.add(cnt);
                    found = true;
                    break;
                }
              
            }
            
            if (!found) {
                ans.add(cnt);
                break;
            }
        }

        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}

/*
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
        */