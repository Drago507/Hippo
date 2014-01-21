package ir.maralani.hippo.db;

import ir.maralani.hippo.model.Record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHandler {
	Connection connection;
	Statement statement;
	
	private static String connectionSyntax;
	public static String tableName;
	
	public void setConnectionSyntax(String hostName, String portId, String schema, String userName, String password){
		connectionSyntax = "jdbc:oracle:thin:@" + hostName + ":" + portId + ":" + schema + "," + userName + "," + password;
		
	}
	
	public void connectToDb() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		statement = DriverManager.getConnection(connectionSyntax).createStatement();
	}
	private void closeConnection() throws Exception {
		statement.close();
		connection.close();
	}
	public void save(Record r) throws Exception {
		connectToDb();
		String fields = "";
		for (int i =0;i<10;i++){
			fields = fields + " '" + r.getField(i) + "', " ;
		}
		fields.substring(1, fields.lastIndexOf(','));
		String str = "insert into " + tableName + " values (" + fields + ")";
		statement.executeUpdate(str);
		
		closeConnection();
	}
	
	//TODO : add connection checking method.
}
