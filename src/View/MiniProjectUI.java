/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MiniProject_Controller;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author rizky
 */
public class MiniProjectUI extends javax.swing.JFrame {

    private MiniProject_Controller controller;
    private SimpleAttributeSet defaultAttrib, FontAttrib;
    Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.cyan);
    int count = 0;

    /**
     * Creates new form MiniProjectUI
     */
    public MiniProjectUI() {
        initComponents();
        setTitle("Word Find And Replace");
        controller = new MiniProject_Controller(this);
        defaultAttrib = new SimpleAttributeSet();
        FontAttrib = new SimpleAttributeSet();
        StyleConstants.setFontFamily(defaultAttrib, "Arial");
        txtArea.setCharacterAttributes(defaultAttrib, true);
    }

    public MiniProject_Controller getController() {
        return controller;
    }

    public void setController(MiniProject_Controller controller) {
        this.controller = controller;
    }

    public JFileChooser getLoadFile() {
        return loadFile;
    }

    public void setLoadFile(JFileChooser loadFile) {
        this.loadFile = loadFile;
    }

    public JButton getBtnRead() {
        return btnRead;
    }

    public void setBtnRead(JButton btnRead) {
        this.btnRead = btnRead;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JButton btnSave) {
        this.btnSave = btnSave;
    }

    public JButton getBtnSearch() {
        return btnFind;
    }

    public void setBtnSearch(JButton btnSearch) {
        this.btnFind = btnSearch;
    }

    public SimpleAttributeSet getDefaultAttrib() {
        return defaultAttrib;
    }

    public void setDefaultAttrib(SimpleAttributeSet defaultAttrib) {
        this.defaultAttrib = defaultAttrib;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextPane getTxtArea() {
        return txtArea;
    }

    public void setTxtArea(JTextPane txtArea) {
        this.txtArea = txtArea;
    }

    public JTextField getTxtWord() {
        return txtFind;
    }

    public void setTxtWord(JTextField txtWord) {
        this.txtFind = txtWord;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadFile = new javax.swing.JFileChooser();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextPane();
        txtReplace = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReplace = new javax.swing.JButton();
        btnBold = new javax.swing.JToggleButton();
        btnItalic = new javax.swing.JToggleButton();
        btnUnderline = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFind.setText("Find Word");
        btnFind.setActionCommand("");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnRead.setText("Read File");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnSave.setText("Save File");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtArea);

        jLabel2.setText("Find word:");

        jLabel3.setText("Replace word:");

        btnReplace.setText("Replace Word");
        btnReplace.setActionCommand("");
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });

        btnBold.setText("B");
        btnBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoldActionPerformed(evt);
            }
        });

        btnItalic.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnItalic.setText("I");
        btnItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalicActionPerformed(evt);
            }
        });

        btnUnderline.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnUnderline.setText("U");
        btnUnderline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnderlineActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Code Medium", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simple Word Find and Replace");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnItalic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUnderline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReplace))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRead)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReplace)
                    .addComponent(btnBold)
                    .addComponent(btnItalic)
                    .addComponent(btnUnderline))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRead)
                    .addComponent(btnSave))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public JButton getBtnFind() {
        return btnFind;
    }

    public void setBtnFind(JButton btnFind) {
        this.btnFind = btnFind;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            txtArea.getHighlighter().removeAllHighlights();
            String findText = txtFind.getText();
            int findLength = findText.length();

            int length = txtArea.getDocument().getLength();
            String text = txtArea.getDocument().getText(0, length);
            count = 0;
            int offset = text.indexOf(findText);

            while (offset != -1) {

                txtArea.getHighlighter().addHighlight(offset, offset + findLength, painter);
                offset = text.indexOf(findText, offset + 1);
                count++;
            }
        } catch (BadLocationException ble) {
        }
    }//GEN-LAST:event_btnFindActionPerformed

    public SimpleAttributeSet getFontAttrib() {
        return FontAttrib;
    }

    public void setFontAttrib(SimpleAttributeSet FontAttrib) {
        this.FontAttrib = FontAttrib;
    }

    public Highlighter.HighlightPainter getPainter() {
        return painter;
    }

    public void setPainter(Highlighter.HighlightPainter painter) {
        this.painter = painter;
    }

    public JButton getBtnReplace() {
        return btnFind;
    }

    public void setBtnReplace(JButton btnReplace) {
        this.btnFind = btnReplace;
    }

    public JTextField getTxtFind() {
        return txtFind;
    }

    public void setTxtFind(JTextField txtFind) {
        this.txtFind = txtFind;
    }

    public JTextField getTxtReplace() {
        return txtReplace;
    }

    public void setTxtReplace(JTextField txtReplace) {
        this.txtReplace = txtReplace;
    }

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed
        try {
            txtArea.getHighlighter().removeAllHighlights();
            String findText = txtFind.getText();
            int findLength = findText.length();
            String replaceText = txtReplace.getText();
            int replaceLength = replaceText.length();
            
            Document doc = txtArea.getDocument();
            int length = txtArea.getDocument().getLength();
            String text = doc.getText(0, length);
            count = 0;
            int offset = 0;

            while ((offset = text.indexOf(findText, offset)) != -1) {
                int replaceOffset = offset + ((replaceLength - findLength) * count);
                txtArea.select(replaceOffset, replaceOffset + findLength);
                txtArea.replaceSelection(replaceText);

                txtArea.getHighlighter().addHighlight(replaceOffset, replaceOffset + replaceLength, painter);
                offset += replaceLength;
                //text = doc.getText(0, doc.getLength());
                count++;
            }
        } catch (BadLocationException ble) {
        }
    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoldActionPerformed
        if(btnBold.isBorderPainted()){
            btnBold.setBorderPainted(false);
            StyleConstants.setBold(FontAttrib, true);
        }
        else{
            btnBold.setBorderPainted(true);
            StyleConstants.setBold(FontAttrib, false);
        }
        txtArea.setCharacterAttributes(FontAttrib, true);
    }//GEN-LAST:event_btnBoldActionPerformed

    private void btnItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalicActionPerformed
        if(btnItalic.isBorderPainted()){
            btnItalic.setBorderPainted(false);
            StyleConstants.setItalic(FontAttrib, true);
        }
        else{
            btnItalic.setBorderPainted(true);
            StyleConstants.setItalic(FontAttrib, false);
        }
        txtArea.setCharacterAttributes(FontAttrib, true);
    }//GEN-LAST:event_btnItalicActionPerformed

    private void btnUnderlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnderlineActionPerformed
        if(btnUnderline.isBorderPainted()){
            btnUnderline.setBorderPainted(false);
            StyleConstants.setUnderline(FontAttrib, true);
        }
        else{
            btnUnderline.setBorderPainted(true);
            StyleConstants.setUnderline(FontAttrib, false);
        }
        txtArea.setCharacterAttributes(FontAttrib, true);
    }//GEN-LAST:event_btnUnderlineActionPerformed

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
            java.util.logging.Logger.getLogger(MiniProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniProjectUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBold;
    private javax.swing.JButton btnFind;
    private javax.swing.JToggleButton btnItalic;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnReplace;
    private javax.swing.JButton btnSave;
    private javax.swing.JToggleButton btnUnderline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFileChooser loadFile;
    private javax.swing.JTextPane txtArea;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtReplace;
    // End of variables declaration//GEN-END:variables
}
