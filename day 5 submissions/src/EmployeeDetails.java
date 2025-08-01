class Employee{
    String name;
    int employeeId;
    void EmployeeDetails(String name,int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
    void calculateSalary(){
        System.out.println("Salary is");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("employee: "+employeeId);
    }
}
class partTimeEmployee extends Employee{
    double hourRate;
    int workHours;
   void partTimeEmployeeDetails(String name,int employeeId,double hourRate,int workHours){
        EmployeeDetails(name,employeeId);
        this.hourRate=hourRate;
        this.workHours=workHours;
    }
    void calculateSalary(){
        double salary=hourRate*workHours;
        display();
        System.out.println("PartTimeEmployee salary: "+ salary);
        System.out.println("----------------------------------------");
    }
}
class fullTimeEmployee extends Employee{
    int workedHours;
    double bonus;
    void details(String name,int employeeId,int workedHours,double bonus){
        EmployeeDetails(name,employeeId);
        this.workedHours=workedHours;
        this.bonus=bonus;
    }
    void calculateSalary(){
        display();
        double salary=workedHours*bonus;
        System.out.println("PartTimeEmployee salary: "+ salary);
    }
}
public class EmployeeDetails {
  public static void main(String[] args){
      Employee[] record=new Employee[2];
      record[0]=new partTimeEmployee();
      record[1]=new fullTimeEmployee();

      ((partTimeEmployee)record[0]).partTimeEmployeeDetails("rishab",12,6000,6);
      ((fullTimeEmployee)record[1]).details("san",32,12,6000);

      for(int i=0;i<record.length;i++){
          System.out.println("Record "+(i+1));
          record[i].calculateSalary();
      }


  }
}



