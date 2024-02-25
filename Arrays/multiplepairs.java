public class multiplepairs {
    //null
    public static void main(String[]args){
        int [] myArray = {2,4,3,5,6,-2,4,7,8,9};
        Exercise obj1 = new Exercise();
        String result = obj1.pairSum(myArray,7);
        System.out.println(result);
    }
  public static String pairSum(int[] myArray, int sum) {
        String pairs = "";
        
        for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
                if(myArray[i]+myArray[j]==sum){
                    pairs += Integer.toString(myArray[i])+":"+Integer.toString(myArray[j])+" ";
                }
            }
        }
        return pairs;
  }

}