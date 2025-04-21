import java.util.*;
import java.io.*;

public class SudokuBoard {
   private char[][] board;
   
   public SudokuBoard(String filename) throws FileNotFoundException {
      board = new char[9][9];
      Scanner readBoard = new Scanner(new File(filename));
      char val;
      
      for(int i = 0; i < 9; i++) { // going through each line
         String line = readBoard.nextLine();
         for(int j = 0; j < line.length(); j++) {
            if (line.charAt(j) == '.') {
               val = '_';
            } else {
               val = line.charAt(j);
            } 
            board[i][j] = val;
            
         }
      }
   }
   
   public String toString() {
      String result = "";
      result += "_________________ \n";
         for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
               result += board[r][c];    
               result += " "; 
            }   
            result += "\n";
	      }
      result += "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ \n";
      return result;
   }
}

