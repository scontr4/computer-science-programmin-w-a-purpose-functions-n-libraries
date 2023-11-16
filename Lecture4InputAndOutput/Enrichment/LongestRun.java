public class LongestRun {

    public static void main(String[] args) {
        
        int longestRun = 0;
        int longestRunNumber = Integer.MIN_VALUE;
        int currentRun = 0;
        int currentNumber = Integer.MIN_VALUE;

        while (!StdIn.isEmpty()){

            int x = StdIn.readInt();

            if (x != currentNumber) {
                currentNumber = x;
                currentRun = 1;
            } else  {
                currentRun++;
            }

            if (currentRun > longestRun) {
                longestRun = currentRun;
                longestRunNumber = currentNumber;
            }
        }

        for (int i=0; i < longestRun; i++) {
            StdOut.print(longestRunNumber + " ");
        }

    }

}