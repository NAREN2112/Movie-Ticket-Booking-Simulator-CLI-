package ticket;

public class Booking {
    int noofTicket;
    double amount;
    String paid;
    String seatNo;

    public Booking() {
    }

    public Booking(int tId,double amount,String paid,String seatNo){
        this.noofTicket= tId;
        this.amount = amount;
        this.paid = paid;
        this.seatNo = seatNo;

    }

    @Override
    public String toString() {
        return "Booking{" +
                "noofTicket=" + noofTicket +
                ", amount=" + amount +
                ", paid='" + paid + '\'' +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }
}
