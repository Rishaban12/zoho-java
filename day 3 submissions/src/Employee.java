    class Employee {
        String name;
        int empId;
        String designation;
        double salary;

        Employee() {
            System.out.println("No-arg constructor called. Employee object created with default values.");
            name = "Unknown";
            empId = 0;
            designation = "Not Assigned";
            salary = 0.0;
        }

        Employee(String name, int empId, String designation, double salary) {
            this.name = name;
            this.empId = empId;
            this.designation = designation;
            this.salary = salary;
        }

        Employee(Employee e) {
            this.name = e.name;
            this.empId = e.empId;
            this.designation = e.designation;
            this.salary = e.salary;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + empId);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);
            System.out.println();
        }

        public static void main(String[] args) {
            Employee emp1 = new Employee();
            emp1.display();

            Employee emp2 = new Employee("Alice", 101, "Software Developer", 75000.50);
            emp2.display();

            Employee emp3 = new Employee(emp2);
            emp3.display();
        }
    }

