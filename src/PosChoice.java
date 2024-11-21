public class PosChoice extends Main{
    public static void posChoice(char[][] grid, int position, int turnTracker){
        char playerOnePos='X';
        char playerTwoPos='O';



        if (turnTracker % 2 == 0) {
            switch (position) {
                case 1:
                    grid[0][0] = playerOnePos;
                    break;
                case 2:
                    grid[0][2] = playerOnePos;
                    break;
                case 3:
                    grid[0][4] = playerOnePos;
                    break;
                case 4:
                    grid[2][0] = playerOnePos;
                    break;
                case 5:
                    grid[2][2] = playerOnePos;
                    break;
                case 6:
                    grid[2][4] = playerOnePos;
                    break;
                case 7:
                    grid[4][0] = playerOnePos;
                    break;
                case 8:
                    grid[4][2] = playerOnePos;
                    break;
                case 9:
                    grid[4][4] = playerOnePos;
                    break;

            }
        } else {
            switch (position) {
                case 1:
                    grid[0][0] = playerTwoPos;
                    break;
                case 2:
                    grid[0][2] = playerTwoPos;
                    break;
                case 3:
                    grid[0][4] = playerTwoPos;
                    break;
                case 4:
                    grid[2][0] = playerTwoPos;
                    break;
                case 5:
                    grid[2][2] = playerTwoPos;
                    break;
                case 6:
                    grid[2][4] = playerTwoPos;
                    break;
                case 7:
                    grid[4][0] = playerTwoPos;
                    break;
                case 8:
                    grid[4][2] = playerTwoPos;
                    break;
                case 9:
                    grid[4][4] = playerTwoPos;
                    break;
            }
        }



    }
}
