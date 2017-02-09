package com.zhu.study.Permutation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * <p>Title: PermutationTest</p>
 * <p>Description: </p>
 * @author zhukai
 */
public class PermutationTest {
	
	public void swap(Character a,Character b){
		Character tmp = b;
		b=a;
		a=tmp;
	}
	
	public List<String> permutation(String s){
		List<String> lists=new ArrayList<String>();
		if(s.length()==1){
			lists.add(s);
			return lists;
		}
		char[] cs=s.toCharArray();
		StringBuilder sb =new StringBuilder();
		for(int i=1;i<cs.length;i++){
			
		}
			
		return null;
	}
	@Test
	public void testPermutation(){
		StringBuilder sb =new StringBuilder();
		char[] a =new char[] {'z','h','u'};
		swap(a[0],a[2]);
		System.out.println(sb.append(a).toString());
	}

}
