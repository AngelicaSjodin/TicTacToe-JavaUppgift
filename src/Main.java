import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running=true;
        char player = 'X';

    //grid using char
        char[][] grid = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
        };
        System.out.println(Arrays.deepToString(grid));


        //moves

    }
    public static boolean won( char player){

        return false;
    }

    public static void printGrid(char[][] grid){

    }
}