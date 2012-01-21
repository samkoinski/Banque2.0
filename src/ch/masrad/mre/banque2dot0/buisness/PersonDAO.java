package ch.masrad.mre.banque2dot0.buisness;

import ch.masrad.mre.banque2dot0.buisness.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ch.masrad.mre.banque2dot0.buisness.Person;

public class PersonDAO extends DAO<Person> {

    @Override
    public Person create(Person obj) throws SQLException {
        try {

            PreparedStatement prepare = this.connect.prepareStatement(
                    "INSERT INTO person (prs_name) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
            prepare.setString(1, obj.getName());

            prepare.executeUpdate();
            ResultSet keys = prepare.getGeneratedKeys();
            if (keys.next()) {
                obj = this.find(keys.getLong(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Person find(long id) throws SQLException {
        Person prs = new Person();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                    "SELECT * FROM person WHERE prs_id = " + id);
            if (result.first()) {
                prs = new Person(
                        id,
                        result.getString("prs_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prs;

    }

    @Override
    public Person update(Person obj) throws SQLException {
        try {

            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeUpdate(
                    "UPDATE person SET prs_name = '" + obj.getName() + "'"
                    + " WHERE prs_id = " + obj.getId());

            obj = this.find(obj.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public void delete(Person obj) throws SQLException {
        try {

            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeUpdate(
                    "DELETE FROM person WHERE prs_id = " + obj.getId());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
