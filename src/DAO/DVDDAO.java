
package DAO;
import Modelo.DVD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DVDDAO extends ExecuteSQL{

    public DVDDAO(Connection con) {
        super(con);
    }
    
    public String Inserir_DVD(DVD d){
        
        String sql = "INSERT INTO dvd VALUES (0,?,?,?,?)";
        
        try{
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setInt(1,d.getCod_filme());
            ps.setDouble(2,d.getPreco());
            ps.setString(3,d.getData_compra());
            ps.setString(4,d.getSituacao());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao Inserir";
            }
            
        }catch(Exception e){
            return e.getMessage();
        }
    }
    
    
     public List<DVD> ListarDVD(){
        String sql = "SELECT iddvd,idfilme,preco_compra,data_compra,situacao FROM dvd";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setPreco(rs.getDouble(3));
                    a.setData_Compra(rs.getString(4));
                    a.setSituacao(rs.getString(5));
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
    
    public List<DVD> Pesquisar_Cod_DVD(int iddvd){
        String sql = "SELECT iddvd, idfilme, preco_compra,data_compra,situacao FROM dvd WHERE iddvd LIKE  '"+iddvd+"'";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setPreco(rs.getDouble(3));
                    a.setData_Compra(rs.getString(4));
                    a.setSituacao(rs.getString(5));
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
    
    public List<DVD> Pesquisar_Cod_Filme(int idfilme){
        String sql = "SELECT iddvd, idfilme, preco_compra,data_compra,situacao FROM dvd WHERE idfilme LIKE  '"+idfilme+"'";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setPreco(rs.getDouble(3));
                    a.setData_Compra(rs.getString(4));
                    a.setSituacao(rs.getString(5));
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
    
    public List<DVD> Pesquisar_Cod_DVDFilme(int codfilme){
        String sql = "SELECT iddvd, idfilme, preco_compra,data_compra,situacao FROM dvd WHERE idfilme = '"+codfilme+"'";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setPreco(rs.getDouble(3));
                    a.setData_Compra(rs.getString(4));
                    a.setSituacao(rs.getString(5));
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
     public List<DVD> CapturarDVD (int cod){
        String sql = "SELECT * FROM dvd WHERE iddvd = "+cod+"";
        List<DVD> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD f = new DVD();
                    
                    f.setCodigo(rs.getInt(1));
                    f.setCod_filme(rs.getInt(2));
                    f.setPreco(rs.getInt(3));
                    f.setData_Compra(rs.getString(4));
                    f.setSituacao(rs.getString(5));
                    lista.add(f);
                }
                return lista;
            }else{
                return null;
            }
        }catch(SQLException e){
            return  null;
        }
    }
    public boolean Testar_DVD(int cod){
    boolean Resultado = false;
   
    try{
        String sql  = "SELECT * FROM dvd WHERE iddvd = "+cod+"";
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
    
   public String Alterar_DVD(DVD a){
        
        String sql = "UPDATE dvd SET idfilme = ?, preco_compra = ?, data_compra = ?, situacao = ? WHERE iddvd = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);

           
            ps.setInt(1, a.getCod_filme());
            ps.setDouble(2,a.getPreco());
            ps.setString(3, a.getData_compra());
            ps.setString(4, a.getSituacao());
            ps.setInt(5, a.getCodigo());

            if(ps.executeUpdate() > 0){
                return "Atualizado com sucesso";
            }else{
                return "Erro ao Atualizar";
            }
            
        }catch(SQLException e){
            return e.getMessage();
        }
    }
   public List<DVD> ListarComboDVD(){
        String sql = "SELECT data_compra FROM dvd order by data_compra";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setData_Compra(rs.getString(1));
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
    
    public List<DVD> ConsultaCodigoDVD(String data){
        String sql = "SELECT iddvd FROM dvd where data_compra = '"+data+"'";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
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
    
    public String Excluir_DVD(DVD a ){
        
        String sql = "DELETE FROM dvd WHERE iddvd = ? and data_compra = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getData_compra());
            if(ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            }else{
                return "Erro ao Excluir";
            }
        }catch(Exception ex){
                return ex.getMessage();
        }
    }
    
   public boolean Testar_Situacao(int cod){
    boolean Resultado = false;
   
    try{
        String sql  = "SELECT iddvd FROM dvd WHERE iddvd = "+cod+" and situacao = 'Disponivel'";
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
}
