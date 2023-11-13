import java.util.ArrayList;
public class Venue extends Organization{
    private String venue_name;
    private String venue_add;
    private String venue_State;
    private String venue_Zip;

    private String venue_policies;

    private boolean refunds_auto;

    private boolean refunds_by_request;

    private boolean exchanges_auto;
    private boolean exchanges_by_request;

    private ArrayList<Performance> performances;

    private SeatingChart defaultSeatingChart;


    //If using inherited refund/exchange policies for Org
    public Venue(String venue_name, String venue_add, String venue_State, String venue_Zip, String venue_policies,
                 String org_name, String org_address, String org_State, String org_Zip, String primary_contact_email,
                 String primary_contact_phone, String org_policies, boolean org_refunds_auto, boolean org_refunds_by_request,
                 boolean org_exchanges_auto, boolean org_exchanges_by_request) {
        super(org_name, org_address, org_State, org_Zip, primary_contact_email, primary_contact_phone, org_policies, org_refunds_auto,
                org_refunds_by_request, org_exchanges_auto, org_exchanges_by_request);
        this.venue_name = venue_name;
        this.venue_add = venue_add;
        this.venue_Zip = venue_Zip;
        this.venue_policies = venue_policies;
        this.performances = new ArrayList<Performance>();
    }


    public Venue() {

    }

    public String getVenue_name() {
        return venue_name;
    }

    public void setVenue_name(String venue_name) {
        this.venue_name = venue_name;
    }

    public String getVenue_add() {
        return venue_add;
    }

    public void setVenue_add(String venue_add) {
        this.venue_add = venue_add;
    }

    public String getVenue_Zip() {
        return venue_Zip;
    }

    public void setVenue_Zip(String venue_Zip) {
        this.venue_Zip = venue_Zip;
    }

    public String getVenue_policies() {
        return venue_policies;
    }

    public void setVenue_policies(String venue_policies) {
        this.venue_policies = venue_policies;
    }

    public void add_Perf(Performance performance) {
        performances.add(performance);
    }
    public void remove_Perf(Performance performance) {
        performances.remove(performance);
    }

    public void setDefaultSeatingChart(SeatingChart seatingChart) {
        this.defaultSeatingChart = seatingChart;
    }
}
