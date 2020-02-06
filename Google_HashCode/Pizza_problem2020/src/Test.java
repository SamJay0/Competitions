import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Pizza pizza=new Pizza();
        Solution solution=new Solution();
        int [] slices_per_type=pizza.slicesPerTypeFromInput();
        solution.possibilities(slices_per_type,pizza.max_number_of_slices_to_order);
        System.out.println(solution);



    }
}
