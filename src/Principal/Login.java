
package Principal;

import DAO.Conexao;
import DAO.FuncionarioDAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        setSize(317,310);
        setTitle("Video Locadora");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setText("Usuário:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 108, 50, 14);

        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(24, 146, 54, 14);
        jPanel1.add(tfUsuario);
        tfUsuario.setBounds(90, 110, 200, 20);
        jPanel1.add(pfSenha);
        pfSenha.setBounds(90, 150, 200, 20);

        jButton1.setBackground(new java.awt.Color(23, 253, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaoEntrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 190, 90, 37);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaoSair.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 190, 90, 37);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(22, 245, 270, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/locadora.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 316, 97);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        FuncionarioDAO sql = new FuncionarioDAO(con);
        String login = tfUsuario.getText();
        String senha = pfSenha.getText();
        
        if(login.equalsIgnoreCase("") || senha.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Nenhum campo pode esta Vazio","Video Locadora",JOptionPane.WARNING_MESSAGE);
            tfUsuario.setText("");
            pfSenha.setText("");
        }else{
            if(sql.Logar(login, senha) == true){
                new Thread(){
                    public void run(){
                        for(int i = 0;i < 110;i++){
                            jProgressBar1.setValue(i);
                            try{
                                
                            }catch(Exception e){
                                e.getMessage();
                            }
                        }
                        new Menu().setVisible(true);
                        dispose();
                    }
                }
               .start();
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario Não Cadastrado ou login/senha Incorretos");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
