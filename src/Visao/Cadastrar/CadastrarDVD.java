
package Visao.Cadastrar;

import DAO.Conexao;
import DAO.DVDDAO;
import DAO.FilmeDAO;
import Modelo.DVD;
import Modelo.Filme;
import Principal.Menu;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CadastrarDVD extends javax.swing.JFrame {

    
    public CadastrarDVD() {
        initComponents();
        setSize(676,610);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Video Locadora");
        AtualizaComboFilme();
        jTextField4.setText("");
    }

    private void InserirDados(int cod){
    String var = jTextField3.getText();
    if(var.equals("")){
    JOptionPane.showMessageDialog(null, "Campo vaziio");
    }else{
    Connection con = Conexao.AbrirConexao();
    FilmeDAO sql  = new FilmeDAO(con);
    List<Filme> lista = new ArrayList<>();
    lista = sql.CapturarFilme(cod);
    for(Filme a : lista){
    jTextField4.setText(""+a.getCapa());
    }
    Conexao.FecharConexao(con);
    }
   }
    
    private void AtualizaComboFilme(){
    Connection con = Conexao.AbrirConexao();
    FilmeDAO sql = new FilmeDAO(con);
    List<Filme> lista = new ArrayList<>();
    lista = sql.ListarComboFilme();
    for( Filme b : lista){
    jComboBox1.addItem(b.getTitulo());
    }
    Conexao.FecharConexao(con);
    }
   
    public void VerificaCapa(){
        String codigo =  jTextField3.getText();
        Connection con = Conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        int cod  = Integer.parseInt(codigo);
        
        jTextField4.setText("");
        InserirDados(cod);
        InserirCapa();
    }
    public void InserirCapa(){
        Image  foto = getToolkit().getImage(jTextField4.getText());   
        foto = foto.getScaledInstance(270, 190,Image.SCALE_DEFAULT);
        jLabel6.setIcon(new ImageIcon(foto));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Cantarell", 2, 36)); // NOI18N
        jLabel7.setText("Cadastro de DVD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel7)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 99);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setText("Codigo:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(26, 26, 60, 27);

        jTextField1.setEditable(false);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(88, 27, 98, 20);

        jLabel2.setText("Situação:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(304, 26, 60, 27);

        jTextField2.setEditable(false);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(380, 30, 220, 20);

        jLabel3.setText("Filme:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(26, 61, 50, 21);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(88, 59, 61, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Filme" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(160, 60, 440, 20);

        jLabel4.setText("Preço da Compra: ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 70, 150, 60);

        jLabel5.setText("Data da Compra:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(300, 85, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/DVD_VIDEO_logo.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(190, 130, 270, 190);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(397, 90, 200, 20);

        jTextField4.setEditable(false);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(70, 340, 510, 20);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(120, 90, 160, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 670, 380);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cadastrar");
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
                .addGap(53, 53, 53)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 480, 670, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new CadastrarDVD().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String situacao = "DISPONIVEL";
        String id_filme = jTextField3.getText();
        String precos = jTextField5.getText();
        
    if( id_filme.equals("") || precos.equals("")  || jDateChooser1 == null){JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio" , "Video Locadora" , JOptionPane.WARNING_MESSAGE);

        }else{
         Connection con = Conexao.AbrirConexao();
         DVDDAO sql = new DVDDAO(con);
          
         SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
         String Data = formatador.format(jDateChooser1.getDate());
         int filme = Integer.parseInt(id_filme);
         double preco = Double.parseDouble(precos);
         
         DVD a  = new DVD();

         a.setCod_filme(filme);
         a.setPreco(preco);
         a.setData_Compra(Data);
         a.setSituacao(situacao);

         sql.Inserir_DVD(a);
         Conexao.FecharConexao(con);

         JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso","Video Locadora",JOptionPane.INFORMATION_MESSAGE);
         dispose();
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        String nome = jComboBox1.getSelectedItem().toString();
        lista =  sql.ConsultaCodigoFilme(nome);

        for( Filme b : lista){
           
            int a = b.getCodigo();
           jTextField3.setText(""+ a);
        }
        Conexao.FecharConexao(con);
        
        VerificaCapa();
    }//GEN-LAST:event_jComboBox1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarDVD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
