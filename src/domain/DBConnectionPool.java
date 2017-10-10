package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DBConnectionPool {
    ArrayList<Connection> list = new ArrayList<Connection>();
    String url;
    String user;
    String password;

    public DBConnectionPool(String driver, String url, String user, String password){
        try{
            Class.forName(driver);
            this.url = url;
            this.user = user;
            this.password = password;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public Connection getConnection(){
        try{
            if(list.size()>0){
                return list.remove(0);
            } else{
                return DriverManager.getConnection(url, user, password);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void returnConnection(Connection con){
        list.add(con);
    }
    public void closeAll(){
        for(Connection con : list){
            try{con.close();}
            catch (Exception e){}
        }
    }
}
