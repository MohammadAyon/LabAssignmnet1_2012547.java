

public class CA1_Task3_2012547 {
  public static void main(String[] args) {
    int[] numberOfSides = new int[50];
    for (int i = 0; i < numberOfSides.length; i++) {
      int sidesGenerator = 2 + (int) (Math.random() * (40 - 2 + 1));
      numberOfSides[i] = sidesGenerator;
    }
    
    double[] sideLength = new double[50];
    for (int j = 0; j < sideLength.length; j++) {
      double sidesGenerator = 10 + (Math.random() * (100.00));
      sideLength[j] = sidesGenerator;
    }
    
    for (int i = 0; i < 50; i++) {
      System.out.println("Area of a polygon with " + " " + numberOfSides[i] + " and side length of " + " " + sideLength[i] + "is " + areaOfPolygon(numberOfSides[i], sideLength[i]));
      
    }
    
  }
  
  public static double areaOfPolygon(int numberOfSides, double sideLength) {
    if (sideLength < 0 && numberOfSides < 0)
      return -1;
    else
      return (sideLength * sideLength * numberOfSides) / (4 * Math.tan((180.00 / numberOfSides) * 3.14159 / 180));
  }
}
