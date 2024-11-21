import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//scanner takes in value from user

        //variables
        boolean running=true;   //keeps the game running
        int turnTracker=-1;      //keep track of who's turn it is

        //asking for player names
        System.out.println("Player ones's name (goes first):");
        String playerOne=scanner.next();
        System.out.println("Player two's name (goes second):");
        String playerTwo=scanner.next();

        //using objects from classes
        Grid grid = new Grid();                 //how the grid should look like
        PrintGrid printGrid = new PrintGrid();  //how the grid should be printed
        PrintGrid.gridLoop(grid.chars);         //prints whole game board
        PosChoice posChoice = new PosChoice();  // gets switch case method from class



        while(running) {
            turnTracker+=1;
            //gets desired position from user one
            System.out.println(playerOne+"'s turn.");
            System.out.println("type a number from 1-9 to choose your place on the board:");
            int position = scanner.nextInt();
            PosChoice.posChoice(grid.chars, position, turnTracker);     //places wanted position on board
            PrintGrid.gridLoop(grid.chars);                             //shows board again

            turnTracker+=1;
            //gets desired position from user two
            System.out.println(playerTwo+"'s turn.");
            System.out.println("type a number from 1-9 to choose your place on the board:");

            position = scanner.nextInt();
            PosChoice.posChoice(grid.chars, position, turnTracker);     //places wanted position on board
            PrintGrid.gridLoop(grid.chars);                             //shows board again


        }
    }
}