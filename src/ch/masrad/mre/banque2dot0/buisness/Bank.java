/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.masrad.mre.banque2dot0.buisness;

import java.util.ArrayList;

/**
 *
 * @author samkoinski
 */
public class Bank {
    private ArrayList<Person> listPerson = new ArrayList<Person>();

    public Bank(){}

    public Bank(ArrayList<Person> l) {
        this.listPerson = l;
    }
 
     public void addPerson(Person p){
      this.listPerson.add(p);
     }

     public Person getPerson(int indice){
      return this.listPerson.get(indice);
    }
     
    public void Transaction (Account f, Account t, Integer i) {
            f.debit(i);
            t.credit(i);
    }
}
