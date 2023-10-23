import java.lang.Math;

public class DiscreteDistribution {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        int n = args.length - 1;
        
        int[] a_list = new int[n];
        for (int i=0; i < n; i++) {
            a_list[i] = Integer.parseInt(args[i + 1]);
        }

        int[] cumsumList = new int[n+1];
        int cumsum = 0;
        for (int i=1; i <= n; i++) {
            cumsum += a_list[i - 1];
            cumsumList[i] = cumsum;
        }

        int totalCumSum = cumsumList[n];

        for (int k=0; k < m; k++) {
            int randint = (int) (Math.random() * totalCumSum);
            for (int i=1; i <= n; i++) {
                if (cumsumList[i-1] <= randint && randint < cumsumList[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }   

}