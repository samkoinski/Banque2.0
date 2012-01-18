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
 * @author phanuel
 */
public class accountTest {
    
    private Person _pers;
    private Account _acnt;
    
    public accountTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        // creating a new person named "Paul"
        _pers = new Person();
        _pers.setName("Paul");
        
        DAO<Person> personDAO = new PersonDAO();
        _pers = personDAO.create(_pers);
        
        _acnt = new Account();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAssign() {
        // assigning a new account to Paul
        _acnt.setOwner(_pers);
        
        assertEquals(_acnt.getOwner(), _pers);
    }
    
    @Test
    public void testInitialBalance() {
        // getting initial balance ammount
        assertTrue(_acnt.getBalance() == 0);
    }
    
    @Test
    public void testCredit() {
        // crediting an ammount to Paul's account
        _acnt.credit(100);
        assertTrue(_acnt.getBalance() == 100);
    }
    
    @Test
    public void testDebit() {
        // debiting an ammount from Paul's account
        _acnt.debit(100);
        assertTrue(_acnt.getBalance() == -100);
    }
    
    @Test
    public void testCreate() {
        DAO<Account> acntDAO = new AccountDAO();
        _acnt = acntDAO.create(_acnt);
        assertEquals(_acnt.getId(), acntDAO.find(_acnt.getId()).getId());
    }
    
    @Test
    public void testUpdate() {
        DAO<Account> acntDAO = new AccountDAO();
        _acnt = acntDAO.create(_acnt);
        _acnt.credit(100);
        _acnt = acntDAO.update(_acnt);
        assertTrue(_acnt.getBalance() == 100);
    }
    
    @Test
    public void testDelete() {
        DAO<Account> acntDAO = new AccountDAO();
        _acnt = acntDAO.create(_acnt);
        assertEquals(_acnt.getId(), acntDAO.find(_acnt.getId()).getId());
        
        acntDAO.delete(_acnt);
        Account acnt = acntDAO.find(_acnt.getId());
        assertNotSame(acnt.getId(), _acnt.getId());
    }
}
