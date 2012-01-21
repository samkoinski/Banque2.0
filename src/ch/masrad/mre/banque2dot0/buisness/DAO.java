package ch.masrad.mre.banque2dot0.buisness;

import ch.masrad.mre.banque2dot0.buisness.ConnectMysql;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAO<T> {
 
  public Connection connect = ConnectMysql.getInstance();
 
 /* Permet de récupérer un objet via son ID */
 public abstract T find(long id) throws SQLException;
 
 /* Permet de créer une entrée dans la base de données par rapport à un objet */
 public abstract T create(T obj) throws SQLException;
 
 /* Permet de mettre à jour les données d'une entrée dans la base */
 public abstract T update(T obj) throws SQLException;
 
 /* Permet la suppression d'une entrée de la base*/
 public abstract void delete (T obj) throws SQLException;
}
