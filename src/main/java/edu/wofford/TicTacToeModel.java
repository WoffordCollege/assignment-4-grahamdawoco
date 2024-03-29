package edu.wofford;
import java.util.ArrayList;

public class TicTacToeModel {

    public enum Mark { EMPTY, XMARK, OMARK };
    public enum Result { XWIN, OWIN, TIE, NONE };
    protected Mark[][] board;
    protected boolean XTurn;
    protected boolean going;

    public TicTacToeModel() {
	this.board = new Mark[3][3];
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			board[i][j]=Mark.EMPTY;}}
	this.XTurn = true;
	this.going = true;
    }
    
    public boolean setMarkAt(int row, int col) {
	if(this.going){
	if(0<=row && row <=2 && 0 <= col && col <=2){
	if(board[row][col] == Mark.EMPTY){
	if(XTurn){
	board[row][col] = Mark.XMARK;
	}
	else{board[row][col] = Mark.OMARK;}
	XTurn = !XTurn;
	return true;
	}}}
        return false;
    }
    
    public Mark getMarkAt(int row, int col) {
	if(0<=row && row <=2 && 0 <= col && col <=2){
	return board[row][col];
	}
        return Mark.EMPTY;
    }

    public Result getResult() {
	String[][] stringmatrix = new String[3][3];
	boolean full = true;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(board[i][j] == Mark.EMPTY){
				stringmatrix[i][j] = " ";
				full = false;
			}
			if(board[i][j] == Mark.XMARK){
				stringmatrix[i][j] = "X";
			}
			if(board[i][j] == Mark.OMARK){
				stringmatrix[i][j] = "O";
			}
	}}
	String row1 = stringmatrix[0][0]+stringmatrix[0][1]+stringmatrix[0][2];
	String row2 = stringmatrix[1][0]+stringmatrix[1][1]+stringmatrix[1][2];
	String row3 = stringmatrix[2][0]+stringmatrix[2][1]+stringmatrix[2][2];
	String col1 = stringmatrix[0][0]+stringmatrix[1][0]+stringmatrix[2][0];
	String col2 = stringmatrix[0][1]+stringmatrix[1][1]+stringmatrix[2][1];
	String col3 = stringmatrix[0][2]+stringmatrix[1][2]+stringmatrix[2][2];
	String dexter = stringmatrix[0][0]+stringmatrix[1][1]+stringmatrix[2][2];
	String sinister=stringmatrix[2][0]+stringmatrix[1][1]+stringmatrix[0][2];
	String[] stringmatrix2 = new String[8];
	stringmatrix2[0] = row1;
	stringmatrix2[1] = row2;
	stringmatrix2[2] = row3;
	stringmatrix2[3] = col1;
	stringmatrix2[4] = col2;
	stringmatrix2[5] = col3;
	stringmatrix2[6] = dexter;
	stringmatrix2[7] = sinister;
	for(int k = 0; k<8; k++){
	if(stringmatrix2[k].equals("XXX")){this.going = false; return Result.XWIN;}
	if(stringmatrix2[k].equals("OOO")){this.going = false; return Result.OWIN;}
	}
	if(full){this.going = false; return Result.TIE;}
        return Result.NONE;
    }
    
    public String toString() {
	String[][] stringmatrix = new String[3][3];
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(board[i][j] == Mark.EMPTY){
				stringmatrix[i][j] = " ";
			}
			if(board[i][j] == Mark.XMARK){
				stringmatrix[i][j] = "X";
			}
			if(board[i][j] == Mark.OMARK){
				stringmatrix[i][j] = "O";
			}
	}}
	String row1 = stringmatrix[0][0]+"|"+stringmatrix[0][1]+"|"+stringmatrix[0][2]+"\n";
	String row2 = stringmatrix[1][0]+"|"+stringmatrix[1][1]+"|"+stringmatrix[1][2]+"\n";
	String row3 = stringmatrix[2][0]+"|"+stringmatrix[2][1]+"|"+stringmatrix[2][2];
	String floor = "-----"+"\n";
        return row1+floor+row2+floor+row3;
    }    

}