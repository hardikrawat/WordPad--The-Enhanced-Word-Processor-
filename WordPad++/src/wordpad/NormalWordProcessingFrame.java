package wordpad;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Hardik Rawat | Copywrite 2020
 */
public class NormalWordProcessingFrame extends javax.swing.JFrame {

    private java.util.Timer timer = new java.util.Timer();

    public NormalWordProcessingFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cutBtn = new java.awt.Button();
        copyBtn = new java.awt.Button();
        pasteBtn = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jFontCb = new java.awt.Choice();
        jSizeCb = new java.awt.Choice();
        jLabel12 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextColor = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jHighlight = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jBold = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jItalic = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jUnderline = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSrike = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        incBtn = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        decBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        upperCaseBtn = new java.awt.Button();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        lowerCaseBtn = new java.awt.Button();
        jPanel10 = new javax.swing.JPanel();
        btnOpen = new java.awt.Button();
        btnSave = new java.awt.Button();
        btnNew = new java.awt.Button();
        btnPrint = new java.awt.Button();
        btnFnR = new java.awt.Button();
        btnClose = new java.awt.Button();
        btnBack = new java.awt.Button();
        matchCheckBox = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        lAlign = new javax.swing.JLabel();
        jAlign = new javax.swing.JLabel();
        rAlign = new javax.swing.JLabel();
        cAlign = new javax.swing.JLabel();
        spellCheckBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        texpan = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        prg = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        findTextfeild = new javax.swing.JTextField();
        findBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        replaceTextFeild = new javax.swing.JTextField();
        replaceBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Fille | Unsaved");
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(250, 246, 246));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Clipboard", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        cutBtn.setBackground(new java.awt.Color(250, 246, 246));
        cutBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cutBtn.setForeground(new java.awt.Color(0, 0, 0));
        cutBtn.setLabel("Cut");
        cutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutBtnActionPerformed(evt);
            }
        });

        copyBtn.setBackground(new java.awt.Color(250, 246, 246));
        copyBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        copyBtn.setForeground(new java.awt.Color(0, 0, 0));
        copyBtn.setLabel("Copy");
        copyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnActionPerformed(evt);
            }
        });

        pasteBtn.setBackground(new java.awt.Color(250, 246, 246));
        pasteBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pasteBtn.setForeground(new java.awt.Color(0, 0, 0));
        pasteBtn.setLabel("Paste");
        pasteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(copyBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(250, 246, 246));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Edit and Text Modifications", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(250, 246, 246));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 65, 118)));
        jPanel9.setPreferredSize(new java.awt.Dimension(276, 69));

        jLabel11.setBackground(new java.awt.Color(85, 65, 118));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Font");

        jFontCb.setBackground(new java.awt.Color(250, 246, 246));
        jFontCb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jFontCb.setForeground(new java.awt.Color(0, 0, 0));
        jFontCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jFontCbItemStateChanged(evt);
            }
        });

        jSizeCb.setBackground(new java.awt.Color(250, 246, 246));
        jSizeCb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSizeCb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jSizeCb.setForeground(new java.awt.Color(0, 0, 0));
        jSizeCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jSizeCbItemStateChanged(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(85, 65, 118));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Size");

        jToolBar2.setBackground(new java.awt.Color(255, 255, 204));
        jToolBar2.setFloatable(false);
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);
        jToolBar2.setName(""); // NOI18N
        jToolBar2.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(250, 246, 246));
        jPanel5.setOpaque(false);

        jLabel7.setBackground(new java.awt.Color(250, 246, 246));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText(" Text Color:");

        jTextColor.setBackground(new java.awt.Color(0, 0, 0));
        jTextColor.setAlignmentY(0.0F);
        jTextColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jTextColor.setIconTextGap(0);
        jTextColor.setOpaque(true);
        jTextColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextColorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(250, 246, 246));
        jPanel8.setOpaque(false);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText(" Highlight: ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jHighlight.setBackground(new java.awt.Color(51, 255, 51));
        jHighlight.setForeground(new java.awt.Color(255, 255, 255));
        jHighlight.setAlignmentY(0.0F);
        jHighlight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null));
        jHighlight.setIconTextGap(0);
        jHighlight.setOpaque(true);
        jHighlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHighlightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jHighlight, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHighlight, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.add(jPanel4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFontCb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jSizeCb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSizeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFontCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(250, 246, 246));
        jToolBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jBold.setBackground(new java.awt.Color(250, 246, 246));
        jBold.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBold.setText(" B ");
        jBold.setOpaque(true);
        jBold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBoldMouseClicked(evt);
            }
        });
        jToolBar1.add(jBold);
        jToolBar1.add(jSeparator1);

        jItalic.setBackground(new java.awt.Color(250, 246, 246));
        jItalic.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jItalic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jItalic.setText("  I  ");
        jItalic.setOpaque(true);
        jItalic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jItalicMouseClicked(evt);
            }
        });
        jToolBar1.add(jItalic);
        jToolBar1.add(jSeparator5);

        jUnderline.setBackground(new java.awt.Color(250, 246, 246));
        jUnderline.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jUnderline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUnderline.setText("<html><u>U");
        jUnderline.setOpaque(true);
        jUnderline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUnderlineMouseClicked(evt);
            }
        });
        jToolBar1.add(jUnderline);
        jToolBar1.add(jSeparator6);

        jSrike.setBackground(new java.awt.Color(250, 246, 246));
        jSrike.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jSrike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSrike.setText("<html><strike>abc");
        jSrike.setOpaque(true);
        jSrike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSrikeMouseClicked(evt);
            }
        });
        jToolBar1.add(jSrike);
        jToolBar1.add(jSeparator4);

        incBtn.setText(" A↑ ");
        incBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(incBtn);
        jToolBar1.add(jSeparator7);

        decBtn.setText(" A↓ ");
        decBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(decBtn);
        jToolBar1.add(jSeparator3);

        upperCaseBtn.setBackground(new java.awt.Color(250, 246, 246));
        upperCaseBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upperCaseBtn.setForeground(new java.awt.Color(0, 0, 0));
        upperCaseBtn.setLabel("ABC");
        upperCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperCaseBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(upperCaseBtn);
        jToolBar1.add(jSeparator8);

        lowerCaseBtn.setBackground(new java.awt.Color(250, 246, 246));
        lowerCaseBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lowerCaseBtn.setForeground(new java.awt.Color(0, 0, 0));
        lowerCaseBtn.setLabel(" abc ");
        lowerCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerCaseBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(lowerCaseBtn);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(250, 246, 246));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "File and Other Actions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        btnOpen.setBackground(new java.awt.Color(250, 246, 246));
        btnOpen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnOpen.setForeground(new java.awt.Color(0, 0, 0));
        btnOpen.setLabel("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSave.setActionCommand("Save");
        btnSave.setBackground(new java.awt.Color(250, 246, 246));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setLabel("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(250, 246, 246));
        btnNew.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 0, 0));
        btnNew.setLabel("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(250, 246, 246));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 0, 0));
        btnPrint.setLabel("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnFnR.setBackground(new java.awt.Color(250, 246, 246));
        btnFnR.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnFnR.setForeground(new java.awt.Color(0, 0, 0));
        btnFnR.setLabel("Find and Replace");
        btnFnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFnRActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(250, 246, 246));
        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setLabel("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(250, 246, 246));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setLabel("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        matchCheckBox.setBackground(new java.awt.Color(250, 246, 246));
        matchCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        matchCheckBox.setText("Match Case");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFnR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matchCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFnR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matchCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(250, 246, 246));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Paragraph", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        lAlign.setBackground(new java.awt.Color(255, 255, 255));
        lAlign.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lAlign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAlign.setText(" L e f t  A l i g n");
        lAlign.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lAlign.setOpaque(true);
        lAlign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lAlignMouseClicked(evt);
            }
        });

        jAlign.setBackground(new java.awt.Color(255, 255, 255));
        jAlign.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jAlign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAlign.setText(" J u s t i f i e d");
        jAlign.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jAlign.setOpaque(true);
        jAlign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAlignMouseClicked(evt);
            }
        });

        rAlign.setBackground(new java.awt.Color(255, 255, 255));
        rAlign.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rAlign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rAlign.setText("R i g h t   A l i g n");
        rAlign.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rAlign.setOpaque(true);
        rAlign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rAlignMouseClicked(evt);
            }
        });

        cAlign.setBackground(new java.awt.Color(255, 255, 255));
        cAlign.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cAlign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cAlign.setText("C e n t e r-A l  i g n");
        cAlign.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cAlign.setMaximumSize(new java.awt.Dimension(85, 20));
        cAlign.setMinimumSize(new java.awt.Dimension(85, 20));
        cAlign.setOpaque(true);
        cAlign.setPreferredSize(new java.awt.Dimension(85, 20));
        cAlign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cAlignMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cAlign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jAlign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rAlign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lAlign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lAlign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rAlign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAlign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cAlign, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        spellCheckBtn.setBackground(new java.awt.Color(250, 246, 246));
        spellCheckBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        spellCheckBtn.setText("Spell Checks ? (Beta)");
        spellCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spellCheckBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spellCheckBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(spellCheckBtn))))
        );

        jTabbedPane1.setBackground(new java.awt.Color(228, 228, 228));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(250, 246, 246));

        texpan.setBackground(new java.awt.Color(250, 246, 246));
        texpan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        texpan.setToolTipText("Type your text here");
        texpan.setCaretColor(new java.awt.Color(102, 0, 153));
        texpan.setMargin(new java.awt.Insets(20, 20, 20, 20));
        texpan.setSelectionColor(new java.awt.Color(204, 204, 204));
        texpan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                texpanMouseMoved(evt);
            }
        });
        texpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texpanMouseClicked(evt);
            }
        });
        texpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texpanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texpanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texpanKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(texpan);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0, 0 | 0, 0 | Unsaved | Tab: Home | Typing: false | Last Action Status: Window Activated");
        jLabel10.setFocusable(false);
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10))
        );

        jTabbedPane1.addTab("Untitled.txt", jPanel3);

        headingLabel.setBackground(new java.awt.Color(255, 255, 255));
        headingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("-- Normal Word Processing --");
        headingLabel.setOpaque(true);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEnabled(false);
        jTextField1.setFocusable(false);
        jTextField1.setOpaque(false);

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Kill Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        prg.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        prg.setForeground(new java.awt.Color(51, 204, 0));
        prg.setString("Intializing...");
        prg.setStringPainted(true);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("^");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prg, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jToolBar3.setBackground(new java.awt.Color(250, 246, 246));
        jToolBar3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Find, Replace Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.setFocusable(false);

        findTextfeild.setBackground(new java.awt.Color(250, 246, 246));
        findTextfeild.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        findTextfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTextfeildActionPerformed(evt);
            }
        });
        jToolBar3.add(findTextfeild);

        findBtn.setBackground(new java.awt.Color(250, 246, 246));
        findBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });
        jToolBar3.add(findBtn);
        jToolBar3.add(jSeparator2);

        replaceTextFeild.setBackground(new java.awt.Color(250, 246, 246));
        replaceTextFeild.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jToolBar3.add(replaceTextFeild);

        replaceBtn.setBackground(new java.awt.Color(250, 246, 246));
        replaceBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        replaceBtn.setText("Find & Replace");
        replaceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceBtnActionPerformed(evt);
            }
        });
        jToolBar3.add(replaceBtn);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    boolean isBold = false, isItallic = false, isUnderlined = false, isStrikeThrough = false, isFinding = false, isTyping = false, wordsAdded = false;
    Color textColor, highlightColor;
    String font, actionStatus, saved = "Developer: Hardik Rawat", NewFile = "NewFile", title = "Wordpad++ | Document Mode | File: " + NewFile + " | " + saved;
    int size = 18;
    int counter = 0;
    ArrayList wordList = new ArrayList();
    ArrayList quickWordList = new ArrayList();
    int paraFound = 0;

    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            // code goes here.
            addWords();
        }
    });

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void cutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutBtnActionPerformed
        //       int from = texpan.getSelectionStart();
        //       int to = texpan.getSelectionEnd();
        //       StringBuilder string = new StringBuilder(texpan.getText());
        //       String cutString = "";
        //       for(int i=from; i<to; i++){
        //          cutString = cutString + string.charAt(i);
        //          string.setCharAt(from, ' ');
        //       }
        //       HashMap<DataFormat, Object> map = new HashMap<DataFormat, Object>();
        //       map.put(DataFormat.PLAIN_TEXT, cutString);
        //       Clipboard.getSystemClipboard().setContent(map);
        //       texpan.setText(string + "");
        texpan.cut();
        actionStatus = "Cut";
    }//GEN-LAST:event_cutBtnActionPerformed

    private void copyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnActionPerformed
        //       int from = texpan.getSelectionStart();
        //       int to = texpan.getSelectionEnd();
        //       StringBuilder string = new StringBuilder(texpan.getText());
        //       String copyString = "";
        //       for(int i=from; i<to; i++){
        //          copyString = copyString + string.charAt(i);
        //       }
        //       HashMap<DataFormat, Object> map = new HashMap<DataFormat, Object>();
        //       map.put(DataFormat.PLAIN_TEXT, copyString);
        //       Clipboard.getSystemClipboard().setContent(map);

        texpan.copy();
        actionStatus = "Copy";
    }//GEN-LAST:event_copyBtnActionPerformed

    private void pasteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBtnActionPerformed
        // TODO add your handling code here:
        texpan.paste();
        actionStatus = "Paste";
    }//GEN-LAST:event_pasteBtnActionPerformed

    private void jBoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoldMouseClicked
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        StyledDocument doc = texpan.getStyledDocument();
        Style style = texpan.addStyle("I'm a Style", null);
        if (jBold.getBackground() != java.awt.Color.lightGray) {
            isBold = true;
            jBold.setBackground(java.awt.Color.lightGray);
            texpan.requestFocus();

            if (from != to) {
                StyleConstants.setBold(style, true);
            }
        } else {
            isBold = false;
            texpan.requestFocus();

            if (from != to) {

                StyleConstants.setBold(style, false);
            }
            jBold.setBackground(java.awt.Color.decode("#f0f0f0"));
        }
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setForeground(style, jTextColor.getBackground());
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Text Bold";
    }//GEN-LAST:event_jBoldMouseClicked

    private void jItalicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jItalicMouseClicked
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        if (jItalic.getBackground() != java.awt.Color.lightGray) {
            isItallic = true;
            jItalic.setBackground(java.awt.Color.lightGray);
            texpan.requestFocus();
            StyledDocument doc = texpan.getStyledDocument();

            if (from != to) {
                System.out.println("from != to");
                Style style = texpan.addStyle("I'm a Style", null);
                StyleConstants.setItalic(style, rootPaneCheckingEnabled);
                doc.setCharacterAttributes(from, to - from, style, true);
            }
        } else {
            isItallic = false;
            jItalic.setBackground(java.awt.Color.decode("#f0f0f0"));
            texpan.requestFocus();
            StyledDocument doc = texpan.getStyledDocument();

            if (from != to) {
                System.out.println("from != to");
                Style style = texpan.addStyle("I'm a Style", null);
                StyleConstants.setItalic(style, false);
                doc.setCharacterAttributes(from, to - from, style, true);
            }
        }
        StyledDocument doc = texpan.getStyledDocument();
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setForeground(style, jTextColor.getBackground());
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Text Italic";
    }//GEN-LAST:event_jItalicMouseClicked

    private void jUnderlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUnderlineMouseClicked
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        if (jUnderline.getBackground() != java.awt.Color.lightGray) {
            isUnderlined = true;
            jUnderline.setBackground(java.awt.Color.lightGray);
            texpan.requestFocus();
            StyledDocument doc = texpan.getStyledDocument();

            if (from != to) {
                System.out.println("from != to");
                Style style = texpan.addStyle("I'm a Style", null);
                StyleConstants.setUnderline(style, rootPaneCheckingEnabled);
                doc.setCharacterAttributes(from, to - from, style, true);
            }
        } else {
            isUnderlined = false;
            jUnderline.setBackground(java.awt.Color.decode("#f0f0f0"));
            texpan.requestFocus();
            StyledDocument doc = texpan.getStyledDocument();
            if (from != to) {
                System.out.println("from != to");
                Style style = texpan.addStyle("I'm a Style", null);
                StyleConstants.setUnderline(style, false);
                doc.setCharacterAttributes(from, to - from, style, true);
            }
        }
        StyledDocument doc = texpan.getStyledDocument();
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setForeground(style, jTextColor.getBackground());
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Text Underlined";
    }//GEN-LAST:event_jUnderlineMouseClicked

    private void jSrikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSrikeMouseClicked
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        if (jSrike.getBackground() != java.awt.Color.lightGray) {
            isStrikeThrough = true;
            jSrike.setBackground(java.awt.Color.lightGray);
            texpan.requestFocus();
            StyledDocument doc = texpan.getStyledDocument();

            if (from != to) {
                System.out.println("from != to");
                Style style = texpan.addStyle("I'm a Style", null);
                StyleConstants.setStrikeThrough(style, rootPaneCheckingEnabled);
                doc.setCharacterAttributes(from, to - from, style, true);
            }
        } else {
            isStrikeThrough = false;
            texpan.requestFocus();
            StyledDocument doc = texpan.getStyledDocument();
            if (from != to) {
                System.out.println("from != to");
                Style style = texpan.addStyle("I'm a Style", null);
                StyleConstants.setStrikeThrough(style, false);
                doc.setCharacterAttributes(from, to - from, style, true);
            }
            jSrike.setBackground(java.awt.Color.decode("#f0f0f0"));
        }
        StyledDocument doc = texpan.getStyledDocument();
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setForeground(style, jTextColor.getBackground());
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Text Strike Through";
    }//GEN-LAST:event_jSrikeMouseClicked

    private void jTextColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextColorMouseClicked
        texpan.requestFocus();
        java.awt.Color color1 = JColorChooser.showDialog(this, "Colors", java.awt.Color.YELLOW);
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        jTextColor.setBackground(color1);
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setForeground(style, color1);
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Text Color Changed to " + color1;
    }//GEN-LAST:event_jTextColorMouseClicked

    private void jHighlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHighlightMouseClicked
        java.awt.Color color1 = JColorChooser.showDialog(this, "Colors", java.awt.Color.YELLOW);
        DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(color1);
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        try {
            texpan.getHighlighter().addHighlight(from, to,
                    highlightPainter);
        } catch (BadLocationException ex) {
            System.out.println("Error: " + ex.toString());
        }
    }//GEN-LAST:event_jHighlightMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Any unsaved changes will be lost !", "Confirm ?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            texpan.setText("");
            actionStatus = "New File";
        } else if (response == JOptionPane.NO_OPTION) {
            //operation suspended
        } else {
            //operation suspended
            System.out.println("Operation Suspended!");
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
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
                NormalWordProcessingFrame nor = new NormalWordProcessingFrame();
                nor.setVisible(true);
                nor.saved = "Saved";
                nor.NewFile = chooser.getSelectedFile().getName().toString();
                nor.setTitle(NewFile);
                jTabbedPane1.setTitleAt(0, NewFile);
                Scanner fin = new Scanner(chooser.getSelectedFile());
                String buffer = "";
                while (fin.hasNext()) {
                    buffer += fin.nextLine() + "\n";
                }
                nor.texpan.setText(buffer);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "File not found");
            }
        } else if ((!NewWindowWanted) && (chooserValue == JFileChooser.APPROVE_OPTION)) {
            try {
                saved = "Saved";
                NewFile = chooser.getSelectedFile().getName().toString();
                this.setTitle(NewFile);
                jTabbedPane1.setTitleAt(0, NewFile);
                Scanner fin = new Scanner(chooser.getSelectedFile());
                String buffer = "";
                while (fin.hasNext()) {
                    buffer += fin.nextLine() + "\n";
                }
                texpan.setText(buffer);
//                JTextPane texpan_new = new JTextPane();
//                texpan_new.setText(buffer);
//                jTabbedPane1.add(jPanel3.add(texpan_new));
//                jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex()+1);
//                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), NewFile);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "File not found");
            }

        } else {
            JOptionPane.showMessageDialog(this, "System Error: Unknown File Opening Error");
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
//        String name = JOptionPane.showInputDialog("Enter file name: ");
//        if (!name.isEmpty()) {
//            String fileName = name;
//            File file = new File(fileName);
//            String text = texpan.getText();
//            try {
//                if (file.createNewFile() == true) {
//                    JOptionPane.showMessageDialog(this, "Saved Successfuly");
//                    
//                    this.setTitle(title);
//                    try (FileWriter writer = new FileWriter(file)) {
//                        writer.write("/* Code made in Wordpad++ */" + text);
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Error: File Already Exists!");
//                    actionStatus = "Attempt to Save";
//                    saved = "Unsaved";
//                }
//
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(this, "System Error: " + ex.toString());
//                actionStatus = "Attempt to Save";
//                saved = "Unsaved";
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Error: Please Enter a valid File Name");
//            actionStatus = "Attempt to Save";
//            saved = "Unsaved";
//        }

        /*
        FileWriter fr = new FileWriter(file, false);
        BufferedWriter br = new BufferedWriter(fr);
        br.write("data2");
        br.close();
        fr.close();
         */
        String name = JOptionPane.showInputDialog("Enter file name: ");
        try {
            if (name != null && name.length() > 0) {
                String fileName = System.getProperty("user.dir") + "\\"+name;
                System.out.println("fileName: " + fileName);
                File file = new File(fileName);
                FileWriter fr = new FileWriter(file, false);
                BufferedWriter br = new BufferedWriter(fr);
                String text = texpan.getText();
                try {
                    br.write(texpan.getText());
                    jTabbedPane1.setTitleAt(0, name);
                    br.close();
                    fr.close();
                    JOptionPane.showMessageDialog(this, name + " Saved Successfuly at " + fileName);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "System Error: " + ex.toString());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operation Suspended");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid File Name: " + ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            boolean done = texpan.print();
            if (done) {
                System.out.println("Ready to print current document!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        actionStatus = "Attempt to Print";
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnFnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFnRActionPerformed
        if (jToolBar3.isVisible()) {
            isFinding = false;
        } else if (!jToolBar3.isVisible()) {
            isFinding = true;
        }
        jToolBar3.setVisible(isFinding);
        System.out.println("Visible: " + isFinding);
        actionStatus = "Find and Replace";
        texpan.getHighlighter().removeAllHighlights();
    }//GEN-LAST:event_btnFnRActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Any unsaved changes will be lost !", "Confirm ?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (response == JOptionPane.NO_OPTION) {
            //operation suspended
            actionStatus = "Operation Suspended!";
        } else {
            //operation suspended
            System.out.println("Operation Suspended!");
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "<html><b>Note:</b>\n-Any unsaved changes will be lost!\n-Any Alive Process in this Window will be Forced-Killed.\n\nPress 'YES' to confirm", "Confirm ?",
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
    }//GEN-LAST:event_btnBackActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        jLabel10.setText(texpan.getCaretPosition() + " | " + MouseInfo.getPointerInfo().getLocation().getX() + ", "
                + MouseInfo.getPointerInfo().getLocation().getY() + " | Unsaved | Typing: " + "false" + " | Last Action Status:  " + actionStatus);
        this.setTitle(title);
    }//GEN-LAST:event_formMouseMoved

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        texpan.getHighlighter().removeAllHighlights();
        String text = texpan.getText();
        String findingText = findTextfeild.getText();
        if (!matchCheckBox.isSelected()) {
            text = text.toLowerCase();
            findingText = findingText.toLowerCase();
        }
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.CYAN);
        int offset = text.indexOf(findTextfeild.getText());
        int length = findTextfeild.getText().length();
        while (offset != -1) {
            try {
                texpan.getHighlighter().addHighlight(offset, offset + length, painter);
                offset = texpan.getText().indexOf(findTextfeild.getText(), offset + 1);
            } catch (BadLocationException ble) {
                System.out.println(ble);
            }
        }
    }//GEN-LAST:event_findBtnActionPerformed

    private void lAlignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAlignMouseClicked
        StyledDocument doc = texpan.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_LEFT);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }//GEN-LAST:event_lAlignMouseClicked

    private void rAlignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rAlignMouseClicked
        StyledDocument doc = texpan.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }//GEN-LAST:event_rAlignMouseClicked

    private void jAlignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlignMouseClicked
        StyledDocument doc = texpan.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_JUSTIFIED);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }//GEN-LAST:event_jAlignMouseClicked

    private void cAlignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cAlignMouseClicked
        StyledDocument doc = texpan.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }//GEN-LAST:event_cAlignMouseClicked

    private void replaceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceBtnActionPerformed
        texpan.getHighlighter().removeAllHighlights();
        String text = texpan.getText();
        String findingText = findTextfeild.getText();
        if (!matchCheckBox.isSelected()) {
            text = text.toLowerCase();
            findingText = findingText.toLowerCase();
        }
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.CYAN);
        int offset = text.indexOf(findingText);
        int length = findingText.length();
        while (offset != -1) {
            try {
                texpan.getHighlighter().addHighlight(offset, offset + length, painter);
                offset = text.indexOf(findingText, offset + 1);
            } catch (BadLocationException ble) {
                System.out.println(ble);
            }
        }
        String replacedString = text.replaceAll(findTextfeild.getText(), replaceTextFeild.getText());
        texpan.setText(replacedString);
        texpan.requestFocus();
        StyledDocument doc = texpan.getStyledDocument();
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setForeground(style, jTextColor.getBackground());
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(texpan.getCaretPosition() - 1, texpan.getCaretPosition(), style, true);
    }//GEN-LAST:event_replaceBtnActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void texpanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texpanKeyTyped
        this.setTitle(title);
        isTyping = true;
        texpan.requestFocus();
        StyledDocument doc = texpan.getStyledDocument();
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setForeground(style, jTextColor.getBackground());
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(texpan.getCaretPosition() - 1, texpan.getCaretPosition(), style, true);
        jLabel10.setText(texpan.getCaretPosition() + " | " + MouseInfo.getPointerInfo().getLocation().getX() + ", "
                + MouseInfo.getPointerInfo().getLocation().getY() + " | Unsaved | Typing: true | Last Action Status:  " + actionStatus);
        saved = "Unsaved";
    }//GEN-LAST:event_texpanKeyTyped

    private void texpanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texpanKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_texpanKeyReleased

    private void texpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texpanKeyPressed

    }//GEN-LAST:event_texpanKeyPressed

    private void texpanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texpanMouseMoved
        jLabel10.setText(texpan.getCaretPosition() + " | " + MouseInfo.getPointerInfo().getLocation().getX() + ", "
                + MouseInfo.getPointerInfo().getLocation().getY() + " | Unsaved | Typing:" + 0 + " | Last Action Status:  " + actionStatus);
        this.setTitle(title);
    }//GEN-LAST:event_texpanMouseMoved

    private void jFontCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jFontCbItemStateChanged
        texpan.requestFocus();
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Font Family Changed to " + jSizeCb.getSelectedItem();
    }//GEN-LAST:event_jFontCbItemStateChanged

    private void jSizeCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jSizeCbItemStateChanged
        texpan.requestFocus();
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        int size = Integer.parseInt((String) jSizeCb.getSelectedItem());
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontSize(style, size);
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontFamily(style, jFontCb.getSelectedItem().toString());
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Font Size Changed to " + jFontCb.getSelectedItem();
    }//GEN-LAST:event_jSizeCbItemStateChanged

    private void spellCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spellCheckBtnActionPerformed
        
        if (wordList.size() >= 466549) {
            texpan.getHighlighter().removeAllHighlights();
            actionStatus = "Spell check attempted!";
            jTextField1.setText("Checking for Spellings...");
            texpan.setEnabled(false);
            this.update(this.getGraphics());
            texpan.setEnabled(true);
            jLabel10.update(jLabel10.getGraphics());
            actionStatus = "Spell Check Done";
            //jTextField1.setText("Done !");
            checkSpell();
        } else {
            int response = JOptionPane.showConfirmDialog(this, "Looks like you have not initiated the Spell Check Process.\n<html><b>></b>This may take upto 3-5 "
                    + "Minutes\n<html><b>></b>You may be able to perform your work flawlessly during the process and we wil notify once the it's ready.\n<html><b>Press Yes to"
                    + " continue");
            if (response == JOptionPane.YES_OPTION) {
                //new thread.
            prg.setForeground(java.awt.Color.GREEN);
              thread1 =  new Thread(new Runnable() {
        @Override
        public void run() {
            // code goes here.
            addWords();
        }
    });
              thread1.start();
            } else {
                actionStatus = "Operation Suspended!";
            }
        }
    }//GEN-LAST:event_spellCheckBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        jTextField1.setVisible(false);
        jButton1.setVisible(false);
        int progress = 1;
        prg.setValue(progress);
        prg.setStringPainted(true);
        prg.setString("Loading...");
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        String fontNames[] = ge.getAvailableFontFamilyNames();

        for (int i = 0; i < fontNames.length; i++) {
            jFontCb.addItem(fontNames[i]);
            progress = (100 * i) / fontNames.length;
            prg.setValue(progress);
            prg.setString("Getting fonts: " + progress + "%");
            if (i % 2 == 0) {
                prg.update(prg.getGraphics());
            }
        }

        for (int i = 1; i <= 10; i++) {
            int size = (int) Math.pow(2, i);
            jSizeCb.addItem(size + "");
            progress = (100 * i) / fontNames.length;
            prg.setValue(progress);
            prg.setString("Adding font size options: " + progress + "%");
            if (i % 2 == 0) {
                prg.update(prg.getGraphics());
            }
        }

        progress = 1;
        prg.setValue(progress);
        prg.setString("Alomost Done: " + progress + "%");
        prg.update(prg.getGraphics());
        jToolBar3.setVisible(isFinding);
        jFontCb.select("Cambria");
        jSizeCb.select(4);
        texpan.setFont(new Font(jFontCb.getSelectedItem().toString(), Font.PLAIN, Integer.valueOf(jSizeCb.getSelectedItem())));
        actionStatus = "Window Activated";
        this.setTitle(title);
        progress = 100;
        prg.setString("Done " + progress + "%");
        prg.update(prg.getGraphics());
        int response = JOptionPane.showConfirmDialog(this, "Do you want initiate spell check process now?\nNOTE: This will take upto 5-6 minutes but will work in background while you can easily continue your work.\n<html><b>Click Yes to Initiate Spell Check. [RECOMENDED]");
        if (response == JOptionPane.YES_OPTION) {
            thread1.start();
        } else {
            actionStatus = "Spell Check Suspended";
        }
        prg.setValue(0);
        prg.setString("");

    }//GEN-LAST:event_formWindowOpened

    private void texpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texpanMouseClicked
        // TODO add your handling code here:
