package wordpad;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
/**
 *
 * @author Hardik Rawat | Copywrite 2020
 */
public class OCRFrame extends javax.swing.JFrame {
    private Timer timer = new Timer();
    public OCRFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        prg = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jSlider2 = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        button8 = new java.awt.Button();
        button7 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(250, 246, 246));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t      OCR Result will be shown here");
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextArea1);

        prg.setBackground(new java.awt.Color(255, 255, 255));
        prg.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        prg.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setBackground(new java.awt.Color(250, 246, 246));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selected Image will be shown here");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton1.setBackground(new java.awt.Color(250, 246, 246));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText(" Choose Image File ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);
        jToolBar2.add(jSeparator13);

        jButton2.setBackground(new java.awt.Color(250, 246, 246));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setText(" Cut ");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);
        jToolBar2.add(jSeparator14);

        jButton3.setBackground(new java.awt.Color(250, 246, 246));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setText(" Copy ");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton3);
        jToolBar2.add(jSeparator15);

        jButton4.setBackground(new java.awt.Color(250, 246, 246));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton4.setText(" Paste ");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton4);
        jToolBar2.add(jSeparator16);

        jButton5.setBackground(new java.awt.Color(250, 246, 246));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton5.setText("Peform Optical Character Recognition");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton5);
        jToolBar2.add(jSeparator17);

        jButton6.setBackground(new java.awt.Color(250, 246, 246));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton6.setText(" How to Works ? ");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton6);
        jToolBar2.add(jSeparator18);

        jSlider2.setBackground(new java.awt.Color(250, 246, 246));
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        jToolBar2.add(jSlider2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        button8.setBackground(new java.awt.Color(250, 246, 246));
        button8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        button8.setLabel("Close");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(250, 246, 246));
        button7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        button7.setLabel("Back");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-- Optical Character Recognition - Extract Text FromImages --");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        int size = jSlider2.getValue();
        if (jTextArea1.getFont().getSize() > size) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), jTextArea1.getFont().getStyle(), size));
        } else if (jTextArea1.getFont().getSize() < size) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), jTextArea1.getFont().getStyle(), size));
        }
    }//GEN-LAST:event_jSlider2StateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String str = new File("resources\\General-working-of-OCR-3.jpg").getAbsolutePath();
        ImageIcon image = new ImageIcon(str);
        Image icon = image.getImage();
        Image modified_image = icon.getScaledInstance(700, 500, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(modified_image);
        System.out.println(""+str);
        JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, image);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        prg.setStringPainted(true);
        prg.setValue(33);
        prg.setString("Initializing OCR: 33%");
        prg.update(prg.getGraphics());

        Tesseract tesseract = new Tesseract();
        try {
            Thread.sleep(2000);
            prg.setValue(45);
            prg.setString("Starting Tesseract: 45%");
            prg.update(prg.getGraphics());
            String str = new File("resources\\tessdata").getAbsolutePath();
            tesseract.setDatapath(str);
            if (file_name.length() == 0) {
                JOptionPane.showMessageDialog(OCRFrame.this, "<hmtl><b>Error:</b>\nNo Image is Selected!\nPlease select an Image first.");
            }
            String text = tesseract.doOCR(new File(file_name));
            prg.setString("Almost There: 74%");
            prg.setValue(74);
            prg.update(prg.getGraphics());
            Thread.sleep(500);
            jTextArea1.setText(text);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(OCRFrame.this, "Error: " + e);
        }
        prg.setValue(100);
        prg.update(prg.getGraphics());
        prg.setString("Task Done: 100%");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.paste();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.cut();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(OCRFrame.this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            file_name = fileChooser.getCurrentDirectory().toString() + "\\" + file.getName();
            //                System.out.println("File_name: " + file_name);
            ImageIcon image = new ImageIcon(file_name);
            Image icon = image.getImage();
            Image modified_image = icon.getScaledInstance(332, 448, java.awt.Image.SCALE_SMOOTH);
            image = new ImageIcon(modified_image);
            jLabel2.setIcon(image);
            jLabel2.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Operation Suspended !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Any unsaved changes will be lost !", "Confirm ?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (response == JOptionPane.NO_OPTION) {
            //operation suspended
        } else {
            //operation suspended
            System.out.println("Operation Suspended!");
        }
    }//GEN-LAST:event_button8ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Any unsaved changes will be lost !", "Confirm ?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
            new ProgressFrame().setVisible(true);
            TimerTask task = new TimerTask() {
                public void run() {
                    counter++;
                    if (counter == 4) {
                        timer.cancel();
                        counter = 1;
                        new WelcomeFrameUI().setVisible(true);
                    }
                }
            };
            timer.schedule(task, 500, 1000);
        } else if (response == JOptionPane.NO_OPTION) {
            //operation suspended
        } else {
            //operation suspended
            System.out.println("Operation Suspended!");
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setTitle("Wordpad++ | OCR Mode | File: TestHumanWriting.png | Developer: Hardik Rawat" );
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
       jButton1.doClick();
    }//GEN-LAST:event_jLabel2MouseClicked
    String file_name = "";
    int counter = 0;
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OCRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OCRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OCRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OCRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OCRFrame().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button7;
    private java.awt.Button button8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JProgressBar prg;
    // End of variables declaration//GEN-END:variables
}
