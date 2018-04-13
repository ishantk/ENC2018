package com.auribises.model;

public class CB extends CA{

	int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "CB [id=" + id +",a= " + a + ",b=" + b+"]";
	}
	
}
