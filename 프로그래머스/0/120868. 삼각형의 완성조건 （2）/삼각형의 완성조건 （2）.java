import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int min = sides[1] - sides[0];
        int max = sides[1] + sides[0];
        int answer = max - min - 1;
        return answer;
    }
}