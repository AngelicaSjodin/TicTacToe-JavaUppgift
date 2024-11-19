public class PrintGrid extends Grid{

    public static void gridLoop(char[][] grid){
        for(char[] row:grid){
            for(char col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
