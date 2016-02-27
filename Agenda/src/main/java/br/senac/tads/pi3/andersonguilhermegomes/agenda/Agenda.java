/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.andersonguilhermegomes.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anderson.mleal
 */
public class Agenda {

    private Connection obterConexao() throws SQLException, ClassNotFoundException {
        Connection conn = null;

        //passo1: registrar driver JDBC
        Class.forName("org.apache.derby.jdbc.ClientDataSource");

        //passo 2: Abrir conexão
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/agendabd;SecurityMechanism=3",
        "app", // usuario
    "app"); // senha
    
    return conn;
    }

}
