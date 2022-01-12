package com.practice.mulithreading.threadpool;

import java.util.concurrent.Callable;

public class ThreadPool implements Runnable,Callable {
	/*Creating thread for every job creates memory problem, to overcome this problem we should go for ThreadPool.
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	/*Callable and Future
	 * 
	 * in-case of Callable Job, thread wont return anything after completing the job
	 * if a thread is required to return anything after execution, then we should go for Future.
	 * 
	 * Callable interface contains only one method
	 * public Object call() throws Exception.
	 * 
	 * if we submit Callable object to Executor, then after completing the job thread return an object of time Future.
	 * That is Future object can be used to retrieve the result from callable Job  
	 */
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	
}
