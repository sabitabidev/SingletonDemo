package com.demo.singleton;

public enum SingletonDemo {
	
	INSTANCE;	
	
    private String  name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

}
