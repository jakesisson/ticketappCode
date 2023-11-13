import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Performance extends Venue{
    private String perfName;
    private String dateTime; //Sat Dec 15, 2024 7:30 PM   for ticket headers
    private boolean isGA;

    private Map<String, Double> ticketpricesbysection;

    private ArrayList<Customer> customers;

    public Performance() {
        super();
        this.customers = new ArrayList<>();

    }

    public Performance(String perfName, String dateTime, boolean isGA, String venue_name, String venue_add, String venue_State, String venue_Zip, String venue_policies,
                       String org_name, String org_address, String org_State, String org_Zip, String primary_contact_email,
                       String primary_contact_phone, String org_policies, boolean org_refunds_auto, boolean org_refunds_by_request,
                       boolean org_exchanges_auto, boolean org_exchanges_by_request) {
        super(venue_name, venue_add, venue_State, venue_Zip, venue_policies,
                org_name, org_address, org_State, org_Zip, primary_contact_email,
                primary_contact_phone, org_policies, org_refunds_auto, org_refunds_by_request,
        org_exchanges_auto, org_exchanges_by_request);

        this.perfName = perfName;
        this.dateTime = dateTime;
        this.isGA = isGA;
        this.ticketpricesbysection = new HashMap<>();
    }

    public String getPerfName() {
        return perfName;
    }

    public void setPerfName(String perfName) {
        this.perfName = perfName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isGA() {
        return isGA;
    }

    public void setGA(boolean GA) {
        isGA = GA;
    }

    public void setTicketPrice(String section, double price) {
        ticketpricesbysection.put(section, price);
    }

    public Double getTicketPrice(String section) {
        return ticketpricesbysection.get(section);
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public ArrayList<Customer> getCustomerList(){
        return this.customers;
    }

}
