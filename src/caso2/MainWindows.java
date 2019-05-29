/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Wilson
 */
public class MainWindows extends javax.swing.JFrame {
    
    boolean saveflag = false;
    ComandManager comand = ComandManager.getInstance();
    String text_temp;
    private final JFileChooser SaveFileChooser;
    private final JFileChooser OpenfileChooser; 
    private String urlsaved = null ;
    //private String extencion;

    /**
     * Creates new form MainWindows
     */
    public MainWindows() {
        initComponents();
        ChangesChecker.start();
        OpenfileChooser = new JFileChooser();
        SaveFileChooser =  new JFileChooser();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tests-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Save-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Save-as-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Printer-blue-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Redo-icon.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Undo-icon.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextPane1);

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Abrir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar como...");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu7.setText("Opciones");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Ayuda");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(627, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (saveflag){
            System.out.println("Abrir nuevo documento");
        }else{
            Object[] options = {"Guardar",
                    "No Guardar","Cancelar"};
            int n = JOptionPane.showOptionDialog(this,
            "¿Desea guardar los cambios?\n"
            +"Si elige no guardar los cambios se perderan los datos no guardados",
            "TextEditor 4 Dummies",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
            
            if(n==0){
                System.out.println("Guardar/salir");
            }else if(n==1){
                System.out.println("Abrir nuevo documento");
            }
            
        }                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (saveflag){
            System.exit(0);
        }else{
            Object[] options = {"Guardar",
                    "No Guardar","Cancelar"};
            int n = JOptionPane.showOptionDialog(this,
            "¿Desea guardar los cambios?\n"
            +"Si elige no guardar los cambios se perderan los datos no guardados",
            "TextEditor 4 Dummies",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
            
            if(n==0){
                System.out.println("Guardar/salir");
            }else if(n==1){
                System.exit(0);
            }
            
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            SaveFileChooser.setFileSelectionMode(0);
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("TXT","txt"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("XML","xml"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("JSON","json"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("TXTPT","txtpt"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("CSV","csv"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("PDF","pdf"));
            SaveFileChooser.setDialogTitle("Guardar como");
            if (SaveFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                saveflag = true;
                String ruta = SaveFileChooser.getSelectedFile().toString();
                try {
                    fileSaver(ruta);
                } catch (IOException ex) {
                    Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Ruta "+ruta);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        comand.undoMemento();
        String state= comand.getMemento();
        this.jTextPane1.setText(state);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        comand.redoMemento();
        String state= comand.getMemento();
        this.jTextPane1.setText(state);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(this.urlsaved != null){
            try {
                fileSaver(urlsaved);
            } catch (IOException ex) {
                Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            SaveFileChooser.setFileSelectionMode(0);
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("TXT","txt"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("XML","xml"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("JSON","json"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("TXTPT","txtpt"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("CSV","csv"));
            SaveFileChooser.setFileFilter(new FileNameExtensionFilter("PDF","pdf"));
            SaveFileChooser.setDialogTitle("Guardar Archivo");
            if (SaveFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                saveflag = true;
                String url = SaveFileChooser.getSelectedFile().toString();
                this.urlsaved = url;
                try {
                    fileSaver(url);
                } catch (IOException ex) {
                    Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            OpenfileChooser.setFileFilter(new FileNameExtensionFilter("TXT","txt"));
            OpenfileChooser.setFileFilter(new FileNameExtensionFilter("XML","xml"));
            OpenfileChooser.setFileFilter(new FileNameExtensionFilter("JSON","json"));
            OpenfileChooser.setFileFilter(new FileNameExtensionFilter("TXTPT","txtpt"));
            OpenfileChooser.setFileFilter(new FileNameExtensionFilter("CSV","csv"));
        int returnValue = OpenfileChooser.showOpenDialog(this);
            if(returnValue == JFileChooser.APPROVE_OPTION) {
                this.urlsaved = OpenfileChooser.getSelectedFile().getAbsolutePath();
                //System.out.println("You chose to open this directory: " +
                //OpenfileChooser.getSelectedFile().getAbsolutePath());
                fileOpener(OpenfileChooser.getSelectedFile().getAbsolutePath());
            }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            JOptionPane.showMessageDialog(null, "No se ha detectado ninguna impresora", "Error", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }
    private void fileSaver(String url) throws IOException{
        String extencion = ""+url.charAt(url.length() - 3)+url.charAt(url.length() - 2)+url.charAt(url.length() - 1) ;
        if(extencion.equals("txt")){
            comand.SaveFile(1,jTextPane1.getText(),url);
        }else if(extencion.equals("tpt")){
            comand.SaveFile(2,jTextPane1.getText(),url);
        }else if(extencion.equals("son")){
            comand.SaveFile(4,jTextPane1.getText(),url);
        }else if(extencion.equals("xml")){
            comand.SaveFile(3,jTextPane1.getText(),url);
        }else if(extencion.equals("csv")){
            comand.SaveFile(5,jTextPane1.getText(),url);
        }else if(extencion.equals("pdf")){
            comand.SaveFile(6,jTextPane1.getText(),url);
        }else{
            JOptionPane.showMessageDialog(null, "El formato no se soporta", "Error de archivo", JOptionPane.WARNING_MESSAGE);
            this.urlsaved = null;
        }
    }
    
   
    private void fileOpener (String url){
        String extencion = ""+url.charAt(url.length() - 3)+url.charAt(url.length() - 2)+url.charAt(url.length() - 1) ;
        if(extencion.equals("txt")){
            jTextPane1.setText(comand.LoadFile(1,url)); 
        }else if(extencion.equals("tpt")){
            jTextPane1.setText(comand.LoadFile(2,url)); 
        }else if(extencion.equals("son")){
            jTextPane1.setText(comand.LoadFile(4,url)); 
        }else if(extencion.equals("xml")){
            jTextPane1.setText(comand.LoadFile(3,url)); 
        }else if(extencion.equals("csv")){
            jTextPane1.setText(comand.LoadFile(5,url)); 
        }else{
            JOptionPane.showMessageDialog(null, "El formato no se soporta", "Error de archivo", JOptionPane.WARNING_MESSAGE);
            this.urlsaved = null;
        }
    }
    
    
    private Thread ChangesChecker = new Thread()
    {
        @Override
        public void run()
        {
          
            try
            {
                while(true)
                {
                   
                  
                    
                    String text = jTextPane1.getText();
                    if(!text.equals(text_temp)){
                        comand.saveMemento(text);
                        saveflag = false;
                    }else{
                        System.out.println("No guardo no hay diferencias");
                    }
                    
                    text_temp = text;
                    ChangesChecker.sleep(10000);
                  
                 
                    System.out.println("Detectando cambios");
                    
                }
            } catch (java.lang.InterruptedException ie) { System.out.println(ie.getMessage()); }
        }
    };
    
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
