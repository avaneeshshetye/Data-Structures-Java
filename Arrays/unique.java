public class unique {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7,8};
        unique obj1 = new unique();
        obj1.uniqueOrnot(array);
        


    }
    public void uniqueOrnot(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println("Elements at " + i + "and" + j + "are similar");
                    return;
                }
                
            }   
        }
        System.out.println("Elements in the array are unique");
    }
    
}
