package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface DBDeletable {
	default public void deleteById(int id) {
		Connection connection = DBConnectable.connect();
		String sql = "DELETE FROM word WHERE id=?";
		try {
			PreparedStatement query = connection.prepareStatement(sql);
			query.setInt(1, id);
			int result = query.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnectable.disconnect(connection);
	}
}
