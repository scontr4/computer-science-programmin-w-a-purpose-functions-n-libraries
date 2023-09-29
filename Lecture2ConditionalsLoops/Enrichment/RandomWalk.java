public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        // I will compute the average of the steps as totaSteps / numberOfTrials
        int steps = 0;
        
        for(int trials=1; trials <= 1000; trials++) {
            boolean inBoundary = false;
            int yCoord = n;
            int xCoord = n;

            while( inBoundary == false){
                double probability = Math.random();

                if (probability < 0.25) {
                    xCoord--;
                } 
                if (0.25 < probability && probability < 0.5) {
                    xCoord++;
                }
                if (0.5 < probability && probability < 0.75) {
                    yCoord--;
                }
                if (0.75 < probability) {
                    yCoord++;
                }

                steps++;

                if (xCoord == 2*n || xCoord == 0 || yCoord == 2*n || yCoord == 0) {
                    inBoundary = true;
                }
            }
        
        }
        int averageSteps = steps/1000;

        System.out.println("Average steps per trial: " + averageSteps);

    }

}