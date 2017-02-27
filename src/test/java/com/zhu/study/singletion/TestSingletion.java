package com.zhu.study.singletion;

import org.junit.Test;

public class TestSingletion {

	public class PostiveThread implements Runnable{

		public void run() {
			System.out.println(SingletionPostive.getInstance().hashCode());  
		}
		
	} 
	
	public class LazyThread implements Runnable{

		public void run() {
			System.out.println(SingletionLazy.getInstance().hashCode());  
		}
		
	}
	
	
	@Test
	public void runPostive(){
		for(int i=0;i<10;i++){
			PostiveThread mythread = new PostiveThread();
			new Thread(mythread).start();
		}
	}
	
	@Test
	public void runLazy(){
		for(int i=0;i<10;i++){
			LazyThread mythread = new LazyThread();
			new Thread(mythread).start();
		}
	}
}
