class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i=s.length()-1; i>0; i--){
            for(int j=i-1; j>=0; j--){
               // answer[0] = -1;
                if(s.charAt(i)==s.charAt(j)){
                    answer[i] = i-j;
                    break;
                }else{
                    answer[i] = -1;
                }              
            }           
        }
        return answer;
    }
}