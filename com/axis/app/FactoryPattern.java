package com.axis.app;
import com.axis.factory.ShapeFactory;
import com.axis.models.Circle;
import com.axis.models.Rectangle;
import com.axis.models.Shape;

public class FactoryPattern {
	public static void main(String[] args) {
		System.out.println("===Factory pattern demo===");
		
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape=shapeFactory.getShape("rectangle");
		shape.draw();
		
	}
}
