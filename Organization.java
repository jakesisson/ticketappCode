import java.util.ArrayList;
public class Organization{
    private String org_name;
    private String org_address;
    private String primary_contact_email;
    private String primary_contact_phone;

    private String org_State;
    private String org_Zip;

    private String org_policies;

    private boolean refunds_auto;

    private boolean refunds_by_request;

    private boolean exchanges_auto;
    private boolean exchanges_by_request;

    private ArrayList<Venue> venues;

    public Organization(){

    }

    public Organization(String org_name, String org_address, String org_State, String org_Zip, String primary_contact_email,
                        String primary_contact_phone, String org_policies, boolean refunds_auto, boolean refunds_by_request,
                        boolean exchanges_auto, boolean exchanges_by_request) {
        this.org_name = org_name;
        this.org_address = org_address;
        this.org_State = org_State;
        this.org_Zip = org_Zip;
        this.org_policies = org_policies;
        this.refunds_auto = refunds_auto;
        this.refunds_by_request = refunds_by_request;
        this.exchanges_auto = exchanges_auto;
        this.exchanges_by_request = exchanges_by_request;
        this.primary_contact_email = primary_contact_email;
        this.primary_contact_phone = primary_contact_phone;
    }


    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getOrg_address() {
        return org_address;
    }

    public void setOrg_address(String org_address) {
        this.org_address = org_address;
    }

    public String getPrimary_contact_email() {
        return primary_contact_email;
    }

    public void setPrimary_contact_email(String primary_contact_email) {
        this.primary_contact_email = primary_contact_email;
    }

    public String getPrimary_contact_phone() {
        return primary_contact_phone;
    }

    public void setPrimary_contact_phone(String primary_contact_phone) {
        this.primary_contact_phone = primary_contact_phone;
    }

    public String getOrg_State() {
        return org_State;
    }

    public void setOrg_State(String org_State) {
        this.org_State = org_State;
    }

    public String getOrg_Zip() {
        return org_Zip;
    }

    public void setOrg_Zip(String org_Zip) {
        this.org_Zip = org_Zip;
    }

    public String getOrg_policies() {
        return org_policies;
    }

    public void setOrg_policies(String org_policies) {
        this.org_policies = org_policies;
    }

    public boolean isRefunds_auto() {
        return refunds_auto;
    }

    public void setRefunds_auto(boolean refunds_auto) {
        this.refunds_auto = refunds_auto;
    }

    public boolean isRefunds_by_request() {
        return refunds_by_request;
    }

    public void setRefunds_by_request(boolean refunds_by_request) {
        this.refunds_by_request = refunds_by_request;
    }

    public boolean isExchanges_auto() {
        return exchanges_auto;
    }

    public void setExchanges_auto(boolean exchanges_auto) {
        this.exchanges_auto = exchanges_auto;
    }

    public boolean isExchanges_by_request() {
        return exchanges_by_request;
    }

    public void setExchanges_by_request(boolean exchanges_by_request) {
        this.exchanges_by_request = exchanges_by_request;
    }

    public ArrayList<Venue> getVenues(){
        return this.venues;
    }

    public void addVenue(Venue venue) {
        venues.add(venue);
    }
}
