public class Minesweeper {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        String[][] grid = new String[m][n];
        for(int i=0; i < k; i++) {

            while (true) {
                int randRow = (int) (Math.random() * m);
                int randCol = (int) (Math.random() * n);
                
                if (grid[randRow][randCol] != "*  ") {
                    grid[randRow][randCol] = "*  ";
                    break;
                }
            }
        }

        
        for (int i=0; i < m; i++){
            for (int j=0; j < m; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

}