class details{
    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    void setDetails(int employeeId, String name,String designation,String department, double monthlySalary){
       this.employeeId=employeeId;
       this.name=name;
       this.designation=designation;
       this.department=department;
       this.monthlySalary=monthlySalary;
    }
    int getEmployeeId(){
        return employeeId;
    }
    String getName(){
        return name;
    }
    String getDesignation(){
        return designation;
    }
    String getDepartment(){
        return department;
    }
    double getMonthlySalary(){
        return monthlySalary;
    }
    void annualsalary(){
        double annualSalary=monthlySalary*12;
        System.out.println("annualSalary: "+annualSalary);
    }
    void display(){
        System.out.println("transactionId: "+employeeId);
        System.out.println("PayerName: "+name);
        System.out.println("payeeName: "+designation);
        System.out.println("amount: "+department);
        System.out.println("paymentMethod: "+monthlySalary);
    }
}

public class Employee {
    public static void main(String[] args) {
        details det=new details();
        det.setDetails(101,"rishab","developer","IT",40000);
        det.display();
        det.annualsalary();
    }
}
