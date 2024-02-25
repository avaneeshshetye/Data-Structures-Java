import java.util.Scanner;

public class findThenumber {
    public static void main(String[] args) {
        findThenumber obj1 = new findThenumber();
        int array [] = {2,4,8,9};
        System.out.println("Enter the number");
        obj1.findThenumber(array,4);
        

    }

    /**
     * @param array
     * @param x
     */
    public void findThenumber(int[] array, int x){
        for(int i=0;i<array.length;i++){
                if(array[i]==x){
                System.out.println(x + " is present at " + i);
                return;
            }
           
        }
        System.out.println(x + " not found");
          
    }
}
