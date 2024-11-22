import java.util.Scanner;

public class PosChoice extends Main{
    public static void posChoice(char[][] grid, int position, int turnTracker) {
        Scanner scanner = new Scanner(System.in);

        char playerOnePos = 'X'; //thought it would make things easier but feels like these variables made no difference to just using 'X' and 'O'
        char playerTwoPos = 'O'; //now im too lazy to change sorry :P

        boolean validPositionX=false;       //for the while loops below
        boolean validPositionO=false;

        if (turnTracker % 2 == 0) {        //because x always goes first i made a turnTracker to see what turn the players are on. The system could then decide which char to place next
                                            //based on if the turnTracker's number is even or odd :)
            while(!validPositionX){         //this loop activates when the player tries to take the other players position
                switch (position) {        //first checks the desired position from player
                    case 1:
                        if (grid[0][0] == 'X' || grid[0][0] == 'O') {                   //afterwardds it checks if the desired position is already taken
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();                               //if the position is occupied the program asks for a new value and loops.
                        } else {                                                        //if position is empty it adds the new value to the board and ends the loop :D
                            grid[0][0] = playerOnePos;
                            validPositionX=true;
                        }                                                               //could have made this class more clean with another class or two however that requires more brainpower of me
                        break;                                                          //and sadly i do not have the time :/

                    case 2:
                        if (grid[0][2] == 'X' || grid[0][2] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[0][2] = playerOnePos;
                            validPositionX=true;
                        }
                        break;

                    case 3:
                        if (grid[0][4] == 'X' || grid[0][4] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[0][4] = playerOnePos;
                            validPositionX=true;
                        }
                        break;

                    case 4:
                        if (grid[2][0] == 'X' || grid[2][0] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[2][0] = playerOnePos;
                            validPositionX=true;
                        }
                        break;

                    case 5:
                        if (grid[2][2] == 'X' || grid[2][2] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[2][2] = playerOnePos;
                            validPositionX=true;
                        }
                        break;
                    case 6:
                        if (grid[2][4] == 'X' || grid[2][4] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[2][4] = playerOnePos;
                            validPositionX=true;
                        }
                        break;
                    case 7:
                        if (grid[4][0] == 'X' || grid[4][0] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[4][0] = playerOnePos;
                            validPositionX=true;
                        }
                        break;
                    case 8:
                        if (grid[4][2] == 'X' || grid[4][2] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[4][2] = playerOnePos;
                            validPositionX=true;
                        }
                        break;
                    case 9:
                        if (grid[4][4] == 'X' || grid[4][4] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[4][4] = playerOnePos;
                            validPositionX=true;
                        }
                        break;
                }
            }
        } else {                                //same code but for the second player O
            while(!validPositionO) {
                switch (position) {
                    case 1:
                        if (grid[0][0] == 'X' || grid[0][0] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[0][0] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;

                    case 2:
                        if (grid[0][2] == 'X' || grid[0][2] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[0][2] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;

                    case 3:
                        if (grid[0][4] == 'X' || grid[0][4] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[0][4] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;

                    case 4:
                        if (grid[2][0] == 'X' || grid[2][0] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[2][0] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;

                    case 5:
                        if (grid[2][2] == 'X' || grid[2][2] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[2][2] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;
                    case 6:
                        if (grid[2][4] == 'X' || grid[2][4] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[2][4] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;
                    case 7:
                        if (grid[4][0] == 'X' || grid[4][0] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[4][0] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;
                    case 8:
                        if (grid[4][2] == 'X' || grid[4][2] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[4][2] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;
                    case 9:
                        if (grid[4][4] == 'X' || grid[4][4] == 'O') {
                            System.out.println("This position is already taken.");
                            System.out.println("Please try again:");
                            position = scanner.nextInt();
                        } else {
                            grid[4][4] = playerTwoPos;
                            validPositionO=true;
                        }
                        break;
                }
            }
        }



    }
}
