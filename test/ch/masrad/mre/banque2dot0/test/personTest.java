package ch.masrad.mre.banque2dot0.test;

import ch.masrad.mre.banque2dot0.buisness.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Person customerOut = new Person();

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
        try {
            customer.setName("Test Person " + System.currentTimeMillis());
            customer = personDAO.create(customer);
            assertEquals(customer.getId(), customer.getId());
            if (customer.getId() == 0) {
                fail("Customer not created");
            }
        } catch (SQLException ex) {
            Logger.getLogger(personTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test
    public void findPerson() {
        try {
            customer = personDAO.find(1);
            assertEquals(1, customer.getId());
        } catch (SQLException ex) {
            Logger.getLogger(personTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test
    public void updatePerson() {
        try {
            customer = personDAO.find(1);
            customer.setName("Test Update" + System.currentTimeMillis());
            customerOut = personDAO.update(customer);
            assertEquals(customer.getName(), customerOut.getName());
            assertEquals(customer.getId(), customerOut.getId());
        } catch (SQLException ex) {
            Logger.getLogger(personTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test
    public void deletePerson() {
        try {
            customer.setName("Test Person" + System.currentTimeMillis());
            customer = personDAO.create(customer);
            personDAO.delete(customer);
            customer = personDAO.find(customer.getId());
            if (customer.getId() != 0) {
                fail("Customer not deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(personTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
