package example;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;







import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context; 








public class Hello implements RequestHandler <RequestDetails, ResponseDetails>
{
public ResponseDetails handleRequest(RequestDetails requestDetails, Context arg1) {
		
		// TODO Auto-generated method stub
		ResponseDetails responseDetails = new ResponseDetails();
		
				try {
					
					insertDetails(requestDetails, responseDetails);
				} catch (SQLException sqlException) {
					responseDetails.setMessageID("999");
					responseDetails.setMessageReason("Unable to Registor "+sqlException);
				}
				return responseDetails;
	}

	private void insertDetails(RequestDetails requestDetails, ResponseDetails responseDetails) throws SQLException {
		//Class.forName("com.mysql.jdbc.Driver"); 
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String query = getquery(requestDetails);
		int responseCode = statement.executeUpdate(query);
		if(1 == responseCode)
		{
			responseDetails.setMessageID(String.valueOf(responseCode));
			responseDetails.setMessageReason("Successfully updated details");
		}
		
	}

	private String getquery(RequestDetails requestDetails) {
		
		String query = "INSERT INTO letsconnect.user(name) VALUES (";
		if (requestDetails != null) {
			query = query.concat("'" + requestDetails.getName());
		}
		System.out.println("the query is "+query);
		return query;
	}

	private Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
				String url = "jdbc:mysql://myletsconnectinstance.ch3qigkbnf3s.us-east-1.rds.amazonaws.com:3306";
				String username = "shruti";
				String password = "Aragog11";
				Connection conn = DriverManager.getConnection(url, username, password);
				return conn;
	}

	
	
	

}
