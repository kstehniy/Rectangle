package com.gmail.stehniy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle(6.0, 10.0);
		
		Rectangles list = new Rectangles();
		list.getList();
		list.addNewRectangle(rectangle);
		
		list.printAllRectangles();
		System.out.println(" ");
		list.areaOfRectangleFromList(6);
		System.out.println(list.getAreaOfAllRectangles());
		
	//	System.out.println(rectangle.toString());
	//	System.out.println(rectangle.getArea());
	//	System.out.println(rectangle.getPerimeter());
	}

}
