/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriofm2.pkg0;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sucely Alvarez
 */
public class Mantenimiento_Juegos extends javax.swing.JInternalFrame {

    public Mantenimiento_Juegos() {
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

        jLabel3 = new javax.swing.JLabel();
        txtNombre_J = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio_J = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExistencia_J = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbox_Genero = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbox_Clas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAutor_J = new javax.swing.JTextField();
        lbgenero = new javax.swing.JLabel();
        lbclas = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Videojuegos");
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jLabel3.setText("Nombre");

        jLabel5.setText("Precio");

        jLabel6.setText("Existencia");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Género");

        cbox_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Terror", "Comedia", "Romantica", "Suspenso", "Familiar", "Anime", "Accion", "Ciencia Ficcion", "Aventura" }));
        cbox_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_GeneroActionPerformed(evt);
            }
        });

        jLabel8.setText("Clasificación");

        cbox_Clas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Seleccione...", "“AA", " “A”", " “B”", " “B15”", " “C”", " “D”" }));

        jLabel4.setText("Autor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(txtNombre_J, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(txtExistencia_J, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAutor_J, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio_J)
                                    .addComponent(cbox_Genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbox_Clas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbgenero)
                            .addComponent(lbclas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAutor_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lbgenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Clas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lbclas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExistencia_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("insert into articulos values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtNombre_J.getText().trim());
            pst.setString(3, txtAutor_J.getText().trim());
            //pst.setString(4, cbox_Genero.getSelectedItem().toString());
            //pst.setString(5, cbox_Clas.getSelectedItem().toString());
            pst.setString(6, "N/A".trim());
            pst.setString(7, txtPrecio_J.getText().trim());
            pst.setString(8, txtExistencia_J.getText().trim());
            pst.setString(9, "2");
            pst.executeUpdate();


            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
           
            txtNombre_J.setText("");
            txtAutor_J.setText("");
            txtPrecio_J.setText("");
            txtExistencia_J.setText("");
             cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
        }catch (Exception e){
             JOptionPane.showMessageDialog(this, "¡REGITRO FALLIDO!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("delete from articulos where Codigo_A = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();

            txtbuscado.setText("");

            JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

            txtNombre_J.setText("");
            txtAutor_J.setText("");
            txtPrecio_J.setText("");
            txtExistencia_J.setText("");
            lbgenero.setText("");
            lbclas.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String codigo = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("update articulos set Nombre_A = ? , Autor_A= ? , Genero_A=? , Clasificacion_A= ? , Duracion_A= ?, Precio_A= ?, Existencia=?  where Codigo_P = " + codigo);
      
            pst.setString(1, txtNombre_J.getText().trim());
            pst.setString(2, txtAutor_J.getText().trim());
            pst.setString(3, cbox_Genero.getSelectedItem().toString());
            pst.setString(4, cbox_Clas.getSelectedItem().toString());
            pst.setString(5, "N/A".trim());
            pst.setString(6, txtPrecio_J.getText().trim());
            pst.setString(7, txtExistencia_J.getText().trim());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            
            txtNombre_J.setText("");
            txtAutor_J.setText("");
            txtPrecio_J.setText("");
            txtExistencia_J.setText("");
            lbgenero.setText("");
            lbclas.setText("");
             cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "NO SE PUDO MODIFICAR.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String buscar = txtbuscado.getText().trim();
        if(buscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el campo de busqueda!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select * from articulos where Codigo_A = ?");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
               txtNombre_J.setText(rs.getString("Nombre_A"));
            txtAutor_J.setText(rs.getString("Autor_A"));
            cbox_Genero.setSelectedItem(rs.getString("Genero_A"));
            cbox_Clas.setSelectedItem(rs.getString("Clasificacion_A"));
            lbgenero.setText(rs.getString("Genero_A"));
            lbclas.setText(rs.getString("Clasificacion_A"));
            txtPrecio_J.setText(rs.getString("Precio_A"));
            txtExistencia_J.setText(rs.getString("Existencia"));
            
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Pelicula no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbox_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_GeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_Clas;
    private javax.swing.JComboBox<String> cbox_Genero;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbclas;
    private javax.swing.JLabel lbgenero;
    private javax.swing.JTextField txtAutor_J;
    private javax.swing.JTextField txtExistencia_J;
    private javax.swing.JTextField txtNombre_J;
    private javax.swing.JTextField txtPrecio_J;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
