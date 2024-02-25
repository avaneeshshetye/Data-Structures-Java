import java.util.Arrays;

public class middle {
    public void main(String[]args){
        middle obj1 = new middle();
        int [] arr = {1,2,3,4};
        int result = obj1.middle(arr);
        System.out.println(result);
    }
    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1); 

    }
}