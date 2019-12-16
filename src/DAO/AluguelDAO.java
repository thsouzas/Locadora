package DAO;

import Modelo.Aluguel;
import Modelo.Categoria;
import Modelo.DVD;
import Modelo.Listar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AluguelDAO extends ExecuteSQL{
    
    public AluguelDAO(Connection con) {
        super(con);
    }
    
   public String Inserir_Aluguel(Aluguel a) {
        String sql = "insert into aluguel values(0,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, a.getCoddvd());
            ps.setInt(2, a.getCodcliente());
            ps.setString(3, a.getHorario());
            ps.setString(4, a.getData_aluga());
            ps.setString(5, a.getData_devolucao());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }

    }
   
   
   public String Atualizar_Situacao(String s, int cod){
        
      String sql = "update dvd set situacao = '" + s + "' where iddvd = " + cod + " ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso.";
            } else {
                return "Erro ao Atualizar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
       
       
   }
   
   public String Excluir_Aluguel(int cod){
        
        String sql = "DELETE FROM aluguel WHERE idaluguel = "+cod;
        
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        if(ps.executeUpdate() > 0){
            return "Excluído com sucesso";
        }else{
            return "Erro ao  excluir";
        }   
    }catch (SQLException e){
        return e.getMessage();
    }
    
   }
   
   public List<Aluguel> ListarAluguel(){
        String sql = "SELECT * FROM aluguel";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCod(rs.getInt(1));
                    a.setCoddvd(rs.getInt(2));
                    a.setCodcliente(rs.getInt(3));
                    a.setHorario(rs.getString(4));
                    a.setData_aluga(rs.getString(5));
                    a.setData_devolucao(rs.getString(6));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(Exception ex){
            return null;
        }
    }
   
    public List<Aluguel> Pesquisar_Por_ID(int nome){
        String sql = "SELECT * FROM aluguel WHERE idaluguel LIKE '"+nome+"'";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCod(rs.getInt(1));
                    a.setCoddvd(rs.getInt(2));
                    a.setCodcliente(rs.getInt(3));
                    a.setHorario(rs.getString(4));
                    a.setData_aluga(rs.getString(5));
                    a.setData_devolucao(rs.getString(6));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(Exception ex){
            return null;
        }
    }
    public List<Aluguel> Pesquisar_Por_IDDVD(int nome){
        String sql = "SELECT * FROM aluguel WHERE iddvd LIKE '"+nome+"'";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCod(rs.getInt(1));
                    a.setCoddvd(rs.getInt(2));
                    a.setCodcliente(rs.getInt(3));
                    a.setHorario(rs.getString(4));
                    a.setData_aluga(rs.getString(5));
                    a.setData_devolucao(rs.getString(6));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(Exception ex){
            return null;
        }
    }
    public List<Aluguel> Pesquisar_Por_IdCliente(int nome){
        String sql = "SELECT * FROM aluguel WHERE idcliente LIKE '"+nome+"'";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCod(rs.getInt(1));
                    a.setCoddvd(rs.getInt(2));
                    a.setCodcliente(rs.getInt(3));
                    a.setHorario(rs.getString(4));
                    a.setData_aluga(rs.getString(5));
                    a.setData_devolucao(rs.getString(6));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(Exception ex){
            return null;
        }
    }
    public List<Aluguel> CapturarAluguel(int cod){
        String sql = "SELECT *  FROM aluguel WHERE idaluguel = "+cod;
        List<Aluguel> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if( rs!= null){
                while(rs.next()){
                Aluguel a = new Aluguel();
                a.setData_aluga(rs.getString(5));
                a.setData_devolucao(rs.getString(6));
                a.setHorario(rs.getString(4));
                lista.add(a);
                }
            return lista;

            }else{
                 return null;
             }
        }catch( SQLException ex ){
            return null;
        }

    }
}
