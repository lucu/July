package com.lucu.String;
/** 
 * 给定一个字符串，要求将字符串前面的若干个字符移动到字符串尾部。
 * 例如：将“abcdef”的'a','b','c'移动到尾部，即字符串变成"defabc"
 * @author :lucu
 * @date :2016年7月10日 下午3:42:09
 * @version :1.0
 */

public class Reverse {
	public String LeftShift(String s,int n){
			String old_right=s.substring(0, n);
			String old_left=s.substring(n);
			return old_left.concat(old_right);
	}
	/**
	 * 旋转字符
	 * @param s 需要反转的字符串
	 * @param n
	 * @return 
	 */
	public String ReverseString(String s){
		if(s!=null&&!s.trim().equals("")){//非空
			char[] cs=s.toCharArray();
			for(int i=0,j=cs.length-1;i<j;i++,j--){//反转字符串
				char t=cs[i];
				cs[i]=cs[j];
				cs[j]=t;
			}
			return new String(cs);
		}
		return s;	
	}
	
	
	public static void main(String[] args){
		Reverse reverse=new Reverse();
		System.out.println(reverse.LeftShift("abcdef", 3));
		String s="abcdef";
		int n=3;
		//1,分成两个子字符串，得到“abc”和“def”
		//2，对两个子字符串反转，得到“cba”和“fed"
		String old_right=reverse.ReverseString(s.substring(0, n));
		String old_left=reverse.ReverseString(s.substring(n));
		//3，对上诉两个子字符串整体反转,把“cbafed”旋转成为defabc；
		System.out.println(reverse.ReverseString(old_right+old_left));
	}
}
