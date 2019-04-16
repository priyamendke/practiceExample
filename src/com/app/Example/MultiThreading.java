package com.app.Example;


	class MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("from My Runnable.run() Method");
		}

	}

	class MyThread extends Thread {
		MyThread() {
			super();
		}

		MyThread(Runnable target) {
			super(target);

		}

		public void run() {

			System.out.println("from My Thread.run() Method");
		}

	}
	public class MultiThreading {

	public static void main(String[] args) {

		Thread th1 = new Thread();
		th1.start();
		
		
		  /*MyThread mt=new MyThread(); 
		  mt.start();
		  
		  MyRunnable mr=new MyRunnable();
		  mr.start();
		 */
	}

}
