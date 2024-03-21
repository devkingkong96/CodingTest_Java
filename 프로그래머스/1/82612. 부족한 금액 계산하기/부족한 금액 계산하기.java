class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long fee = 0;
        for(int i=1;i<=count;i++){
            fee += price * i;
        }
        long check = fee - money;
        answer = check>=0 ? check : 0;
        return answer;
    }
}