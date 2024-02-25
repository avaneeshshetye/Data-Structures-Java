class Main{
  
    public int sumoftwodigits(int n){
      if(n==0|n<0){
        return 0;
      }
      else{
       
      return n%10 + sumoftwodigits(n/10);
    }
    }
  
    public static void main(String[]args)
    {
      Main obj1 =new Main();
      var ans = obj1.sumoftwodigits(45);
      System.out.println(ans);
    }
  }