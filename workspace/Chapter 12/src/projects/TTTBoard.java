package projects;
public class TTTBoard{
private char[][] board;
public TTTBoard(){
	board = new char[3][3];
	reset();
}
	public void reset(){
		for (int row = 0; row < 3; row++)
			for (int column = 0; column < 3; column++)
				board[row][column] = '-';
	}
	public String toString(){
		String result = "\n";
		for (int row = 0; row < 3; row++){
			for (int column = 0; column < 3; column++)
				result += board[row][column] + " ";
			result += "\n";
		}
		return result;
	}
	public boolean placeXorO(char player, int row, int column){
		if (board[row - 1][column - 1] == '-'){
			board[row - 1][column - 1] = player;
			return true;
		}
		else
			return false;
	}

	public char getWinner() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return board[i][0];
			} else if(board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return board[0][i];
			} else if(board [0][0] == board[1][1] && board[1][1] == board [2][2]) {
				return board[1][1];
			} else if(board [2][0] == board[1][1] && board[1][1] == board [0][2]) {
				return board[1][1];
			}
		}
		return '-';
	}
	
	public boolean full() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean validate(int row, int column) {
		if (board[row][column] == 'X' || board[row][column] == 'O') {
			System.out.println("---Ok bot move---");
			return false;
		} else {
		System.out.println("Blocked invalid bot move");
		return true;
		}
	}
}