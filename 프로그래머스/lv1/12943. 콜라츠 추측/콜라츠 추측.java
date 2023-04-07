class Solution {
    public int solution(int num) {
        
    long num1 = (long)num;
    int count = 0;
		
		//num이 1이 될때까지
		while(num1!=1) {
			//num이 짝수인 조건
			if(num1%2==0) {
				num1 = num1/2;
				count++;
			//num이 홀수인 조건
			}else{
        num1 = 3*num1 + 1;
				count++;
			}
		}//while 끝
		
		if(count>=500) count=-1;
        
        int answer = count;
        return answer;
    }
}