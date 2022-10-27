/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.BeeSoftware.visao;

import com.BeeSoftware.controle.IMarcaControle;
import com.BeeSoftware.controle.MarcaControle;
import com.BeeSoftware.ferramentas.GeradorIdentificador;
import com.BeeSoftware.modelos.Marca;
import com.BeeSoftware.persistencia.IMarcaDao;
import com.BeeSoftware.persistencia.MarcaDao;
import com.BeeSoftware.controle.IModeloControle;
import com.BeeSoftware.controle.ModeloControle;
import com.BeeSoftware.persistencia.IModeloDao;
import com.BeeSoftware.persistencia.ModeloDao;
import com.BeeSoftware.modelos.Modelo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import com.BeeSoftware.imagensNaTela.JTableRenderer;
import com.BeeSoftware.imagensNaTela.JTableRendererModelos;
import com.BeeSoftware.imagensNaTela.JTableRendererMarcas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eric
 */
public class TelaDosModelos extends javax.swing.JFrame {

    ModeloControle modelocontrole = new ModeloControle();
    MarcaControle obj = new MarcaControle();
    ArrayList<Marca> dados = obj.listagem();
    JTableRendererMarcas captarurl = new JTableRendererMarcas();

    /**
     * Creates new form TelaDosModelos
     */
    public TelaDosModelos() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        jTID.setEnabled(false);
        jTURL.setEnabled(false);
        
        

