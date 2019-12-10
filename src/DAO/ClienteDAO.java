/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cliente
 */
public class ClienteDAO {

    public ClienteDAO(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Inserir_Cliente(Cliente a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public List<Cliente> ListarCliente() throws SQLException {
    String sql = "select idcliente,nome,rg,cpf,telefone,email from cliente";
    List<Cliente> lista = new ArrayList<>();
    try {
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if (rs != null) {
            while (rs.next()) {
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
    } catch (SQLException e) {
      return null;
    }
}


}

    public List<Cliente> Pesquisar_Nome_Cliente(String nome) {
String sql = "select idcliente, nome, RG, CPF, Telefone, Email," 
+ "from cliente where nome Like'" + nome + "%'";
   //PRECISA CONTINUAR
       
    public List<Cliente> Pesquisar_Cod_Cliente(int cod) {
        String sql = "select idcliente, Nome, RG, CPF, Telefone, Email "
+ "from Cliente where idcliente = '" + cod + "'";
        //PRECISA CONTINUAR
}


    public boolean Testar_Cliente(int cod) {
        boolean Resultado = false;
        try {
        
            String sql = "select * from cliente where idcliente = " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sl);
            ResultSet rs = ps.executeQuery();
        
            if (rs != null) {
                while (rs.next()) {
                    Resultado = true;
                }
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return Resultado;
    }