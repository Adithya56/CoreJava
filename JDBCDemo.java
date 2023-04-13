import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://192.168.110.48:5432/plf_training?user=plf_training_admin&password=pff123");
			CallableStatement cs = con.prepareCall("CALL UpdateAcc(?)");
			cs.setInt(1, 1006);
			cs.execute();
			// Statement ps = con.createStatement();
			// ResultSet rs = ps.executeQuery("select * from adi_acc");
			// Statement ps = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// rs.moveToInsertRow();
			// rs.updateInt(1, 1004);
			// rs.updateString(2, "Shyam");
			// rs.updateDate(3, java.sql.Date.valueOf("2011-08-21"));
			// rs.updateDouble(4, 9800.0);
			// rs.updateRow();
			// rs.insertRow();
			// while (rs.next()) {
			// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDate(3) + " " + rs.getDouble(4));
			// }
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
