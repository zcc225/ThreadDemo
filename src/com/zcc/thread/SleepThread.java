package com.zcc.thread;

/**
 * 
 * @author zhangchangchao
 *
 */
public class SleepThread {

	private static int num = 0 ;
	
	public static  synchronized void printnum(String tag){
		try{
			if(tag.equals("a")){
				num = 100;
				System.out.println("tag a ,set over");
				Thread.sleep(1000);
			
			}else{
				num = 200;
				System.out.println("tag b ,set over");
				Thread.sleep(1000);
			}
			System.out.println(num);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SleepThread sleepThread = new SleepThread();
		SleepThread sleepThread2 = new SleepThread();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sleepThread.printnum("a");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sleepThread2.printnum("b");
			}
		});
		t1.start();
		t2.start();
	}
}
