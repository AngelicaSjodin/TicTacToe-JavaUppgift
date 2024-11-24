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
            for(char cell : row){
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void resetGrid(){
        for(int row=0;row< chars.length;row++){
            for(int col=0;col<chars[row].length;col++){
                chars[row][col]=defaultGrid[row][col];
            }
        }
        System.out.println();
    }

//    private static char rowChar;
//    private static int rowIndex;
//    private static int colIndex;
//
//    public static void gridLoop(char[][] grid){                             //prints all rows and columns
//        for(int rowIndex=0;rowIndex< grid.length;rowIndex++){
//            for(int colIndex=0;colIndex<grid[rowIndex].length;colIndex++){
//                rowChar=grid[rowIndex][colIndex];
//                System.out.print(rowChar);
//            }
//            System.out.println();
//        }
//    }
//
//    public static char getRowChar(){
//        return rowChar;
//    }
//    public static int getRowIndex(){
//        return rowIndex;
//    }
//    public static int getColIndex(){
//        return colIndex;
//    }



}
