package ch.masrad.mre.banque2dot0.buisness;

public class Account {
    
        private int _id;
	private Person _owner;
	private int _balance = 0;
        
        public Account (int id, int balance, int owner_id) {
            _id = id;
            _balance = balance;
            
            DAO<Person> personDAO = new PersonDAO();
            _owner = new Person();
            _owner = personDAO.find(owner_id);
        }
        
	public Account (Person p) {
		_owner = p;
	}
        
        public Account () {

        }
	
	public void credit(int i){
		_balance += i;
	}
        
	public void debit(int i){
		_balance -= i;
	}
        
        public int getId (){
		return _id;
	}
        
        public Person getOwner (){
		return _owner;
	}
        
	public int getBalance(){
                return _balance;
	}
        
        public void setOwner (Person new_owner){
		_owner = new_owner;
	}
        
}