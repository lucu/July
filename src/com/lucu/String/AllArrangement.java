package com.lucu.String;
/** 
 * @author :lucu
 * @date :2016年7月10日 下午6:12:34
 * @version :1.0
 */

public class AllArrangement {

	public static void main(String[] args) {
		char[] cs={'a','b','c'};
		try {
		//	CalcAllPermutation(cs,0,2);
			calcAllSequence("",cs,0,2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 所有排列
	 * @param cs
	 * @param form
	 * @param to
	 * @throws Exception
	 */
	public static void CalcAllPermutation(char[] cs,int form,int to) throws Exception{
		if(to<1||form>to||form<0){
			throw new Exception("起止字符位置错误");
		}
		if(form==to){
			System.out.println( cs);
		}else{
			for(int i=form;i<=to;i++){
				char t=cs[i];
				cs[i]=cs[to];
				cs[to]=t;
				CalcAllPermutation(cs, form+1, to);
				cs[to]=cs[i];
				cs[i]=t;
			}
		}
	}
	
	/**
	 * 输出所有的排列组合
	 * @param s				目标字符串
	 * @param cs 			字符集
	 * @param form			开始节点
	 * @param to			结束节点
	 * @throws Exception
	 */
	public static void calcAllSequence(String s,char[] cs,int form,int to) throws Exception{
		if(to<1||form>to||form<0){
			throw new Exception("起止字符位置错误");
		}
		for(int i=form;i<=to;i++){
			if(s.length()>=to+1){//停止递归
				System.out.println(s);
				break;
			}else{
				calcAllSequence(s+cs[i],cs,form,to);
			}
		}
		
	}
}