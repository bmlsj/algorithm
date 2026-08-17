import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        HashMap<Integer, Integer> map = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        
        int day = 0;
        for(int i = 1; i < a; i++) {
            day += map.get(i);
        }
        
        day += b;
        //System.out.println(day + ", " + day % 7);
        HashMap<Integer, String> days = new HashMap<>() {{
            put(0, "THU");
            put(1, "FRI");
            put(2, "SAT");
            put(3, "SUN");
            put(4, "MON");
            put(5, "TUE");
            put(6, "WED");
        }};
        // 금, 토, 일, 월, 화, 수, 목
        return days.get(day % 7);
    }
}