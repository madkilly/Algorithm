package com.zhu.study.singletion;

public class SingletionPostive{
	private static SingletionPostive instance=new SingletionPostive();

	private SingletionPostive(){
		
	}
	
	public static SingletionPostive getInstance(){
		return instance;
	}
	
	
}
