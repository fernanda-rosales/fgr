/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Controlador.VerTabla;
import DAO.PeliculaDAO;

import Modelo.Pelicula;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 * @author Rosales paez /Martinez Barradas
 * @version 1.5
 * fecha:12 octubre 2017*/
public class JPanelAgregar extends javax.swing.JPanel {

    PeliculaDAO peliDAO;
    Pelicula pelicula;
    String ruta = "";
    String codigo;
    float precio;
    VerTabla v;
    JTable tabla;

    /**
     * Creates new form JPanelAgregar
     * @param tabla
     */

    public JPanelAgregar(JTable tabla) {
        initComponents();
        this.tabla = tabla;
        peliDAO = new PeliculaDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbActorP = new javax.swing.JLabel();
        txtActorP = new javax.swing.JTextField();
        lbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lbGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lblimagen = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jlElegirFoto = new javax.swing.JLabel();
        btnAbrir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lbDirector = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbActorP.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbActorP.setText("Actor Principal:");

        txtActorP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbPrecio.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbPrecio.setText("Precio:");

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbGenero.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbGenero.setText("Genero de la pelicula:");

        txtGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setText("Preview");

        lbTitulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbTitulo.setText("Titulo de la pelicula:");

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlElegirFoto.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jlElegirFoto.setText("Elegir Foto:");

        btnAbrir.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 204, 51));
        btnAbrir.setText("Abrir...");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 255, 51));
        btnAgregar.setText("Agregar Pelicula");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lbDirector.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbDirector.setText("Director de la pelicula:");

        txtDirector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtGenero)
                        .addComponent(txtPrecio)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbGenero)
                                .addComponent(lbPrecio)
                                .addComponent(jlElegirFoto)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTitulo)))
                            .addGap(0, 54, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActorP)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbDirector)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtTitulo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbActorP)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtDirector))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(544, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbTitulo)
                    .addGap(3, 3, 3)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbActorP)
                    .addGap(7, 7, 7)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbDirector)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtActorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbGenero)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbPrecio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jlElegirFoto)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAbrir)
                            .addGap(169, 169, 169))
                        .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(48, 48, 48)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setCurrentDirectory(new File("Portadas"));
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if (o == JFileChooser.APPROVE_OPTION) {
            ruta = elegirImagen.getSelectedFile().getAbsolutePath();
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta);
            if (preview != null) {
                lblimagen.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
                lblimagen.setIcon(icon);
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String titulo = this.txtTitulo.getText();
        if (titulo.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el titulo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String director = this.txtDirector.getText();
        if (director.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el director", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String actor_Prin = this.txtActorP.getText();
        if (actor_Prin.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el actor_Prin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String genero = this.txtGenero.getText();
        if (genero.equals("")) {
            JOptionPane.showMessageDialog(null, "Te falto agregar el genero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String preString = this.txtPrecio.getText();
        if (preString.equals("")) {
            JOptionPane.showMessageDialog(null, "Falta Agregar el Precio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            precio = Float.parseFloat(preString);
            if (precio < 0.0) {
                JOptionPane.showMessageDialog(null, "El precio es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        codigo = "P-" + this.txtGenero.getText().charAt(0)
                + this.txtGenero.getText().charAt(1)
                + this.txtGenero.getText().charAt(2)
                + "-" + this.txtTitulo.getText().charAt(0)
                + this.txtTitulo.getText().charAt(1)
                + this.txtTitulo.getText().charAt(2);

        String imagen = ruta;

        pelicula = new Pelicula(codigo, titulo, director, actor_Prin, genero, precio, imagen);

        if (!ruta.equals("")) {
            if (peliDAO.guardarImagen(pelicula)) {
                JOptionPane.showMessageDialog(null, "La Pelicula fue Guardada Exitosamente en la Base de Datos", "Hecho", JOptionPane.INFORMATION_MESSAGE);
                txtTitulo.setText("");
                txtDirector.setText("");
                txtActorP.setText("");
                txtGenero.setText("");
                txtPrecio.setText("");
                lblimagen.setIcon(null);
                ruta = "";
                v.visualizar_tabla(tabla);
                return;
            } else {
                JOptionPane.showMessageDialog(null, "La Pelicula no puedo ser Guardada en la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Te falta Agregar la portada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jlElegirFoto;
    private javax.swing.JLabel lbActorP;
    private javax.swing.JLabel lbDirector;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTextField txtActorP;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
