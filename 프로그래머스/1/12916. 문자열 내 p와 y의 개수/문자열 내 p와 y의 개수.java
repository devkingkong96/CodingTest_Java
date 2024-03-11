class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='Y') cnt++;
            else if(s.charAt(i)=='P') cnt--;
        }
        answer = cnt==0 ? true : false;
        return answer;
    }
}