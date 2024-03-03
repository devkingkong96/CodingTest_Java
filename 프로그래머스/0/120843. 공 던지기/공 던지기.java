class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        int cnt = 0;
        while(cnt<k){
            answer = numbers[index%numbers.length];
            index += 2;
            cnt++;
        }
        return answer;
    }
}