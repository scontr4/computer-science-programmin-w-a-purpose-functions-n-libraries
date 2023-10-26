import java.lang.Math;

public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

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

            System.out.println(count);

        }

    }

}