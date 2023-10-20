public class BinomialCoefficients {

    public static void main(String[] args) {
        int max_n = Integer.parseInt(args[0]);       
        double[][] binomialDistribution = new double[max_n + 1][max_n + 1];

        System.out.println("Binomial distribution: ");
        for (int n = 1; n < max_n + 1; n++) {
            for (int k = 0; k <= n; k++) {
                if (k == 0) {
                    binomialDistribution[n][k] = 0;
                }
                else if (n == 1 && k == 1){
                    binomialDistribution[n][k] = 1;
                }
                else {
                    binomialDistribution[n][k] = (binomialDistribution[n-1][k] + binomialDistribution[n-1][k-1]) / 2;
                }

                if (k != 0) {
                    System.out.print(binomialDistribution[n][k] + " ");
                }
            }
            System.out.println();
        }
    }

}