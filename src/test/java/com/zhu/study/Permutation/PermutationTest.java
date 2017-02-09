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
	
	public void swap(char[] src,int poss,int post){
		char tmp=src[post];
		src[post]=src[poss];
		src[poss]=tmp;
	}
	
	public void permutation(List<String> lists,String s,int index){
		char[] cs=s.toCharArray();
		
		if(index>=s.length()){
			lists.add(new String(cs));
		}
		for(int i=index;i<cs.length;i++){
			swap(cs,index,i);
			permutation(lists,new String(cs),index+1);
		}
	}
	@Test
	public void testPermutation(){
		StringBuilder sb =new StringBuilder();
		List<String> lists=new ArrayList<String>();
        String src ="zhu";
        permutation(lists,src, 0);
        for(String s : lists){
        	System.out.println(s);
        }
	}

}
