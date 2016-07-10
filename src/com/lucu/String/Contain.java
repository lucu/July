package com.lucu.String;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author :lucu
 * @date :2016年7月10日 下午5:05:18
 * @version :1.0
 */

public class Contain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contain contain=new Contain();
		String a="把本地库的内容推送到远程，用git push命令，实际上是把当前分支master推送到远程。";
		String b="本内容";
		System.out.println(contain.StringContain(a,b));
		
	}

	/**
	 * 用散列表判断
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean StringContain(String a,String b){
		char[] as=a.toCharArray();
		char[] bs=b.toCharArray();
		Map<Character, Character> map=new HashMap<Character, Character>(a.length(),0.75f);
		//把a的字符放入散列表里面
		for(int i=0,j=as.length;i<j;i++){
			map.put(as[i], null);
		}
		//遍历b字符，判断是否在散列表里面
		for(int i=0,j=bs.length;i<j;i++){
			if(map.containsKey(bs[i])==false){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 利用位运算得到word的编码，字母26个，不会超出int范围。
	 * @param word
	 * @return
	 */
	public int word_int_hash(String word){
		int hash=0;
		char[] words=word.toCharArray();
		for(int i=0,j=words.length;i<j;i++){
			hash|=1<<(words[i]-'A');
		}
		return hash;
	}
}
