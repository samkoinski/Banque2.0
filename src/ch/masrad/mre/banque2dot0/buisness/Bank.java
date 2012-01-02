/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.masrad.mre.banque2dot0.buisness;

/**
 *
 * @author samkoinski
 */
public class Bank {
	
	public void Transaction (Account f, Account t, Integer i) {
		f.debit(i);
		t.credit(i);
	}
}
