/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public static Person paul;
    
    public personTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
   //     paul = new Person("Paul");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testName() {
            paul.setName("paul");
            assertEquals("paul", paul.getName());
    }
    
    public void createPerson() {
        DAO<Person> paulDAO = new PersonDAO();
    }
}
