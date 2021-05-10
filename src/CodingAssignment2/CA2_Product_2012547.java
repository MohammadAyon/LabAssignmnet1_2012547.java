package CodingAssignment2;

 abstract class CA2_Product_2012547 {
  private String Name;
  private double price;
  
  public CA2_Product_2012547(String name, double price) {
    Name = name;
    this.price = price;
  }
  
  public String getName() {
    return Name;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  public abstract void  changePrice(double percentage);
  
   @Override
   public String toString() {
     return "Product{" +
              "Name='" + Name + '\'' +
              ", price=" + price +
              '}';
   }
 }
