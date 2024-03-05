class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        int cnt = 1;
        while(share>=cnt){
            answer *= balls--;
            answer /= cnt++;
        }
        return answer;
    }
}