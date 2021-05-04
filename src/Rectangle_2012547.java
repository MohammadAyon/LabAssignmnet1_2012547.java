

public class Rectangle_2012547 extends Shape_2012547 {
  protected double length;
  protected double width;
  
  public Rectangle_2012547(boolean filled, String color, double length, double width) {
    super(filled, color);
    this.length = length;
    this.width = width;
  }
  
  @Override
  public String toString() {
    return    " color='" + color +
                " filled=" + filled +
             "length=" + length +
             " width=" + width
      
             ;
  }
  public double getArea() {
    return this.width*this.length;
  }
  public double getPerimeter() {
    
    return 2*(this.width+this.length);
  }
}

