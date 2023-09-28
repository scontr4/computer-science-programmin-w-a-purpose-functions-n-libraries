public class RelativelyPrime {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i=0; i <= n; i++) {

            for (int j=0; j <= n; j++) {
                
                int minimum;
                if (j <= i) {
                    minimum = j;
                } else {
                    minimum = i;
                }

                int gcd = minimum;
                while ( minimum > 0 ) {

                    if (j % minimum == 0 && i % minimum == 0) {
                        gcd = minimum;
                        break;
                    }

                    minimum--;

                }

                if (gcd == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }

            // New line for the matrix
            System.out.println("");

        }
    }

}