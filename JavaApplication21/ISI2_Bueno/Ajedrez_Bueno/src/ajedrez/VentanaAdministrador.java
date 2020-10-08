/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import javax.swing.JFrame;

/**
 *
 * @author ivana
 */
public class VentanaAdministrador extends javax.swing.JFrame 
{
    /**
     * Creates new form VentanaAdministrador
     */
    public VentanaAdministrador()
    {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        ReservarSede = new javax.swing.JButton();
        IntroducirResultados = new javax.swing.JButton();
        AsignarResponsable = new javax.swing.JButton();
        RegistrarNuevoJug = new javax.swing.JButton();
        Jugadores = new javax.swing.JButton();
        Entrenadores = new javax.swing.JButton();
        Gerentes = new javax.swing.JButton();
        Torneos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ADMINISTRADOR");

        Volver.setText("VOLVER");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        ReservarSede.setText("Reservar sede para entrenamiento");
        ReservarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarSedeActionPerformed(evt);
            }
        });

        IntroducirResultados.setText("Introducir resultados");
        IntroducirResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntroducirResultadosActionPerformed(evt);
            }
        });

        AsignarResponsable.setText("Asignar responsable a los infantiles");
        AsignarResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarResponsableActionPerformed(evt);
            }
        });

        RegistrarNuevoJug.setText("Registrarse como nuevo jugador");

        Jugadores.setText("Jugadores");

        Entrenadores.setText("Entrenadores");

        Gerentes.setText("Gerentes");

        Torneos.setText("Torneos");
        Torneos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorneosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RegistrarNuevoJug, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReservarSede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AsignarResponsable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IntroducirResultados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Entrenadores, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(Gerentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Torneos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReservarSede)
                    .addComponent(Jugadores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntroducirResultados)
                    .addComponent(Entrenadores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsignarResponsable)
                    .addComponent(Gerentes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarNuevoJug)
                    .addComponent(Torneos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void TorneosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TorneosActionPerformed
        IscribirseATorneo insTorneo = new IscribirseATorneo(this);
        insTorneo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TorneosActionPerformed

    private void ReservarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarSedeActionPerformed
        ReservarSedeEntr res = new ReservarSedeEntr(this);
        res.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReservarSedeActionPerformed

    private void IntroducirResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntroducirResultadosActionPerformed
        IntroducirResultados intRes = new IntroducirResultados(this);
        intRes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IntroducirResultadosActionPerformed

    private void AsignarResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarResponsableActionPerformed
        ResponsableInfantiles respoInf = new ResponsableInfantiles(this);
        respoInf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AsignarResponsableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignarResponsable;
    private javax.swing.JButton Entrenadores;
    private javax.swing.JButton Gerentes;
    private javax.swing.JButton IntroducirResultados;
    private javax.swing.JButton Jugadores;
    private javax.swing.JButton RegistrarNuevoJug;
    private javax.swing.JButton ReservarSede;
    private javax.swing.JButton Torneos;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
