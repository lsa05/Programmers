class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int diff = 0;
        boolean check = true;
        char x = s.charAt(0);
        
        for(int i = 0; i<s.length(); i++){
            if(check){
                x = s.charAt(i);    
                check = false;
                
            }
            if(x == s.charAt(i)){
                count++;
            }else{
                diff++;
            }
            
            if(count == diff){
                answer++;
                check = true;
            }
            
        }
        
        if(count != diff){
            answer++;
        }
        
        return answer;
    }
}