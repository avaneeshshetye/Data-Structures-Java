public class printNumbers {
    public int print(int n){
       if(n==0){
        return 0;
       }
       System.out.println(n);
        return print(n-1);

    }
    public static void main(String[]args) {
        printNumbers obj1 =  new printNumbers();
        System.out.println(obj1.print(5));
    }
    
}
