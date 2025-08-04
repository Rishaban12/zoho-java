import java.util.Scanner;

abstract class Ticket {
    private String name;
    private long infoContact;
    private int date;
    String source;
    String destination;

    void setUserDetails(String name, int date, long infoContact,String source,String destination) {
        this.name = name;
        this.date = date;
        this.infoContact = infoContact;
        this.source=source;
        this.destination=destination;
    }

    int getDate() {
        return date;
    }

    String getName() {
        return name;
    }

    long getInfoContact() {
        return infoContact;
    }

    abstract void bookTicket();

    void userDisplay() {
        System.out.println("Name: " + name);
        System.out.println("infoContact: " + infoContact);
        System.out.println("Date: "+date);
        System.out.println("source: "+source);
        System.out.println("destination: "+destination);
    }
}

class Bus extends Ticket{
    int seatBook;
    String acOrNot;
    void Bus(String name,long infoContact,int date,String source,String destination,int seatBook,String acOrNot){
        setUserDetails(name,date,infoContact,source,destination);
        this.seatBook=seatBook;
        this.acOrNot=acOrNot;
    }

    @Override
    public void bookTicket() {
        userDisplay();
        System.out.println("seat: "+ seatBook);
        System.out.println("seats are Ac or Not: "+acOrNot);
        calculateFare();
        System.out.println("------------------------------------------------------------------");

    }
    public void calculateFare(){
        double fare=seatBook*800.00;
        System.out.println("Fare for your travel is: "+fare);
    }
}
class Train extends Ticket {
    int seatBook;
    String classChoice;
    String food;

    void Train(String name, long infoContact, int date, String source, String destination, int seatBook, String classChoice, String food) {
        setUserDetails(name, date, infoContact, source, destination);
        this.seatBook = seatBook;
        this.classChoice = classChoice;
        this.food = food;
    }

    @Override
    void bookTicket() {
        userDisplay();
        System.out.println("seat: " + seatBook);
        System.out.println("classChoice: 1." + classChoice);
        System.out.println("food or not? " + food);
        calculateFare();
        System.out.println("------------------------------------------------------------------");

    }

    public void calculateFare() {
        double fare = 0.0;
        if (classChoice == "1Ac" || classChoice == "1ac") {
            fare = seatBook * 1000.00;
        } else if (classChoice == "2Ac" || classChoice == "2ac") {
            fare = seatBook * 800.00;
        } else {
            fare = seatBook * 500.00;
        }
        System.out.println("Fare for your travel is: " + fare);
    }
}
class Flight extends Ticket{
    int seatBook;
    int classChoice;
    String food;
    int luggages;

    void Flight(String name,long infoContact,int date,String source,String destination,int seatBook,int classChoice,String food, int luggages){
        setUserDetails(name,date,infoContact,source,destination);
        this.seatBook=seatBook;
        this.classChoice=classChoice;
        this.food=food;
        this.luggages=luggages;
    }

    @Override
    void bookTicket() {
        userDisplay();
        System.out.println("seat: "+ seatBook);
        System.out.println("classChoice: "+classChoice);
        System.out.println("food or not? "+food);
        System.out.println("luggages weight: "+luggages);
        calculateFare();
        System.out.println("------------------------------------------------------------------");
    }

    public void calculateFare(){
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

public class TicketBooking {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("Welcome to the Ticket Booking System");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");
        System.out.println("4. exit");
        System.out.println("enter the choice: ");
        int choice = read.nextInt();
        if (choice == 4) {
            System.out.println("Exit");
            return;
        }

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("enter name:");
        String name = read.next();
        System.out.println("PhoneNumber: ");
        long infoContact = read.nextLong();
        System.out.println("date: ");
        int date = read.nextInt();
        System.out.println("source: ");
        String source = read.next();
        System.out.println("destination: ");
        String destination = read.next();
        System.out.println("seatbook: ");
        int seatBook = read.nextInt();

        Ticket selectedBooking = null;


        switch (choice) {
            case 1:
                selectedBooking = new Bus();
                System.out.println("acOrNot: ");
                String acOrNot = read.next();
                ((Bus) selectedBooking).Bus(name, infoContact, date, source, destination, seatBook, acOrNot);
                break;
            case 2:
                selectedBooking = new Train();
                System.out.println("food: ");
                String food = read.next();
                System.out.println("classchoice (1AC, 2AC, Sleeper) ");
                String classChoice = read.next().toLowerCase();
                ((Train) selectedBooking).Train(name, infoContact, date, source, destination, seatBook, classChoice, food);
                break;
            case 3:
                selectedBooking = new Flight();
                System.out.println("classchoice (1.economy 2.firstclass 3.Business): ");
                int classChoic = read.nextInt();
                System.out.println("food: ");
                String food1 = read.next();
                System.out.println("luggages weight: ");
                int luggages = read.nextInt();
                ((Flight) selectedBooking).Flight(name, infoContact, date, source, destination, seatBook, classChoic, food1, luggages);
                break;

        }

        selectedBooking.bookTicket();
    }
}

