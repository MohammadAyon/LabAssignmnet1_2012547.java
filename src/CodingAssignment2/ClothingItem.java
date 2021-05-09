package CodingAssignment2;
public class ClothingItem extends Product{
  private Fabric fabricType;
  
  public ClothingItem(String name, double price, Fabric fabricType) {
    super(name, price);
    this.fabricType = fabricType;
  }
  
  public Fabric getFabricType() {
    return fabricType;
  }
  
  @Override
  public void changePrice(double percentage) {
    double percent= getPrice()+getPrice()*percentage/100;
    System.out.println(percent);
    
  }
  
  @Override
  public String toString() {
    return "Class Name:ClothingItem\n" +
             "fabricType: " + fabricType +"\nName"+getName()+"\nprice"+getPrice();
             
  }
}
