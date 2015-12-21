//not complete
public class LongestPalindrome{
    public static void main(String args []){
        int [] str={1,2,2,1,2,3,2,1};
        longest(str,8);
    }
    private static int longest(int [] s,int n){
        if(s==0 || n<1){
            return 0;
        }
        int [] p=new int[1000];
        int mx=0,id=0;
        for(int i=0;!s[i].euqals("$");i++){
            p[i]=mx >i ? min(p[2*id-i],mx-i):1;
            while(s[i+p[i]]==s[i-p[i]]){
                p[i]++;
            }
            if(i+p[i]>mx){
                mx=i+p[i];
                id=i;
            }
        }
        return p[i]-1;
    }
    private static int min(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}

