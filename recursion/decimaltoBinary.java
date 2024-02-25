 class decimaltoBinary{
    public int recursion(int n){
        if(n==0){
            return 0;
        }
        else{
        return n%2 + 10*recursion(n/2);
        }
    }
    public static void main(String[]args){
        decimaltoBinary obj1 = new  decimaltoBinary();
        var result = obj1.recursion(4);
        System.out.println(result);
    }
 }