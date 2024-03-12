import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String [] str = String.valueOf(n).split("");
        Arrays.sort(str,Collections.reverseOrder());
        for(String s : str){
            answer += Long.parseLong(s);
            answer *= 10;
        }
        return answer/10;
    }
}