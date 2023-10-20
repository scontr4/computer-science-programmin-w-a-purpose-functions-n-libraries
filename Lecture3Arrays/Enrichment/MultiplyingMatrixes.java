// Multiplying a matrix a by matrix b:
//  * The number of columns of a must equal the number of rows of b.
//  * And the result will have the same number of rows as a, and the same number of columns as b.
//    m x n X n x p --> m x p
import java.lang.Math;

public class MultiplyingMatrixes {
    
    public static void main(String[] args) {

        int rows_a = (int) (Math.random() * 3 + 1);
        int cols_a = (int) (Math.random() * 3 + 1);
        int[][] a = new int[rows_a][cols_a];
        System.out.println("a: " + rows_a + "x" + cols_a);

        int rows_b = (int) (Math.random() * 3 + 1);
        int cols_b = (int) (Math.random() * 3 + 1);
        int[][] b = new int[rows_b][cols_b];
        System.out.println("b: " + rows_b + "x" + cols_b);

        if (cols_a != rows_b) {
            System.out.println("The dimensions of the matrixes do not satisfy matrix multiplication");
        } else {        

            System.out.println("Matrix a: ");
            for (int i=0; i < rows_a; i++) {
                for (int j=0; j< cols_a; j++) {
                    a[i][j] = (int) (Math.random() * 9 + 1);                    
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix b: ");
            for (int i=0; i < rows_b; i++) {
                for (int j=0; j < cols_b; j++) {
                    b[i][j] = (int) (Math.random() * 9 + 1);
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matrix c (axb): ");
            int [][] c = new int[rows_a][cols_b];
            for (int i=0; i < rows_a; i++) {
                for (int j=0; j < cols_b; j++) {
                    for (int k=0; k < cols_a; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    } 
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        
    }

}
