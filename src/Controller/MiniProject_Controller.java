/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MiniProjectUI;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 *
 * @author rizky
 */
public class MiniProject_Controller {

    private MiniProjectUI view;

    public MiniProject_Controller(MiniProjectUI view) {
        this.view = view;
        this.view.getBtnRead().addActionListener((e) -> {
            try {
                read();
            } catch (BadLocationException ex) {
                Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.view.getBtnSave().addActionListener((e) -> {
            save();
        });
    }

    private void save() {

        JFileChooser loadFile = view.getLoadFile();
        if (JFileChooser.APPROVE_OPTION == loadFile.showSaveDialog(view)) {
            BufferedOutputStream writer = null;
            try {
                String contents = view.getTxtArea().getText();
                if (contents != null && !contents.isEmpty()) {
                    writer = new BufferedOutputStream(new FileOutputStream(loadFile.getSelectedFile()));
                    writer.write(contents.getBytes(), 0, contents.length());
                    JOptionPane.showMessageDialog(view, "File berhasil ditulis.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(view, "Text Editor is empty. Cannot Save the document.", "Warning", JOptionPane.WARNING_MESSAGE);

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (writer != null) {
                    try {
                        writer.flush();
                        writer.close();
                        view.getTxtArea().setText("");
                    } catch (IOException ex) {
                        Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private void read() throws BadLocationException {
        JFileChooser loadFile = view.getLoadFile();
        Document doc = view.getTxtArea().getDocument();
        if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)) {
            BufferedInputStream reader = null;
            try {
                reader = new BufferedInputStream(new FileInputStream(loadFile.getSelectedFile()));
                doc.insertString(0, "", null);

                int temp = 0;

                byte[] dt = new byte[reader.available()];
                if (!(reader.available() <= 0)) {
                    while ((temp = reader.read(dt)) != -1);
                }

                doc.insertString(doc.getLength(), new String(dt), null);
                JOptionPane.showMessageDialog(view, "File berhasil dibaca.", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | BadLocationException ex) {
                Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException ex) {
                        Logger.getLogger(MiniProject_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
