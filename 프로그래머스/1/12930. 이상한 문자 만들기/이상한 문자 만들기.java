class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String [] arr = s.split("");
        int index = 0;
        for(String str : arr){
            if(str.contains(" ")) index = 0;
            else index++;
            
            if(index % 2 ==0){
                answer.append(str.toLowerCase());
            }else{
                answer.append(str.toUpperCase());
            }
        }
        return answer.toString();
    }
}