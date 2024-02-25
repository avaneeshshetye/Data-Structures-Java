class Factorial{

    public int recursion(int n){
        if(n<1){
            return 1;
        }
        else{
            return n * recursion(n-1);
        }
    }

    
    public static void main(String[]args){
        Factorial obj1 = new Factorial();
        var result = obj1.recursion(4);
        System.out.println(result);
    }
}
