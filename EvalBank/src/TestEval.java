
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/EvalBank"; 
		String login = "root";
		String password = "root";
		
		try {
			Class.forName(driver); 
			Connection connection = DriverManager.getConnection(url, login, password); 
			System.out.println("connexion");
			Statement statement = connection.createStatement();
			
			statement.executeQuery("DROP DATABASE IF EXISTS EvalBank;");
			//statement.executeQuery("CREATE DATABASE EvalBank ;");
			//statement.executeQuery("use EvalBank;");
			//String selc = "select * from T_Comptes inner join T_Customers on T_Counts.IdCust = T_Customers.IdCust where T_Counts.IdCust=1;";
		
			
			String str = "CREATE TABLE T_Customres (" + 
					"	IdCust					int(4)		PRIMARY KEY AUTO_INCREMENT," + 
					"	Name						varchar(20)	NOT NULL," + 
					"	FirstName					varchar(20)	NOT NULL" + 
					") ENGINE = InnoDB;";			
			statement.executeQuery(str);
			
			
			String cnt = "CREATE TABLE T_Counts (" + 
					"NumCt			int(20)		PRIMARY KEY AUTO_INCREMENT," + 
					"	DateCreation		date(20)	NOT NULL," + 
					"	Balance			float(20)	NOT NULL," + 
					"        IdCust                          int(4)          NOT NULL," + 
					"	ConnectionNumber		int(4)		NOT NULL DEFAULT 0" + 
					") ENGINE = InnoDB;";			
			statement.executeQuery(cnt);
			
			//String str = "INSERT INTO T_Customers (IdCust, Name,FirstName) VALUES (1 'sylla' ,'djenabou' );";			
			//statement.executeQuery(str);
			
			//String str = "update T_Customres set Name='keita' where IdCust=1;";			
			//statement.executeQuery(str);
			
			//String str = "delete from T_Customers where IdCust=1;";	
			//statement.executeQuery(str);
			
			//String str = "select * from T_Customres;"; 
			  //ResultSet resultSet = statement.executeQuery(str);
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("no connected");

		}	
	}
}
