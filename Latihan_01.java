

package com.mycompany.latihan_01;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
/**
 *@author zulfahmi, M.Kom
 * @author PC 1
 * 
 */
public class latihan1 {
    static final String DB_Url= "jdbc : mysql ://localhost : 3306/db_prak01";
    private static Connection Test_Konek;
    public static Connection DB_Konek() throws SQLException, ClassNotFoundException {
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println("Proses Deteksi Driver Berhasil");
            
            final java.sql.Connection tersambung = DriverManager.getConnection(DB_Url, "root", "");
            System.out.println("Koneksi Database Berhasil");
        }  catch (final SQLException ex){
            System.out.println("Koneksi Database Gagal");
        }
    return Test_Konek; 
    }
        /**
         * @param args the command line arguments
         */
         public static void main(String[] args) {
             // TODO code application logic here
         }
    
}

/**
 *
 * @author Administrator
 */
public class Latihan_01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
