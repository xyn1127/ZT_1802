package com.thread;

class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object KnivesAndFork=new Object();
	private boolean flag;
	
	public DeadLockThread(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			while (true) {
			 synchronized(chopsticks) {
				 System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
				 synchronized(KnivesAndFork) {
					 System.out.println(Thread.currentThread().getName()+"---if---KnivesAndFork");
					 
				 } 
			 }
				
			}
		}else {
			 synchronized(KnivesAndFork) {
				 System.out.println(Thread.currentThread().getName()+"---if---KnivesAndFork");
				 synchronized( chopsticks) {
					 System.out.println(Thread.currentThread().getName()+"---if--- chopsticks");
					 
				 } 
			 }
		}
		
		
	}
	
}
public class Thread_test14 {

	public static void main(String[] args) {
	        new Thread(new DeadLockThread(true),"Chinese").start(); 
	        new Thread(new DeadLockThread(true),"American").start();
	}

}
