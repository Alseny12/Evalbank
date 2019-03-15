package co.simplon.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CustomerDao {
	
	
	

	public class Customer extends Dao<Customer> {


		public Customer find(int id) {	
			// Renvoi un objet Client si on trouve dans la table 							
			//T_Customer une occurrence à partir de l’identifiant d'un client, null sinon 						
		}

	
		public boolean create(Customer obj) {
			// Crée une occurrence dans la table T_Customer
			// Renvoi vrai si c’est bon, faux sinon
		}

		public boolean update(Customer obj) {
			// Met à jour une occurrence de la table T_Customer
			 //Renvoi vrai si c’est bon, faux sinon 		
		}


		public boolean delete(Customer obj) { 
			// Supprime une occurrence de la table T_Customer
			// Renvoi vrai si c’est bon, faux sinon 		
		}
	}



	}


