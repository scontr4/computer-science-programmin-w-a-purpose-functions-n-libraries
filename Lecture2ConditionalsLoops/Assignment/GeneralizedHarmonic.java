import java.lang.Math;

public class GeneralizedHarmonic {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double harmonic = 0;

        for (int i=1; i <= n; i++) {
            double denominator = Math.pow(i, r);
            harmonic += 1.0 / denominator;
        }

        System.out.println(harmonic);

    }

}
