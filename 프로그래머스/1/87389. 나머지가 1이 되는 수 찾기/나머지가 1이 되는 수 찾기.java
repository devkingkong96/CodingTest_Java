class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 1;
        while(true){
            if(n%index==1){
                answer = index;
                break;
            }
            index++;
        }
        return answer;
    }
}