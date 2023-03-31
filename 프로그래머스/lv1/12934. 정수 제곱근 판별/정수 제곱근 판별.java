	class Solution {
        public long solution(long n) {

            long answer = (long)Math.sqrt(n); 

            for(int i=0;i<answer;i++) {
                if(n == answer*answer) {
                    return (answer+1)*(answer+1);
                }    
            }
            return -1;  
        }
    }