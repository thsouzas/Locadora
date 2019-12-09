/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

 import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author F. Bruno Santana
 */
public class Listar extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     * @return 
     * @throws java.sql.SQLException
     */
    public List<Cliente> ListarCliente() throws SQLException {
        String sql = "select idcliente,nome,rg,cpf,telefone,email from cliente";
        List<Cliente> lista = new ArrayList<>();
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs != null){
            while (rs.next()){
                Cliente a = new Cliente();
                a.setCodigo(rs.getInt(1));
                a.setNome(rs.getString(2));
                a.setRG(rs.getString(3));
                a.setCPF(rs.getString(4));
                a.setTelefone(rs.getString(5));
                a.setEmail(rs.getString(6));
                
                lista.add(a);
                
            }
            return lista;
        } else {
            return null;
        }
    }}