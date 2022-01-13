
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aditya Pandey
 */
public class Parade_Module extends javax.swing.JFrame {

    /**
     * Creates new form Parade_Module
     */
    Database db = new Database();
    boolean flag = true;
    private int mouseX, mouseY;

    public Parade_Module() {
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

        minimize_icon = new javax.swing.JLabel();
        exit_icon = new javax.swing.JLabel();
        move_panel = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        Separator = new javax.swing.JSeparator();
        side_pane = new javax.swing.JPanel();
        title_label1 = new javax.swing.JLabel();
        title_separator = new javax.swing.JSeparator();
        title_icon = new javax.swing.JLabel();
        go_back = new javax.swing.JLabel();
        menuA = new javax.swing.JPanel();
        menuA_icon = new javax.swing.JLabel();
        menuA_label = new javax.swing.JLabel();
        panelA = new javax.swing.JPanel();
        A1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A0 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        A2 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        A3 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        A4 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        A5 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        A6 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 160));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/minimize-purple.png"))); // NOI18N
        minimize_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_iconMouseClicked(evt);
            }
        });
        getContentPane().add(minimize_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, 40));

        exit_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/remove_purple.png"))); // NOI18N
        exit_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_iconMouseClicked(evt);
            }
        });
        getContentPane().add(exit_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 30, 40, -1));

        move_panel.setFocusable(false);
        move_panel.setOpaque(false);
        move_panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                move_panelMouseDragged(evt);
            }
        });
        move_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                move_panelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout move_panelLayout = new javax.swing.GroupLayout(move_panel);
        move_panel.setLayout(move_panelLayout);
        move_panelLayout.setHorizontalGroup(
            move_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        move_panelLayout.setVerticalGroup(
            move_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(move_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1280, 720));
        bg.setMinimumSize(new java.awt.Dimension(1280, 720));
        bg.setPreferredSize(new java.awt.Dimension(1280, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separator.setForeground(new java.awt.Color(54, 33, 89));
        Separator.setPreferredSize(new java.awt.Dimension(50, 20));
        bg.add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 890, 10));

        side_pane.setBackground(new java.awt.Color(54, 33, 89));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_label1.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N
        title_label1.setForeground(new java.awt.Color(255, 255, 255));
        title_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label1.setText("Parade State");
        side_pane.add(title_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 50));
        side_pane.add(title_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 50));

        title_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/parade module white.png"))); // NOI18N
        side_pane.add(title_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 70));

        go_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/left-arrow.png"))); // NOI18N
        go_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_backMouseClicked(evt);
            }
        });
        side_pane.add(go_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        menuA.setBackground(new java.awt.Color(85, 65, 118));
        menuA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuAFocusGained(evt);
            }
        });
        menuA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAMouseClicked(evt);
            }
        });

        menuA_icon.setForeground(new java.awt.Color(255, 255, 255));
        menuA_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuA_icon.setText("A");

        menuA_label.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        menuA_label.setForeground(new java.awt.Color(255, 255, 255));
        menuA_label.setText("Parade State");

        javax.swing.GroupLayout menuALayout = new javax.swing.GroupLayout(menuA);
        menuA.setLayout(menuALayout);
        menuALayout.setHorizontalGroup(
            menuALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuALayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(menuA_icon)
                .addGap(33, 33, 33)
                .addComponent(menuA_label))
        );
        menuALayout.setVerticalGroup(
            menuALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuALayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(menuALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuA_label, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(menuA_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        side_pane.add(menuA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 330, 60));

        bg.add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 740));

        panelA.setBackground(new java.awt.Color(255, 255, 255));
        panelA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A1.setForeground(new java.awt.Color(240, 240, 240));
        A1.setMaximumSize(new java.awt.Dimension(200, 200));
        A1.setMinimumSize(new java.awt.Dimension(200, 200));
        A1.setPreferredSize(new java.awt.Dimension(200, 200));
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A1MouseExited(evt);
            }
        });
        A1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/posting_green.png"))); // NOI18N
        A1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 80));

        jLabel4.setBackground(new java.awt.Color(54, 33, 89));
        jLabel4.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 33, 89));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POSTING");
        A1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, -1));

        panelA.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        A0.setForeground(new java.awt.Color(240, 240, 240));
        A0.setMaximumSize(new java.awt.Dimension(200, 200));
        A0.setMinimumSize(new java.awt.Dimension(200, 200));
        A0.setPreferredSize(new java.awt.Dimension(200, 200));
        A0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A0MouseExited(evt);
            }
        });
        A0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/new user.png"))); // NOI18N
        A0.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 90));

        jLabel78.setBackground(new java.awt.Color(54, 33, 89));
        jLabel78.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(54, 33, 89));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("NEW REGISTRATION");
        A0.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 150, 200, 17));

        panelA.add(A0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        A2.setForeground(new java.awt.Color(240, 240, 240));
        A2.setMaximumSize(new java.awt.Dimension(200, 200));
        A2.setMinimumSize(new java.awt.Dimension(200, 200));
        A2.setPreferredSize(new java.awt.Dimension(200, 200));
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        A2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/tank.png"))); // NOI18N
        A2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 90));

        jLabel80.setBackground(new java.awt.Color(54, 33, 89));
        jLabel80.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(54, 33, 89));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("PARADE STATE");
        A2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, -1));

        panelA.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        A3.setForeground(new java.awt.Color(240, 240, 240));
        A3.setMaximumSize(new java.awt.Dimension(200, 200));
        A3.setMinimumSize(new java.awt.Dimension(200, 200));
        A3.setPreferredSize(new java.awt.Dimension(200, 200));
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A3MouseExited(evt);
            }
        });
        A3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/attach.png"))); // NOI18N
        A3.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 80));

        jLabel82.setBackground(new java.awt.Color(54, 33, 89));
        jLabel82.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(54, 33, 89));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("ATTACHMENT");
        A3.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        panelA.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        A4.setForeground(new java.awt.Color(240, 240, 240));
        A4.setMaximumSize(new java.awt.Dimension(200, 200));
        A4.setMinimumSize(new java.awt.Dimension(200, 200));
        A4.setPreferredSize(new java.awt.Dimension(200, 200));
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A4MouseExited(evt);
            }
        });
        A4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/strength.png"))); // NOI18N
        A4.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 80));

        jLabel84.setBackground(new java.awt.Color(54, 33, 89));
        jLabel84.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(54, 33, 89));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("AUTHORISED STRENGTH");
        A4.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 150, 200, -1));

        panelA.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        A5.setForeground(new java.awt.Color(240, 240, 240));
        A5.setMaximumSize(new java.awt.Dimension(200, 200));
        A5.setMinimumSize(new java.awt.Dimension(200, 200));
        A5.setPreferredSize(new java.awt.Dimension(200, 200));
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A5MouseExited(evt);
            }
        });
        A5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/update.png"))); // NOI18N
        A5.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 80));

        jLabel86.setBackground(new java.awt.Color(54, 33, 89));
        jLabel86.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(54, 33, 89));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("UPDATE");
        A5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, -1));

        panelA.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        A6.setForeground(new java.awt.Color(240, 240, 240));
        A6.setMaximumSize(new java.awt.Dimension(200, 200));
        A6.setMinimumSize(new java.awt.Dimension(200, 200));
        A6.setPreferredSize(new java.awt.Dimension(200, 200));
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A6MouseExited(evt);
            }
        });
        A6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGS/pension out.png"))); // NOI18N
        A6.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 80));

        jLabel88.setBackground(new java.awt.Color(54, 33, 89));
        jLabel88.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(54, 33, 89));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("PENSION OUT");
        A6.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        panelA.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        bg.add(panelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 192, 910, 480));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuAFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAFocusGained

    private void menuAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAMouseClicked

    }//GEN-LAST:event_menuAMouseClicked

    private void go_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_backMouseClicked
        if (flag) {
            new Modules(0).setVisible(true);
            this.setVisible(false);
            flag = false;
        }
    }//GEN-LAST:event_go_backMouseClicked

    private void A1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseEntered
        A1.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A1MouseEntered

    private void A1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseExited
        A1.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A1MouseExited

    private void A0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A0MouseEntered
        A0.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A0MouseEntered

    private void A0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A0MouseExited
        A0.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A0MouseExited

    private void A2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseEntered
        A2.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A2MouseEntered

    private void A2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseExited
        A2.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A2MouseExited

    private void A3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseEntered
        A3.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A3MouseEntered

    private void A3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseExited
        A3.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A3MouseExited

    private void A4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseEntered
        A4.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A4MouseEntered

    private void A4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseExited
        A4.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A4MouseExited

    private void A5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseEntered
        A5.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A5MouseEntered

    private void A5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseExited
        A5.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A5MouseExited

    private void A6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseEntered
        A6.setBackground(new java.awt.Color(237, 224, 255));// TODO add your handling code here:
    }//GEN-LAST:event_A6MouseEntered

    private void A6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseExited
        A6.setBackground(new java.awt.Color(240, 240, 240));// TODO add your handling code here:
    }//GEN-LAST:event_A6MouseExited

    private void exit_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_iconMouseClicked
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the program?", "Exit Program", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
            db.create_connection(false);
        }
    }//GEN-LAST:event_exit_iconMouseClicked

    private void minimize_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_iconMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_minimize_iconMouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        new Update_data().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A5MouseClicked

    private void A0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A0MouseClicked
        new new_registration().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A0MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        new Posting().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A1MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        new modify_parade_state().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        new Attachment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        new Authorised_Strength().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A4MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        new Pension_Out().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A6MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //for a centered frame
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        //for a centered frame

        panelA.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void move_panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_move_panelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_move_panelMouseDragged

    private void move_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_move_panelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_move_panelMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parade_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parade_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parade_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parade_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parade_Module().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A0;
    private javax.swing.JPanel A1;
    private javax.swing.JPanel A2;
    private javax.swing.JPanel A3;
    private javax.swing.JPanel A4;
    private javax.swing.JPanel A5;
    private javax.swing.JPanel A6;
    private javax.swing.JSeparator Separator;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exit_icon;
    private javax.swing.JLabel go_back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JPanel menuA;
    private javax.swing.JLabel menuA_icon;
    private javax.swing.JLabel menuA_label;
    private javax.swing.JLabel minimize_icon;
    private javax.swing.JPanel move_panel;
    private javax.swing.JPanel panelA;
    private javax.swing.JPanel side_pane;
    private javax.swing.JLabel title_icon;
    private javax.swing.JLabel title_label1;
    private javax.swing.JSeparator title_separator;
    // End of variables declaration//GEN-END:variables
}
