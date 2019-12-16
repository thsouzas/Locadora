package DAO;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CategoriaDAO extends ExecuteSQL{
    
    public CategoriaDAO(Connection con) {
        super(con);
    }
    
    public String Inserir_Categoria(Categoria b){
        
        String sql = "INSERT INTO categoria VALUES (0,?)";
        
        try{
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1,b.getNome());
        
            if(ps.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao Inserir";
            }
            
        }catch(Exception e){
            return e.getMessage();
        }
    }
    
    public List<Categoria> ListarCategoria(){
        String sql = "SELECT idcategoria,nome FROM categoria";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
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
    
    public List<Categoria> Pesquisar_Nome_Categoria(String nome){
        String sql = "SELECT idcategoria, nome FROM categoria WHERE nome LIKE  '"+nome+"%'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
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
    
    public List<Categoria> Pesquisar_Cod_Categoria(int cod){
        String sql = "SELECT idcategoria, nome FROM categoria WHERE idcategoria = '"+cod+"'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    
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
    
    public List<Categoria> ListarComboCategoria(){
        String sql = "SELECT nome FROM categoria order by nome";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setNome(rs.getString(1));
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
    
    public List<Categoria> ConsultaCodigoCategoria(String nome){
        String sql = "SELECT idcategoria FROM categoria where nome = '"+nome+"'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
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
    
    public String Excluir_Categoria(Categoria a ){
        
        String sql = "DELETE FROM categoria WHERE idcategoria = ? and nome = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getNome());
            if(ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            }else{
                return "Erro ao Excluir";
            }
        }catch(Exception ex){
                return ex.getMessage();
        }
    }
    
    public boolean Testar_Categoria(int cod){
    boolean Resultado = false;
   
    try{
        String sql  = "SELECT * FROM categoria WHERE idcategoria = "+cod;
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet  rs = ps.executeQuery();

        if( rs!= null){
            while(rs.next()){
            Resultado = true;
            }
        }
    }catch(SQLException ex){
        ex.getMessage();
    }
        return Resultado;
    }

    public List<Categoria> CapturarCategoria(int cod){
        String sql = "SELECT *  FROM categoria WHERE idcategoria = "+cod;
        List<Categoria> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if( rs!= null){
                while(rs.next()){
                Categoria a = new Categoria();
                a.setCodigo(rs.getInt(1));
                a.setNome(rs.getString(2));
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
    
    public String Alterar_Categoria(Categoria a){
        
        String sql = "UPDATE categoria SET nome = ? WHERE idcategoria = ? ";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setInt(2, a.getCodigo());

            if(ps.executeUpdate() > 0){
                return "Atualizado com sucesso";
            }else{
                return "Erro ao Atualizar";
            }
            
        }catch(SQLException e){
            return e.getMessage();
        }
    }
}
