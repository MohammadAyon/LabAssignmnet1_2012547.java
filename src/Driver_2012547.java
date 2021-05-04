import java.math.BigDecimal;

public class Driver_2012547 {
  public static void main(String[] args) {
    
    for (int i=1;i<=10;i++){
      if(i%2==0){
        Decagon_2012547 result =new Decagon_2012547(getRandomBigDecimal());
        System.out.println("No:"+i+result.toString());
      }else{
        Octagon_2012547 result= new Octagon_2012547(getRandomBigDecimal());
        System.out.println("No:"+i+result.toString());
      }
      
    }
    
  }
  public static BigDecimal getRandomBigDecimal(){
  
 BigDecimal max = new BigDecimal("5600000000000.00");
 BigDecimal min = new BigDecimal("100000000000.00");
 BigDecimal range = max.subtract(min);
 BigDecimal result = min.add(range.multiply(new BigDecimal(Math.random())));
 
    return result.setScale(15,BigDecimal.ROUND_HALF_UP);
  }
}
