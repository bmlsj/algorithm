import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        HashMap<Integer, Float> fail = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 1; i <= N; i++){
            fail.put(i, 0.0f);
        }
        
        for (int i = 0; i < stages.length; i++){
            if (stages[i] >= N) {
                map.put(N, 0);
               //   fail.put(N, 0.0f);
            } else {
                map.put(stages[i], 0);
                // fail.put(stages[i], 0.0f);
            }
            
        }
        System.out.println(fail);
   
        for (int i = 0; i < stages.length; i++){
            if (stages[i] <= N) {
                int tmp = map.get(stages[i]) + 1;
                map.put(stages[i], tmp);
            }
        }
        

        int cnt = 0, people = stages.length;
        float rate = 0.0f;
        for (int num :  map.keySet()){
            rate = (float)map.get(num) / people;
            people -= map.get(num);
            fail.put(num, rate);
        }
        
       
        // 값으로 오름차순 정렬
        List<Map.Entry<Integer, Float>> list = new ArrayList<>(fail.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()) == 0 ? a.getKey().compareTo(b.getKey()) : b.getValue().compareTo(a.getValue()));
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).getKey();
        }


        return answer;
    }
}