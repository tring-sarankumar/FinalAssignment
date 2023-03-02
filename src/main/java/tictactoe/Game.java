package tictactoe;

import java.util.Scanner;

public class Game {
  public void game() {
    TicTacToe tic = new TicTacToe();
    Scanner scan = new Scanner(System.in);
    
    
    char mark;
    char mark1;
    
    int t = 0;
    tic.printboard();
    
    TicTacToe.l.println("Enter Player 1 Name ");
    String name = scan.next();
    TicTacToe.l.println("Choose X  OR O");
    mark = scan.next().charAt(0);
    HumanPlayer player1 = new HumanPlayer(name, mark);

    
    TicTacToe.l.println("Enter Player 2 Name");
    String name1 = scan.next();
    if (mark == 'X') {
      mark1 = 'O';
    } else {
      mark1 = 'X';
    }
    HumanPlayer player2 = new HumanPlayer(name1, mark1);

    
    HumanPlayer cp;
    cp = player1;

    while (t < 9) {
      TicTacToe.l.println(cp.name + " Turn");
      cp.makeMove();
      tic.printboard();
      if (TicTacToe.checkRow() || TicTacToe.checkcol() || TicTacToe.checkDiag()) {
        TicTacToe.l.println(cp.name + " Win");
        t++;
        break;
      } else {
        if (cp == player1) {
          cp = player2;
        } else {
          cp = player1;
        }
      }
    }
    
    if (t == 0) {
      TicTacToe.l.println(cp.name + " Die");
    }
  }

}