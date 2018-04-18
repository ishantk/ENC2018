package com.auribises.view;

// Bean
public class Button {
	
	int width;
	int height;
	String text;
	String color;
	int id;
	
	public Button(){
		System.out.println("==Button Object Constructed==");
	}
	
	public Button(int width, int height, String text, String color, int id) {
		System.out.println("==Button Object Constructed==");
		this.width = width;
		this.height = height;
		this.text = text;
		this.color = color;
		this.id = id;
	}
	
	public void myInit(){
		System.out.println("==MyInit==");
	}
	
	public void myDestroy(){
		System.out.println("==MyDestroy==");
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Button [width=" + width + ", height=" + height + ", text=" + text + ", color=" + color + ", id=" + id
				+ "] Address: "+super.toString();
	}
}