        try {

            String[] linha = new String[dados.size()];
            for (int pos = 0; pos < dados.size(); pos++) {
                jComboBox1.addItem(dados.get(pos).getDescicao());
            }
            imprimirTabela(modelocontrole.listagem());
        } catch (IOException e) {
            System.err.println("erro");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLmodelo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTModelo = new javax.swing.JTextField();
        JLlogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTURL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BTincluirMarca = new javax.swing.JButton();
        BTalterar = new javax.swing.JButton();
        BTbuscar = new javax.swing.JButton();
        BTincluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 186, 3));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANTER MODELOS");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel3.setText("MANTER MODELOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addContainerGap(478, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel3)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLmodelo.setBackground(new java.awt.Color(255, 255, 255));
        jLmodelo.setForeground(new java.awt.Color(255, 255, 255));
        jLmodelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MARCAS:");

        jLabel5.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MODELO:");

        jTModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTModeloKeyTyped(evt);
            }
        });

        JLlogo.setBackground(new java.awt.Color(255, 255, 255));
        JLlogo.setForeground(new java.awt.Color(255, 255, 255));
        JLlogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MODELO");

        jLabel8.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LOGO");

        jLabel9.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID:");

        jTID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIDKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("URL:");

        jTURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTURLKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTModelo)
                            .addComponent(jTID)
                            .addComponent(jTURL))
                        .addGap(238, 238, 238))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(175, 175, 175)
                        .addComponent(jLabel7)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLlogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Descrição", "URL", "Marca", "Modelo"
            }
        ));
        jTableModelos.setRowHeight(75);
        jTableModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableModelos);
        if (jTableModelos.getColumnModel().getColumnCount() > 0) {
            jTableModelos.getColumnModel().getColumn(0).setMinWidth(27);
            jTableModelos.getColumnModel().getColumn(0).setMaxWidth(27);
            jTableModelos.getColumnModel().getColumn(1).setMinWidth(100);
            jTableModelos.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableModelos.getColumnModel().getColumn(3).setMinWidth(80);
            jTableModelos.getColumnModel().getColumn(3).setMaxWidth(80);
            jTableModelos.getColumnModel().getColumn(3).setCellRenderer(new JTableRendererMarcas());
            jTableModelos.getColumnModel().getColumn(4).setMinWidth(80);
            jTableModelos.getColumnModel().getColumn(4).setMaxWidth(80);
            jTableModelos.getColumnModel().getColumn(4).setCellRenderer(new JTableRendererModelos());
        }

        jPanel3.setBackground(new java.awt.Color(252, 186, 3));

        BTincluirMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTincluirMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BeeSoftware/imagens/incluir.png"))); // NOI18N
        BTincluirMarca.setText("Incluir Marca");
        BTincluirMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTincluirMarcaActionPerformed(evt);
            }
        });

        BTalterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BeeSoftware/imagens/refresh.png"))); // NOI18N
        BTalterar.setText("Alterar");

        BTbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BeeSoftware/imagens/buscar.png"))); // NOI18N
        BTbuscar.setText("Buscar Modelo");
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        BTincluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BeeSoftware/imagens/incluir.png"))); // NOI18N
        BTincluir.setText("Incluir Modelo");
        BTincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTincluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BTincluirMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(BTincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(BTalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTincluirMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTbuscar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BeeSoftware/imagens/arquivo.png"))); // NOI18N
        jMenu1.setText("arquivo");

        jMenuItem1.setText("Marcas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Veículos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Categorias");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Acessórios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BeeSoftware/imagens/fechar.png"))); // NOI18N
        jMenu2.setText("fechar");

        jMenuItem2.setText("fechar");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTModeloKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if (!Character.isLetter(e)) {
            evt.consume();
        }
        if (Character.isLowerCase(e)) {
            evt.setKeyChar(Character.toUpperCase(e));
        }
    }//GEN-LAST:event_jTModeloKeyTyped

    private void jTIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDKeyTyped

    private void jTURLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTURLKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTURLKeyTyped

    private void BTincluirMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTincluirMarcaActionPerformed
        TelaDasMarcas tm = new TelaDasMarcas();
        this.dispose();
        tm.setVisible(true);
    }//GEN-LAST:event_BTincluirMarcaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaDasMarcas tm = new TelaDasMarcas();
        this.dispose();
        tm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
        try {

            JFileChooser file = new JFileChooser();
            File modelo = new File("./src/com/BeeSoftware/imagens/modelos");
            file.setCurrentDirectory(modelo);
            file.setFileSelectionMode(JFileChooser.FILES_ONLY);
            file.showOpenDialog(this);
            File arq = file.getSelectedFile();
            String nomeModelo = arq.getPath();
            jTURL.setText(nomeModelo);
            ImageIcon iconeModelo = new ImageIcon(nomeModelo);
            iconeModelo.setImage(iconeModelo.getImage().getScaledInstance(jLmodelo.getWidth(), jLmodelo.getHeight(), 1));
            jLmodelo.setIcon(iconeModelo);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            MarcaControle obj = new MarcaControle();
            ArrayList<Marca> dados = obj.listagem();
            for (int pos = 0; pos < dados.size(); pos++) {
                if (jComboBox1.getSelectedItem().equals(dados.get(pos).getDescicao())) {
                    ImageIcon iconeModelo = new ImageIcon(dados.get(pos).getUrl());
                    iconeModelo.setImage(iconeModelo.getImage().getScaledInstance(JLlogo.getWidth(), JLlogo.getHeight(), 1));
                    JLlogo.setIcon(iconeModelo);
                    captarurl.receber(dados.get(pos).getUrl());
                }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BTincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTincluirActionPerformed

        try {
            int idMarca = 0;

            File path = new File(jTURL.getText());
            String logo = ".\\src\\com\\BeeSoftware\\imagens\\modelos\\" + path.getName();
            for (int pos = 0; pos < dados.size(); pos++) {
                if (jComboBox1.getSelectedItem().equals(dados.get(pos).getDescicao())) {
                    idMarca = dados.get(pos).getId();
                }else new Exception("Marca não cadastrada");

            }
            Modelo obj = new Modelo(0, jTModelo.getText(), logo, idMarca);
            modelocontrole.incluir(obj);
            imprimirTabela(modelocontrole.listagem());
            jTModelo.setText("");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
        

    }//GEN-LAST:event_BTincluirActionPerformed

    private void jTableModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelosMouseClicked
        try {
            this.jTID.setText((String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 0));
            this.jTModelo.setText((String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 1));
            this.jTURL.setText((String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2));

            String nomeArquivo = (String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2);

            jTURL.setText(nomeArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLmodelo.getWidth(), jLmodelo.getHeight(), 1));
            jLmodelo.setIcon(iconLogo);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jTableModelosMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaDosVeiculos tv = new TelaDosVeiculos();
        this.dispose();
        tv.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaDasCategorias tcat = new TelaDasCategorias();
        this.dispose();
        tcat.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaDosAcessorios tacess = new TelaDosAcessorios();
        this.dispose();
        tacess.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    public void imprimirTabela(ArrayList<Modelo> listademarca) {
        try {
            DefaultTableModel tabela = (DefaultTableModel) jTableModelos.getModel();
            tabela.setNumRows(0);
            Iterator<Modelo> lista = listademarca.iterator();

            while (lista.hasNext()) {
                String[] tab = new String[4];
                Modelo aux = lista.next();
                tab[0] = aux.getId() + "";
                tab[1] = aux.getDescricao();
                tab[2] = aux.getUrl();
                tab[3] = Integer.toString(aux.getIdMarca());

                tabela.addRow(tab);

            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDosModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDosModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDosModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDosModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaDosModelos().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaDosModelos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTalterar;
    private javax.swing.JButton BTbuscar;
    private javax.swing.JButton BTincluir;
    private javax.swing.JButton BTincluirMarca;
    private javax.swing.JLabel JLlogo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLmodelo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTURL;
    private javax.swing.JTable jTableModelos;
    // End of variables declaration//GEN-END:variables
}
