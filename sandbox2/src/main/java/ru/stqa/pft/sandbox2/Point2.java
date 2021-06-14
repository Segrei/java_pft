package ru.stqa.pft.sandbox2;

public class Point2 {
  double x1,x2,y1,y2,a,b,len;
public Point2(double x1, double y1, double x2, double y2){
 this.x1=x1;
 this.y1=y1;
 this.x2=x2;
 this.y2=y2;
}
public double distance(){
  a=this.x1-this.x2;
  b=this.y1-this.y2;
  len=Math.sqrt(a*a+b*b);
  return len;
}
}
