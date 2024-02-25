class GCD{
    public int Calculate(int a, int b){
        if(b==0){
            return a;
        }
        else{
        return Calculate(b,a%b);
        }
    }
    public static void main(String[]args){
        GCD obj1 = new GCD();
        var result = obj1.Calculate(20,16);
        System.out.println(result);
    }
}