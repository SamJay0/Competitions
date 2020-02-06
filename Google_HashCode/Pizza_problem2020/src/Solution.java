import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    int max_possible_slices_less_or_equal_to_max_order;
    ArrayList<Integer> slice_type_ordered= new ArrayList<>();

    void possibilities(int[] arr,int maxOrder){
        for(int i=0;i<arr.length;i++){
            /*
            *incase a pizza has a number of slices required
             */
            if(arr[i]==maxOrder){
                max_possible_slices_less_or_equal_to_max_order=maxOrder;
                slice_type_ordered.add(i);
                break;
            }
            if(arr[i]==maxOrder-1){
                max_possible_slices_less_or_equal_to_max_order=maxOrder-1;
                slice_type_ordered.add(i);
                break;
            }
            else {
                max_possible_slices_less_or_equal_to_max_order=20;
                for(int j=0;j<4;j++){
                    slice_type_ordered.add(i);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Solution{" +
                "max_possible_slices_less_or_equal_to_max_order=" + max_possible_slices_less_or_equal_to_max_order +
                ", slice_type_ordered=" + slice_type_ordered +
                '}';
    }
}
