import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        ArrayList<String> s1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> s2 = new ArrayList<>(Arrays.asList(str2.split("")));

        for (int i = 0; i < s1.size(); i++){
            answer.append(s1.get(i));
            answer.append(s2.get(i));
        }

        System.out.println(answer);
        return answer.toString();
    }
}