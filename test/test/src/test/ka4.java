package test;

public class ka4 {
	public static void main(String[] args) {
		int[][] board = { { 0, 1, 1, 1 }, { 0, 1, 1, 1 }, { 0, 1, 1, 1 }, { 0, 0, 0, 0 } };

		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 0) {
					continue;
				}
				
				if ((i >= 1 && board[i - 1][j] > 0)
                        && (j >= 1 && board[i][j - 1] > 0)
                        && (i >= 1 && j >= 1 && board[i - 1][j - 1] > 0)) {
					// 정사각형인지 판단하는 if문이다.
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                    System.out.println(i+" "+j+" "+board[i][j]);
                }
				
				
				
				answer = answer < board[i][j] ? board[i][j] : answer;
			}
			
		}

		System.out.println(answer*answer);
	}
}
