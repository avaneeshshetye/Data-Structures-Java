class Power{
    public int calculatepower(int base,int exp){

        if(exp==0){
            return 1;
        }
        else{
            return base * calculatepower(base,exp-1);
        }
    }
    public static void main(String[]args){
        Power obj1 = new Power();
        var result = obj1.calculatepower(3,3);
        System.out.println(result);
    }
}