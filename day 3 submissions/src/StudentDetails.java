class StudentDetails {
    String name;
    int roll_no;
    int phone_no;
    String address;


    StudentDetails(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No: " + phone_no);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Sam", 1, 987654321, "Chennai");
        StudentDetails student2 = new StudentDetails("John", 2, 912345678, "Mumbai");

        System.out.println("Student 1 Details:");
        student1.display();

        System.out.println("Student 2 Details:");
        student2.display();
    }
}
