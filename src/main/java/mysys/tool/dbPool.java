package mysys.tool;

import java.sql.*;

public class dbPool {

    private Connection conn  = null;
    private String url="";

    public dbPool(String url) {
        this.url = url;
    }


    public boolean connect() {
        boolean isConnected = false;

        try {

            if (this.conn == null) {
                this.conn = DriverManager.getConnection(this.url);

                System.out.println(String.format("Connect [%s] is made.", this.url));
                isConnected = true;
            } else {
                isConnected = true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            return isConnected;
        }
    }

    public ResultSet getTxn() {

        int intCount = 0;
        String sql = "select * from txn;";

        try {

            Statement stmt = this.conn.createStatement();
            final ResultSet rs = stmt.executeQuery(sql);

            return rs;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
