package ch.masrad.mre.banque2dot0.buisness;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main(String[] args) {
        //Person paul = new Person(2,"Pierre");

        //DAO<Person> paulDAO = new PersonDAO();

        //paulDAO.create(paul);

        //Person georges = new Person("Georges");
        //Bank aBank = new Bank();

        //Account paulsAccount = new Account(paul);
        //Account georgsAccount = new Account(georges); 

        //System.out.println(paulsAccount.getBalance());
        //aBank.Transaction(paulsAccount,georgsAccount,10);
        //System.out.println(paulsAccount.getBalance());
        //System.out.println(georgsAccount.getBalance());

        DAO<Person> personDAO = new PersonDAO();
        Person paul = new Person();
        paul.setName("Pierre Yves August");
        try {
            paul = personDAO.create(paul);
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(paul.getId());
    }
}