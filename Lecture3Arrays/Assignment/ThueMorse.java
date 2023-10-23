import java.lang.Math;

public class ThueMorse {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        int[] thueMorseSequence = new int[n];
        System.out.print(thueMorseSequence[0] + " ");
        for (int i=1; i < n; i++) {

            int exponent = (int) (Math.log(i) / Math.log(2));
            int complementIndex = i % (int) Math.pow(2, exponent);

            if (thueMorseSequence[complementIndex] == 0) {
                thueMorseSequence[i] = 1;
            }
            else {
                thueMorseSequence[i] = 0;
            }
            System.out.print(thueMorseSequence[i] + " ");

        }
    }
}