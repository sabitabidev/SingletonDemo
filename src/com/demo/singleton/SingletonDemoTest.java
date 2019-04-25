package com.demo.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;



public class SingletonDemoTest {
	
	  public static void main(String args[])
	  {
	    ExecutorService service = Executors.newFixedThreadPool(10);
	    IntStream.range(0, 100).forEach(i -> service.submit(new TaskDemo(i)));
	  }
}

	
