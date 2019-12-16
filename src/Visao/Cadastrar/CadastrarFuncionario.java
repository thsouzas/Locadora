
package Visao.Cadastrar;

import DAO.ClienteDAO;
import DAO.Conexao;
import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class CadastrarFuncionario extends javax.swing.JFrame {

    
    public CadastrarFuncionario() {
        initComponents();
        setSize(540,450);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Video Locadora");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(240, 32, 32));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro  de Funcionário");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 30, 450, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 590, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 300);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel3.setText("Codigo:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 50, 60, 30);

        jLabel4.setText("Nome:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 90, 50, 30);

        jLabel5.setText("Login:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 130, 39, 30);

        jLabel6.setText("Senha:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 170, 44, 30);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(80, 60, 150, 25);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(80, 100, 220, 25);
        jPanel3.add(jTextField3);
        jTextField3.setBounds(80, 140, 220, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pass_key.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(360, 50, 140, 180);
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(80, 180, 220, 25);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 70, 540, 250);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(30, 20, 110, 50);

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(210, 20, 110, 50);

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(400, 20, 110, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 320, 540, 100);

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cantarell", 2, 36)); // NOI18N
        jLabel2.setText("Cadastro de Funcionario");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(70, 0, 380, 70);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 540, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String nome = jTextField2.getText();
       String login = jTextField3.getText();
       String senha = jPasswordField1.getText();
       
       if(nome.equals("") || login.equals("") || senha.equals("")){
           JOptionPane.showMessageDialog(null, "Nenhum Campo pode estar Vazio","Erro: ",JOptionPane.WARNING_MESSAGE);
       }else{
           Connection con = Conexao.AbrirConexao();
           FuncionarioDAO sql = new FuncionarioDAO(con);
           
           Funcionario f = new Funcionario();
           
           f.setNome(nome);
           f.setLogin(login);
           f.setSenha(senha);
           
           sql.Inserir_Funcionario(f);
           
           Conexao.FecharConexao(con);
           
           jTextField2.setText("");
           jTextField3.setText("");
           jPasswordField1.setText("");
           
           JOptionPane.showMessageDialog(null, "Cadastro Finalizado com sucesso!!","Video Locadora",JOptionPane.INFORMATION_MESSAGE);
           dispose();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
