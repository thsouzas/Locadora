package DAO;
import Modelo.Classificacao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClassificacaoDAO extends ExecuteSQL{
    
    public ClassificacaoDAO(Connection con) {
        super(con);
    }
     public String Inserir_Classificacao(Classificacao c){
        
        String sql = "INSERT INTO classificacao VALUES (0,?,?)";
        
        try{
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1,c.getNome());
            ps.setString(2,c.getPreco());
        
            if(ps.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao Inserir";
            }
            
        }catch(Exception e){
            return e.getMessage();
        }
    }
     
     public List<Classificacao> ListarClassificacao(){
        String sql = "SELECT idclassificacao,nome,preco FROM classificacao";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
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
    
    public List<Classificacao> Pesquisar_Nome_Classificacao(String nome){
        String sql = "SELECT idclassificacao, nome, preco FROM classificacao WHERE nome LIKE  '"+nome+"%'";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
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
    
    public List<Classificacao> Pesquisar_Cod_Classificacao(int cod){
        String sql = "SELECT idclassificacao, nome,preco FROM classificacao WHERE idclassificacao = '"+cod+"'";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
                    
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
     
     public List<Classificacao> ListarComboClassificacao(){
        String sql = "SELECT nome FROM classificacao order by nome";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
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
    
    public List<Classificacao> ConsultaCodigoClassificacao(String nome){
        String sql = "SELECT idclassificacao FROM classificacao where nome = '"+nome+"'";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
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
    
    public String Excluir_Classificacao(Classificacao a ){
        
        String sql = "DELETE FROM classificacao WHERE idclassificacao = ? and nome = ?";
        
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
    
    public boolean Testar_Classificacao(int cod){
    boolean Resultado = false;
   
    try{
        String sql  = "SELECT * FROM classificacao WHERE idclassificacao = "+cod;
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

    public List<Classificacao> CapturarClassificacao(int cod){
        String sql = "SELECT *  FROM classificacao WHERE idclassificacao = "+cod;
        List<Classificacao> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if( rs!= null){
                while(rs.next()){
                Classificacao a = new Classificacao();
                a.setCodigo(rs.getInt(1));
                a.setNome(rs.getString(2));
                a.setPreco(rs.getString(3));
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
    
    public String Alterar_Classificacao(Classificacao a){
        
       String sql = "UPDATE classificacao SET nome = ?, preco = ? WHERE idclassificacao = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getPreco());
            ps.setInt(3,a.getCodigo());
            
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
