import java.util.Scanner;

public class LabAssignment2_2012547 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter password : ");
    String Password=in.nextLine();
    int length = Password.length();


    String  Username=in.nextLine();
    if (Username.length() >= 4) {
      boolean checkUsername = isValidUsername(Username);
      if(checkUsername==false){
        System.out.println("Invalid username");
      }
    } else {
      System.out.println("Invalid Username");
    }
    if (Password.length() >= 6) {
      boolean checkPassword = isValidPassword(Password);
      if(!checkPassword){
        System.out.println("In");
      }
    } else {
      System.out.println("Invalid Password");
    }
    
  }
  
  public static boolean isValidUsername(String username) {
    char store;
    boolean checklowerCase = false;
    boolean checkupperCase = false;
    boolean checkNumber = false;
    boolean checkSpace= false;
    for (int i = 0; i < username.length(); i++) {
      store = username.charAt(i);
      if (Character.isLowerCase(store)) {
        checklowerCase = true;
      } else if (Character.isUpperCase(store)) {
        checkupperCase = true;
        
      } else if (Character.isDigit(store)) {
        return true;
      }
      else if (Character.isWhitespace(store)){
        return true;
      }
      if (checklowerCase && checkupperCase==false && checkSpace== false||checkNumber)
        return true;
  
    }
    return false;
  }
  
public static boolean isValidPassword(String password){
  char store;
  boolean checklowerCase = false;
  boolean checkupperCase = false;
  boolean checkNumber = false;
  boolean checkSpace= false;
  for (int i = 0; i < password.length(); i++) {
    store = password.charAt(i);
    if (Character.isLowerCase(store)) {
      checklowerCase = true;
    } else if (Character.isUpperCase(store)) {
      checkupperCase = true;
  
    } else if (Character.isDigit(store)) {
      return true;
    } else if (Character.isWhitespace(store)){
      return true;
    }
    
    if (checklowerCase && checkNumber && checkupperCase || checkSpace==true || checkSpace==false)
      return true;
  }
    
    return  false;
}
  }
  
  

