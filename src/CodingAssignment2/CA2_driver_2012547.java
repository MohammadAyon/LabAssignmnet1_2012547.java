package CodingAssignment2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Random;

public class CA2_driver_2012547 {
  private final static double  MINIMUM_PRODUCT_PRICE = 50.00;
  private final static double  MAXIMUM_PRODUCT_PRICE = 1000.00;
  
  enum ElectronicProductList{
    Phone,
    Tablet,
    Computer,
    Oven,
    Fridge,
    Washing_Machine
  }
  enum Model{SAMSUNG,LG,WALTON,SONY,SHARP,GREECE,SINGER}
  enum NameList{
    Shirt,TShirt,Jeans,Jacket,Trousers,Sweater,Undergarments,PoloShirts
  }
  public static NameList getNames(){
    int Name=new Random().nextInt(NameList.values().length);
    return NameList.values()[Name];
  }
  public static Model getModelName(){
    int ModelName=new Random().nextInt(Model.values().length);
    return Model.values()[ModelName];
  }
  public static double getRandomPrice(){
    double random=((Math.random()*(MAXIMUM_PRODUCT_PRICE-MINIMUM_PRODUCT_PRICE)) +MINIMUM_PRODUCT_PRICE);
     return Math.round(random*100.00)/100.00;
  }
  public static int getRandomPercentage(){
    return (int)(Math.random()*(100.00));
  }
  
  public static int getRandomProductNumber(int upperLimit){
    return (((int)(Math.random()*(upperLimit))));
  }
  public static int getRandomProductNumber(int upperLimit,int object1){
    int randomNumber=((int)(Math.random()*(upperLimit)));
    if (randomNumber==object1)
      return ((int)(Math.random()*(upperLimit)));
    else
       return randomNumber;
  }
  
  public static ElectronicProductList getElectronicProductName(){
    int ElectronicDevice=new Random().nextInt(ElectronicProductList.values().length);
    return ElectronicProductList.values()[ElectronicDevice];
  }
  public static CA2_Fabric_2012547 getFabric(){
    int FabricName=new Random().nextInt(CA2_Fabric_2012547.values().length);
    return CA2_Fabric_2012547.values()[FabricName];
  }
  public static CA2_Warranty_2012547 getWarranty(){
    int warranty=new Random().nextInt(CA2_Warranty_2012547.values().length);
    return CA2_Warranty_2012547.values()[warranty];
  }

  public static void main(String[] args) {
//    System.out.println(String.valueOf(getFabric()));

    CA2_ClothingItem_2012547[] cloths=new CA2_ClothingItem_2012547[3];
    for (int i=0;i<cloths.length;i++){
      cloths[i]=new CA2_ClothingItem_2012547(String.valueOf(getNames()),getRandomPrice(),(getFabric()));
      System.out.println(cloths[i].toString());

    }
   CA2_ElectronicDevice_2012547[] Edevice=new CA2_ElectronicDevice_2012547[4];
    for (int i=0;i<Edevice.length;i++){
      Edevice[i]=new CA2_ElectronicDevice_2012547(String.valueOf(getElectronicProductName()),getRandomPrice(),(getWarranty()),String.valueOf(getModelName()));
     System.out.println(Edevice[i].toString());
    
    }
    int RandomObjectOfClothingItem1=getRandomProductNumber(cloths.length);
    int RandomObjectsOfClothingItem2=getRandomProductNumber(cloths.length,RandomObjectOfClothingItem1);
    int key=cloths[RandomObjectOfClothingItem1].compareTo(cloths[RandomObjectsOfClothingItem2]);
    System.out.println("Comparing "+cloths[RandomObjectOfClothingItem1].getName()+" with "+cloths[RandomObjectsOfClothingItem2].getName()+" :"+key);
    String FabricName1=cloths[RandomObjectOfClothingItem1].getName();
    String FabricType1= String.valueOf(cloths[RandomObjectOfClothingItem1].getFabricType());
    double FabricPrice1=cloths[RandomObjectOfClothingItem1].getPrice();
    String FabricName2=cloths[RandomObjectsOfClothingItem2].getName();
    String FabricType2= String.valueOf(cloths[RandomObjectsOfClothingItem2].getFabricType());
    double FabricPrice2=cloths[RandomObjectsOfClothingItem2].getPrice();
    Formatter(FabricName1,FabricType1,FabricPrice1,FabricName2,FabricType2,FabricPrice2);
    
    
    
   
    System.out.println("\n\n");
  
    int RandomObjectOfElectronicItem1=getRandomProductNumber(Edevice.length);
    int RandomObjectsOfElectronicItem2=getRandomProductNumber(Edevice.length,RandomObjectOfElectronicItem1);
    int key2=Edevice[RandomObjectOfElectronicItem1].compareTo(Edevice[RandomObjectsOfElectronicItem2]);
    System.out.println("Comparing "+Edevice[RandomObjectOfElectronicItem1].getName()+" with "+Edevice[RandomObjectsOfElectronicItem2].getName()+" :"+key2);
    
    
    String EdeviceNam1= Edevice[RandomObjectOfElectronicItem1].getName();
    String EdeviceModel1=Edevice[RandomObjectOfElectronicItem1].getModel();
    double EdevicePrice1=Edevice[RandomObjectOfElectronicItem1].getPrice();
    String EdeviceName2= Edevice[RandomObjectsOfElectronicItem2].getName();
    String EdeviceModel2=Edevice[RandomObjectsOfElectronicItem2].getModel();
    double EdevicePrice2=Edevice[RandomObjectsOfElectronicItem2].getPrice();
    Formatter(EdeviceNam1,EdeviceModel1,EdevicePrice1,EdeviceName2,EdeviceModel2,EdevicePrice2);
  
    for (CA2_ClothingItem_2012547 cloth : cloths) {
      System.out.println("Product Type  ClothingItem :" + cloth.getFabricType());
      System.out.println("Old price :" + cloth.getPrice());
      System.out.println("New Price");
      cloth.changePrice(getRandomPercentage());
    }
    for (CA2_ElectronicDevice_2012547 electronicDevice : Edevice) {
      System.out.println("Product Type Electric Item :" + electronicDevice.getModel());
      System.out.println("Old price :" + electronicDevice.getPrice());
      System.out.println("New Price");
      electronicDevice.changePrice(getRandomPercentage());
    }
    double min=cloths[0].getPrice();
    int valueOfLeastExpensiveClothingItem = 0;
    for(int i = 0; i < cloths.length; i++)
    {
      if(min > cloths[i].getPrice())
      {
        valueOfLeastExpensiveClothingItem=i;
        
      }
      
    }
    System.out.println("Least Expensive Clothing Item details ");
    System.out.println(cloths[valueOfLeastExpensiveClothingItem].toString());
    double max=Edevice[0].getPrice();
    int valueOfMostExpensiveElectronicItem = 0;
    for(int i = 0; i < Edevice.length; i++)
    {
      if(max < Edevice[i].getPrice())
      {
        valueOfMostExpensiveElectronicItem =i;
      
      }
      
    }
    System.out.println("Most Expensive Electronic device details");
    System.out.println(Edevice[valueOfMostExpensiveElectronicItem].toString());
    
  }
  public static void Formatter(String name1, String type1, double price1,String name2,String type2,double price2){
    Formatter formatter2=new Formatter(new StringBuilder());
    formatter2.format("%-20s | %-20s\n",  name1,name2+" :");
    formatter2.format("%-20s | %-20s\n",  type1,type2);
    formatter2.format("%-20s | %-20s\n",  price1,price2);
  
  
    System.out.println(formatter2);
    
  }
  
}
