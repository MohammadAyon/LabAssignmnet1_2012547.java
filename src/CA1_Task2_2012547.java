
public class CA1_Task2_2012547 {
  public static void main(String[] args) {
    int sum = 0;
    int count=1;
    StringBuilder display= new StringBuilder();
    for (int i = 0; i < 1000000; i++) {
      
      if (isExquisiteNumber(i)) {
        System.out.println("Exquisite number "+count+" : "+i );
        count++;
        display.append(i).append("+");
        sum += i;
      }
    }
    String display1= display.toString();
    System.out.println(display1+"="+sum);
    
   if(isExquisiteNumber(sum)){
     System.out.println(sum+" is an exquisite number ");
   }
   else{
      System.out.println(sum+" is not an exquisite number ");}
    
    
  }
  
  public static boolean isExquisiteNumber(int number) {
    
    int add = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        
        add += i;
      }
      
    }
    
    return add == number;
  }
}
