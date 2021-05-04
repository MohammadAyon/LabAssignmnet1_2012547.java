import java.util.Scanner;
public class DebugExample2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        num=input.nextInt();
     boolean numm = reverse(num);
        
       if(numm=true) 
       {
           System.out.println("palindrome");
       }
       
       else
       {
           System.out.println("not palindome");
       }
    }
    
    public static boolean reverse(int number)
    {
       int reversedInteger = 0, remainder;

       

        
        while( number != 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number  /= 10;
        }
     boolean palindromicInteger = isPalindromicInteger(reversedInteger);
       return  palindromicInteger;
    }
    public static boolean isPalindromicInteger(int number)
    {
        int reversedInteger = number;
       
          int ab=number;
       
        if (ab == reversedInteger)
            return true;
        else
            return false;
    }
}