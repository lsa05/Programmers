class Solution {
  public  long solution(int price, int money, int count) {
        long answer = 0;
        long result=0; 
        long num=0;
        for(int i=1; i<=count; i++) {
        	num++;
        	result+=num*price;
        }
        if(result>money) {
        	answer = result-money;
        }else {
        	answer = 0;
        }
  
        return answer;
    }
}