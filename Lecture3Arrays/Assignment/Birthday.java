import java.lang.Math;

public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[0]);

        for (int trial = 0; trial < trials; trial++) {
            
            int count = 0;
            boolean[] birthdays = new boolean[n];

            while (true) {
                int newBirthday = (int) (Math.random() * n);

                if (birthdays[newBirthday] == false) {
                    count++;
                    birthdays[newBirthday] = true;
                } else {
                    break;
                }
            }

        }

    }

}