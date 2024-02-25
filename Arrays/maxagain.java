import java.util.Arrays;
import java.util.Collections;
public class maxagain {
    public static void main(String[]args){
        Exercise obj1 = new Exercise();
        int [] myArray = {84,85,86,87,85,90,83,23,45,84,1,2,0};
        String result = obj1.firstSecond(myArray);
        System.out.println(result);
    }
  static String firstSecond(Integer[] myArray) {
      int maxproduct = 0;
      String pair = "";
      
      for(int i=0;i<myArray.length;i++){
          for(int j=i+1;j<myArray.length;j++){
              if(myArray[i] * myArray[j] > maxproduct){
                  maxproduct=myArray[i]*myArray[j];
                  pair = Integer.toString(myArray[i])+","+Integer.toString(myArray[j]);
              }
          }
          
      }
      return pair;
    
  }
  

}
