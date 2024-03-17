import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0) list.add(i);
        }
        if(list.size() == 0){
            return new int[] {-1};
        }
        int [] answer = new int [list.size()];
        int index = 0;
        for(int i : list){
            answer[index] = list.get(index);
            index++;
        }
        return answer;
    }
}