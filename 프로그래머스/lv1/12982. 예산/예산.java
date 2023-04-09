import java.util.Arrays;
class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        int sum=0;
	        int count=0;
	        //오름차순 정렬
	        Arrays.sort(d);
	        
	        for(int i=0; i<d.length; i++) {
	        	sum+=d[i];
	        	if(sum<=budget) {
	        		count++;
	        	}else break;
	        }
	        
	        answer=count;
     
	        return answer;
	    }
	}