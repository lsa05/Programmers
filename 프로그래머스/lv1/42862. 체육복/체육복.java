import java.util.Arrays;
class Solution {
 public static int solution(int n, int[] lost, int[] reserve) {

 
        Arrays.sort(lost);
        Arrays.sort(reserve);
    	
        int answer = 0; 
        int borrow = 0;	
        
        
        for(int i=0; i<lost.length; i++) { 	
        	for(int j=0; j<reserve.length; j++) { 
        		if(lost[i]==reserve[j]) {	
        			lost[i]=reserve[j]=-5;	
        			borrow++;
        			break;	
        		}	
        	}
        }
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1) { 
        			lost[i]=reserve[j]=-5;	 
                    
        			borrow++;
        			break;
        		}
        	}
        	

        }
        return answer = n-lost.length + borrow; 
    }
}