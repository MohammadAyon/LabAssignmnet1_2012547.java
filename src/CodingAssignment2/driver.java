package CodingAssignment2;

public class driver {
  public static void main(String[] args) {
    ClothingItem cloth = new ClothingItem("Adidas",100.00,Fabric.LINEN);
    System.out.println(cloth.toString());
    cloth.changePrice(10);
  }
}
