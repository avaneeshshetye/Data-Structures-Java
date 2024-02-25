

public class TwoDArray{

    int twoDarray [] [] = null;

    public TwoDArray(int size1,int size2){
        twoDarray = new int [size1][size2];
        for(int row=0;row<twoDarray.length;row++){
            for(int column=0;column<twoDarray[0].length;column++){
            twoDarray[row][column]=Integer.MIN_VALUE;
        }
    }
    }

      
        public void insert(int row,int column,int value){
            try{
                if(twoDarray[row][column] == Integer.MIN_VALUE){
                    twoDarray[row][column]= value;
                    System.out.println("Value inserted");
                }
            else{
                    System.out.println("Index is already occupied");
                }
            }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array Index is out of bounds");
                }
            
            
            
    
    
    }


 }
    

