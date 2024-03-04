import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] arr = my_string.split(" ");
        for(int i=1;i<arr.length;i+=2){
            if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }else{
                answer += Integer.parseInt(arr[i+1]);
            }
        }
        answer += Integer.parseInt(arr[0]);
        return answer;
    }
}