import java.util.*;

public class Main {
    public static void main(String[]args){
       /*  singleDimensionArray obj = new singleDimensionArray(10);

         obj.insert(2,5);
        obj.insert(1,9);
        obj.insert(9,4);
        obj.insert(2,8);

        var firstElement = obj.array[1];
        System.out.println(firstElement);
        obj.traversearray();
        System.out.println();
        obj.search(9);
        */

       TwoDArray obj2 = new TwoDArray(3,3);
       obj2.insert(1,1,5);
       System.out.println(Arrays.deepToString(obj2.twoDarray));



    }

    
}
