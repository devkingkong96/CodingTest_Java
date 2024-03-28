import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int leng = p.length();
        for(int i=0;i<=t.length()-p.length();i++){
            if(Long.parseLong(p)>=Long.parseLong(t.substring(i,i+leng))){
                answer++;
            }
        }
        return answer;
    }
}