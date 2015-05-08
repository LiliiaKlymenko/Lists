package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class JDBCRunner {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        cn = Connector.getConnection();

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM phonebook");

        List<Abonent> abonents = new ArrayList<Abonent>();

        while(rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            int phone=rs.getInt(3);
            abonents.add(new Abonent(id,phone,name));
        }
        if(abonents.size()>0){
            System.out.println(abonents);
        }else {
            System.out.println("Not found");
        }
        st.close();
        cn.close();

    }
}
