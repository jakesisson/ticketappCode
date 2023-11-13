public class Ticket extends Order{
    private Performance performance;
    private String section;
    private String row;
    private String seat;

    private double ticketPrice;
    private double fee; // redefine to have more in depth fee structure

    private int serial;


    public Ticket(int serial, Performance performance, double ticketPrice, double fee, String section, String row, String seat,
                  int orderID, Customer customer) {
        super(orderID, customer);
        this.serial = serial;
        this.performance = performance;
        this.ticketPrice = ticketPrice;
        this.fee = fee;
        this.section = section;
        this.row = row;
        this.seat = seat;

    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
