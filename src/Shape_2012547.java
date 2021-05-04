public class Shape_2012547 {
  
  protected boolean filled;
  protected String color;
  
  public Shape_2012547(boolean filled, String color) {
    this.filled = filled;
    this.color = color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  @Override
  public String toString() {
    return
      " color='" + color +
        "\nfilled=" + filled
      ;
  }
  
}
