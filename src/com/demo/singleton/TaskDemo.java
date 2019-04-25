package com.demo.singleton;

final class  TaskDemo implements Runnable {
  private int taskId;

  public TaskDemo(int id)
  {
    this.taskId = id;
  }

  @Override
  public void run()
  {
	  
	 if(this.taskId %2 == 0) {
		 SingletonDemo.INSTANCE.setName("3");
		 System.out.println("inside mod operation");
	 }
	 else {
		 SingletonDemo.INSTANCE.setName("5");
		 System.out.println("inside non-mod operation");
	 }
    System.out.println("Task ID : " + this.taskId + " performed by "
        + Thread.currentThread().getName()+ " SingletonDemo Instance hashcode"+ SingletonDemo.INSTANCE.hashCode()+ "  Singleton Object Name value: "+ SingletonDemo.INSTANCE.getName());
  }



}
