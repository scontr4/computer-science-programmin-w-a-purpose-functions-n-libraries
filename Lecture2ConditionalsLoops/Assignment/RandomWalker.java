import java.lang.Math;

public class RandomWalker {
    
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        
        int xCoord = 0;
        int yCoord = 0;
        System.out.println("(" + xCoord + ", " + yCoord + ")");

        int steps = 0;


        boolean reachedManhattanDistance = false;

        while (reachedManhattanDistance == false) {
            double probability = Math.random();

                if (probability < 0.25) {
                    xCoord--;
                } 
                else if (probability < 0.5) {
                    xCoord++;
                }
                else if (probability < 0.75) {
                    yCoord--;
                }
                else {
                    yCoord++;
                }
                
                steps ++;
                System.out.println("(" + xCoord + ", " + yCoord + ")");

                int manhattanDistance = Math.abs(xCoord) + Math.abs(yCoord);
                if (manhattanDistance == r) reachedManhattanDistance = true;
        }

        System.out.println("steps = " + steps);

    }

}
