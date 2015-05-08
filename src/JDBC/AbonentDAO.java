package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class AbonentDAO extends AbstractDAO<Integer, Abonent> {
    public static final String SQL_SELECT_ALL_ABONENTS="SELECT  `data` ,  `temperature` ,  `precipitation` FROM  `weather` JOIN  `region` ON  `region`.`id_region` =  `weather`.`id_region` WHERE ( `region`.`name` =  \"?\")";
    public static final String SQL_SELECT_ABONENTS_BY_LASTNAME=
            "SELECT ID, Phone FROM phonebook WHERE LastName=Nina";
    @Override
    public List<Abonent> findAll() {
        List<Abonent>  abonents= new ArrayList<>();
        Connection cn=null;
        Statement st=null;
        try {
            cn=Connector.getConnection();
            st=cn.createStatement();
            ResultSet rs= st.executeQuery(SQL_SELECT_ALL_ABONENTS);
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int phone=rs.getInt(3);
                abonents.add(new Abonent(id,phone,name));
            }

        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed): " + e);
        }

        return null;
    }

    @Override
    public Abonent findEntityById(Integer Id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Integer Id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Abonent update(Abonent entity) {
        return null;
    }
    public Abonent findAbonentByLastName(String name){
        Abonent abonent =new Abonent();
        Connection cn=null;
        PreparedStatement st=null;
        try {
            cn=Connector.getConnection();
            st=cn.prepareStatement(SQL_SELECT_ABONENTS_BY_LASTNAME);
            st.setString(1, name);
            ResultSet resultSet = st.executeQuery();
            resultSet.next();
            abonent.setId(resultSet.getInt("idphonebook"));
            abonent.setPhone(resultSet.getInt("phone"));
            abonent.setLastname(name);;
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed):"+e);
        }

        return abonent;

    }

}
