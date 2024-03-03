import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> result = new HashSet<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n /= i;
                }
                result.add(i);
            }
        }
        int [] answer = new int [result.size()];
        int index = 0;
        for(int i : result){
            answer[index++] = i;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}