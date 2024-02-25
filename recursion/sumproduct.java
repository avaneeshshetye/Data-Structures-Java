public class sumproduct {
    public static void recursion(int array[]){
        int sum=0;
        int product = 1;

        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        for(int i=0;i<array.length;i++){
            product*=array[i];
        }
        System.out.println(sum+" "+product);
    }
    public static void main(String[]args){
        
        int[] array = {2,7,9};

        recursion(array);

    }
    
}
