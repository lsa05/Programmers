class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cp=0; 	
		int cy=0;	
		           
        for(int i=0; i<s.length(); i++) {
            if('p'==s.charAt(i) || 'P'==s.charAt(i)) {
                cp++;	
            }else if('Y'==s.charAt(i) || 'y'==s.charAt(i)) {
                cy++;					        
            }	
        }

        if(cp==cy) {
           answer = true;
        }else {
            answer = false;
        }
        
        return answer;
    }
}