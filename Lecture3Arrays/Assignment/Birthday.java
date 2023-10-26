import java.lang.Math;

public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // For this list, each position i has the times i people entered
        // until two birthdays matched
        int[] timesList = new int[1000];

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

        for (int i=0; i < 30; i++) {
            System.out.println( i + " times: " + timesList[i]);
        }

    }

}