public class Darrays {
    public int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i=0; i<a.length;i++) {
            sum+= a[i][i];
        }
        return sum;
    }
    public static void main(String[]args){
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        Darrays obj1 = new Darrays ();
        int result = obj1.sumDiagonal(a);
        System.out.println(result);
    }
 
}
