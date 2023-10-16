package com.threadpractise;

class MyThread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child : "+i);
		}
	}
}

public class ThreadByRunnableI {
	public static void main(String[] args) {
		Runnable thread=new MyThread1();
//		thread.start(); // this will not runs
		new Thread(thread).start();;
		for (int i = 0; i < 5; i++) {
			System.out.println("Main : "+i);
		}
//		thread2.start();
		
		System.out.println("********************************");
		
		
	}
}
