public class StringContain{
	public static void main(String[] args) {
		System.out.println(isContain("ABCDEF","BGE"));
	}
	//字符串包含 t:O(m+n)  s:O(1)
	private static boolean isContain(String a,String b){
		char [] achar=a.toCharArray();
		char [] bchar=b.toCharArray();
		int hash=0;
		for (int i=0; i<achar.length; ++i) {
			//生成数字“签名”
			hash |=(1<<(achar[i]-'A'));
		}
		for (int i=0; i<bchar.length; ++i) {
			//验证
			if((hash & (1<<(bchar[i]-'A')))==0){
				return false;
			}
		}
		return true;
	}
}