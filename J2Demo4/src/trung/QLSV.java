/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trung;

import trung.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLSV extends javax.swing.JFrame {

    /**
     * Creates new form QLSV
     */
    List<Student> list = new ArrayList<>();
    int vitri=0;
    public QLSV() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void addStudent() {
        Student sv = new Student();
        if (hoten.getText().compareTo("") != 0 && diem.getText().compareTo("") != 0) {
            sv.name = hoten.getText();
            while (true) {
                sv.marks =Double.parseDouble(diem.getText());
                sv.major = (String) nganh.getSelectedItem();
                if (sv.marks < 0 | sv.marks > 10) {
                    JOptionPane.showMessageDialog(this, "Bạn đã nhập sai khoảng điểm từ 0 ---> 10");
                    diem.setText("");
                    hocluc.setText("");
                    checkbot.setSelected(false);
                    break;
                } else {
                    list.add(sv);
                    hocluc.setText(sv.getGrade());
                    checkbot.setSelected(sv.isBonus());
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn phải nhập đủ các thông tin!!!");
        }

    }

    public void removeStudent() {
        int index = bang.getSelectedRow();
        list.remove(index);
    }

    public void updateStudent() {
        if (hoten.getText().compareTo("") != 0 && diem.getText().compareTo("") != 0) {
            int index = bang.getSelectedRow();
            Student sv = list.get(index);
            while (true) {
                sv.marks = Double.parseDouble(diem.getText());
                sv.major = (String) nganh.getSelectedItem();
                if (sv.marks < 0 | sv.marks > 10) {
                    JOptionPane.showMessageDialog(this, "Bạn đã nhập sai khoảng điểm từ 0 ---> 10");
                    diem.setText("");
                    hocluc.setText("");
                    checkbot.setSelected(false);
                    break;
                } else {
                    hocluc.setText(sv.getGrade());
                    checkbot.setSelected(sv.isBonus());
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn phải cập nhập đủ các thông tin!!!");
        }
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) bang.getModel();
        model.setRowCount(0);
        for (Student sv : list) {
            Object[] row = new Object[]{sv.name, sv.marks, sv.major, sv.getGrade(), sv.isBonus()};
            model.addRow(row);
        }
    }

    public void showDetail() {
        int index = bang.getSelectedRow();
        Student sv = list.get(index);
        sv.name = hoten.getText();
        sv.marks = Double.parseDouble(diem.getText());
        sv.major = (String) nganh.getSelectedItem();
        hocluc.setText(sv.getGrade());
        checkbot.setSelected(sv.isBonus());
    }
    public void showItem(int index) {
        Student sv = new Student();
        sv = list.get(index);
        sv.name = hoten.getText();
        sv.marks = Double.parseDouble(diem.getText());
        sv.major = (String) nganh.getSelectedItem();
        hocluc.setText(sv.getGrade());
        checkbot.setSelected(sv.isBonus());
        stt.setText((index +1) +"of"+list.size());
    }
    public void orderByName() {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student t, Student t1) {
                return t.name.compareTo(t1.name);
            }
        };
        Collections.sort(list, com);
    }

    public void orderByMarks() {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student t, Student t1) {
                Double d1 = t.marks;
                Double d2 = t1.marks;
                return d1.compareTo(d2);
            }
        };
        Collections.sort(list, com);
    }
    public void dau(){
        showItem(0);
    }
    public void lui(){
        vitri--;
        if (vitri < 0) {
            vitri = 0;
        }
        showItem(vitri);
    }
    public void tien(){
        vitri++;
        if (vitri > (list.size() -1)) {
            vitri = 0;
        }
        showItem(vitri);
    }
    public void cuoi(){
        showItem(list.size() - 1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QLSV = new javax.swing.JLabel();
        hoten = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nganh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        diem = new javax.swing.JTextField();
        hocluc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        checkbot = new javax.swing.JCheckBox();
        sxten = new javax.swing.JButton();
        sxdiem = new javax.swing.JButton();
        them = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        capnhat = new javax.swing.JButton();
        nhapmoi = new javax.swing.JButton();
        dau = new javax.swing.JButton();
        lui = new javax.swing.JButton();
        tien = new javax.swing.JButton();
        cuoi = new javax.swing.JButton();
        stt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("QLSV"); // NOI18N

        QLSV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        QLSV.setForeground(new java.awt.Color(255, 51, 51));
        QLSV.setText("QUẢN LÝ SINH VIÊN");

        hoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Họ và Tên:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Điểm:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Học lực:");

        nganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phầm mềm", "Lập trình web", "Lập trình mobile", "Thiết kế đồ họa" }));
        nganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nganhActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Ngành:");

        diem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diemActionPerformed(evt);
            }
        });

        hocluc.setEditable(false);
        hocluc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoclucActionPerformed(evt);
            }
        });

        bang.setAutoCreateRowSorter(true);
        bang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ và Tên", "Điểm", "Ngành", "Học lực", "Phần thưởng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bang.setSelectionBackground(new java.awt.Color(255, 51, 51));
        bang.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                bangAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bangAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(bang);

        checkbot.setBackground(new java.awt.Color(153, 255, 204));
        checkbot.setText("Có phần thường");
        checkbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbotActionPerformed(evt);
            }
        });

        sxten.setBackground(new java.awt.Color(153, 153, 153));
        sxten.setText("Sắp xếp theo tên");
        sxten.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sxten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxtenActionPerformed(evt);
            }
        });

        sxdiem.setBackground(new java.awt.Color(153, 153, 153));
        sxdiem.setText("Sắp xếp theo điểm");
        sxdiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sxdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxdiemActionPerformed(evt);
            }
        });

        them.setBackground(new java.awt.Color(153, 153, 153));
        them.setText("Thêm");
        them.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        xoa.setBackground(new java.awt.Color(153, 153, 153));
        xoa.setText("Xóa");
        xoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        capnhat.setBackground(new java.awt.Color(153, 153, 153));
        capnhat.setText("Cập nhật");
        capnhat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatActionPerformed(evt);
            }
        });

        nhapmoi.setBackground(new java.awt.Color(153, 153, 153));
        nhapmoi.setText("Nhập mới");
        nhapmoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapmoiActionPerformed(evt);
            }
        });

        dau.setText("|<");
        dau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dauActionPerformed(evt);
            }
        });

        lui.setText("<");
        lui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luiActionPerformed(evt);
            }
        });

        tien.setText(">");
        tien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tienActionPerformed(evt);
            }
        });

        cuoi.setText(">|");
        cuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuoiActionPerformed(evt);
            }
        });

        stt.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(them)
                        .addGap(18, 18, 18)
                        .addComponent(xoa)
                        .addGap(18, 18, 18)
                        .addComponent(capnhat)
                        .addGap(18, 18, 18)
                        .addComponent(nhapmoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(dau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tien)
                        .addGap(18, 18, 18)
                        .addComponent(cuoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkbot)
                                    .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(diem, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hoten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hocluc, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(QLSV)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sxten)
                        .addGap(87, 87, 87)
                        .addComponent(sxdiem)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(QLSV)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them)
                    .addComponent(xoa)
                    .addComponent(capnhat)
                    .addComponent(nhapmoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dau)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lui)
                        .addComponent(tien)
                        .addComponent(cuoi)
                        .addComponent(stt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sxdiem)
                    .addComponent(sxten))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        nganh.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("Quản Lý Sinh Viên");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotenActionPerformed

    private void hoclucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoclucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoclucActionPerformed

    private void nganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nganhActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        this.addStudent();
        this.fillToTable();
    }//GEN-LAST:event_themActionPerformed

    private void bangAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bangAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_bangAncestorAdded

    private void diemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diemActionPerformed

    private void bangAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bangAncestorMoved
        // TODO add your handling code here:
        this.showDetail();
    }//GEN-LAST:event_bangAncestorMoved

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        this.removeStudent();
        this.fillToTable();
    }//GEN-LAST:event_xoaActionPerformed

    private void capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatActionPerformed
        // TODO add your handling code here:
        this.updateStudent();
        this.fillToTable();
    }//GEN-LAST:event_capnhatActionPerformed

    private void sxtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxtenActionPerformed
        // TODO add your handling code here:
        this.orderByName();
        this.fillToTable();
    }//GEN-LAST:event_sxtenActionPerformed

    private void sxdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxdiemActionPerformed
        // TODO add your handling code here:
        this.orderByMarks();
        this.fillToTable();
    }//GEN-LAST:event_sxdiemActionPerformed

    private void nhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapmoiActionPerformed
        // TODO add your handling code here:
        hoten.setText("");
        diem.setText("");
        hocluc.setText("");
        checkbot.setSelected(false);
    }//GEN-LAST:event_nhapmoiActionPerformed

    private void checkbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbotActionPerformed
        // TODO add your handling code here:
        checkbot.setSelected(false);
    }//GEN-LAST:event_checkbotActionPerformed

    private void dauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dauActionPerformed
        // TODO add your handling code here:
        dau();
    }//GEN-LAST:event_dauActionPerformed

    private void luiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luiActionPerformed
        // TODO add your handling code here:
        lui();
    }//GEN-LAST:event_luiActionPerformed

    private void tienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tienActionPerformed
        // TODO add your handling code here:
        tien();
    }//GEN-LAST:event_tienActionPerformed

    private void cuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuoiActionPerformed
        // TODO add your handling code here:
        cuoi();
    }//GEN-LAST:event_cuoiActionPerformed

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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QLSV;
    private javax.swing.JTable bang;
    private javax.swing.JButton capnhat;
    private javax.swing.JCheckBox checkbot;
    private javax.swing.JButton cuoi;
    private javax.swing.JButton dau;
    private javax.swing.JTextField diem;
    private javax.swing.JTextField hocluc;
    private javax.swing.JTextField hoten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lui;
    private javax.swing.JComboBox<String> nganh;
    private javax.swing.JButton nhapmoi;
    private javax.swing.JTextField stt;
    private javax.swing.JButton sxdiem;
    private javax.swing.JButton sxten;
    private javax.swing.JButton them;
    private javax.swing.JButton tien;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
