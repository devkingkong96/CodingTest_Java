class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++){
            if (food[i] > 1) {
                int num = food[i] / 2;
                while (num > 0){
                    sb.append(i);
                    num--;
                }
            }
        }
        
        sb.append("0");
        
        for (int i = food.length - 1; i > 0; i--){
            if (food[i] > 1){
                int num = food[i] / 2;
                while (num > 0){
                    sb.append(i);
                    num--;
                }
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}