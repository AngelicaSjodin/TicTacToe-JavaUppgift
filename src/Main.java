import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner takes in value from user
        Scanner scanner = new Scanner(System.in);

        //variables
        boolean running=true;
        char player = 'X';

    //grid using char and how the board should look like
        char[][] grid = {
                {'1','|','2','|','3'},
                {'-','+','-','+','-'},
                {'4','|','5','|','6'},
                {'-','+','-','+','-'},
                {'7','|','8','|','9'},
        };
        printGrid(grid);

        //gets desired position from user
        System.out.println("type a number from 1-9 to choose your place on the board:");
        int position=scanner.nextInt();
        System.out.println(position);

        posChoice(grid,position);
        printGrid(grid);

    }

    public static void posChoice(char[][] grid,int position){
        switch (position){
            case 1:
                grid[0][0]='X';
                break;
            case 2:
                grid[0][2]='X';
                break;
            case 3:
                grid[0][4]='X';
                break;
            case 4:
                grid[2][0]='X';
                break;
            case 5:
                grid[2][2]='X';
                break;
            case 6:
                grid[2][4]='X';
                break;
            case 7:
                grid[4][0]='X';
                break;
            case 8:
                grid[4][2]='X';
                break;
            case 9:
                grid[4][4]='X';
                break;
        }
    }

    public static boolean won( char player){

        return false;
    }

    public static void printGrid(char[][] grid){
        for(char[] row:grid){
            for(char col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}