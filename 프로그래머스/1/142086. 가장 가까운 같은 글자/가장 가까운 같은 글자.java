import java.util.*;

class Solution {
    public int[] solution(String s) {
        int [] answer = new int [s.length()];
        char [] charArr = s.toCharArray();
        for(int i=0;i<charArr.length;i++){
            int check = -1;
            for(int j=0;j<i;j++){
                if(charArr[i]==charArr[j]) check = i - j;
            }
            answer[i] = check;
        }
        return answer;
    }
}