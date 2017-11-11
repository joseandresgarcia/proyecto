
package proyecto;

import control.*;
import java.sql.Connection;
import java.sql.DriverManager;

public  class   conectar {
    Connection   conectar=null;//propiedad que tiene java que me va permitir conectarme a la base de datos 
    public  Connection conexion(){  //metodo
        try {
            Class.forName("com.mysql.jdbc.Driver");//permite que java puedad tener una relacion con mysql
            conectar=DriverManager.getConnection("jdbc:mysql://pc:3306/hospital","jose","grupo1");
                                             //se refiere a que maquina esta//
        } catch (Exception e) {
            System.out.println("no es posible conectar a la base de datos ");
            System.out.print(e.getMessage());
        }
        
        return conectar;
    }
    
}
