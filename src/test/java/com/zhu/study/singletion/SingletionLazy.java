package com.zhu.study.singletion;
//����ģʽ���ܱ�֤����
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
