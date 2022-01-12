package com.practice.mulithreading.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool_Callable implements Callable {
	/*Callable and Future
	 * 
	 * in-case of Callable Job, thread wont return anything after completing the job
	 * if a thread is required to return anything after execution, then we should go for Future.
	 * 
	 * Callable interface contains only one method
	 * public Object call() throws Exception.
	 * 
	 * if we submit Callable object to Executor, then after completing the job thread return an object of type Future.
	 * That is Future object can be used to retrieve the result from callable Job  
	 */	
	int num;
	ThreadPool_Callable(int num){
		this.num=num;
	}

	@Override
	public Object call() {
		int sum=0;
		System.out.print(Thread.currentThread().getName()+" Sum of first "+num+ " is ");
		for (int i = 1; i <=num; i++) {
			sum=sum+i;
		}
		return sum;
	}
}

class ThreadPool_Callable_Main{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPool_Callable[] names = {
				new ThreadPool_Callable(5),
				new ThreadPool_Callable(10),
				new ThreadPool_Callable(15),
				new ThreadPool_Callable(20),
				new ThreadPool_Callable(25),
				new ThreadPool_Callable(30),
		};
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (ThreadPool_Callable name:names) {
			//System.out.println(name);
			Future f =service.submit(name);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}