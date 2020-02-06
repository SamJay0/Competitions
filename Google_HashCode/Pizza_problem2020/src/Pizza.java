import java.util.Arrays;
import java.util.Scanner;

public class Pizza {
    //
    int max_number_of_slices_to_order;
    int different_pizza_types;
    Scanner in = new Scanner(System.in);

    int [] slicesPerTypeFromInput() {
        String s1 = in.nextLine();
        String[] numbers = s1.trim().split(" ");
        max_number_of_slices_to_order = Integer.parseInt(numbers[0]);
        different_pizza_types = Integer.parseInt(numbers[1]);
        String s2 = in.nextLine();
        String[] slices = s2.trim().split(" ");
        int[] slicesPerType = new int[different_pizza_types];
        for (int i = 0; i < different_pizza_types; i++) {
            slicesPerType[i] = Integer.parseInt(slices[i]);
        }
        return slicesPerType;
    }



}

