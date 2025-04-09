package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 */
public class Exercise_06 {

    public static void main(String[] args){
        int[] nums = {45, 87, 62, 99, 1, 42, 12};

        int temp;

        // Loop only until the middle of the array
        for(int i = 0; i < nums.length / 2; i++){
            // Store the current element in temp
            temp = nums[i];

            // Swap with the corresponding element from the end
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.print("Contents of array after for loop - ");
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
