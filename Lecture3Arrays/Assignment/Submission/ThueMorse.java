import java.lang.Math;

public class ThueMorse {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        // Build the Thue-Morse sequence
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
        System.out.println();

        // Create the Thue-Morse wave
        for (int i = 0; i < n; i++) {    
            for (int j = 0; j < n; j++) {
                if (thueMorseSequence[i] == thueMorseSequence[j]) {
                    System.out.print("+  ");
                } 
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}