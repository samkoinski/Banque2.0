/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.masrad.mre.banque2dot0.buisness;

/**
 *
 * @author samkoinski
 */
public class Account {
	private Person owner;
	private Integer balance = 0;
	
	public Account (Person p) {
		owner = p;
	}
	
	public Person getOwner (){
		return owner;
	}
	
	public void credit(Integer i){
		balance -= i;
	}
	public void debit(Integer i){
		balance += i;
	}
	public Integer getBalance(){
		return balance;
	}
}