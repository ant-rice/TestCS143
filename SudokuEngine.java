import java.io.*;

public class SudokuEngine {
    public static void main(String[] args) {
        try {
        SudokuBoard myBoard = new SudokuBoard("data1.sdk"); 
        System.out.println(myBoard);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
    }
}
/*
change log
1. added try catch block
*/


/*
# PROGRAM OUTPUT
  ----jGRASP exec: java SudokuEngine
 _________________ 
 2 _ _ 1 _ 5 _ _ 3 
 _ 5 4 _ _ _ 7 1 _ 
 _ 1 _ 2 _ 3 _ 8 _ 
 6 _ 2 8 _ 7 3 _ 4 
 _ _ _ _ _ _ _ _ _ 
 1 _ 5 3 _ 9 8 _ 6 
 _ 2 _ 7 _ 1 _ 6 _ 
 _ 8 1 _ _ _ 2 4 _ 
 7 _ _ 4 _ 2 _ _ 1 
 ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ 
 
 
  ----jGRASP: Operation complete.
*/

