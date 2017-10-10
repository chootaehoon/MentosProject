package domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentDAO {
    private DBConnectionPool connPool;
    private static final String ALLRETRIEVE_STMT = "SELECT * FROM shoppingpayment";
    private static final String RETRIEVE_STMT = "SELECT * FROM shoppingpayment WHERE UserID = ?";
    private static final String GETID_STMT = "SELECT COUNT(PaymentID) FROM shoppingpayment";
    private static final String ADD_STMT = "INSERT INTO shoppingpayment VALUES(?,?,?,?,?,?,?,?)";

    ArrayList<Payment> allpaymentRetrieve() throws SQLException{
        ArrayList<Payment> payments = new ArrayList<Payment>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try{
            conn = connPool.getPoolConnection
        }
    }
}
