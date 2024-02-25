public class bestscore {
    public static void main(String[] args) {
        bestscore obj1 = new bestscore();
        int [] array = {1,2,6,9,3,4};
        String result =  obj1.bestscore(array);
        System.out.println(result);

       
    }

    public String bestscore(int [] array){
        int maxproduct = 0;
        String pairs = "";

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] * array[j] > maxproduct){
                    maxproduct = array[i] * array[j];
                    pairs= Integer.toString(array[i])+","+Integer.toString(array[j]);
                }
                
            }
            
        }
        return pairs;

    }
}
