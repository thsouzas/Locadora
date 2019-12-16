
package Visao.Alterar;

import DAO.CategoriaDAO;
import DAO.ClassificacaoDAO;
import DAO.Conexao;
import DAO.FilmeDAO;
import Modelo.Categoria;
import Modelo.Classificacao;
import Modelo.Filme;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AlterarFilme extends javax.swing.JFrame {

    
    public AlterarFilme() {
        initComponents();
         setSize(800,560);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Video Locadora");
        AtualizarComboCategoria();
        AtualizarComboClassificacao();
    }

    public void InserirDados(int cod){
        Connection con = Conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = sql.CapturarFilme(cod);
        
        for(Filme a : lista){
            jTextField1.setText(""+a.getCodigo());
            jTextField2.setText(""+a.getTitulo());
            jTextField3.setText(""+a.getAno());
            jFormattedTextField1.setText(""+a.getDuracao());
            jTextField4.setText(""+a.getCod_categoria());
            jTextField5.setText(""+a.getCod_classificacao());
            jTextField6.setText(""+a.getCapa());
            
            Image foto = getToolkit().getImage(jTextField6.getText());
            foto = foto.getScaledInstance(270, 190,Image.SCALE_DEFAULT);
            jLabel1.setIcon(new ImageIcon(foto));

        }
        Conexao.FecharConexao(con);
    }
    public void AtualizarComboCategoria(){
        Connection con = Conexao.AbrirConexao();
        CategoriaDAO sql = new CategoriaDAO(con);
        List<Categoria> lista = new ArrayList<>();
        lista = sql.ListarComboCategoria();
        
        for(Categoria b : lista){
            jComboBox1.addItem(b.getNome());
        }
        Conexao.FecharConexao(con);
    }
    
    public void AtualizarComboClassificacao(){
        Connection con = Conexao.AbrirConexao();
        ClassificacaoDAO sql = new ClassificacaoDAO(con);
        List<Classificacao> lista = new ArrayList<>();
        lista = sql.ListarComboClassificacao();
        
        for(Classificacao b : lista){
            jComboBox2.addItem(b.getNome());
        }
        Conexao.FecharConexao(con);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 251, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Cantarell", 2, 36)); // NOI18N
        jLabel2.setText("Alterar Filme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/DVD_VIDEO_logo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(497, 57, 270, 190);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("CAPA 270 x  190");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(560, 20, 142, 24);

        jLabel4.setText("Codigo:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 10, 60, 40);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(90, 20, 110, 30);

        jLabel5.setText("Título:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 50, 50, 50);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(90, 60, 380, 30);

        jLabel6.setText("Ano:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 90, 50, 50);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(90, 100, 130, 30);

        jLabel7.setText("Duração:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(240, 90, 80, 50);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(320, 100, 150, 30);

        jLabel8.setText("Categoria:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 130, 80, 50);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(120, 140, 40, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Categoria", "nada" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(170, 140, 300, 30);

        jLabel9.setText("Classificação:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 170, 90, 50);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(120, 180, 40, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma classificação", "nada" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(170, 180, 300, 30);

        jLabel10.setText("Capa:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 210, 60, 50);
        jPanel2.add(jTextField6);
        jTextField6.setBounds(90, 220, 280, 30);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(380, 220, 90, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Id do Filme:");

        jButton5.setText("Ok");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        CategoriaDAO sql = new CategoriaDAO(con);
        List<Categoria> lista = new ArrayList<>();
        String nome = jComboBox1.getSelectedItem().toString();

        lista = sql.ConsultaCodigoCategoria(nome);
        
        for(Categoria b : lista){
            int a = b.getCodigo();
            jTextField4.setText("" + a);
        }
        Conexao.FecharConexao(con);        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        Connection con = Conexao.AbrirConexao();
        ClassificacaoDAO sql = new ClassificacaoDAO(con);
        List<Classificacao> lista = new ArrayList<>();
        String nome = jComboBox2.getSelectedItem().toString();

        lista = sql.ConsultaCodigoClassificacao(nome);

        for(Classificacao b : lista){
            int a = b.getCodigo();
            jTextField5.setText("" + a);
        }
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filtro =  new FileNameExtensionFilter("Formatos de Arquivo JPEG(*.JPG;*.JPEG)","jpg","jpeg");

        JFileChooser arquivo = new JFileChooser();

        arquivo.addChoosableFileFilter(filtro);
        arquivo.setDialogTitle("Abrir arquivo");
        File rota = new File("C://Users//Jhonatan Holanda//Documents//NetBeansProjects//Locadora//Imagens_Capas/");
        arquivo.setCurrentDirectory(null);

        int option = arquivo.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = arquivo.getSelectedFile();
            jTextField6.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(jTextField6.getText());
            foto = foto.getScaledInstance(270, 190,Image.SCALE_DEFAULT);
            jLabel1.setIcon(new ImageIcon(foto));

        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel carregar capa.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new AlterarFilme().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cod = jTextField1.getText();
        String titulo = jTextField2.getText();
        String ano = jTextField3.getText();
        String duracao = jFormattedTextField1.getText();
        String idcat = jTextField4.getText();
        String idcla = jTextField5.getText();
        String capa = jTextField6.getText();

        if(titulo.equals("") || ano.equals("") || duracao.equals("") || idcat.equals("") || idcla.equals("") || capa.equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum campo pode ficar em branco","Video Locadora",JOptionPane.WARNING_MESSAGE); 
        }else{
            Connection con = Conexao.AbrirConexao();
            FilmeDAO sql = new FilmeDAO(con);
            int anoo = Integer.parseInt(ano);
            int idcate = Integer.parseInt(idcat);
            int idclas = Integer.parseInt(idcla);
            int code = Integer.parseInt(cod);
            Filme a = new Filme();
            
            a.setCodigo(code);
            a.setTitulo(titulo);
            a.setAno(anoo);
            a.setDuracao(duracao);
            a.setCod_categoria(idcate);
            a.setCod_classificacao(idclas);
            a.setCapa(capa);
            
            
            sql.Alterar_Filme(a);
            Conexao.FecharConexao(con);
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jFormattedTextField1.setText("");
            jTextField4.setText("");
            jComboBox1.setSelectedItem(1);
            jTextField5.setText("");
            jComboBox2.setSelectedItem(1);
            jTextField6.setText("");
            
            JOptionPane.showMessageDialog(null, "Alteração Realizada com sucesso","Video Locadora",JOptionPane.WARNING_MESSAGE); 
        }
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String codigo = jTextField7.getText();
        Connection con = Conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        int cod = Integer.parseInt(codigo);
        if(sql.Testar_Filme(cod) == false){
            JOptionPane.showMessageDialog(null, "Codigo não encontrado no Banco","Video Locadora",JOptionPane.WARNING_MESSAGE);
            Conexao.FecharConexao(con);
        }
        if(codigo.equals("")){
            JOptionPane.showMessageDialog(null, "Digite um codigo para Atualizar","Video Locadora",JOptionPane.WARNING_MESSAGE);
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jFormattedTextField1.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedItem(1);
        jTextField5.setText("");
        jComboBox2.setSelectedItem(1);
        jTextField6.setText("");
        
        InserirDados(cod);
        jTextField7.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
