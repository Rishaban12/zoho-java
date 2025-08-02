package travel.booking;

public class Ticket {
    private int ticketId;
    private String destination;
    private double fee;

    public void setDetails(int ticketId,String destination,double fee){
        this.ticketId=ticketId;
        this.destination=destination;
        this.fee=fee;
    }
    public int getTicketId(){
        return ticketId;
    }
   public String getDestination(){
        return destination;
    }
    public double getFee(){
        return fee;
    }
}
