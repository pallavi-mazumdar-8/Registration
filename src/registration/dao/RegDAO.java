/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import registration.dbutil.DBConnection;
import registration.pojo.Registration;

/**
 *
 * @author 91708
 */
public class RegDAO {
   
    public static boolean addRegistration(Registration r)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement("Insert into registration values(?,?,?,?,?)");
        ps.setInt(1,r.getId());
        ps.setString(2,r.getName());
        ps.setString(3,r.getEmail());
        ps.setString(4,r.getDateOfBirth());
        ps.setString(5,r.getPhoneNo());
        
        
        int result= ps.executeUpdate();
        
        
        return result==1;
        
        
        
    } 
       public static List<Registration> getAllRegistration()throws SQLException
    {
         Connection conn=DBConnection.getConnection ();
         Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("Select * from registration order by id");
         ArrayList <Registration> regList=new ArrayList<>();
         while (rs.next()){
            Registration reg=new  Registration();
             reg.setId(rs.getInt(1));
              reg.setName(rs.getString(2));
               reg.setEmail(rs.getString(3)); 
              reg.setDateOfBirth(rs.getString(4));
               reg.setPhoneNo(rs.getString(5)); 
               regList.add(reg); 
             
         }
         return regList;
         
    }
       
    
public static boolean updateRegistration(Registration r) throws SQLException {
  Connection conn=DBConnection.getConnection ();
    PreparedStatement ps=conn.prepareStatement("Update registration set name=?,email=?,date_of_birth=?,phone_no=? where id=?");
    ps.setString(1, r.getName());
    ps.setString(2, r.getEmail());
    ps.setString(3, r.getDateOfBirth());
    ps.setString(4, r.getPhoneNo());
     ps.setInt(5, r.getId());
     

    int x = ps.executeUpdate();
     System.out.println("Number of rows updated: " + x);
    if (x == 0) {
        return false;
    }
    return true;
}

    public static Registration findRegId(String regid) throws SQLException {
        Connection conn=DBConnection.getConnection ();
      PreparedStatement ps= conn.prepareStatement("Select * from registration where id=?");
      ps.setString(1, regid);
      ResultSet rs=ps.executeQuery();
      rs.next();
      Registration r=new  Registration();
      
       
       r = new Registration();
      r.setId(rs.getInt(1));
      r.setName(rs.getString(2));
      r.setEmail(rs.getString(3));
      r.setDateOfBirth(rs.getString(4));
      r.setPhoneNo(rs.getString(5));
       return r;
}

    public static List<String> getRegId() throws SQLException {
      {
     Connection conn=DBConnection.getConnection ();
         Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("Select id from registration order by id");
         ArrayList<String> allId =new ArrayList<String>();
         while(rs.next())
         {
             allId.add(rs.getString(1));
             
         }
         return allId;
    }
}

public static boolean deleteReg(String id)throws SQLException
{
Connection conn=DBConnection.getConnection();

PreparedStatement ps=conn.prepareStatement ("delete from registration where id=?");
ps.setString(1, id);

int x=ps.executeUpdate();

return x==1;


}


}