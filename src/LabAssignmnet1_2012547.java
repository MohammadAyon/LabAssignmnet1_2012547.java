import java.util.Scanner;

public class LabAssignmnet1_2012547 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        System.out.println("Enter your ID : ");
    int ID= in.nextInt();
        System.out.println("Enter your name ");
    String Name= in.next();
        System.out.println("Enter the major information: ");
        char Major = in.next().charAt(0);
        String Type= in.next();

    if(Major=='C'||Major=='c')
    {
        if(Type.equals("I"))
        {
            System.out.println("You are "+Name+","+ID+", Computer Science and Engineering Freshmen");
        }
        else if (Type.equalsIgnoreCase("II"))
    {

        System.out.println("You are " + Name + "," + ID + ", Computer Science and Engineering Sophomore ");
    }
        else if (Type.equalsIgnoreCase("III")) {

        System.out.println("You are " + Name + "," + ID + ", Computer Science and Engineering Junior ");
    }
        else if (Type.equalsIgnoreCase("IV")) {

            System.out.println("You are " + Name + "," + ID + ", Computer Science and Engineering Senior ");
        }
    }
        else if(Major=='B'||Major=='b')
        {
            if(Type.equals("I"))
            {
                System.out.println("You are "+Name+","+ID+", Business Administration freshmen");
            }
            else if (Type.equalsIgnoreCase("II"))
            {

                System.out.println("You are " + Name + "," + ID + ",  Business AdministrationSophomore ");
            }
            else if (Type.equalsIgnoreCase("III")) {

                System.out.println("You are " + Name + "," + ID + ",  Business Administration Junior ");
            }
            else if (Type.equalsIgnoreCase("IV")) {

                System.out.println("You are " + Name + "," + ID + ",  Business Administration Senior ");
            }
        }
    else if(Major=='M'||Major=='m')
    {
        if(Type.equalsIgnoreCase("I"))
        {
            System.out.println("You are "+Name+","+ID+", Business Administration freshmen");
        }
        else if (Type.equalsIgnoreCase("II"))
        {

            System.out.println("You are " + Name + "," + ID + ",  Business AdministrationSophomore ");
        }
        else if (Type.equalsIgnoreCase("III")) {

            System.out.println("You are " + Name + "," + ID + ",  Business Administration Junior ");
        }
        else if (Type.equalsIgnoreCase("IV")) {

            System.out.println("You are " + Name + "," + ID + ",  Business Administration Senior ");
        }
    }
    else
        System.out.println("Sorry,Invalid Major imformation");

    }
    
    }

