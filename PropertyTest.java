

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    Property property1;
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
        property1 = new Property("T3 Monte Belo", 150000.0);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }
    
    /**
     * Teste
     */
    @Test
    public void testConstructor(){
        assertEquals(150000.0, property1.getPrice());
    }
    
    /**
     * Teste tostring
     */
    @Test
    public void testToString(){
        assertEquals("  Descricao   : "+"T3 Monte Belo"+"\n  Preco    : "+"150000.0"+" Euros", property1.toString());
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
