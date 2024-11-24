public class Grid {

    private static final char[][] defaultGrid={
            {' ','|',' ','|',' '},                  //unchangeable
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
    };

    public static char[][]chars = {
            {' ','|',' ','|',' '},                  //how the board should look like
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
    };

    public static void gridLoop(){
        for(char[]row:chars){
            for(char cell : row){                   //how the board should be printed out
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void resetGrid(){                 //reset board to default
        for(int row=0;row< chars.length;row++){
            for(int col=0;col<chars[row].length;col++){
                chars[row][col]=defaultGrid[row][col];
            }
        }
        System.out.println();
    }





}
