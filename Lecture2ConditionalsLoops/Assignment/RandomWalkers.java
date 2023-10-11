public class RandomWalkers {
    
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        long trials = Long.parseLong(args[1]);
        
        // I will compute the averageSteps as steps / trials;
        long steps = 0; 
        
        for (int i=0; i<=trials; i++) {

            int xCoord = 0;
            int yCoord = 0;

            boolean reachedManhattanDistance = false;
            if (r==0) break;

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

                    int manhattanDistance = Math.abs(xCoord) + Math.abs(yCoord);
                    if (manhattanDistance == r) reachedManhattanDistance = true;
            }
        }

        double averageSteps = (double) steps/trials;
        System.out.println("average number of steps = " + averageSteps);

    }
}
