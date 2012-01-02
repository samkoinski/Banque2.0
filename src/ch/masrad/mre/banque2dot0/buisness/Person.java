/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.masrad.mre.banque2dot0.buisness;

/**
 *
 * @author samkoinski
 */
public class Person {
	String name;
	
	public Person(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}

}