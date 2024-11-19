import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner takes in value from user
        Scanner scanner = new Scanner(System.in);

        //variables
        boolean running=true;
        char player = 'X';

        //using objects from classes
        Grid grid = new Grid(); //how the grid should look like
        PrintGrid printGrid=new PrintGrid(); //how the grid should be printed

        PrintGrid.gridLoop(grid.chars);//prints whole game board



        //gets desired position from user
        System.out.println("type a number from 1-9 to choose your place on the board:");
        int position=scanner.nextInt();

        PosChoice posChoice=new PosChoice();// gets switch cas method from class
        PosChoice.posChoice(grid.chars,position);//places wanted position on board
        PrintGrid.gridLoop(grid.chars);//shows board again

    }






}