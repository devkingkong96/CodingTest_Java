class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long n = num;
        if(n == 1){
            return answer = 0;
        }
        while(true){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = n * 3 + 1;
            }
            cnt ++;
            if(cnt > 500){
                return answer = -1;
            }
            if(n == 1){
                return answer = cnt;
            }
        }
    }
}