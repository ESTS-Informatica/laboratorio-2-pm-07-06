
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        clients = new ArrayList<>();
        sellers = new ArrayList<>();
        properties = new ArrayList<>();
        sells = new ArrayList<>();
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return this.clients;
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return this.sellers;         // dummy implementation
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return this.properties;         // dummy implementation
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return this.sells;         // dummy implementation
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(client != null && !clients.contains(client)){
            return clients.add(client);
        }
        return false;
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if(seller != null && !sellers.contains(seller)){
            return sellers.add(seller);
        }
        return false;
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(property != null && !properties.contains(property)){
            return properties.add(property);
        }
        return false;
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        if(sell != null && !sells.contains(sell)){
            return sells.add(sell);
        }
        return false;
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        if(clients.contains(client) && sellers.contains(seller) && properties.contains(property)){
            Sell sell1 = new Sell(client, seller, property);
            return registerSell(sell1);
        }
        return false;
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        int count = 0;
        for(Sell s : sells){
            if(s.getDate().getYear() == year){
                count++;
            }
        }
        return count;
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        User sellerMax = null;
        int countMAX = 0;
        for(User s : sellers){
            int count = 0;
            for(Sells sa : sells){
                if(sa.getSeller() == s && s.getDate().getYear() == year){
                    count++;
                }
            }
            if(count > countMAX){
                countMAX = count;
                sellerMax = s;
            }
        }
        return sellerMax.getName();
    }

}
