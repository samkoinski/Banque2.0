import ch.masrad.mre.banque2dot0.buisness.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samkoinski
 */
public class personTest {
    
    DAO<Person> personDAO = new PersonDAO();
    Person customer = new Person();
        
    
    public personTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {


    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        customer.setName("paul");
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testName() {
            assertEquals("paul", customer.getName());
    }
    
    @Test
    public void createPerson() {

        customer = personDAO.create(customer);
        assertEquals("paul", customer.getName());
    }
    
    @Test
    public void findPerson() {
        
        customer = personDAO.find(customer.getId());
        assertEquals("paul", customer.getName());
    }
    
    @Test
    public void updatePerson() {
        
        customer.setName("Yves");
        customer = personDAO.update(customer);
        assertEquals("Yves", customer.getName());
    }
}
