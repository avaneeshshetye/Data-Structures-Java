package linearProbing;

public class linearProbing {
    String [] hashTable;
    int usedCellNumber;

    linearProbing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    
public int modASCIIHashFunction(String word, int M){
    char ch[];
    ch = word.toCharArray();
    int i, sum;
    for(sum=0, i=0; i<word.length(); i++ ){
        sum = sum + ch[i];
    }
    return sum % M;
}
public double getLoadFactor(){
    double loadFactor = usedCellNumber * 1.0/hashTable.length;
    return loadFactor;
}

public void rehashKeys(String word){
    
}


}
