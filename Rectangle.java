package com.gmail.stehniy;

import java.util.Random;

public class Rectangle {

	private double width;
	private double height;

	public Rectangle(double height, double width) {
		checkHeight(height);
		checkWidth(width);

		this.height = height;
		this.width = width;
	}

	public Rectangle() {
		Random random = new Random();
		height = random.nextInt(20) + 1;
		width = random.nextInt(20) + 1;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return "Rectangle { " + width + "," + height + " }";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	private void checkWidth(double width) {
		if (width <= 0) {
			throw new IllegalArgumentException("not positiv width " + width);
		}
	}

	private void checkHeight(double height) {
		if (height <= 0) {
			throw new IllegalArgumentException("not positiv height " + height);
		}
	}

	public void printRectangle() {
		System.out.println("Rectangle: " + height + "*" + width);
	}

}
