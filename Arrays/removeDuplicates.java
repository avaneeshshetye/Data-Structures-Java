 public class removeDuplicates {
    public static void main(String[]args){
        int arr[] = {1,2,2,6};
        Exercise obj1 = new Exercise();
        String duplicate = obj1.removeDuplicate(arr);
        System.out.println(duplicate);
    }
    
  public static String removeDuplicate(int[] arr) {

            
            String pairs = "";
            
          
          
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;i<arr.length;i++){
            if(arr[i]==arr[j]){
                pairs += Integer.toString(arr[i])+" ";
               
            }
      }
     
    
  }
  return pairs;

} 
}


    

