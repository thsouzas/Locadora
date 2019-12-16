package Locacao;

import DAO.AluguelDAO;
import DAO.ClienteDAO;
import DAO.Conexao;
import Modelo.Aluguel;
import Modelo.Cliente;
import Modelo.Listar;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaDevolucao extends javax.swing.JFrame {

    public ConsultaDevolucao() {
        initComponents();
        setSize(910,510);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Video Locadora");
        AtualizarCombo();
        AtualizaTable();
    }

    public void AtualizarCombo(){
        Connection con = Conexao.AbrirConexao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = sql.ListarComboCliente();
        
        for(Cliente b : lista){
            jComboBox1.addItem(b.getNome());
        }
        Conexao.FecharConexao(con);
    }
     public void AtualizaTable(){
        
        Connection con = Conexao.AbrirConexao();
        AluguelDAO db = new AluguelDAO(con);
        
        List<Aluguel> lista = new ArrayList<>();
        lista = db.ListarAluguel();
         DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        while(tbm.getRowCount() > 0){
              tbm.removeRow(0);
        }
        int i = 0;
        for(Aluguel tab : lista){
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getCod(), i, 0);
            jTable1.setValueAt(tab.getCodcliente(), i, 1);
            jTable1.setValueAt(tab.getCoddvd(), i, 2);
            jTable1.setValueAt(tab.getHorario(), i, 3);
            jTable1.setValueAt(tab.getData_aluga(), i, 4);
            jTable1.setValueAt(tab.getData_devolucao(), i, 5);
            i++;
        }
            Conexao.FecharConexao(con);
    }
     public void AtualizaTableNome(){
        
        Connection con = Conexao.AbrirConexao();
        AluguelDAO db = new AluguelDAO(con);
        
        List<Aluguel> lista = new ArrayList<>();
        lista = db.Pesquisar_Por_IdCliente(Integer.parseInt(jTextField1.getText()));
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        while(tbm.getRowCount() > 0){
              tbm.removeRow(0);
        }
        int i = 0;
        for(Aluguel tab : lista){
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getCod(), i, 0);
            jTable1.setValueAt(tab.getCodcliente(), i, 1);
            jTable1.setValueAt(tab.getCoddvd(), i, 2);
            jTable1.setValueAt(tab.getHorario(), i, 3);
            jTable1.setValueAt(tab.getData_aluga(), i, 4);
            jTable1.setValueAt(tab.getData_devolucao(), i, 5);
            i++;
        }
            Conexao.FecharConexao(con);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cliente", "DVD", "Horario", "Locação", "Devolução"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 106, 868, 357));

        jLabel1.setText("Cliente:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Cliente" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 908, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        Connection con = Conexao.AbrirConexao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        String nome = jComboBox1.getSelectedItem().toString();
        lista =  sql.ConsultaCodigoCliente(nome);
        Conexao.FecharConexao(con);
         for(Cliente b : lista){
            int a = b.getCodigo();
            jTextField1.setText("" + a);
            AtualizaTableNome();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Integer linha = jTable1.getSelectedRow();
        JOptionPane.showMessageDialog(null, linha);
        Integer idaluguel = (Integer) jTable1.getValueAt(linha, 0);
        Integer idcliente = (Integer) jTable1.getValueAt(linha, 1);
        Integer iddvd = (Integer) jTable1.getValueAt(linha, 2);
        Listar a = new Listar();
        a.setCoddvd(iddvd);
        a.setCodaluguel(idaluguel);
        a.setCodcliente(idcliente);
        
        new EfetuarDevolucao().setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       AtualizaTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDevolucao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
