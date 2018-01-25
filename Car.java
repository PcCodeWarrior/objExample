package com.softwarethatperforms;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        if(model.toLowerCase().equals("carrera")||model.toLowerCase().equals("holden"))
            this.model = model;
        else
            this.model = "Unknown";
    }

    public String getModel(){
        return this.model;
    }
}
