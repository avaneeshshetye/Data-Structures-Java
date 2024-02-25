class NQueens{
    public void printpermutation(String str, int idx, String perm){
            if(str.length()==0){
                System.out.println(perm);
                return;
                
            }

        for(int i=0;i<str.length();i++){
            char Current=str.charAt(i);
            String newStr = str.substring(0,1)+str.substring(i+1);
            printpermutation(newStr, idx+1, perm+Current);

        }
    }

}