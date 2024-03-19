class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
    for(double x:numbers){
        answer+=x;
    }
    double result=answer/numbers.length;
    return result;
    }
}