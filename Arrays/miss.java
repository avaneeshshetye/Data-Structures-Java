public class miss {
    public static void main(String[]args){
        Exercise obj1 = new Exercise();
        int [] arr = {1,2,3,4,6};
        int result = obj1.missingNumber(arr,6);
        System.out.println(result);
    }
   static int missingNumber(int[] arr, int totalCount) {
    int sum = 0;
    for(int i:arr){
        sum+=i;
    }

   int sum2 = totalCount * (totalCount+1)/2;
    
    int difference = sum2 - sum;
    return difference;
  }

}
