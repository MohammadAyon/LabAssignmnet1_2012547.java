public class Employee extends person {
  private String ID;
  private String department;
  private double salary;
  
  public String getID() {
    return ID;
  }
  
  public void setID(String ID) {
    this.ID = ID;
  }
  
  public String getDepartment() {
    return department;
  }
  
  public void setDepartment(String department) {
    this.department = department;
  }
  
  public double getSalary() {
    return salary;
  }
  
  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  public Employee(String ID, String department, double salary) {
    super();
    this.ID = ID;
    this.department = department;
    this.salary = salary;
    
  }
}
