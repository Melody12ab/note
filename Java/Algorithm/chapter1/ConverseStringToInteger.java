public class ConverseStringToInteger{

	static final int MAX_INT=(int)(~0 >>> 1);
	static final int MIN_INT=-(int)(~0 >>> 1)-1;

	public static void main(String[] args) {
		System.out.println(StrToInt("123"));
	}
	private static int StrToInt(final String str){
		
		int n=0;
		//判断非空
		
		//处理空格
		
		//处理正负

		//确认是否为数字

		//处理溢出
		
		for(int i=0;i<str.length();i++){		
			int c=str.toCharArray()[i]-'0';

			//==预防越界==
			if(n>MAX_INT/10 || (n==MAX_INT/10 && c>MAX_INT%10)){
				n=MAX_INT;
				break;
			}else if(n<MIN_INT || (n==MIN_INT/10 && c>MIN_INT%10)){
				n=MIN_INT;
				break;
			}
			//==预防结束==

			n=n*10+c;
		}
		return n;

	}
}