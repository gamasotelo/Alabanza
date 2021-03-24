

package Ventanas;

import java.awt.Dimension;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VRepertorio extends javax.swing.JFrame {
    
  
  
    public VRepertorio() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setMinimumSize(new Dimension(900, 457));
        agregarElementosInicio();
    }
    
//    Se agregan elementos que ya hay en el arrayList
    public void agregarElementosInicio() {
        if (elementosLista.isEmpty() == true) {
            //Si la lista esta vacía, no hagas nada porque hará un error en el index de get
        } else {
            for (int i = 0; i <= elementosLista.size(); i++) {
                String recogeNombre = elementosLista.get(i);
                modelo.addElement(recogeNombre);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        PanelPrinicipal = new javax.swing.JPanel();
        pencabezado = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        batras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SEGUNDO = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        badd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        bbuscar = new javax.swing.JButton();
        panelGrande = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        lista = new javax.swing.JList<>();
        panelherramientas = new javax.swing.JPanel();
        beliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(53, 51, 2));

        PanelPrinicipal.setLayout(new java.awt.BorderLayout());

        pencabezado.setBackground(new java.awt.Color(97, 15, 15));
        pencabezado.setPreferredSize(new java.awt.Dimension(900, 60));
        pencabezado.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(143, 1, 1));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("                 ");
        jPanel5.add(jLabel9, java.awt.BorderLayout.LINE_END);

        jLabel10.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("REPERTORIO");
        jPanel5.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(143, 1, 1));
        jPanel4.setLayout(new java.awt.BorderLayout());

        batras.setBackground(new java.awt.Color(254, 254, 254));
        batras.setText("Atrás");
        batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batrasActionPerformed(evt);
            }
        });
        jPanel4.add(batras, java.awt.BorderLayout.CENTER);

        jLabel1.setText("    ");
        jPanel4.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel8.setText("      ");
        jPanel4.add(jLabel8, java.awt.BorderLayout.PAGE_END);

        jLabel11.setText("                ");
        jPanel4.add(jLabel11, java.awt.BorderLayout.LINE_END);

        jLabel12.setText("      ");
        jPanel4.add(jLabel12, java.awt.BorderLayout.LINE_START);

        jPanel5.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        pencabezado.add(jPanel3);

        SEGUNDO.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(143, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("                    ");
        jPanel2.add(jLabel4, java.awt.BorderLayout.LINE_START);

        jLabel5.setText("                 ");
        jPanel2.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jLabel6.setText("              ");
        jPanel2.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        badd.setBackground(new java.awt.Color(254, 254, 254));
        badd.setText("Add");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        jPanel2.add(badd, java.awt.BorderLayout.CENTER);

        jLabel7.setText("   ");
        jPanel2.add(jLabel7, java.awt.BorderLayout.LINE_END);

        SEGUNDO.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel8.setBackground(new java.awt.Color(143, 1, 1));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("                      ");
        jPanel8.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jLabel3.setText("                        ");
        jPanel8.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        txtbuscar.setText("ingresa nombre de la canción");
        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbuscarMouseClicked(evt);
            }
        });
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        jPanel7.add(txtbuscar);

        jPanel8.add(jPanel7, java.awt.BorderLayout.CENTER);

        bbuscar.setBackground(new java.awt.Color(253, 251, 251));
        bbuscar.setText("Buscar");
        jPanel8.add(bbuscar, java.awt.BorderLayout.LINE_END);

        SEGUNDO.add(jPanel8, java.awt.BorderLayout.CENTER);

        pencabezado.add(SEGUNDO);

        PanelPrinicipal.add(pencabezado, java.awt.BorderLayout.PAGE_START);

        panelGrande.setBackground(new java.awt.Color(254, 254, 254));
        panelGrande.setLayout(new java.awt.BorderLayout());

        lista.setModel(modelo);
        lista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(143, 1, 1)));
        lista.setFont(new java.awt.Font("DejaVu Sans Light", 1, 20)); // NOI18N
        lista.setSelectionBackground(new java.awt.Color(143, 1, 1));
        jScrollPane1.setViewportView(lista);

        panelGrande.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelherramientas.setBackground(new java.awt.Color(36, 27, 27));
        panelherramientas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(143, 1, 1)));
        java.awt.GridBagLayout panelherramientasLayout = new java.awt.GridBagLayout();
        panelherramientasLayout.columnWidths = new int[] {0};
        panelherramientasLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        panelherramientas.setLayout(panelherramientasLayout);

        beliminar.setBackground(new java.awt.Color(254, 254, 254));
        beliminar.setText("Eliminar");
        beliminar.setPreferredSize(new java.awt.Dimension(150, 32));
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelherramientas.add(beliminar, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setText("Editar");
        jButton4.setPreferredSize(new java.awt.Dimension(150, 32));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 42;
        panelherramientas.add(jButton4, gridBagConstraints);

        panelGrande.add(panelherramientas, java.awt.BorderLayout.LINE_END);

        PanelPrinicipal.add(panelGrande, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrinicipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrinicipal, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
      
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void batrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batrasActionPerformed
        if(evt.getSource()== batras){
            Principal vp = new Principal(); 
            vp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_batrasActionPerformed
    
    int borrarbusqueda = 0;//parametro para liminar lo que dice la barra de busqueda al dar click sobre ella
    private void txtbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbuscarMouseClicked
        if (borrarbusqueda == 0){
        txtbuscar.setText("");
        borrarbusqueda++;
        }
    }//GEN-LAST:event_txtbuscarMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

  Vector<String>elementosLista = new Vector<String>();//Almacena nombres de las canciones 
    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        String agregar = JOptionPane.showInputDialog(null,"Nombre  de la canción:");
        elementosLista.add(agregar);
        modelo.addElement(agregar);
    }//GEN-LAST:event_baddActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
      int indexSeleccionado = lista.getSelectedIndex();
      modelo.remove(indexSeleccionado);
      elementosLista.remove(indexSeleccionado);
    }//GEN-LAST:event_beliminarActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(VRepertorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRepertorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRepertorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRepertorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRepertorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrinicipal;
    private javax.swing.JPanel SEGUNDO;
    private javax.swing.JButton badd;
    private javax.swing.JButton batras;
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private DefaultListModel modelo;
    private javax.swing.JPanel panelGrande;
    private javax.swing.JPanel panelherramientas;
    private javax.swing.JPanel pencabezado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

}
