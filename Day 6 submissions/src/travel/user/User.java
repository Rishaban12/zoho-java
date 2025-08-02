package travel.user;
import travel.booking.Ticket;
public class User {
    private int userId;
    private String name;
    private long infoContact;

    void setUserDetails(int userId,String name,long infoContact){
        this.userId=userId;
        this.name=name;
        this.infoContact=infoContact;
    }
    int getUserId(){
        return userId;
    }
    String getName(){
        return name;
    }
    long getInfoContact(){
        return infoContact;
    }
    void userDisplay(){
        System.out.println("userId: "+userId);
        System.out.println("Name: "+name);
        System.out.println("infoContact: "+infoContact);
    }
    void bookTicket(){
        Ticket ticket=new Ticket();
        ticket.setDetails(222,"thanjavur",360.00);
        System.out.println("TicketId: "+ticket.getTicketId());
        System.out.println("Destination: "+ticket.getDestination());
        System.out.println("Fee: "+ticket.getFee());
    }
}
class bookingDetails{
    public static void main(String[] args) {
        User user=new User();
        user.setUserDetails(112,"rishab",987654321);
        user.userDisplay();
        user.bookTicket();

    }
}
