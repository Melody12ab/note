public class CalcAllPermutation{
    public static void main (String args []){
        CalcAll("abc".toCharArray(),0,2);
    }
    //递归 not complete
    private static void CalcAll(char [] perm,int from,int to){
       if(to<=1){
           return;
       }
       if(from == to){
           for(int i=0;i<=to;i++){
               System.out.print(perm[i]);
           }
           System.out.println();
       }else{
           for(int j=from;j<=to;j++){
               char temp;
               temp=perm[j];
               perm[j]=perm[from];
               perm[from]=temp;

               //swap(perm[j],perm[from]);

               CalcAll(perm,from+1,to);

               temp=perm[j];
               perm[j]=perm[from];
               perm[from]=temp;
               //swap(perm[j],perm[from]);
           }
       }
    }
}
