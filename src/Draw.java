

public class Draw {

    public static void draw(char[][] grid) {

        for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
            for (int colIndex = 0; colIndex < grid[rowIndex].length; colIndex++) {
                if(grid[rowIndex][colIndex]==' '){
                    return;
                }
            }                               //goes though whole grid to see if all empty spaces are taken
                                            //if so, the game ends in a draw
        }
        System.out.println("draw");
        System.out.println("no winners");
        PlayAgain.question();


    }
}
