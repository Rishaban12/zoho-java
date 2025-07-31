public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : ₹" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Ravi Kumar", "IT", 55000.00);

        emp.displayDetails();
    }
}

