/**
 * findmissingnumber
 */
public class findmissingnumber {

    public static void main(String[] args) {
        findmissingnumber fmn = new findmissingnumber();
        int [] array = {1,2,3,4,5,6,8,9,10};
        fmn.missingNumber(array);
        


        
    }
    public void missingNumber(int [] array){
        int sum1=0;
        int sum2=0;

        for(int i: array){
            sum1+=i;
        }

        sum2 = 10*(10+1)/2;

        int difference  = sum2 - sum1;
        System.out.println("The missing number is: " + difference);
    }
}