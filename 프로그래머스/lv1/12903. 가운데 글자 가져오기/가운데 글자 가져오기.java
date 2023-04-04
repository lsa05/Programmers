class Solution {
		    public String solution(String s) {
		        String answer = "";
		        //substring(int begin,int end)이용 (begin<= x <end) 
		        
		        if(s.length()%2==0) { //짝수
		        	answer=s.substring(s.length()/2-1, s.length()/2+1);
		        }else { //홀수			
		        	answer=s.substring(s.length()/2, s.length()/2+1);
		        }
		        
		        return answer;
		    }
		}