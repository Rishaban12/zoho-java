import java.util.Scanner;

class booking{
    String name;
    long phoneNumber;
    int date;
    String source;
    String destination;

    void details(String name,long phoneNumber,int date,String source,String destination){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.date=date;
        this.source=source;
        this.destination=destination;
    }
    void display(){
        System.out.println("\nThis is the details for the ticket bookings\n");
        System.out.println("Name: "+name);
        System.out.println("PhoneNumber: "+ phoneNumber);
        System.out.println("date: "+ date);
        System.out.println("source: "+source);
        System.out.println("destination: "+destination);
    }
    public void calculateFare(){

    }
}
class Bus extends booking{
    int seatBook;
    String acOrNot;
    void details(String name,long phoneNumber,int date,String source,String destination,int seatBook,String acOrNot){
        details(name,phoneNumber,date,source,destination);
        this.seatBook=seatBook;
        this.acOrNot=acOrNot;
    }

    @Override
    void display() {
        super.display();
        System.out.println("seat: "+ seatBook);
        System.out.println("seats are Ac or Not: "+acOrNot);
        System.out.println("------------------------------------------------------------------");

    }
    public void calculateFare(){
        display();
        double fare=seatBook*800.00;
        System.out.println("Fare for your travel is: "+fare);
    }
}
class Train extends booking{
    int seatBook;
    String classChoice;
    String food;
    void details(String name,long phoneNumber,int date,String source,String destination,int seatBook,String classChoice,String food){
        super.details(name,phoneNumber,date,source,destination);
        this.seatBook=seatBook;
        this.classChoice=classChoice;
        this.food=food;
    }

    @Override
    void display() {
        super.display();
        System.out.println("seat: "+ seatBook);
        System.out.println("classChoice: 1."+classChoice);
        System.out.println("food or not? "+food);
        System.out.println("------------------------------------------------------------------");

    }
    public void calculateFare(){
        display();
        double fare = 0.0;
        if(classChoice == "1Ac" || classChoice=="1ac"){
            fare = seatBook * 1000.00;
        } else if(classChoice == "2Ac" || classChoice=="2ac"){
            fare = seatBook * 800.00;
        } else {
            fare = seatBook * 500.00;
        }
        System.out.println("Fare for your travel is: " + fare);
    }

}
class Flight extends booking{
    int seatBook;
    int classChoice;
    String food;
    int luggages;

    void details(String name,long phoneNumber,int date,String source,String destination,int seatBook,int classChoice,String food, int luggages){
        super.details(name,phoneNumber,date,source,destination);
        this.seatBook=seatBook;
        this.classChoice=classChoice;
        this.food=food;
        this.luggages=luggages;
    }

    @Override
    void display() {
        super.display();
        System.out.println("seat: "+ seatBook);
        System.out.println("classChoice: "+classChoice);
        System.out.println("food or not? "+food);
        System.out.println("luggages weight: "+luggages);
        System.out.println("------------------------------------------------------------------");
    }

    public void calculateFare(){
        display();
        double fare = 0.0;

        if(classChoice == 1){
            fare = (luggages <= 65) ? seatBook * 35000.00 : seatBook * 40000.00;
        } else if(classChoice == 1){
            fare = (luggages <= 70) ? seatBook * 55000.00 : seatBook * 60000.00;
        } else if(classChoice == 3){
            fare = (luggages <= 70) ? seatBook * 100000.00 : seatBook * 120000.00;
        } else {
            System.out.println("Invalid class choice.");
            return;
        }

        System.out.println("Fare for your travel is: " + fare);
    }

}
public class TicketBookingSystem {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);


        System.out.println("Welcome to the Ticket Booking System");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");
        System.out.println("4. exit");
        System.out.println("enter the choice: ");
        int choice= read.nextInt();
        if (choice == 4) {
            System.out.println("Exit");
            return;
        }

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("enter name:");
        String name=read.next();
        System.out.println("PhoneNumber: ");
        long phoneNumber=read.nextLong();
        System.out.println("date: ");
        int date=read.nextInt();
        System.out.println("source: ");
        String source=read.next();
        System.out.println("destination: ");
        String destination=read.next();
        System.out.println("seatbook: ");
        int seatBook=read.nextInt();

        booking selectedBooking = null;


        switch (choice){
            case 1:
                selectedBooking = new Bus();
                System.out.println("acOrNot: ");
                String acOrNot=read.next();
                ((Bus)selectedBooking).details(name, phoneNumber,date,source,destination,seatBook,acOrNot);
                break;
            case 2:
                selectedBooking = new Train();
                System.out.println("food: ");
                String food=read.next();
                System.out.println("classchoice (1AC, 2AC, Sleeper) ");
                String classChoice= read.next().toLowerCase();
                ((Train)selectedBooking).details(name, phoneNumber,date,source,destination,seatBook,classChoice,food);
                break;
            case 3:
                selectedBooking = new Flight();
                System.out.println("classchoice (1.economy 2.firstclass 3.Business): ");
               int classChoic = read.nextInt();
                System.out.println("food: ");
                String food1=read.next();
                System.out.println("luggages weight: ");
                int luggages=read.nextInt();
                ((Flight)selectedBooking).details(name, phoneNumber,date,source,destination,seatBook,classChoic,food1,luggages);
                break;

        }

        selectedBooking.calculateFare();


    }
}
