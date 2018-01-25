package com.softwarethatperforms;

public class Main {

    public static void main(String[] args) {
	com.softwarethatperforms.Car porsche = new com.softwarethatperforms.Car();
	com.softwarethatperforms.Car holdern = new com.softwarethatperforms.Car();

	porsche.setModel("Carrera");
	System.out.println("Model is "+ porsche.getModel());

    }
}
