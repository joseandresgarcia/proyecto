
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class   conectar {
    Connection   conectar=null;//propiedad que tiene java que me va permitir conectarme a la base de datos 
    public  Connection conexion(){  //metodo
        try {
            Class.forName("com.mysql.jdbc.Driver");//permite que java pueda tener una relacion con mysql
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/clinica","root","root");
                                                   //se refiere a que maquina esta//
        } catch ( SQLException e) {
            System.out.println("no es posible conectar a la base de datos ");
            System.out.print(e.getMessage());
        }
         catch (ClassNotFoundException e) {
            System.out.println("error  con la libreria  ");
            System.out.print(e.getMessage());
        }
        
        
        
        
        
        
        return conectar;
    }
    
}
