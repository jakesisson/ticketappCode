import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
public class TicketCompany {
    private ArrayList<Organization> orgs;
    private ArrayList<Customer> customers;
    private ArrayList<Integer> serials;
    private ArrayList<Integer> orderIds;
    private final String orderID_file = "id_store.txt";
    private final String serialID_file = "serial_store.txt";
    public TicketCompany() {
        this.orgs = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.serials = new ArrayList<>();
        this.orderIds= new ArrayList<Integer>();
    }

    private void loadNumbersFromFile() {
        try {
            List<String> existingOrders = Files.readAllLines(new File(orderID_file).toPath());
            List<String> existingSerials = Files.readAllLines(new File(serialID_file).toPath());
            for (String line : existingOrders) {
                // Assuming one number per line
                orderIds.add(Integer.parseInt(line.trim()));
            }
            for (String line : existingSerials) {
                serials.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            // Handle exceptions or throw them further
        }
    }

    public void addOrg(Organization organization) {
        orgs.add(organization);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
