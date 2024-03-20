

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    Company company1;
    User client1, client2, seller1, seller2;
    Property property1, property2;
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
        company1 = new Company();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
          client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
          client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
          seller1 = new User("Fernando Fernandes", "966777101", "ff@remax.pt");
          seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
          property1 = new Property("T3 Monte Belo", 150000.0);
          property2 = new Property("T5 Monte Feio", 350000.0);
    }
    @Test
    public void testConstrutor(){
        assertNotNull(company1.getClients());
    }
    @Test
    public void testRegisterClient(){
        assertTrue(company1.registerClient(client1));
    }
    @Test
    public void testRegisterClients(){
        assertTrue(company1.registerClient(client1));
        assertTrue(company1.registerClient(client2));
    }
    @Test
    public void testRegisterSeller(){
        assertTrue(company1.registerSeller(seller1));
    }
    @Test
    public void testRegisterSellers(){
        assertTrue(company1.registerSeller(seller1));
        assertTrue(company1.registerSeller(seller2));
    }
    @Test
    public void testRegisterProperty(){
        assertTrue(company1.registerProperty(property1));
    }
    @Test
    public void testRegisterProperties(){
        assertTrue(company1.registerProperty(property1));
        assertTrue(company1.registerProperty(property2));
    }
    @Test
    public void testRegisterClientDuplicate(){
        assertTrue(company1.registerClient(client1));
        assertFalse(company1.registerClient(client1));
    }
    @Test
    public void testRegisterSellerDuplicate(){
        assertTrue(company1.registerSeller(seller1));
        assertFalse(company1.registerSeller(seller1));
    }
    @Test
    public void testRegisterPropertyDuplicate(){
        assertTrue(company1.registerProperty(property1));
        assertFalse(company1.registerProperty(property1));
    }
    @Test
    public void testRegisterClientNull(){
        assertFalse(company1.registerClient(null));
    }
    @Test
    public void testRegisterSellerNull(){
        assertFalse(company1.registerSeller(null));
    }
    @Test
    public void testRegisterPropertyNull(){
        assertFalse(company1.registerProperty(null));
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
