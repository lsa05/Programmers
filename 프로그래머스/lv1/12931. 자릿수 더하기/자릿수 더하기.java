import java.util.*;

public class Solution {
    public int solution(int n) {
        String str=String.valueOf(n);
	    	String[]arr=str.split("");
	        int answer = 0;
	        
	        for(int i=0;i<arr.length;i++) {
	        	answer+=Integer.parseInt(arr[i]);
	        }
	        
	        return answer;
    }
}