package wordpad;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author Hardik Rawat | Copywrite 2020
 */
public class CodeProcesssingFrame extends javax.swing.JFrame {
    
    private RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
    private int counter = 1;
    private int count = 0;
    private Timer timer = new Timer();
    private String NewFile = "";
    private String title = "";
    public CodeProcesssingFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jButton8 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jButton9 = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jButton10 = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jButton11 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jButton12 = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jButton13 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jButton14 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jButton15 = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        findTextfeild = new javax.swing.JTextField();
        findBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        replaceTextFeild = new javax.swing.JTextField();
        replaceBtn = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator9 = new javax.swing.JSeparator();
        jSlider1 = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        button8 = new java.awt.Button();
        button7 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(228, 228, 228));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(250, 246, 246));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel4KeyTyped(evt);
            }
        });
        jPanel4.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Untitled.c", jPanel4);

        jToolBar1.setBackground(new java.awt.Color(250, 246, 246));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton3.setBackground(new java.awt.Color(250, 246, 246));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setText("New");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator10);

        jButton2.setBackground(new java.awt.Color(250, 246, 246));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setText("Open");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator11);

        jButton4.setBackground(new java.awt.Color(250, 246, 246));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton4.setText("Save");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator12);

        jButton8.setBackground(new java.awt.Color(250, 246, 246));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton8.setText("Print");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);
        jToolBar1.add(jSeparator13);

        jButton9.setBackground(new java.awt.Color(250, 246, 246));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton9.setText("Cut");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);
        jToolBar1.add(jSeparator14);

        jButton10.setBackground(new java.awt.Color(250, 246, 246));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton10.setText("Copy");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);
        jToolBar1.add(jSeparator15);

        jButton11.setBackground(new java.awt.Color(250, 246, 246));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton11.setText("Paste");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);
        jToolBar1.add(jSeparator20);

        jButton12.setBackground(new java.awt.Color(250, 246, 246));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton12.setText("Commment");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton12);
        jToolBar1.add(jSeparator16);

        jButton13.setBackground(new java.awt.Color(250, 246, 246));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton13.setText("()");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton13);
        jToolBar1.add(jSeparator17);

        jButton14.setBackground(new java.awt.Color(250, 246, 246));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton14.setText("{}");
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton14);
        jToolBar1.add(jSeparator18);

        jButton15.setBackground(new java.awt.Color(250, 246, 246));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton15.setText("[]");
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton15);
        jToolBar1.add(jSeparator21);

        jCheckBox2.setBackground(new java.awt.Color(250, 246, 246));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jCheckBox2);

        jLabel1.setBackground(new java.awt.Color(250, 246, 246));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText(" Code Folding ");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel1);
        jToolBar1.add(jSeparator22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText(" Language: ");
        jToolBar1.add(jLabel2);

        jComboBox2.setBackground(new java.awt.Color(250, 246, 246));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "C-Sharp", "CSS", "HTML", "Java", "JavaScript", "Json", "PHP", "Python", "Scala", "SQL", "Unix Shell", "Windows Batch", "XML" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jComboBox2);
        jToolBar1.add(jSeparator23);

        jButton5.setBackground(new java.awt.Color(250, 246, 246));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton5.setText("More");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jLabel6.setText(" ");
        jToolBar1.add(jLabel6);

        jToolBar2.setBackground(new java.awt.Color(250, 246, 246));
        jToolBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Other Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        findTextfeild.setBackground(new java.awt.Color(250, 246, 246));
        jToolBar2.add(findTextfeild);

        findBtn.setBackground(new java.awt.Color(250, 246, 246));
        findBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(findBtn);
        jToolBar2.add(jSeparator1);

        replaceTextFeild.setBackground(new java.awt.Color(250, 246, 246));
        jToolBar2.add(replaceTextFeild);

        replaceBtn.setBackground(new java.awt.Color(250, 246, 246));
        replaceBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        replaceBtn.setText("Find & Replace");
        replaceBtn.setActionCommand("");
        replaceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(replaceBtn);
        jToolBar2.add(jSeparator19);

        jCheckBox1.setBackground(new java.awt.Color(250, 246, 246));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Match Case");
        jToolBar2.add(jCheckBox1);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.add(jSeparator9);

        jSlider1.setBackground(new java.awt.Color(250, 246, 246));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(0, 0, 0));
        jSlider1.setMinimum(2);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(26);
        jSlider1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 33, 89)), "Zoom In/Out", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setOpaque(false);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jToolBar2.add(jSlider1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        button8.setActionCommand("[250,246,246]");
        button8.setBackground(new java.awt.Color(255, 255, 255));
        button8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        button8.setLabel("Close");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button7.setActionCommand("[250,246,246]");
        button7.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel5.setText("-- Code Editor for Multiple Languages --");
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
            .addComponent(jTabbedPane1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        int size = jSlider1.getValue();
        if (textArea.getFont().getSize() > size) {
            textArea.setFont(new Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), size));
        } else if (textArea.getFont().getSize() < size) {
            textArea.setFont(new Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), size));
        }
        System.out.println("Size: " + size);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jPanel4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4KeyTyped

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved

    }//GEN-LAST:event_jPanel4MouseMoved

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

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        textArea.getHighlighter().removeAllHighlights();
        String text = textArea.getText();
        if (!jCheckBox1.isSelected()) {
            text = text.toLowerCase();
        }
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.CYAN);
        int offset = text.indexOf(findTextfeild.getText());
        int length = findTextfeild.getText().length();
        while (offset != -1) {
            try {
                textArea.getHighlighter().addHighlight(offset, offset + length, painter);
                offset = textArea.getText().indexOf(findTextfeild.getText(), offset + 1);
            } catch (BadLocationException ble) {
                System.out.println(ble);
            }
        }
    }//GEN-LAST:event_findBtnActionPerformed

    private void replaceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceBtnActionPerformed
        textArea.getHighlighter().removeAllHighlights();
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.CYAN);
        int offset = textArea.getText().indexOf(findTextfeild.getText());
        int length = findTextfeild.getText().length();
        while (offset != -1) {
            try {
                textArea.getHighlighter().addHighlight(offset, offset + length, painter);
                offset = textArea.getText().indexOf(findTextfeild.getText(), offset + 1);
            } catch (BadLocationException ble) {
                System.out.println(ble);
            }
        }
        String replacedString = textArea.getText().replaceAll(findTextfeild.getText(), replaceTextFeild.getText());
        textArea.setText(replacedString);
        textArea.requestFocus();
        
    }//GEN-LAST:event_replaceBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jToolBar2.isVisible()) {
            jToolBar2.setVisible(false);
        } else {
            jToolBar2.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
                        new CodeProcesssingFrame().setVisible(true);
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textArea.requestFocus();
        boolean NewWindowWanted = false;
        int response = JOptionPane.showConfirmDialog(this, "Open in New Window ?");
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showOpenDialog(this);
        if (response == JOptionPane.OK_OPTION) {
            NewWindowWanted = true;
            
        } else {
            NewWindowWanted = false;
        }
        
        if (NewWindowWanted && chooserValue == JFileChooser.APPROVE_OPTION) {
            try {
                CodeProcesssingFrame nor = new CodeProcesssingFrame();
                nor.setVisible(true);
                
                nor.NewFile = chooser.getSelectedFile().getName().toString();
                nor.setTitle(NewFile);
                jTabbedPane1.setTitleAt(0, NewFile);
                Scanner fin = new Scanner(chooser.getSelectedFile());
                String buffer = "";
                while (fin.hasNext()) {
                    buffer += fin.nextLine() + "\n";
                }
                nor.textArea.setText(buffer);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "File not found");
            }
        } else if ((!NewWindowWanted) && (chooserValue == JFileChooser.APPROVE_OPTION)) {
            try {
                
                NewFile = chooser.getSelectedFile().getName().toString();
                this.setTitle(NewFile);
                jTabbedPane1.setTitleAt(0, NewFile);
                Scanner fin = new Scanner(chooser.getSelectedFile());
                String buffer = "";
                while (fin.hasNext()) {
                    buffer += fin.nextLine() + "\n";
                }
                this.textArea.setText(buffer);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "File not found");
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "System Error: Unknown File Opening Error");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String name = JOptionPane.showInputDialog("Enter file name: ");
        if (name.length() > 0) {
            String fileName = System.getProperty("user.dir") + "\\"+name;
            File file = new File(fileName);
            String text = textArea.getText();
            try {
                if (file.createNewFile() == true) {
                    JOptionPane.showMessageDialog(this, "Saved Successfuly at: " + fileName);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error: File Already Exists!");
                }
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("/* Code made in Wordpad++ */" + text);
                    jTabbedPane1.setTitleAt(0, name);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "System Error: " + ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: Please Enter a valid File Name");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            textArea.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Error Printing: " + ex.toString());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        textArea.cut();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        textArea.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        textArea.paste();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (textArea.getSyntaxEditingStyle().equals(SyntaxConstants.SYNTAX_STYLE_JAVA)) {
            String code = textArea.getSelectedText();
            code = "/*" + code + "*/";
            textArea.replaceSelection(code);
        } else if (textArea.getSyntaxEditingStyle().equals(SyntaxConstants.SYNTAX_STYLE_XML)) {
            String code = textArea.getSelectedText();
            code = "<!--" + code + "-->";
            textArea.replaceSelection(code);
        } else {
            JOptionPane.showMessageDialog(this, "Feature will be available soon for other languages too...");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String code = textArea.getSelectedText();
        code = "(" + code + ")";
        textArea.replaceSelection(code);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String code = textArea.getSelectedText();
        code = "{" + code + "}";
        textArea.replaceSelection(code);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String code = textArea.getSelectedText();
        code = "[" + code + "]";
        textArea.replaceSelection(code);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected() == true) {
            textArea.setCodeFoldingEnabled(false);
        } else {
            textArea.setCodeFoldingEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (jCheckBox2.isSelected() == true) {
            textArea.setCodeFoldingEnabled(false);
            jCheckBox2.setSelected(false);
        } else {
            textArea.setCodeFoldingEnabled(true);
            jCheckBox2.setSelected(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Any unsaved changes will be lost !", "Confirm ?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            int index = jComboBox2.getSelectedIndex();
            switch (index) {
                case 0:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
                    break;
                case 1:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CPLUSPLUS);
                    break;
                case 2:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CSHARP);
                    break;
                case 3:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CSS);
                    break;
                case 4:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_HTML);
                    break;
                case 5:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
                    break;
                case 6:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVASCRIPT);
                    break;
                case 7:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JSON);
                    break;
                case 8:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PHP);
                    break;
                case 9:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
                    break;
                case 10:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_SCALA);
                    break;
                case 11:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_SQL);
                    break;
                case 12:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_UNIX_SHELL);
                    break;
                case 13:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_WINDOWS_BATCH);
                    break;
                case 14:
                    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_XML);
                    break;
            }
        } else if (response == JOptionPane.NO_OPTION) {
            //operation suspended

        } else {
            //operation suspended
            System.out.println("Operation Suspended!");
        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea);
        jPanel4.add(sp);
        textArea.setFont(new Font("Monospace", Font.PLAIN, 12));
        jToolBar2.setVisible(false);
        this.setTitle("Wordpad++ | Code Editing Mode | File: NewFile | Status: Unsaved | Developer: Hardik Rawat" );
    }//GEN-LAST:event_formWindowOpened
    private void closeThis() {
        this.dispose();
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CodeProcesssingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeProcesssingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeProcesssingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeProcesssingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodeProcesssingFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button7;
    private java.awt.Button button8;
    private javax.swing.JButton findBtn;
    private javax.swing.JTextField findTextfeild;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton replaceBtn;
    private javax.swing.JTextField replaceTextFeild;
    // End of variables declaration//GEN-END:variables
}