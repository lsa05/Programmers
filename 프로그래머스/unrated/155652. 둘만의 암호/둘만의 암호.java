class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            int idx = 0;
            
            while(idx < index){
                c = c=='z' ? 'a' : (char)(c+1);
                
                if(!skip.contains(String.valueOf(c))){
                    idx++;
                }
            }
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}