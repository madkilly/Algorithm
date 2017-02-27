package com.zhu.study.singletion;
//懒汉模式不能保证单例
public class SingletionLazy {
	private volatile static SingletionLazy instance=null;
	
	private  SingletionLazy(){
		
	}

	public static SingletionLazy getInstance(){
		if(instance==null){
			instance=new SingletionLazy();
		}
		return instance;
	}
}
