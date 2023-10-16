package com.threadpractise;
class DemoThread extends Thread{
	public DemoThread() {
	}
	public DemoThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		System.out.println("Child default name: "+Thread.currentThread().getName());
		System.out.println("Child default priority: "+Thread.currentThread().getPriority());
	}
}


public class ThreadStuff {
	public static void main(String[] args) {
		
		DemoThread demoThread=new DemoThread();
		demoThread.start();
		System.out.println("Main Thread defult name : "+Thread.currentThread().getName());
		System.out.println("Main Thread default priority: "+Thread.currentThread().getPriority());
		System.out.println("***************************************************");
		
		DemoThread demoThread1=new DemoThread("Child1");
		demoThread1.start();
		demoThread1.setPriority(11);
	}
}
