package com.demo.GitProject;
interface shape{
    double calculateArea();
}
class circle implements shape{
    double radius;
    circle(double radius){
    this.radius=radius;
    }
public double calculateArea(){
    return 3.14*radius*radius;
    }
}
class Rectangle implements shape{
    double length,breadth;
    Rectangle(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
    }
public double calculateArea(){
    return length*breadth;
    }
}
class Triangle implements shape{
    double base,height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
public double calculateArea(){
    return 0.5*base*height;
    }
}
public class area{
    public static void main(String[] args){
        shape Circle=new circle(5);
        shape rectangle=new Rectangle(10,4);
        shape triangle=new Triangle(6,4);
        System.out.println(Circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
