
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "student";
		String password = "student";

		// Step 1* register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect success!");

		// Step 3: Create a statement object
		String sql = "SELECT id, username, email FROM 	`User`";
		Statement statement = connection.createStatement();

		// Step 4: execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// Step 5: handling result set
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("username"));
			System.out.println(resultSet.getString("email"));

		}

		// Step 3: Create a statement object
		String sql1 = "	INSERT INTO `Group` (`name` ,		`author_ID`)"
				+ "	VALUE				('Java Senior5',		4)";

		// Step 4: execute query
		int effectedRecordAmount = statement.executeUpdate(sql1);

		// Step 5: handling result set
		System.out.println("Effected Record Amount: " + effectedRecordAmount);

		// Step 3: Create a statement object
		String sql2 = "	INSERT INTO `Group` (`name` ,	`author_ID`	)"
				+ "	VALUE				(	? 	,		?		)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql2);

		// input scanner
		String groupName = "java test2";
		int authorId = 5;

		preparedStatement.setString(1, groupName);
		preparedStatement.setInt(2, authorId);

		// Step 4: execute query
		int effectedRecordAmount1 = preparedStatement.executeUpdate();

		// Step 5: handling result set
		System.out.println("Effected Record Amount: " + effectedRecordAmount1);

	}
}
