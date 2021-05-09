package CodingAssignment2;

 abstract class Product {
  private String Name;
  private double price;
  
  public Product(String name, double price) {
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
