import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //grid using char

        char[][] grid = new char [4][4];
        for(int row =0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                grid[row][col]='o';
            }
        }
        System.out.println(Arrays.deepToString(grid));



    }

}