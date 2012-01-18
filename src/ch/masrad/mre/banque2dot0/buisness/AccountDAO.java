package ch.masrad.mre.banque2dot0.buisness;

import ch.masrad.mre.banque2dot0.buisness.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ch.masrad.mre.banque2dot0.buisness.Account;

public class AccountDAO extends DAO<Account> {
    
    @Override
    public Account create(Account obj) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO account (acnt_balance, acnt_owner_id) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);

            prepare.setInt(1, 0);
            
            if (obj.getOwner() != null) {
                prepare.setInt(2, (int)obj.getOwner().getId());
            }else {
                prepare.setInt(2, 0);
            }
            
            prepare.execute();
            
            ResultSet keys = prepare.getGeneratedKeys();
            
            if(keys.next()) {
                obj = this.find(keys.getLong(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return obj;
    }
    
    @Override
    public Account find(long acnt_id) {
        Account acnt = new Account();
        
        try {
            ResultSet result = this.connect.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_UPDATABLE
            ).executeQuery("SELECT * FROM account WHERE acnt_id = " + (int)acnt_id);
            
            if(result.first()) {
                acnt = new Account((int)acnt_id, result.getInt("acnt_balance"), result.getInt("acnt_owner_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return acnt;
    }

    @Override
    public Account update(Account obj) {
        try {
            this.connect.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("UPDATE account SET acnt_balance = '" + obj.getBalance() + "', acnt_owner_id = '" + obj.getOwner().getId() + "'" + " WHERE acnt_id = " + obj.getId());
   
            obj = this.find(obj.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return obj;
    }
    
    @Override
    public void delete(Account obj) {
        try {
            this.connect.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM account WHERE acnt_id = " + obj.getId());
        } catch (SQLException e) {
             e.printStackTrace();
        }
    }

}