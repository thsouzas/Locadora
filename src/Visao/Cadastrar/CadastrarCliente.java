
package Visao.Cadastrar;

import DAO.ClienteDAO;
import DAO.Conexao;
import DAO.FuncionarioDAO;
import Modelo.Cliente;
import javax.swing.JOptionPane;
import java.sql.*;

public class CadastrarCliente extends javax.swing.JFrame {

    
    public CadastrarCliente() {
        initComponents();
        setSize(670,443);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Video Locadora");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setText("Nº do Cliente :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 100, 14);

        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 50, 60, 14);

        jLabel5.setText("RG:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 80, 40, 14);

        jLabel6.setText("CPF:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 80, 40, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(140, 20, 120, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(90, 50, 520, 20);

        jLabel1.setText("Telefone:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 110, 70, 20);

        jLabel7.setText("Data de Nascimento:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 110, 140, 20);

        jLabel8.setText("Rua:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 140, 30, 14);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(90, 140, 350, 20);

        jLabel9.setText("Nº");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(470, 140, 20, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(500, 140, 110, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(90, 170, 260, 20);

        jLabel10.setText("CEP:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 170, 40, 20);

        jLabel11.setText("Bairro:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 170, 50, 20);

        jLabel12.setText("Email:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 200, 50, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(90, 200, 520, 20);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(90, 80, 220, 20);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(390, 80, 220, 20);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField3);
        jFormattedTextField3.setBounds(90, 110, 170, 20);

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField4);
        jFormattedTextField4.setBounds(460, 110, 150, 20);

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField5);
        jFormattedTextField5.setBounds(410, 170, 200, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 670, 260);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(530, 80));

        jLabel2.setFont(new java.awt.Font("Cantarell", 2, 36)); // NOI18N
        jLabel2.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 70);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 330, 670, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = jTextField2.getText();
        String nascimento = jFormattedTextField4.getText();
        String cep = jFormattedTextField5.getText();
        String rua = jTextField3.getText();
        String numero = jTextField4.getText();
        String bairro = jTextField5.getText();
        String email = jTextField6.getText();
        String fone = jFormattedTextField3.getText();
        String cpf = jFormattedTextField2.getText();
        String rg = jFormattedTextField1.getText();

        if(nome.equals("") || nascimento.equals("") || cep.equals("") || rua.equals("") || numero.equals("") || bairro.equals("") || fone.equals("") || cpf.equals("") || rg.equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum Campo pode estar Vazio","Erro: ",JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = Conexao.AbrirConexao();
            ClienteDAO sql = new ClienteDAO(con);
            int n = Integer.parseInt(numero);
            Cliente a = new Cliente();

            a.setNome(nome);
            a.setNascimento(nascimento);
            a.setCEP(cep);
            a.setRua(rua);
            a.setNumero(n);
            a.setBairro(bairro);
            a.setEmail(email);
            a.setTelefone(fone);
            a.setCPF(cpf);
            a.setRG(rg);

            sql.Inserir_Cliente(a);

            Conexao.FecharConexao(con);

            jTextField1.setText("");
            jTextField2.setText("");
            jFormattedTextField1.setText("");
            jFormattedTextField2.setText("");
            jFormattedTextField3.setText("");
            jFormattedTextField4.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jFormattedTextField5.setText("");
            jTextField6.setText("");

            JOptionPane.showMessageDialog(null, "Cadastro Finalizado com sucesso!!","Video Locadora",JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
        jFormattedTextField4.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jFormattedTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
