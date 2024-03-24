class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int gcm = 0;
        int lcm = 0;
        for(int i=1;i<=max;i++){
            if(n%i==0 && m%i==0){
                gcm = i;
            }
        }
        lcm = (n * m) / gcm;
        int[] answer = {gcm,lcm};
        return answer;
    }
}