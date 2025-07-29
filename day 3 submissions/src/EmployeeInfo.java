public class EmployeeInfo {
    String name;
    int yearOfJoining;
    String address;


    EmployeeInfo(String name, int yearOfJoining, String address){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.address=address;
    }


    public static void main(String[] args){
        EmployeeInfo e1=new EmployeeInfo("Robert", 1994,"64C-WallStreet");
        EmployeeInfo e2=new EmployeeInfo("Sam", 2000,"68D-WallStreet");
        EmployeeInfo e3=new EmployeeInfo("John", 1999,"26B-WallStreet");
        System.out.printf("%-10s %-15s %10s\n", "Name", "Year of Joining", "Address");

        System.out.printf("%-10s %-15d %10s\n", e1.name, e1.yearOfJoining, e1.address);
        System.out.printf("%-10s %-15d %10s\n", e2.name, e2.yearOfJoining, e2.address);
        System.out.printf("%-10s %-15d %10s\n", e3.name, e3.yearOfJoining, e3.address);
    }
    }

