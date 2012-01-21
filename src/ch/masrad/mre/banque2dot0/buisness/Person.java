package ch.masrad.mre.banque2dot0.buisness;
import java.util.ArrayList;


public class Person {
private long id = 0;
private String name;

// the authentication status
private boolean succeeded = false;
private boolean commitSucceeded = false;

// username and password
private String username;
private char[] password;
        
 public Person(){}	
    public Person(long i, String n){
        id = i;
        name = n;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String toString(){
            String str =	"*******************************\n";
            str += 			"ID : " + this.getId() + "\n";
            str += 			"NOM : " + this.getName() + "\n";
            str +=			"*******************************\n";


            return str;
    }
}