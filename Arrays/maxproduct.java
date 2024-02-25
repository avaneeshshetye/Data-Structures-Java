public class maxproduct {

    public static void main(String[] args) {
        maxproduct obj1 = new maxproduct();

        int array[]={4,7,80,3,7,90};
        String result = obj1.method1(array);
        System.out.println(result);

    }

    public String method1(int[]array){
        int maxproduct=0;
        String pairs = "";
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]*array[j] > maxproduct){
                    maxproduct = array[i] * array[j];
                    pairs = Integer.toString(array[i])+","+Integer.toString(array[j]);
                  
                    }
                }

            }
            return pairs;
    }
}
