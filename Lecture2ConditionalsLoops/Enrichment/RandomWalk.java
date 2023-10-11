public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        // I will compute the average of the steps as totaSteps / numberOfTrials
        int steps = 0;
        int numberOfTrials = 1000;
        
        for(int trials=1; trials <= numberOfTrials; trials++) {
            boolean inBoundary = false;
            int yCoord = n;
            int xCoord = n;

            while( inBoundary == false){
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

                steps++;

                if (xCoord == 2*n || xCoord == 0 || yCoord == 2*n || yCoord == 0) {
                    inBoundary = true;
                }
            }
        
        }
        int averageSteps = steps/numberOfTrials;

        System.out.println("Average steps per trial: " + averageSteps);

    }

}