package CodingAssignment2;
public class CA2_ClothingItem_2012547 extends CA2_Product_2012547 implements Comparable<CA2_ClothingItem_2012547>{
  private CA2_Fabric_2012547 fabricType;
  
  public CA2_ClothingItem_2012547(String name, double price, CA2_Fabric_2012547 fabricType) {
    super(name, price);
    this.fabricType = fabricType;
  }
  
  public CA2_Fabric_2012547 getFabricType() {
    return fabricType;
  }
  
  @Override
  public void changePrice(double percentage) {
    double ChangedPrice= getPrice()+getPrice()*percentage/100;
    System.out.println(Math.round(ChangedPrice*100)/100);
    
  }
  
  @Override
  public double getPrice() {
    return super.getPrice();
  }
  
  @Override
  public String toString() {
    return "\nClass Name:ClothingItem\n" +
             "fabricType: " + fabricType +"\nName :"+getName()+"\nprice :"+getPrice();
             
  }
  
  
  @Override
  public int compareTo(CA2_ClothingItem_2012547 ClothingItemToCompare) {
    if(this.getPrice()==ClothingItemToCompare.getPrice()&&this.fabricType==ClothingItemToCompare.getFabricType())
      return 0;
    else if(this.getPrice()<ClothingItemToCompare.getPrice())
      return 1;
    else
      return -1;
  }
}
