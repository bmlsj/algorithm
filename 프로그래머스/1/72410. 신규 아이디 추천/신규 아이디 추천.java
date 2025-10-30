class Solution {
    public String solution(String new_id) {

        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        StringBuilder sb = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if ((c >= 'a' && c <= 'z') ||  
                (c >= '0' && c <= '9') ||   
                c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        
        // 3단계
        boolean check = false;
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '.') {
                if (!check) {
                    sb2.append(c);
                    check = true;
                }
            } else {
                check = false;
                sb2.append(c);
            }           
            
        } 
        
        // 4단계
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '.') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (sb2.length() > 0 && sb2.charAt(0) == '.') {
            sb2.deleteCharAt(0);
        }
        
        // 5단계
        if (sb2.length() == 0) sb2.append("a");
        // 6단계
        if (sb2.length() >= 16) {
            sb2.setLength(15);
            if (sb2.charAt(sb2.length() - 1) == '.') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        // 7단계
        if (sb2.length() <= 2) {
            while(sb2.length() <= 2) {
                sb2.append(sb2.charAt(sb2.length() - 1));
            }
        }
        
        
        return sb2.toString();
    }
}