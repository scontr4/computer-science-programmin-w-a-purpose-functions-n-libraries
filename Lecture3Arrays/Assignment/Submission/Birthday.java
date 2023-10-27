import java.lang.Math;

public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // For this list, each position i has the times i people entered
        // until two birthdays matched
        int hugeListLength = 1000;

        int[] timesList = new int[hugeListLength];

        for (int trial = 0; trial < trials; trial++) {            
            
            int count = 1;

            // Entries until 2 people match their birthday
            boolean[] birthdays = new boolean[n];            
            while (true) {
                int newBirthday = (int) (Math.random() * n);                

                if (birthdays[newBirthday] == false) {
                    birthdays[newBirthday] = true;
                } else {
                    break;
                }

                count++;
            }
            timesList[count]++;
        }

        // Print the table, initializing it on the first person
        int times = 1;        
        int cumTimesCounter = 0;
        double cumPercentage = 0;        
        while (cumPercentage < 0.5) {
            cumTimesCounter += timesList[times];
            cumPercentage = ((double) cumTimesCounter) / trials;

            System.out.println( times + "   " + timesList[times] + "   " + cumPercentage);

            times++;
        }

    }

}