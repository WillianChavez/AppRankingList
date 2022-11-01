/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apprankinglist;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author willi
 */
public class ViewRanking extends javax.swing.JFrame {

    /**
     * Creates new form ranking
     */
    public ArrayList<Jugador> jugadores;
    public Jugador jugador;
    public   DefaultTableModel model;
    public ViewRanking(ArrayList<Jugador> lista,Jugador player) {
        initComponents();
        jugadores = lista;
        jugador = player;
        
        rellenarTabla();
        int posicion = 0;
        for(int i = 0; i<model.getRowCount();i++){
            System.out.println(model.getValueAt(i, 0));
            if(player.getNombre() == model.getValueAt(i, 1)){
                posicion = (int) model.getValueAt(i, 0);
            }
        }
        txtPosicion.setText("Felicidades " + jugador.getNombre() + "\n quedaste en " + posicion +"º con " + jugador.getPuntaje()+" Puntos" );
        
        this.setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(background, "src/images/background.jpg");
    }

    private ViewRanking() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void rellenarTabla(){
         String[] columnas = {"Clasificación", "Nombre", "Puntaje"};
      model = new DefaultTableModel(null,columnas);
        for(int i = 0; i<jugadores.size();i++){
            Jugador jugador = jugadores.get(i);
            Object[] obj = new Object[]{
                i +1,
                jugador.getNombre(),
                jugador.getPuntaje()
                
                
            };
            model.addRow(obj);
        }
       
        tableRanking.setModel(model);
        tableRanking.repaint();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.
     * The content of this method is always
 regenerated by the Form Editor.
     * @param lista
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRanking = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtPosicion = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RANKING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tableRanking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clasificación", "Nombre", "Puntaje"
            }
        ));
        jScrollPane1.setViewportView(tableRanking);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 250));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 40));

        txtPosicion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPosicion.setForeground(new java.awt.Color(255, 255, 255));
        txtPosicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPosicion.setText("txtPosicion");
        jPanel1.add(txtPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 370, 450, -1));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        view newFrame = new view();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRanking;
    private javax.swing.JLabel txtPosicion;
    // End of variables declaration//GEN-END:variables
}