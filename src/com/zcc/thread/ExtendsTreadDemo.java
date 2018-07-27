package com.zcc.thread;

/**
 * synchronized
 * @author zhangchangchao
 *
 */
public class ExtendsTreadDemo extends Thread {

	private int count = 5;
	public synchronized void run(){
		count++;
		System.out.println(this.currentThread().getName() +"count="+count);
	}
	
	
	public static void main(String[] args) {
		ExtendsTreadDemo extendsTreaddemo = new ExtendsTreadDemo();
		Thread thread1 = new Thread(extendsTreaddemo,"t1");
		Thread thread2 = new Thread(extendsTreaddemo,"t2");
		Thread thread3 = new Thread(extendsTreaddemo,"t3");
		Thread thread4 = new Thread(extendsTreaddemo,"t4");
		Thread thread5 = new Thread(extendsTreaddemo,"t5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
