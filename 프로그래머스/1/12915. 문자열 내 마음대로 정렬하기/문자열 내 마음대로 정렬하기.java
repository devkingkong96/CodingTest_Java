import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String [strings.length];
        List<String> list = new ArrayList<>();
        for(int i=0;i<strings.length;i++){
            list.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++){
            for(int j=0;j<strings.length;j++){
                if(list.get(i).substring(1).equals(strings[j])){
                    answer[i] = strings[j];
                }
            }
        }
        return answer;
    }
}