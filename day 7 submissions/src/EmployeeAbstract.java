abstract class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary=monthlySalary;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("MonthlySalary: "+ monthlySalary);

    }
    @Override
    void calculateSalary() {
        double salary=monthlySalary;
        System.out.println("salary is: "+salary);
        System.out.println("-------------------------------------------------");

    }

}
class PartTimeEmployee extends Employee{
    int workedHours;
    double hourlyRate;

    PartTimeEmployee(String name, int employeeId,int workedHours,double hourlyRate) {
        super(name, employeeId);
        this.workedHours=workedHours;
        this.hourlyRate=hourlyRate;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("WorkedHours: "+workedHours);
        System.out.println("HourlyRate: "+hourlyRate);
    }

    @Override
    void calculateSalary() {
        double salary=workedHours*hourlyRate;
        System.out.println("salary is: "+salary);
        System.out.println("-------------------------------------------------");
    }
}

public class EmployeeAbstract {
    public static void main(String[] args) {
        Employee emp;
        System.out.println("FullTimeEmployee\n");
        emp=new FullTimeEmployee("rishab",111,90000);
        emp.displayDetails();
        emp.calculateSalary();
        System.out.println("PartTimeEmployee\n");
        emp=new PartTimeEmployee("san",121,7,10000);
        emp.displayDetails();
        emp.calculateSalary();

    }
}
