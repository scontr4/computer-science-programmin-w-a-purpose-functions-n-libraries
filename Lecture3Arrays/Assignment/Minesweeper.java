public class Minesweeper {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // two extra rows so i don't get out of bounds errors
        // I will truncate them later
        int[][] grid = new int[m + 2][n + 2]; 
        for(int i=0; i < k; i++) {

            while (true) {
                int randRow = (int) (Math.random() * m) + 1;
                int randCol = (int) (Math.random() * n) + 1;
                
                if (grid[randRow][randCol] != -1) {
                    grid[randRow][randCol] = -1;

                    if(grid[randRow][randCol + 1] != -1) {
                        grid[randRow][randCol + 1]++;
                    }
                    if(grid[randRow][randCol - 1] != -1) {
                        grid[randRow][randCol - 1]++;                        
                    }

                    if(grid[randRow + 1][randCol] != -1) {
                        grid[randRow + 1][randCol]++;
                    }
                    if(grid[randRow - 1][randCol] != -1) {
                        grid[randRow - 1][randCol]++;
                    }

                    if(grid[randRow + 1][randCol + 1] != -1) {
                        grid[randRow + 1][randCol + 1]++;
                    }
                    if(grid[randRow + 1][randCol - 1] != -1) {
                        grid[randRow + 1][randCol - 1]++;
                    }
                    if(grid[randRow - 1][randCol - 1] != -1) {
                        grid[randRow - 1][randCol - 1]++;
                    }
                    if(grid[randRow - 1][randCol + 1] != -1) {
                        grid[randRow - 1][randCol + 1]++;
                    }                
                    break;
                }
            }
        }

        
        for (int i=1; i < m+1; i++){
            for (int j=1; j < m+1; j++){
                if (grid[i][j] == -1) {
                    System.out.print('*' + "  ");
                } 
                else {
                    System.out.print(grid[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

}