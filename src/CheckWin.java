public class CheckWin  {
    public static void X(char[][] grid, boolean running) {       //checks wins for X

        for (int rowIndex = 0; rowIndex < 5; rowIndex++) {                                  //goes through all rows
            if(grid[rowIndex][0] == 'X'&&grid[rowIndex][2]=='X'&&grid[rowIndex][4]=='X'){
                System.out.println("x won yippie");
                PlayAgain.question(Grid.chars,running);
                break;
            } else{
                continue;
            }
        }
        for (int colIndex = 0; colIndex < 5; colIndex++) {                                  //goes through all columns
            if(grid[0][colIndex] == 'X'&&grid[2][colIndex]=='X'&&grid[4][colIndex]=='X'){
                System.out.println("x won yippie");
            } else{
                continue;
            }
        }

        if(grid[0][0] =='X' && grid[2][2] =='X' && grid[4][4] =='X'){                       //checks diagonal wins
            System.out.println("x won yippie");
        }
        if(grid[0][4] =='X' && grid[2][2] =='X' && grid[4][0] =='X'){
            System.out.println("x won yippie");
        }

    }
    public static void O(char[][] grid) {       //checks wins for X

        for (int rowIndex = 0; rowIndex < 5; rowIndex++) {
            if(grid[rowIndex][0] == 'O'&&grid[rowIndex][2]=='O'&&grid[rowIndex][4]=='O'){
                System.out.println("O won yippie");
            } else{
                continue;
            }
        }
        for (int colIndex = 0; colIndex < 5; colIndex++) {
            if(grid[0][colIndex] == 'O'&&grid[2][colIndex]=='O'&&grid[4][colIndex]=='O'){
                System.out.println("O won yippie");
            } else{
                continue;
            }
        }

        if(grid[0][0] =='=' && grid[2][2] =='O' && grid[4][4] =='O'){
            System.out.println("O won yippie");
        }
        if(grid[0][4] =='O' && grid[2][2] =='O' && grid[4][0] =='O'){
            System.out.println("O won yippie");
        }

    }
}
