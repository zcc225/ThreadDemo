package com.zcc.thread;

/**
 * 
 * @author zhangchangchao
 *
 */
public class MyObject {

	public synchronized void method1(){
		try {
		System.err.println(Thread.currentThread().getName()+"同步");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method2(){
		System.out.println(Thread.currentThread().getName()+"不同步");
	}
	
	public static void main(String[] args) {
		final MyObject m1 = new MyObject();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				m1.method1();
			}
		},"t1");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				m1.method2();
			}
		},"t2");
		
		t1.start();
		t2.start();
	}
}
