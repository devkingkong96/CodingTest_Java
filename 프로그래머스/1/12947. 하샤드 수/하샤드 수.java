class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String [] arr = String.valueOf(x).split("");
        int check = 0;
        for(String s : arr){
            check += Integer.parseInt(s);
        }
        answer = x % check == 0 ? true : false;
        return answer;
    }
}