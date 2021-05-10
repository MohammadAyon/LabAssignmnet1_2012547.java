package CodingAssignment2;

public class CA2_ElectronicDevice_2012547 extends CA2_Product_2012547 implements Comparable<CA2_ElectronicDevice_2012547> {
  public CA2_Warranty_2012547 warranty;
  public String model;
  
  public CA2_ElectronicDevice_2012547(String name, double price, CA2_Warranty_2012547 warranty, String model) {
    super(name, price);
    this.warranty = warranty;
    this.model = model;
  }
  
  public String getModel() {
    return model;
  }
  
  @Override
  public void changePrice(double percentage) {
    double changePrice = getPrice() - getPrice() * (percentage / 100);
    System.out.println(Math.round(changePrice * 100.0) / 100.0);
    
  }
  
  @Override
  public String toString() {
    return "\nClass Name :ElectronicDevice \nName :"+getName() +
             "\nModel :" + model +
             "\nWarrant :" + warranty + '\'' +
             "\nPrice :"+getPrice();
             
  }
  
  @Override
  public int compareTo(CA2_ElectronicDevice_2012547 ElectricItemToCompare) {
    if(this.getPrice()==ElectricItemToCompare.getPrice()&& this.getName().equals(ElectricItemToCompare.getName())&& this.model.equals(ElectricItemToCompare.getModel()))
      return 0;
    else if(this.getPrice()<(ElectricItemToCompare.getPrice()))
      return 1;
    else
      return -1;
  }
  
}
