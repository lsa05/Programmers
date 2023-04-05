class Solution {
		    public int solution(int left, int right) {
		        int answer = 0;
		        
		        for(int i=left; i<=right; i++) {
		        	double a=(double)Math.sqrt(i);
		        	if(a%1==0) { //제곱근이 나머지가 0이면,= 정수면 
		        		answer -=i;
		        	}else {
		        		answer +=i;
		        	}
		        }
		        return answer;
		    }
		}