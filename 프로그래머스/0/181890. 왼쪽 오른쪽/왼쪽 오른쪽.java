import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {

        boolean check = false;
        int left = 0, right = 0;
        
        for(int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                check = false;
                left = i;
                break;
            } else if (str_list[i].equals("r")) {
                check = true;
                right = i;
                break;
            }
        }
        
        List<String> list = new ArrayList<>();
        if (check) { // 오른쪽
            for(int i = right + 1; i < str_list.length; i++) {
                list.add(str_list[i]);
            }
        } else {
            for(int i = 0; i < left; i++) {
                list.add(str_list[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}