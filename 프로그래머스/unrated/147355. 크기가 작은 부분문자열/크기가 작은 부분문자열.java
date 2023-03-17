class Solution {
    public int solution(String t, String p) {
        
        int len = p.length(); //p의 길이랑 같은 부분문자열
        long pNum = Long.parseLong(p); //문자열 -> 숫자  
        
        int answer = 0;
        
        for(int i=0; i<=t.length()-len; i++){
          long str = Long.parseLong(t.substring(i, i+len));
            if(str <= tNum){
                System.out.println(str);
                answer++;
            }
           
        }
        return answer;
    }
}
