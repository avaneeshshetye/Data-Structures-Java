package directChaining;
public class Main {
    public static void main(String[]args){
    DirectChaining directChaining = new DirectChaining(13);
    directChaining.insertHashTable("The");
    directChaining.insertHashTable("END");
    directChaining.insertHashTable("The");
    directChaining.insertHashTable("END");
    directChaining.insertHashTable("The");
    directChaining.insertHashTable("END");
    directChaining.displayHashTable();
    directChaining.searchHashTable("en");
    directChaining.deleteKeyHashTable("The");
    directChaining.displayHashTable();
    }

}

