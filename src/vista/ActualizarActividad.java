/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controlador;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.Actividad;
import modelo.Empleado;
import java.sql.Blob;

/**
 *
 * @author rober
 */
public class ActualizarActividad extends javax.swing.JFrame {
    String path2="";

    /**
     * Creates new form AgregarEmpleado
     */
    public ActualizarActividad() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        idLugarTxt = new javax.swing.JTextField();
        numCuadrillaTxt = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();
        atrasBtn = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        imgBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripcion");

        jLabel2.setText("IdLugar");

        jLabel4.setText("N� cuadrilla");

        agregarBtn.setText("Actualizar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        atrasBtn.setText("Atras");
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        imgBtn.setText("Imagen");
        imgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imgBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTxt)
                            .addComponent(descTxt)
                            .addComponent(idLugarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(numCuadrillaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numCuadrillaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idLugarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgBtn)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBtn)
                    .addComponent(atrasBtn)
                    .addComponent(buscarBtn))
                .addContainerGap())
        );

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

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        // TODO add your handling code here:
        if(!this.descTxt.getText().isBlank() && !this.idLugarTxt.getText().isBlank() && !this.numCuadrillaTxt.getText().isBlank()){
            Actividad e=new Actividad();
            e.setDescripcion(this.descTxt.getText());
            e.setLugar(Integer.parseInt(this.idLugarTxt.getText()));
            e.setNumCuadrilla(Integer.parseInt(this.numCuadrillaTxt.getText()));
            e.setImagen(path2);
            
            Controlador cr=new Controlador();
            cr.actualizarAct(Integer.parseInt(this.idTxt.getText()),e);
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos inv�lidos");
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        // TODO add your handling code here:
         this.dispose();
         new menuAdmin().setVisible(true);
        
    }//GEN-LAST:event_atrasBtnActionPerformed

    private void imgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser ch=new JFileChooser();
        ch.showOpenDialog(null);
        File f= ch.getSelectedFile();
        String path=f.getAbsolutePath();
        try{
            BufferedImage bi = ImageIO.read(new File(path));
            Image img=bi.getScaledInstance(388, 176, Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(img);
            this.foto.setIcon(icon);
            path2=path;
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_imgBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
        if(!this.numCuadrillaTxt.getText().isBlank()){            
            Controlador cr=new Controlador();
            Actividad m=cr.buscarAct(Integer.parseInt(this.idTxt.getText().replaceAll(",", "")));            
            this.descTxt.setText(m.getDescripcion());
            this.numCuadrillaTxt.setText(String.valueOf(m.getNumCuadrilla()));
            this.idLugarTxt.setText(String.valueOf(m.getLugar()));
            String path=m.getImagen();
            Image img;
            try 
            {
                img = ImageIO.read(new File("C:\\Users\\rober\\Documents\\NetBeansProjects\\ActividadesLimpieza\\src\\imagenes\\img.jpg"));
                ImageIcon icon=new ImageIcon(img);
                this.foto.setIcon(icon);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos inv�lidos");
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField descTxt;
    private javax.swing.JLabel foto;
    private javax.swing.JTextField idLugarTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton imgBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numCuadrillaTxt;
    // End of variables declaration//GEN-END:variables
}
