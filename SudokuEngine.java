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