class Solution {
    public int solution(int[][] sizes) {
        int maxValue = 1;
        int minValue = 1;
        for(int i=0;i<sizes.length;i++){
            int max = Math.max(sizes[i][0],sizes[i][1]);
            int min = Math.min(sizes[i][0],sizes[i][1]);
            maxValue = Math.max(maxValue,max);
            minValue = Math.max(minValue,min);
        }
        return maxValue * minValue;
    }
}