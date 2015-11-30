public class MaxSubArray{
    public static void main(String args []){
        System.out.println(MaxSubArray1(new int[]{-2,4,5,-7,-12,11,4},7));       
    }
    private static int MaxSubArray1(int [] a,int n){
        int currSum=0;
        int maxSum=a[0];
        for(int i=0;i<n;i++){
            currSum=(a[i] > currSum+a[i])?a[i]:currSum+a[i];
            maxSum=(maxSum>currSum)? maxSum:currSum;
        }
        return maxSum;
    }
}
