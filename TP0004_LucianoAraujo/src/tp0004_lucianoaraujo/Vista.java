/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp0004_lucianoaraujo;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Auto Servicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Cliente> listclients = new ArrayList<>();
        ArrayList<Cliente> ordenprioridad = new ArrayList<>();
        int prioridad = 0;
        int pem = 0;
        int cce = 0;
       
        
        listclients.add(new Cliente("Juana",30,"F",true));
        listclients.add(new Empleado("Pedro",54,"M",true));
        listclients.add(new Cliente("Goku",59,"M",false));
        listclients.add(new Cliente("Pablo",34,"M",false));
        listclients.add(new Cliente("Nancy",40,"F",false));
        listclients.add(new Cliente("Valentina",45,"F",true));
        listclients.add(new Cliente("Victoria",21,"F",false));
        listclients.add(new Cliente("Luciano",25,"M",false));
        listclients.add(new Cliente("Ariel",33,"F",true));
        listclients.add(new Cliente("Eugenia",34,"F",true));
        
        for(Cliente c : listclients){ 
            if(c instanceof Empleado ){
                cce++;
            }           
        }
        for(Cliente c : listclients){
            if(c.getIsEmbarazada()){
                ordenprioridad.add(c);
                pem++;
                c.setPrioridad(pem);
                
            }
        }
         int pan = pem;
         
        for(Cliente c : listclients){
            if(c.getIsEmbarazada() == false && c.getEdad() > 65  ){
                ordenprioridad.add(c);
                pan++;
                c.setPrioridad(pan);
            }
        }
        prioridad = pan;
        for(Cliente c : listclients){
            if(c.getIsEmbarazada() == false ){
                ordenprioridad.add(c);
                prioridad++;
                c.setPrioridad(prioridad);
            }
        }
        
        ordenprioridad.forEach((c) -> {
            System.out.println("La prioridad de "+ c.getNombre() + " Es de " + c.getPrioridad() );
        });
        System.out.println("La cantidad de empleados que tambien son clientes es de: " + cce);
        
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