//        texpan.getHighlighter().removeAllHighlights();
//        texpan.update(texpan.getGraphics());
    }//GEN-LAST:event_texpanMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (thread1.isAlive()) {
            int response = JOptionPane.showConfirmDialog(this, "Killing tasks may lead to progress loss!\nAre you sure to Kill the ongoing process ?");
            if (response == JOptionPane.YES_OPTION) {
                prg.setStringPainted(true);
                prg.setString("Processed Forced Killed before task completion");
                prg.setValue(100);
                prg.setForeground(java.awt.Color.red);
                jTextField1.setVisible(false);
                jButton1.setVisible(false);
                spellCheckBtn.setEnabled(true);
                thread1.stop();
                if (wordList.size() > 0) {
                    wordList.clear();
                    System.out.println("ArrayList Cleared");
                    prg.setString("Process Forced Killed before task completion");
                    prg.setValue(100);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operation Suspended!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No Tasks To Kill!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (jTextField1.isVisible()) {
            jTextField1.setVisible(false);
            jButton1.setVisible(false);
        } else {
            jTextField1.setVisible(true);
            jButton1.setVisible(true);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void upperCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperCaseBtnActionPerformed
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        texpan.replaceSelection(texpan.getSelectedText().toUpperCase());
        int size = Integer.parseInt((String) jSizeCb.getSelectedItem());
        Style style = texpan.addStyle("I'm a Style", null);
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Upper Case";

    }//GEN-LAST:event_upperCaseBtnActionPerformed

    private void lowerCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerCaseBtnActionPerformed
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        texpan.replaceSelection(texpan.getSelectedText().toLowerCase());
        int size = Integer.parseInt((String) jSizeCb.getSelectedItem());
        Style style = texpan.addStyle("I'm a Style", null);
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Lower Case";
    }//GEN-LAST:event_lowerCaseBtnActionPerformed

    private void incBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incBtnActionPerformed
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        int size = Integer.parseInt((String) jSizeCb.getSelectedItem());
        Style style = texpan.addStyle("I'm a Style", null);
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        StyleConstants.setFontSize(style, size * 2);
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Font Size Increased";
        jSizeCb.select(size * 2 + ""); //bug resolved
    }//GEN-LAST:event_incBtnActionPerformed

    private void decBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decBtnActionPerformed
        StyledDocument doc = texpan.getStyledDocument();
        int from = texpan.getSelectionStart();
        int to = texpan.getSelectionEnd();
        int size = Integer.parseInt((String) jSizeCb.getSelectedItem());
        Style style = texpan.addStyle("I'm a Style", null);
        StyleConstants.setFontSize(style, size - 4);
        if (isBold) {
            StyleConstants.setBold(style, true);
        } else {
            StyleConstants.setBold(style, false);
        }
        if (isItallic) {
            StyleConstants.setItalic(style, true);
        } else {
            StyleConstants.setItalic(style, false);
        }
        if (isUnderlined) {
            StyleConstants.setUnderline(style, true);
        } else {
            StyleConstants.setUnderline(style, false);
        }
        if (isStrikeThrough) {
            StyleConstants.setStrikeThrough(style, true);
        } else {
            StyleConstants.setStrikeThrough(style, false);
        }
        StyleConstants.setFontSize(style, Integer.parseInt((String) jSizeCb.getSelectedItem()));
        doc.setCharacterAttributes(from, to - from, style, true);
        actionStatus = "Font Size Decreased";
        jSizeCb.select(size / 2 + ""); //bug resolved
    }//GEN-LAST:event_decBtnActionPerformed

    private void findTextfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTextfeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findTextfeildActionPerformed

    private static String appendProperties(int size) {
        //still developing...
        return "";
    }

    private boolean addWords() {

        long start = System.currentTimeMillis();
        this.update(this.getGraphics());
        spellCheckBtn.setEnabled(false);
        int progress = 1;
        prg.setStringPainted(true);
        prg.setValue(progress);
        prg.setString("Locating words: " + progress + "%");
        prg.update(prg.getGraphics());
        String wordListName = "spell_check_word_list.txt";
        int wordListSize = 479000;
        wordListName = "spell_check_word_list1.txt";
        String dictionaryLocation = new File("resources//" + wordListName).getAbsolutePath();
        Scanner fin;
        try {
            fin = new Scanner(new File(dictionaryLocation));
            progress = 2;
            prg.setValue(progress);
            prg.setString("Word Located: " + progress + "%");
            prg.update(prg.getGraphics());

            int total_words = 0;
            while (fin.hasNext()) {
                String h = fin.nextLine().toLowerCase();
                wordList.add(h);
                System.out.println("" + h);
                jTextField1.setText("Adding Word: " + h);
                jTextField1.update(jTextField1.getGraphics());
                total_words++;
                progress = (100 * total_words) / wordListSize;
                prg.setValue(progress);
                prg.setString("Added '" + total_words + "' words to Dictionary | Progress: " + progress + "%");
                prg.update(prg.getGraphics());

//            System.out.println("Added: " + wordList.get(total_words-1));
            }
            progress = 100;
            prg.setValue(progress);
            prg.setString("Words Added Successfully: " + progress + "%");
            prg.update(prg.getGraphics());
            wordsAdded = true;
            JOptionPane.showMessageDialog(this, "Spell Checker Initiated Successfully with dictionary size of " + wordList.size()
             + " words");
        } catch (Exception ex) {
            System.out.println("Error scanning at beginning!");
            wordsAdded = false;
            return false;
        }
        spellCheckBtn.setEnabled(true);
        return true;
    }

    private void checkSpell() {
        prg.setForeground(java.awt.Color.GREEN);
        int incorrect_words = 0;
        DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.decode("#FF976E"));
        int from = 0;
        int to = 0;
        spellCheckBtn.setEnabled(false);
        int totalWordsToCheck = texpan.getText().length();
        int progress = 0;

        String string = texpan.getText();
        string = string.toLowerCase();

        //removing punctuations temporary
        string = removePunctuation(string, ",");
        string = removePunctuation(string, ";");
        string = removePunctuation(string, "'");
        string = removePunctuation(string, "\"");
        string = removePunctuation(string, ":");
        string = removePunctuation(string, "!");

