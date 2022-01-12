package com.practice.mulithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_Runnable implements Runnable {
	/*Creating thread for every job creates memory problem, to overcome this problem we should go for thread pool.
	 * Thread pool is a pool of already created thread which are ready to do our job.
	 * 
	 * Java 1.5v introduces thread pool framework to implement thread pool.
	 * thread pool framework is also know as executor framework 
	 * 
	 * ExecutorService service= Executor.newFixedThreadPool(int);
	 * 
	 * we can submit a runnable job using submit()
	 * service.submit(job);
	 * 
	 * we can shutdown executor service using shutDown()
	 * service.shutDown(job);
	 */	

	String name;
	ThreadPool_Runnable(String name){
		this.name=name;
	}

	@Override
	public void run() {
		System.out.println("Good Morning:: "+Thread.currentThread().getName()+" "+name);
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thanks !!!! Bye Bye:: "+Thread.currentThread().getName()+" "+name);
		System.out.println();
	}
}

class ThreadPool2_Main{
	public static void main(String[] args) {
		ThreadPool_Runnable[] names = {
				new ThreadPool_Runnable("shivendra"),
				new ThreadPool_Runnable("Sudha"),
				new ThreadPool_Runnable("Vedansh"),
				new ThreadPool_Runnable("Poorvi"),
				new ThreadPool_Runnable("Ansh"),
				new ThreadPool_Runnable("Anshi"),
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (ThreadPool_Runnable name:names) { 
			//System.out.println(name);
			service.submit(name);
		}
		service.shutdown();
	}
}