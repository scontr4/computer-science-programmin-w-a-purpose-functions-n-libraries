public class CountingPrimes {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int count = 0;

        for (int potentialPrime = 2; potentialPrime <= n; potentialPrime++) {
            boolean isPrime = true;
    
            for (int factor = 2; factor*factor <= potentialPrime; factor++) {
                if (potentialPrime % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count ++;
            }

        }

        System.out.println(count);

    }

}