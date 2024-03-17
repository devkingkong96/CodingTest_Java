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
        Integer[] tempArray = list.toArray(new Integer[list.size()]);
        int[] intArray = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            intArray[i] = tempArray[i];
        }

        return intArray;
    }
}