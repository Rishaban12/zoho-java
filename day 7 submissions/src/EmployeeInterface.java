interface Employees{

    void calculateSalary();
}

class FulltimeEmployee implements Employees{
    String name;
    int EmployeeId;
    double monthlySalary;

    FulltimeEmployee(String name, int employeeId, double monthlySalary) {
        this.name=name;
        this.EmployeeId=employeeId;
        this.monthlySalary=monthlySalary;
    }
    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("EmployeeId: "+EmployeeId);
        System.out.println("MonthlySalary: "+ monthlySalary);

    }
    @Override
    public void calculateSalary() {
        double salary=monthlySalary;
        System.out.println("salary is: "+salary);
        System.out.println("-------------------------------------------------");

    }

}
class ParttimeEmployee implements Employees{
    String name;
    int EmployeeId;
    int workedHours;
    double hourlyRate;

    ParttimeEmployee(String name, int employeeId,int workedHours,double hourlyRate) {
        this.name=name;
        this.EmployeeId=employeeId;
        this.workedHours=workedHours;
        this.hourlyRate=hourlyRate;
    }
    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("EmployeeId: "+EmployeeId);
        System.out.println("WorkedHours: "+workedHours);
        System.out.println("HourlyRate: "+hourlyRate);
    }

    @Override
    public void calculateSalary() {
        double salary=workedHours*hourlyRate;
        System.out.println("salary is: "+salary);
        System.out.println("-------------------------------------------------");
    }
}
public class EmployeeInterface {
    public static void main(String[] args) {
        Employees emp;
        System.out.println("Part Time Employee\n");
        emp=new ParttimeEmployee("rishab",112,6,800.00);
        ((ParttimeEmployee)emp).displayDetails();
        emp.calculateSalary();
        System.out.println("Full Time Employee\n");
        emp=new FulltimeEmployee("san",111,800000);
        ((FulltimeEmployee) emp).displayDetails();
        emp.calculateSalary();
    }
}
