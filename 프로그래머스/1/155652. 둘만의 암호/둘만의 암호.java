import java.util.ArrayList;
class Solution {
    public String solution(String s, String skip, int index) {
                ArrayList<Integer> skiplist = new ArrayList<>();
        for (int i=0;i < skip.length();i++){
            for (char c: skip.toCharArray()) skiplist.add((int) c);
        }

        StringBuilder ans = new StringBuilder();
        for (char c: s.toCharArray()){
            int afteridx = (int)c + index;
            int endIdx = (int) 'z', startIdx = (int) 'a';
            
            for (int i = (int) c + 1; i <= afteridx; i++) {
                if (i > endIdx) {
                    i -= 26;
                    afteridx -= 26;
                }
                if (skiplist.contains(i)) afteridx++;
            }
            
            ans.append((char) afteridx);

        }

        return ans.toString();
    }
}