package DAO;

import Modelo.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO extends ExecuteSQL{

    public FilmeDAO(Connection con) {
        super(con);
    }
    
    
    public String Inserir_Filme(Filme f){
        
        String sql = "INSERT INTO filme VALUES (0,?,?,?,?,?,?)";
        
        try{
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            
            ps.setString(1,f.getTitulo());
            ps.setInt(2,f.getAno());
            ps.setString(3,f.getDuracao());
            ps.setInt(4,f.getCod_categoria());
            ps.setInt(5,f.getCod_classificacao());
            ps.setString(6,f.getCapa());
        
            if(ps.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao Inserir";
            }
            
        }catch(Exception e){
            return e.getMessage();
        }
    }
     
    public List<Filme>ListarFilme(){

        String sql = "SELECT idfilme,titulo,ano,duracao,idcategoria,idclassificacao FROM filme";
        List<Filme> lista = new ArrayList<>();

        try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs =  ps.executeQuery();

        if(rs != null){
            while(rs.next()){
                Filme a = new Filme();
                a.setCodigo(rs.getInt(1));
                a.setTitulo(rs.getString(2));
                a.setAno(rs.getInt(3));
                a.setDuracao(rs.getString(4));
                a.setCod_categoria(rs.getInt(5));
                a.setCod_classificacao(rs.getInt(6));
                lista.add(a);
                }
            return lista;
        }else{
            return null;
        }

        }catch(SQLException e){
            return null;
        }

    }
   
    public List<Filme> Pesquisar_Nome_Filme(String nome){
    String sql = "SELECT idfilme,titulo,ano,duracao,idcategoria,idclassificacao FROM filme WHERE titulo LIKE '"+nome+"%'";
    List<Filme> lista = new ArrayList<>();
    
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    ResultSet rs =  ps.executeQuery();
    
        if(rs != null){
            while(rs.next()){
                Filme a = new Filme();
                a.setCodigo(rs.getInt(1));
                a.setTitulo(rs.getString(2));
                a.setAno(rs.getInt(3));
                a.setDuracao(rs.getString(4));
                a.setCod_categoria(rs.getInt(5));
                a.setCod_classificacao(rs.getInt(6));
                lista.add(a);
                }
            return lista;
        }else{
            return null;
        }
    
    }catch( SQLException e){
        return null;
    }
    
   }
   
    public List<Filme> Pesquisar_Cod_Filme(int cod){
            String sql = "SELECT idfilme,titulo,ano,duracao,idcategoria,idclassificacao FROM filme WHERE idfilme LIKE '"+cod+"'";
            List<Filme> lista = new ArrayList<>();
    
        try{

            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();

            if(rs != null){
                while(rs.next()){
                    Filme a = new Filme();
                    a.setCodigo(rs.getInt(1));
                    a.setTitulo(rs.getString(2));
                    a.setAno(rs.getInt(3));
                    a.setDuracao(rs.getString(4));
                    a.setCod_categoria(rs.getInt(5));
                    a.setCod_classificacao(rs.getInt(6));
                    lista.add(a);
                    }
                return lista;
            }else{
                return null;
            }

        }catch( SQLException e){
            return null;
        }
    
   }
    
    public List<Filme> ListarComboFilme(){
        String sql = "SELECT titulo FROM filme order by titulo";
        List<Filme> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Filme a = new Filme();
                    a.setTitulo(rs.getString(1));
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
    
    public List<Filme> CapturarCapa (int cod){
        String sql = "SELECT * FROM filme WHERE idfilme = "+cod+"";
        List<Filme> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Filme f = new Filme();
                    
                    f.setCapa(rs.getString(7));
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
    
     public List<Filme> CapturarFilme (int cod){
        String sql = "SELECT * FROM filme WHERE idfilme = "+cod+"";
        List<Filme> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Filme f = new Filme();
                    
                    f.setCodigo(rs.getInt(1));
                    f.setTitulo(rs.getString(2));
                    f.setAno(rs.getInt(3));
                    f.setDuracao(rs.getString(4));
                    f.setCod_categoria(rs.getInt(5));
                    f.setCod_classificacao(rs.getInt(6));
                    f.setCapa(rs.getString(7));
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
    
    public List<Filme> ConsultaCodigoFilme(String nome){
        String sql = "SELECT idfilme FROM filme where titulo = '"+nome+"'";
        List<Filme> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Filme a = new Filme();
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
     
    public boolean Testar_Filme(int cod){
    boolean Resultado = false;
   
    try{
        String sql  = "SELECT * FROM filme WHERE idfilme = "+cod+"";
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
    
   public String Alterar_Filme(Filme a){
        
        String sql = "UPDATE filme SET titulo = ?, ano = ?, duracao = ?, idcategoria = ?, idclassificacao = ?, capa = ? WHERE idfilme = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);

           
            ps.setString(1, a.getTitulo());
            ps.setInt(2,a.getAno());
            ps.setString(3, a.getDuracao());
            ps.setInt(4, a.getCod_categoria());
            ps.setInt(5, a.getCod_classificacao());
            ps.setString(6, a.getCapa());
            ps.setInt(7, a.getCodigo());

            if(ps.executeUpdate() > 0){
                return "Atualizado com sucesso";
            }else{
                return "Erro ao Atualizar";
            }
            
        }catch(SQLException e){
            return e.getMessage();
        }
    }
   
    public String Excluir_Filme(Filme a ){
        
        String sql = "DELETE FROM filme WHERE idfilme = ? and titulo = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getTitulo());
            if(ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            }else{
                return "Erro ao Excluir";
            }
        }catch(Exception ex){
                return ex.getMessage();
        }
    }
}
