package com.zhu.study.singletion;
//����ģʽ���ܱ�֤����
public class SingletionLazy {
	private volatile static SingletionLazy instance=null;
	
	static{
		instance = new SingletionLazy();
	}
	
	private  SingletionLazy(){
		
	}

	public static SingletionLazy getInstance(){
		return instance;
	}
}
