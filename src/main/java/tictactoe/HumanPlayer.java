package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer {
	  String name;
	  char mark;
	  
	  HumanPlayer(String name, char mark) {
	    this.name = name;
	    this.mark = mark;
	  }

	  void makeMove() {
	    Scanner scan = new Scanner(System.in);
	    int row;
	    int col;
	    try {
	    do {
	      TicTacToe.l.println("enter row :");
	      row = scan.nextInt();
	      TicTacToe.l.println("enter col:");
	      col = scan.nextInt();
	    } while (!validMove(row, col));
	    
	    TicTacToe.placeMark(row, col, mark);
	    
	   }catch(InputMismatchException e) {
	    	TicTacToe.l.println(e);}
		  
	  }
	  
	  boolean validMove(int row, int col) {
	    if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
	      
	        return TicTacToe.board[row][col] == ' ';

	    } else {
	      return false;
	    }
	  }
	}

