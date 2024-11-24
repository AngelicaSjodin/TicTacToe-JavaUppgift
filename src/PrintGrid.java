public class PrintGrid extends Grid{

    private static char rowChar;
    private static int rowIndex;
    private static int colIndex;

    public static void gridLoop(char[][] grid){
        for(int rowIndex=0;rowIndex< grid.length;rowIndex++){
            for(int colIndex=0;colIndex<grid[rowIndex].length;colIndex++){
                rowChar=grid[rowIndex][colIndex];
                System.out.print(rowChar);
            }
            System.out.println();
        }
    }

public static char getRowChar(){
        return rowChar;
}
public static int getRowIndex(){
    return rowIndex;
}
public static int getColIndex(){
    return colIndex;
}

    public static void setRowIndex(int rowIndex) {
        PrintGrid.rowIndex = rowIndex;
    }

}
