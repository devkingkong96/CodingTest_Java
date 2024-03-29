class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char [] chArr = s.toCharArray();
        for(char c : chArr){
            if(c==' '){
                answer += " ";
                continue;
            }
            else if('a'<=c && c<='z'){
                c += n;
                if(c>'z') c-=26;
            }else{
                c += n;
                if(c>'Z') c-=26;
            }
            answer += c;
        }
        return answer;
    }
}