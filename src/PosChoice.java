public class PosChoice {
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
}
