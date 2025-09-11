import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
//         int[] answer = new int[N];
        
//         HashMap<Integer, Float> fail = new HashMap<>();
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 1; i <= N; i++){
//             fail.put(i, 0.0f);
//         }
        
//         for (int i = 0; i < stages.length; i++){
//             if (stages[i] >= N) {
//                 map.put(N, 0);
//                //   fail.put(N, 0.0f);
//             } else {
//                 map.put(stages[i], 0);
//                 // fail.put(stages[i], 0.0f);
//             }
            
//         }
//         System.out.println(fail);
   
//         for (int i = 0; i < stages.length; i++){
//             if (stages[i] <= N) {
//                 int tmp = map.get(stages[i]) + 1;
//                 map.put(stages[i], tmp);
//             }
//         }
        

//         int cnt = 0, people = stages.length;
//         float rate = 0.0f;
//         for (int num :  map.keySet()){
//             rate = (float)map.get(num) / people;
//             people -= map.get(num);
//             fail.put(num, rate);
//         }
        
       
//         // 값으로 오름차순 정렬
//         List<Map.Entry<Integer, Float>> list = new ArrayList<>(fail.entrySet());
//         list.sort((a, b) -> b.getValue().compareTo(a.getValue()) == 0 ? a.getKey().compareTo(b.getKey()) : b.getValue().compareTo(a.getValue()));
        
//         for (int i = 0; i < list.size(); i++) {
//             answer[i] = list.get(i).getKey();
//         }


//         return answer;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Double> fail = new HashMap<>();
        int[] result = new int[N];
        
        
        int stage = 1;
        for(int i = 0; i < N; i++) {
            int cnt = 0;
            for(int j = 0; j < stages.length; j++) {
                if (stages[j] == stage) {
                    cnt++;
                }
            }

            map.put(stage, cnt);
            stage++;
        }
        
        
        int total = stages.length;
        for(int key: map.keySet()) {
            int nonClear = map.get(key);
            if (nonClear > 0) {
                fail.put(key, (double) nonClear / total);
            } else {
                fail.put(key, 0.0);
            }
            total -= nonClear;
        }
        
        List<Integer> keySet = new ArrayList<>(fail.keySet());
        keySet.sort((o1, o2) -> {
            int cmp = fail.get(o2).compareTo(fail.get(o1));
            if (cmp == 0) {
                return o1.compareTo(o2);  // 값이 같으면 key를 오름차순
            }
            return cmp;
        });
        
        int idx = 0;
        for (int key : keySet) {
            result[idx++] = key;
        }
        
        return result;
    }
}