class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int end = 0;
        
        for(int start : section){
            if(end < start){
                end = start+m-1;
                answer++;
            }    
        }
        return answer;
    }
}