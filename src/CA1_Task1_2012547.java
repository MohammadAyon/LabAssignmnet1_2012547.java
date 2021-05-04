import java.util.Scanner;

public class CA1_Task1_2012547 {
  
  public enum Month {
    
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
  }
  
  public enum Day {
    SATURDAY,
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
  }
  
  
  
  
  public static void main(String[] args)
  {
    
    for(int j = 0; j < 3; j++) {
      Scanner input = new Scanner(System.in);
      
      
      System.out.print("Enter month: ");
      String month = input.next();
      
      System.out.print("Enter year: ");
      int year = input.nextInt();
      
      System.out.print("Enter day of the month: ");
      byte day = input.nextByte();
      
      month = month.toUpperCase();
      Day computeDayOfWeek = computeDayOfWeek(year, Month.valueOf(month), day);
      System.out.println("Day of the week is " + computeDayOfWeek.name() + "\n");
    }
  }
  
  public static Day computeDayOfWeek(int year, Month monthName, byte dayOfMonth)
  {
    int x = 0;
    
    
    switch (monthName) {
      case JANUARY:
        x = 13;
        year--;
        break;
      
      case FEBRUARY:
        
        x = 14;
        year--;
        break;
      case MARCH:
        x = 3;
        break;
      
      case APRIL:
        x = 4;
        break;
      
      case MAY:
        x = 5;
        break;
      
      case JUNE:
        x = 6;
        break;
      
      case JULY:
        x = 7;
        break;
      
      case AUGUST:
        x = 8;
        break;
      
      case SEPTEMBER:
        x = 9;
        break;
      
      case OCTOBER:
        x = 10;
        break;
      
      case NOVEMBER:
        x = 11;
        break;
      
      case DECEMBER:
        x=12;
        break;
      
      
    }
    
    
    int q = dayOfMonth;
    int m = x;
    int k = year % 100;
    int j = year / 100;
    int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
    h = h % 7;
    
    return Day.values()[h];
  }
}

