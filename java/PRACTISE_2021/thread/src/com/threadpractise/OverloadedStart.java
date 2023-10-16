package com.threadpractise;

class MyThread extends Thread{
	@Override
	public synchronized void start() {
		System.out.println("Start");
	}
	
	@Override
	public void run() {
		System.out.println("Run ");
	}
}

public class OverloadedStart {
	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
		System.out.println("Main");
	}
}
