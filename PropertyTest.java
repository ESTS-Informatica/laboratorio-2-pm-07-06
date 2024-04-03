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
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        property1 = new Property("T3 Monte Belo", 150000.0);
    }
    
    /**
     * Teste construtor
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
}