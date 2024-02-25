import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
     
    public static void main(String[]args){
        Exercise obj1 = new Exercise();
        int [] nums = {2,7,11,15};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("What's your target number: ");
            int target = sc.nextInt();
      int result [] = obj1.twoSum(nums,target);
      System.out.println(Arrays.toString(result));
        }
        
     
       
    }
       public int[] twoSum(int[] nums, int target) {
   
         for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                   return new int[]{i,j};
                     }
                
                }
            }
            throw new IllegalArgumentException("No solution found");
                
            
        }
    public String firstSecond(int[] myArray) {
        return null;
    }
    public int missingNumber(int[] arr, int i) {
        return 0;
    }
    public String removeDuplicate(int[] arr) {
        return 0;
    }
    public String pairSum(int[] myArray, int i) {
        return null;
    }

}