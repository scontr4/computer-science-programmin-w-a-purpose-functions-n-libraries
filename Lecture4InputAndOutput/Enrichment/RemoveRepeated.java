public class RemoveRepeated {

    public static void main(String[] args) {    

        StringBuilder stringToPrint = new StringBuilder();        
        int currentNumber = Integer.MIN_VALUE;;

        while (!StdIn.isEmpty()){

            int x = StdIn.readInt();

            if (x != currentNumber) {
                currentNumber = x;
                stringToPrint.append(currentNumber + " ");
            }
        }

        StdOut.println(stringToPrint);

    }

}