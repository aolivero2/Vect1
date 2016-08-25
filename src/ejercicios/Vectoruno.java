/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aolivero11
 */
public class Vectoruno extends javax.swing.JFrame {

    /**
     * Creates new form Vectoruno
     */
    double v[];
    public Vectoruno() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLlenadoA = new javax.swing.JButton();
        cmdLlenadoM = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos inicial:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Longitud:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtLong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongKeyTyped(evt);
            }
        });
        jPanel2.add(txtLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRes.setEditable(false);
        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane1.setViewportView(txtRes);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 188, 135));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones:"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        cmdLlenadoA.setText("Llenado Automatico");
        cmdLlenadoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        cmdLlenadoM.setText("Llenado Manual");
        cmdLlenadoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoMActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 170, 250));

        jLabel2.setText("    OPERACIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongKeyTyped
         char c=evt.getKeyChar(); 

          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();  
          }
    }//GEN-LAST:event_txtLongKeyTyped

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
       double acu=0, p=1,nm=0,nma=0;
        for (int i = 0; i <v.length; i++) {
            txtRes.append(v[i]+"\n");
        }
        for (int i = 0; i <v.length; i++) {
           acu=acu+v[i];
           p=p*v[i];
        }
        for (int i = 0; i <v.length; i++) {
            if( i==0){
            nm= v[0];
            nma= v[0];
            }
          else if(v[i] > nma){
          nma= v[i];
           }
           else if(v[i] < nm){
            nm= v[i];
           }
           }
        JOptionPane.showMessageDialog(this,"La sumatoria es:"  +acu);
        JOptionPane.showMessageDialog(this,"La producotria es:"  +p);
         JOptionPane.showMessageDialog(this,"El numero menor es:"  +nm);
         JOptionPane.showMessageDialog(this,"El numero mayor es:"  +nma);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLlenadoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoMActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n=Double.parseDouble(JOptionPane.showInputDialog("Digite el elemento en la posicion"+i));
            v[i]=n;
        }
    }//GEN-LAST:event_cmdLlenadoMActionPerformed

    private void cmdLlenadoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAActionPerformed
        double n;
     
        for (int i = 0; i < v.length; i++) {
            //n=(int)(Math.random()* + 1);
            n=i+1;
            v[i]=1;
        }
    }//GEN-LAST:event_cmdLlenadoAActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtLong.setText("");
        txtRes.setText("");
        v=null;
        txtLong.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int Longitud;
        if (txtLong.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite la longitud","Error",JOptionPane.ERROR_MESSAGE);
         txtLong.requestFocusInWindow();
        }
        else if(Integer.parseInt(txtLong.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "La longitud no puede ser cero","Error",JOptionPane.ERROR_MESSAGE);
            txtLong.requestFocusInWindow();
            txtLong.selectAll();
        }
        else{
            Longitud=Integer.parseInt(txtLong.getText().trim());
            v = new double [Longitud];
            JOptionPane.showMessageDialog(this, "Vector creado exitosamente!");
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

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
            java.util.logging.Logger.getLogger(Vectoruno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vectoruno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vectoruno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vectoruno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vectoruno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenadoA;
    private javax.swing.JButton cmdLlenadoM;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLong;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
