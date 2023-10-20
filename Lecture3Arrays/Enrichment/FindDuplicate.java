import java.lang.Math;

public class FindDuplicate {

    public static void main(String[] args) {
        
        int len_array = (int) (Math.random() * 10 + 1);
        int[] array = new int[len_array];
        for (int i=0; i < len_array; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int current_index = 0; current_index < len_array; current_index++) {
            for (int compare_index = current_index + 1; compare_index < len_array; compare_index++) {
                if (array[current_index] == array[compare_index]) {
                    System.out.println("Duplicate finded: " + array[current_index]);
                    System.exit(0);
                }                
            }
        }

    }

}

