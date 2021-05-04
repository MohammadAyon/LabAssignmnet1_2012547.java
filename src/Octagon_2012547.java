import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Octagon_2012547 {
  private BigDecimal lengthOfSide;
  private LocalDateTime createdOn;
  final static int Number_OF_Sides = 8;
  
  public Octagon_2012547(BigDecimal lengthOfSide) {
    this.lengthOfSide = lengthOfSide;
  }
  public Octagon_2012547(String  lengthOfSide) {
    lengthOfSide = lengthOfSide;
  }
  
  public String getLengthOfSide() {
    return String.valueOf(lengthOfSide);
  }
  public BigDecimal calculateArea(){
    BigDecimal a= new BigDecimal(getLengthOfSide());
    BigDecimal A= (a.multiply(a));
    
    return A.multiply(BigDecimal.valueOf(2.00*(1.00+Math.sqrt(2.00)))).setScale(15,BigDecimal.ROUND_HALF_UP);
    
  }
  public BigDecimal CalculatePerimeter(){
    BigDecimal a= new BigDecimal(getLengthOfSide());
    return a.multiply(BigDecimal.valueOf((8))).setScale(15,BigDecimal.ROUND_HALF_UP);
    
  }
  @Override
  public String toString() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    return "\nName of Class Octagon_2012547 \n" +
             "Number of Sides "+Number_OF_Sides+
             "\nLength Of Side=" + lengthOfSide +" Unit"+
             " \nCreatedOn=" + dtf.format(createdOn=LocalDateTime.now()) +
             "\nArea ="+calculateArea()+"Sq.units"+
             "\nPerimeter "+CalculatePerimeter();
             
  }
}