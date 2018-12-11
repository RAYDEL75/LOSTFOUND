/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosperdidos;

import java.sql.*;
import javax.swing.*;

public class conectar {
    Connection conect = null;//declaramos variable de conexion
	public Connection conexion()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conect = DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");//nombre de la bd y usuario
				JOptionPane.showMessageDialog(null,"Conectado");//mensaje de conexion
				
			} catch (ClassNotFoundException | SQLException e) {
				JOptionPane.showMessageDialog(null,"Error de conexion"+e);//tipo de error
			}
			return conect;
		}
    
}