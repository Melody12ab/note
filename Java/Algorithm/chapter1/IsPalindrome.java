public class IsPalindrome{
	public static void main(String[] args) {
		System.out.println(IsPalindrome1("abcba",5));//true
		System.out.println(IsPalindrome1("好不好",3));//true
		System.out.println(IsPalindrome1("好不好呀",4));//false
	}
	//判断回文字符串
	private static boolean IsPalindrome1(String str,int n){
		if(str==null || n<1){
			return false;
		}
		char [] chararr=str.toCharArray();
		int first=0;
		int end=n-1;
		while(first<end){
			if(chararr[first]!=chararr[end]){
				return false;
			}
			++first;
			--end;
		}
		return true;
	}
}