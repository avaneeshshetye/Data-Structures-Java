public class Exercise {
    public static void reverse(String str,int i)
    {
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
       
        System.out.println(str.charAt(i));
        reverse(str,i-1);
        
    }
}

