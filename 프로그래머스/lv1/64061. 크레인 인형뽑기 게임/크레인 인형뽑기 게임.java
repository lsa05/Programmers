import java.util.Stack;
class Solution{


    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();   
     
        
        for (int x : moves) {    
            int j = x - 1;      
            
            for (int i = 0; i < board.length; i++) {
                // 인형을 뽑을 경우
                if (board[i][j] > 0) {
                    // 뽑은 인형이 있고, 마지막 인형과 방금 뽑은 인형이 동일할 경우
                    if (!stack.isEmpty() && stack.peek() == board[i][j]) {
                        stack.pop();	//인형을 꺼낸다.
                        
                        answer += 2;	//꺼낼때 2개씩 제거
                    }
                    
                    // 아닐 경우
                    else
                    {
                        stack.push(board[i][j]);
                    }
                    
                    board[i][j] = 0;
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}