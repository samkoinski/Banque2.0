package ch.masrad.mre.banque2dot0.buisness;

import ch.masrad.mre.banque2dot0.buisness.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ch.masrad.mre.banque2dot0.buisness.Person;

public class PersonDAO extends DAO<Person> {
 @Override
 public Person create(Person obj) {
  try {
    
       PreparedStatement prepare = this .connect
                                                    .prepareStatement(                                                  
  "INSERT INTO Person (prs_name) VALUES(?)"
                                                    );
 //   prepare.setLong(1, null);
    prepare.setString(1, obj.getName());
    
    prepare.executeUpdate();
    obj = this.find(obj.getId()); 
    
   
     } catch (SQLException e) {
             e.printStackTrace();
     }
     return obj;
 }
 @Override
 public Person find(long id) {
 Person prs = new Person();
  try {
            ResultSet result = this .connect
                                    .createStatement(
                                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                ResultSet.CONCUR_UPDATABLE
                                             ).executeQuery(
                                                "SELECT * FROM person WHERE prs_id = " + id
                                             );
            if(result.first())
              prs = new Person(
                                        id, 
                                        result.getString("prs_name") 
                                    );
            
      } catch (SQLException e) {
              e.printStackTrace();
      }
     return prs;
 
    }
 @Override
 public Person update(Person obj) {
  try {
   
                this .connect 
                     .createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                     ).executeUpdate(
                     "UPDATE langage SET prs_name = '" + obj.getName() + "'"+
                     " WHERE prs_id = " + obj.getId()
                     );
   
   obj = this.find(obj.getId());
     } catch (SQLException e) {
             e.printStackTrace();
     }
     
     return obj;
 }
 @Override
 public void delete(Person obj) {
     try {

                    this    .connect
                         .createStatement(
                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
                             ResultSet.CONCUR_UPDATABLE
                        ).executeUpdate(
                             "DELETE FROM langage WHERE prs_id = " + obj.getId()
                        );
   
     } catch (SQLException e) {
             e.printStackTrace();
     }
 }
 
}