//        string = removeParas(string);
//        string = removePunctuation(string, ".");
        //removed punctuations temporary
        //replace linebreaks temporary
//        string = string.replace("\n", "").replace("\r", "");
        //replaced libreaks temporary
        System.out.println("String: " + string);
        for (int i = 0; i < string.length(); i++) {
            String checkerWord = "";
            while (string.charAt(i) != ' ') {
                checkerWord = checkerWord + string.charAt(i);
                i++;
                if (i == string.length() || string.charAt(i) == ' ') {
                    break;
                }
                prg.setString("Checking Spellings: " + progress + "%");
                prg.update(prg.getGraphics());
            }
            if (wordList.contains(checkerWord)) {
                //System.out.println(checkerWord + " is correct");
            } else if (!wordList.contains(checkerWord)) {
                try {

                    from = string.indexOf(checkerWord);
                    to = from + checkerWord.length();
                    if (from == to || (from == 0) && (to == 0)) {
                        System.out.println("error of from=to");
                    } else {
//                    System.out.println("From: " + from + " To: " + to);
                        texpan.getHighlighter().addHighlight(from, to,
                                highlightPainter);
                        incorrect_words++;
                    }

                } catch (BadLocationException ex) {
                    System.out.println("Error: " + ex.toString());
                }
                System.out.println(checkerWord + " is incorrect | " + from + "-" + to);
            } else {
                System.out.println("Other Error");
            }
            progress = (100 * i) / totalWordsToCheck;
            prg.setValue(progress);
            prg.setString("Checking Spellings: " + progress + "%");
            prg.update(prg.getGraphics());
        }
        progress = 100;
        prg.setValue(progress);
        prg.setValue(progress);
        prg.setString("Done Checking: " + progress + "%");
        prg.update(prg.getGraphics());
        spellCheckBtn.setEnabled(true);
    }

    private String removePunctuation(String string, String puntuation) {
        int offset = string.indexOf(puntuation);
        int length = puntuation.length();
        while (offset != -1) {
            offset = string.indexOf(puntuation, offset + 1);
        }

        string = string.replaceAll(puntuation, " ");
        return string;
    }

    private String removeParas(String string) {
        paraFound++;
        string = string.replace("\n", " ").replace("\r", " ");
        System.out.println("Removed Para String: " + string);
        System.out.println("Para Detected: " + paraFound);
        return string;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NormalWordProcessingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormalWordProcessingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormalWordProcessingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormalWordProcessingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormalWordProcessingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBack;
    private java.awt.Button btnClose;
    private java.awt.Button btnFnR;
    private java.awt.Button btnNew;
    private java.awt.Button btnOpen;
    private java.awt.Button btnPrint;
    private java.awt.Button btnSave;
    private javax.swing.JLabel cAlign;
    private java.awt.Button copyBtn;
    private java.awt.Button cutBtn;
    private javax.swing.JButton decBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JTextField findTextfeild;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton incBtn;
    private javax.swing.JLabel jAlign;
    private javax.swing.JLabel jBold;
    private javax.swing.JButton jButton1;
    private java.awt.Choice jFontCb;
    private javax.swing.JLabel jHighlight;
    private javax.swing.JLabel jItalic;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private java.awt.Choice jSizeCb;
    private javax.swing.JLabel jSrike;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jTextColor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel jUnderline;
    private javax.swing.JLabel lAlign;
    private java.awt.Button lowerCaseBtn;
    private javax.swing.JCheckBox matchCheckBox;
    private java.awt.Button pasteBtn;
    private javax.swing.JProgressBar prg;
    private javax.swing.JLabel rAlign;
    private javax.swing.JButton replaceBtn;
    private javax.swing.JTextField replaceTextFeild;
    private javax.swing.JButton spellCheckBtn;
    private javax.swing.JTextPane texpan;
    private java.awt.Button upperCaseBtn;
    // End of variables declaration//GEN-END:variables
}
