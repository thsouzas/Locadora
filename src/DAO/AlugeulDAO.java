/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Aluguel;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author cliente
 */
public class AlugeulDAO extends ExecuteSQL{
    
    public AlugeulDAO(Connection con) {
        super(con);
    }

    public List<Aluguel> ListarAlugeul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Aluguel> Pesquisar_Alugeul_Cod(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Aluguel> Pesquisar_Alugeul_DVD(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Aluguel> Pesquisar_Alugeul_Cliente(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
