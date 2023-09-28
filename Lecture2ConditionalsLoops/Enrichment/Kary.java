public class Kary {

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        char number;

        if (k < 2 || k > 16) {
            System.out.println("Base (second argument) must be between 2 and 16");
            return;
        }

        int num = i;
        int base = k;

        if (num == 0) {
            System.out.println("0");
        }

        String result = "";

        while (num > 0) {
            int digitValue = num % base;
            char digit;

            if (digitValue < 10) {
                digit = (char) ('0' + digitValue);
            } else {
                digit = (char) ('a' + digitValue - 10);
            }

            result = digit + result;
            num = num / base;
        }

        System.out.println(result);
    }

}