public class reversStr{
    public static void main(String args [])
    {
        String a="givemefive";
        System.out.println(LeftRotateString(a.toCharArray(),10,4));
    }

    private static void ReverseString(char [] s,int from,int to)
    {
        while(from<to)
        {
            char t=s[from];
            s[from++]=s[to];
            s[to--]=t;
        }
    }
    private static String LeftRotateString(char [] s,int n,int m)
    {
        m%=n;
        ReverseString(s,0,m-1);
        ReverseString(s,m,n-1);
        ReverseString(s,0,n-1);
        return new String(s);
    }
}
