package com.nguyenthao.DI;

public class ShapeManager {
	 private Shape shape;

     public void setShape(Shape shape) {
         this.shape = shape;
     }

     public float calculatePerimeter() {
         return this.shape.getPerimeter();
     }

     public float calculateArea() {
         return this.shape.getArea();
     }
}
