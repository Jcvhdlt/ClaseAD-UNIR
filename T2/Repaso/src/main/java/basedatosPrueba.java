import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class basedatosPrueba {

    public static void main(String[] args) {

        try {

            //1. para crear la conexion
                Connection miConexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/concesionario","root","");

            // 2. crear objeto statement para ejecutar consultas SQL
                Statement miStatement =miConexion.createStatement();

            //3. ejecutar inctruccion SQL
                ResultSet miResultset = miStatement.executeQuery("SELECT * FROM EMPLEADOS");

            //4 . recorrer el resultset
                while (miResultset.next()){
                    System.out.println(miResultset.getString("nombre")+ "" + miResultset.getString("telefono"));

                }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }


    }
}
