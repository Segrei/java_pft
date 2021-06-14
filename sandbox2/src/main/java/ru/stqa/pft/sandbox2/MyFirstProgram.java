package ru.stqa.pft.sandbox2;

import java.awt.*;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("Сережа!");
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    Point p1 = new Point(2, 2);
    Point p2 = new Point(2, 6);
    distance(p1, p2);

    Point2 p=new Point2(2,2,2,6);
    System.out.println("Расчет расстояния через метод в классе.");
    System.out.println("Расстояние между точками: "+p.distance());
  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody +"!");
  }

  public static void distance(Point p1, Point p2) {
    double a=p1.x-p2.x;
    double b=p1.y-p2.y;
    double len=Math.sqrt(a*a+b*b);
    System.out.println("Расчет расстояния с помощью функции.");
    System.out.println("Координаты первой точки: ("+ p1.x+"; "+p1.y+")");
    System.out.println("Координаты первой точки: ("+ p2.x+"; "+p2.y+")");
    System.out.println("Расстояние между точками: "+len);
  }
}
