package com.gmail.stehniy;

import java.util.ArrayList;

public class Rectangles {
	private ArrayList<Rectangle> list = new ArrayList<>();

	public ArrayList getList() {
		for (int i = 0; i < 5; i++) {
			list.add(new Rectangle());
		}
		return list;
	}

	public ArrayList<Rectangle> addNewRectangle(Rectangle rectangle) {
		list.add(rectangle);
		return list;
	}

	public double getAreaOfAllRectangles() {
		double sum = 0;
		for (Rectangle rec : list) {
			sum += rec.getArea();
		}
		return sum;
	}

	public double getPerimeteOfAllRectangles() {
		double sum = 0;
		for (Rectangle rec : list) {
			sum += rec.getPerimeter();
		}
		return sum;
	}

	public void printAllRectangles() {
		for (Rectangle rec : list) {
			rec.printRectangle();
		}
	}

	public void areaOfRectangleFromList(int n) {
		list.get(n - 1).printRectangle();
	}

}
