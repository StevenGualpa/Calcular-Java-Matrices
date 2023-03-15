/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculadoramatrices;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Steven
 */
public class FormularioDatos extends javax.swing.JFrame {

    /**
     * Creates new form FormularioDatos
     */
    String DatosAuxiliar[][];
    int FilasM1; int FilasM2;  int ColumnasM1; int ColumnasM2;
    Double Resultado[][];
    String Resultado2[][];


    void MuestraMensaje(String msm,String titulo)
    {
        JOptionPane.showMessageDialog(this, msm, titulo, WIDTH);
        //    JOptionPane.showMessageDialog(this, msm);
    }
    public FormularioDatos() {
        initComponents();
         this.FilasM1=3;
         this.ColumnasM1=3;
         this.FilasM2=3;
         this.ColumnasM2=3;
          ClaseOperaciones.LimpiaTabla(jTable1, FilasM1, ColumnasM1);
          ClaseOperaciones.LimpiaTabla(jTable2, FilasM2, ColumnasM2);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelM1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBotonAgregaColumnaM1 = new javax.swing.JButton();
        JBotonBorraColumnaM1 = new javax.swing.JButton();
        JBotonAgregaFilaM1 = new javax.swing.JButton();
        JBotonEliminaFilaM1 = new javax.swing.JButton();
        JPanelM2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        JBotonAgregaColumnaM2 = new javax.swing.JButton();
        JBotonBorraColumnaM2 = new javax.swing.JButton();
        JBotonAgregaFilaM2 = new javax.swing.JButton();
        JBotonEliminaFilaM2 = new javax.swing.JButton();
        JLabelTitulo = new javax.swing.JLabel();
        JBotonSumaMatriz = new javax.swing.JButton();
        JBotonRestaMatriz = new javax.swing.JButton();
        JBotonMultiplicacionMatriz = new javax.swing.JButton();
        JBotonTraspuestaM1 = new javax.swing.JButton();
        JBotonDeterminanteM1 = new javax.swing.JButton();
        JBotonInversaM1 = new javax.swing.JButton();
        JBotonTraspuestaM2 = new javax.swing.JButton();
        JBotonDeterminanteM2 = new javax.swing.JButton();
        JBotonInversaM2 = new javax.swing.JButton();
        JBotonLLenarM1 = new javax.swing.JButton();
        JBotonLLenarM2 = new javax.swing.JButton();
        JBotonLimpiarM1 = new javax.swing.JButton();
        JBotonLimpiarM2 = new javax.swing.JButton();
        JBotonAdjuntaM1 = new javax.swing.JButton();
        JBotonAdjuntaM2 = new javax.swing.JButton();
        JBotonEsquinaMatriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);
        getContentPane().setLayout(null);

        JPanelM1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JPanelM1.setPreferredSize(new java.awt.Dimension(400, 400));
        JPanelM1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setTableHeader(null);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JPanelM1.add(jScrollPane1);
        jScrollPane1.setBounds(11, 20, 452, 325);

        JBotonAgregaColumnaM1.setBackground(java.awt.Color.lightGray);
        JBotonAgregaColumnaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonAgregaColumnaM1.setText("+");
        JBotonAgregaColumnaM1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonAgregaColumnaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAgregaColumnaM1ActionPerformed(evt);
            }
        });
        JPanelM1.add(JBotonAgregaColumnaM1);
        JBotonAgregaColumnaM1.setBounds(470, 20, 50, 25);

        JBotonBorraColumnaM1.setBackground(java.awt.Color.lightGray);
        JBotonBorraColumnaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonBorraColumnaM1.setText("-");
        JBotonBorraColumnaM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonBorraColumnaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonBorraColumnaM1ActionPerformed(evt);
            }
        });
        JPanelM1.add(JBotonBorraColumnaM1);
        JBotonBorraColumnaM1.setBounds(470, 60, 50, 25);

        JBotonAgregaFilaM1.setBackground(java.awt.Color.lightGray);
        JBotonAgregaFilaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonAgregaFilaM1.setText("+");
        JBotonAgregaFilaM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonAgregaFilaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAgregaFilaM1ActionPerformed(evt);
            }
        });
        JPanelM1.add(JBotonAgregaFilaM1);
        JBotonAgregaFilaM1.setBounds(11, 356, 50, 25);

        JBotonEliminaFilaM1.setBackground(java.awt.Color.lightGray);
        JBotonEliminaFilaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonEliminaFilaM1.setText("-");
        JBotonEliminaFilaM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonEliminaFilaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonEliminaFilaM1ActionPerformed(evt);
            }
        });
        JPanelM1.add(JBotonEliminaFilaM1);
        JBotonEliminaFilaM1.setBounds(79, 356, 50, 25);

        getContentPane().add(JPanelM1);
        JPanelM1.setBounds(20, 150, 525, 400);

        JPanelM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanelM2.setPreferredSize(new java.awt.Dimension(400, 400));
        JPanelM2.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setTableHeader(null);
        jScrollPane2.setViewportView(jTable2);

        JPanelM2.add(jScrollPane2);
        jScrollPane2.setBounds(11, 12, 450, 325);

        JBotonAgregaColumnaM2.setBackground(java.awt.Color.lightGray);
        JBotonAgregaColumnaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonAgregaColumnaM2.setText("+");
        JBotonAgregaColumnaM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonAgregaColumnaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAgregaColumnaM2ActionPerformed(evt);
            }
        });
        JPanelM2.add(JBotonAgregaColumnaM2);
        JBotonAgregaColumnaM2.setBounds(471, 12, 40, 25);

        JBotonBorraColumnaM2.setBackground(java.awt.Color.lightGray);
        JBotonBorraColumnaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonBorraColumnaM2.setText("-");
        JBotonBorraColumnaM2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonBorraColumnaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonBorraColumnaM2ActionPerformed(evt);
            }
        });
        JPanelM2.add(JBotonBorraColumnaM2);
        JBotonBorraColumnaM2.setBounds(471, 55, 40, 25);

        JBotonAgregaFilaM2.setBackground(java.awt.Color.lightGray);
        JBotonAgregaFilaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonAgregaFilaM2.setText("+");
        JBotonAgregaFilaM2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonAgregaFilaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAgregaFilaM2ActionPerformed(evt);
            }
        });
        JPanelM2.add(JBotonAgregaFilaM2);
        JBotonAgregaFilaM2.setBounds(11, 363, 50, 25);

        JBotonEliminaFilaM2.setBackground(java.awt.Color.lightGray);
        JBotonEliminaFilaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonEliminaFilaM2.setText("-");
        JBotonEliminaFilaM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonEliminaFilaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonEliminaFilaM2ActionPerformed(evt);
            }
        });
        JPanelM2.add(JBotonEliminaFilaM2);
        JBotonEliminaFilaM2.setBounds(79, 363, 40, 25);

        getContentPane().add(JPanelM2);
        JPanelM2.setBounds(690, 150, 525, 400);

        JLabelTitulo.setFont(new java.awt.Font("Times New Roman", 3, 50)); // NOI18N
        JLabelTitulo.setText("Calculadora Matrices V2.0");
        getContentPane().add(JLabelTitulo);
        JLabelTitulo.setBounds(344, 11, 590, 46);

        JBotonSumaMatriz.setBackground(java.awt.Color.lightGray);
        JBotonSumaMatriz.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonSumaMatriz.setText("M1 + M2");
        JBotonSumaMatriz.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonSumaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonSumaMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonSumaMatriz);
        JBotonSumaMatriz.setBounds(560, 150, 120, 25);

        JBotonRestaMatriz.setBackground(java.awt.Color.lightGray);
        JBotonRestaMatriz.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonRestaMatriz.setText("M1 - M2");
        JBotonRestaMatriz.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonRestaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonRestaMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonRestaMatriz);
        JBotonRestaMatriz.setBounds(560, 190, 120, 25);

        JBotonMultiplicacionMatriz.setBackground(java.awt.Color.lightGray);
        JBotonMultiplicacionMatriz.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonMultiplicacionMatriz.setText("M1 * M2");
        JBotonMultiplicacionMatriz.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonMultiplicacionMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonMultiplicacionMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonMultiplicacionMatriz);
        JBotonMultiplicacionMatriz.setBounds(560, 230, 120, 25);

        JBotonTraspuestaM1.setBackground(java.awt.Color.lightGray);
        JBotonTraspuestaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonTraspuestaM1.setText("Traspuesta");
        JBotonTraspuestaM1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonTraspuestaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonTraspuestaM1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonTraspuestaM1);
        JBotonTraspuestaM1.setBounds(360, 70, 150, 25);

        JBotonDeterminanteM1.setBackground(java.awt.Color.lightGray);
        JBotonDeterminanteM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonDeterminanteM1.setText("Determinante");
        JBotonDeterminanteM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonDeterminanteM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonDeterminanteM1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonDeterminanteM1);
        JBotonDeterminanteM1.setBounds(360, 110, 150, 25);

        JBotonInversaM1.setBackground(java.awt.Color.lightGray);
        JBotonInversaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonInversaM1.setText("Inversa");
        JBotonInversaM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonInversaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonInversaM1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonInversaM1);
        JBotonInversaM1.setBounds(190, 110, 150, 25);

        JBotonTraspuestaM2.setBackground(java.awt.Color.lightGray);
        JBotonTraspuestaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonTraspuestaM2.setText("Traspuesta");
        JBotonTraspuestaM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonTraspuestaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonTraspuestaM2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonTraspuestaM2);
        JBotonTraspuestaM2.setBounds(1040, 70, 150, 25);

        JBotonDeterminanteM2.setBackground(java.awt.Color.lightGray);
        JBotonDeterminanteM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonDeterminanteM2.setText("Derterminante");
        JBotonDeterminanteM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonDeterminanteM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonDeterminanteM2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonDeterminanteM2);
        JBotonDeterminanteM2.setBounds(1040, 110, 150, 25);

        JBotonInversaM2.setBackground(java.awt.Color.lightGray);
        JBotonInversaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonInversaM2.setText("Inversa");
        JBotonInversaM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonInversaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonInversaM2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonInversaM2);
        JBotonInversaM2.setBounds(870, 110, 150, 25);

        JBotonLLenarM1.setBackground(java.awt.Color.lightGray);
        JBotonLLenarM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonLLenarM1.setText("LLenar");
        JBotonLLenarM1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonLLenarM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonLLenarM1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonLLenarM1);
        JBotonLLenarM1.setBounds(190, 70, 150, 25);

        JBotonLLenarM2.setBackground(java.awt.Color.lightGray);
        JBotonLLenarM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonLLenarM2.setText("Llenar");
        JBotonLLenarM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBotonLLenarM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonLLenarM2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonLLenarM2);
        JBotonLLenarM2.setBounds(870, 70, 150, 25);

        JBotonLimpiarM1.setBackground(java.awt.Color.lightGray);
        JBotonLimpiarM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonLimpiarM1.setText("Limpiar");
        JBotonLimpiarM1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonLimpiarM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonLimpiarM1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonLimpiarM1);
        JBotonLimpiarM1.setBounds(30, 70, 150, 25);

        JBotonLimpiarM2.setBackground(java.awt.Color.lightGray);
        JBotonLimpiarM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonLimpiarM2.setText("Limpiar");
        JBotonLimpiarM2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonLimpiarM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonLimpiarM2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonLimpiarM2);
        JBotonLimpiarM2.setBounds(690, 70, 150, 25);

        JBotonAdjuntaM1.setBackground(java.awt.Color.lightGray);
        JBotonAdjuntaM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonAdjuntaM1.setText("Adjunta");
        JBotonAdjuntaM1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonAdjuntaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAdjuntaM1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonAdjuntaM1);
        JBotonAdjuntaM1.setBounds(30, 110, 150, 25);

        JBotonAdjuntaM2.setBackground(java.awt.Color.lightGray);
        JBotonAdjuntaM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonAdjuntaM2.setText("Adjunta");
        JBotonAdjuntaM2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonAdjuntaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAdjuntaM2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonAdjuntaM2);
        JBotonAdjuntaM2.setBounds(690, 110, 150, 25);

        JBotonEsquinaMatriz.setBackground(java.awt.Color.lightGray);
        JBotonEsquinaMatriz.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBotonEsquinaMatriz.setText("Esquina");
        JBotonEsquinaMatriz.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JBotonEsquinaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonEsquinaMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonEsquinaMatriz);
        JBotonEsquinaMatriz.setBounds(560, 270, 120, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Matriz 1
    private void JBotonAgregaColumnaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAgregaColumnaM1ActionPerformed

        if(this.ColumnasM1<10)
        {
                this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable1, FilasM1, ColumnasM1);
                this.ColumnasM1++; 
                ClaseOperaciones.LlenaTabla(jTable1, FilasM1, ColumnasM1,DatosAuxiliar);
        }
        else
        {
            this.MuestraMensaje("El  Limite Columnas es 10","Error");
        }
    }//GEN-LAST:event_JBotonAgregaColumnaM1ActionPerformed

    private void JBotonBorraColumnaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonBorraColumnaM1ActionPerformed

        if(this.ColumnasM1>1)
         {
                 this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable1, FilasM1, ColumnasM1);
                this.ColumnasM1--;
                 ClaseOperaciones.LlenaTabla(jTable1, FilasM1, ColumnasM1,DatosAuxiliar);
         }
        else
        {
        this.MuestraMensaje("Debe Exisitr como Minimo 1 Columa","Error");
        }
    }//GEN-LAST:event_JBotonBorraColumnaM1ActionPerformed

    private void JBotonAgregaFilaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAgregaFilaM1ActionPerformed
        if(this.FilasM1<10)
        {
                this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable1, FilasM1, ColumnasM1);
                this.FilasM1++;
                 ClaseOperaciones.LlenaTabla(jTable1, FilasM1, ColumnasM1,DatosAuxiliar);
        }
        else
        {
                this.MuestraMensaje("El Limite de Filas es de 10","Error");
        }
    }//GEN-LAST:event_JBotonAgregaFilaM1ActionPerformed

    private void JBotonEliminaFilaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonEliminaFilaM1ActionPerformed

        if(this.FilasM1>1)
        {
                 this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable1, FilasM1, ColumnasM1);
                this.FilasM1--; 
                ClaseOperaciones.LlenaTabla(jTable1, FilasM1, ColumnasM1,DatosAuxiliar);
        }
        else
        {
           this.MuestraMensaje("Debe Exisitr como Minimo 1 Fila","Error");
        }
    }//GEN-LAST:event_JBotonEliminaFilaM1ActionPerformed
    
    //Matriz 2
    private void JBotonAgregaColumnaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAgregaColumnaM2ActionPerformed
        if(this.ColumnasM2<10)
        {
            this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable2, FilasM2, ColumnasM2);
            this.ColumnasM2++;
            ClaseOperaciones.LlenaTabla(jTable2, FilasM2, ColumnasM2, DatosAuxiliar);
        }
        else
        {
            this.MuestraMensaje("El Limite de las Columnas es 10", "Error");
        }
    }//GEN-LAST:event_JBotonAgregaColumnaM2ActionPerformed

    private void JBotonBorraColumnaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonBorraColumnaM2ActionPerformed
        if(this.ColumnasM2>0)
        {
            this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable2, FilasM2, ColumnasM2);
            this.ColumnasM2--;
            ClaseOperaciones.LlenaTabla(jTable2, FilasM2, ColumnasM2, DatosAuxiliar);
        }
        else
        {
            this.MuestraMensaje("Debe existir como minimo una Columna", "Error");
        }
    }//GEN-LAST:event_JBotonBorraColumnaM2ActionPerformed

    private void JBotonAgregaFilaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAgregaFilaM2ActionPerformed
        if(this.FilasM2<10)
        {
            this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable2, FilasM2, ColumnasM2);
            this.FilasM2++;
            ClaseOperaciones.LlenaTabla(jTable2, FilasM2, ColumnasM2, DatosAuxiliar);
        }
        else
        {
            this.MuestraMensaje("El Limite de las Filas es 10", "Error");
        }
    }//GEN-LAST:event_JBotonAgregaFilaM2ActionPerformed

    private void JBotonEliminaFilaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonEliminaFilaM2ActionPerformed
            if(this.FilasM2>0)
            {
                this.DatosAuxiliar=ClaseOperaciones.LeerTablaAux(jTable2, FilasM2, ColumnasM2);
                this.FilasM2--;
                ClaseOperaciones.LlenaTabla(jTable2, FilasM2, ColumnasM2, DatosAuxiliar);
            }
            else
            {
                this.MuestraMensaje("Debe existit como minimo una Fila", "Error");
            }
    }//GEN-LAST:event_JBotonEliminaFilaM2ActionPerformed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
        /*
        int filactual=this.jTable1.getSelectedRow();
        int columnactual= this.jTable1.getSelectedColumn();
       MuestraMensaje("Fila: "+filactual+" Columna: "+ columnactual);
        char letra=evt.getKeyChar();
        jTable1.setValueAt(letra, filactual, columnactual);
        */
    }//GEN-LAST:event_jTable1KeyTyped

    
    //COMPROBAR 
     public double []comprobar(Double m[][],int o,int d){
        double v[]=new double[4]; //se crea un vector conformado por un arreglo de 4 posiciones
        double so=0,sd=0; //sumatorias de oferta y demanda
        for(int i=0;i<o;i++){ //con este ciclo se suman los valores de las ofertas
            so=so+m[i][d-1]; 
        }
        for(int i=0;i<d;i++){ // con este ciclo se suman los valores de las demandas
            sd=sd+m[o-1][i];
        }
        if(sd!=so){ //si la sumatoria de la demanda es diferente de la sumatoria de la oferta y 
            //145  45
            if(sd>so){ //además la supera 
                o=o+1;//se compensa esto dando un ofertante más  para compensar la demanda. 
            }else{ //(Si la sumatoria de la oferta es superior a la sumatoria de la demanda)
                d=d+1;//se compensa esto dando un demandante más para cubrir la oferta
            }
        }
        if(sd!=so){
            v[0]=o; //se envia la cantidad de ofertantes, depende si se haya aumentado un ofertante o no. 
            v[1]=d; //se envia la cantidad de demandantes, depende si se haya aumentado un ofertante o no.
            v[2]=so; //se envia al vector la sumatoria de oferta para poderla mover a la columna siguiente.
            v[3]=sd; // se envia al vector la sumatoria de demanda para poderla mover a la fila siguiente.
        }else{
            v[0]=o; //se queda igual la cantidad de ofertantes
            v[1]=d; //se queda igual la cantidad de demandantes
            v[2]=0; //se queda la posición de la sumatoria de oferta tal como está, porque no hay cambios. 
            v[3]=0; //se queda la posición de la sumatoria de demanda tal como está, porque no hay cambios. 
        }
        return v; 
    }
    
     //Se recompila matriz
     public Double[][]crear_nueva_matriz(Double m[][],int o,int d,double so,double sd){
        Double sobra=0.0;int i1=0,j1=0;
        Double m1[][]=new Double[o][d]; // se inicia otro arreglo bidimensional para crear la nueva matrix
        System.out.println(sd+"   "+so);
        if(sd>so){ //como la demanda supera la oferta se necesita agregar otro ofertante
            sobra=sd-so; //la diferencia entre la demanda y la oferta. 
            m1[o-2][d-1]=sobra; //se coloca el valor de la sobra que es la demanda faltante a cubrir 
            for(int i=0;i<o;i++){ //se inicia el recorrido en todas las filas de la matriz nueva
                j1=0; //jl tiene el lugar de las columnas "d" de la matriz original: "m"
                if(i!=o-2){ //esto es para evitar que toda la fila nueva agregada (la oferta compensatoria) se modifique
                    for(int j=0;j<d;j++){ //recorrido a través de las columnas. 
                        m1[i][j]=m[i1][j1];//se colocan en la matriz nueva los valores que tenia la matrix original
                        j1++; //Se incrementa el valor del indice, para seguir recorriendo las columnas de la matriz original. 
                    }i1++; // se incrementa el valor del indice para seguir recorriendo las filas de la matriz original
                }
            }
            
        }else{ //como la oferta supera la demanda se necesita agregar otro ofertante
            sobra=so-sd; //la diferencia entre la oferta y la demanda. 
            m1[o-1][d-2]=sobra; //se coloca el valor de la sobra que es la oferta faltante a cubrir 
            for(int i=0;i<o;i++){ //se inicia el recorrido en todas las filas de la matriz nueva
                j1=0; //jl tiene el lugar de las columnas "d" de la matriz original: "m"
                for(int j=0;j<d;j++){ //recorrido a través de las columnas. 
                    if(j!=d-2){ //esto es para evitar que toda la columna nueva agregada (la demanda compensatoria) se modifique
                        m1[i][j]=m[i1][j1]; //se colocan en la matriz nueva los valores que tenia la matrix original
                        j1++; //Se incrementa el valor del indice, para seguir recorriendo las columnas de la matriz original. 
                    }
                }
                i1++; // se incrementa el valor del indice para seguir recorriendo las filas de la matriz original
            }
        }
        /*
         mo.setRowCount(o); //se obtienen la cuenta de filas 
        mo.setColumnCount(d); //se obtienen la cuenta de columnas
        
        for(int i=0;i<o;i++){
            for(int j=0;j<d;j++){
                jTable1.setValueAt(m1[i][j], i, j); //se vacian los datos de la matriz nueva a la tabla
            }
        }*/
        return m1;
    }
     
    //Operaciones
    private void JBotonSumaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonSumaMatrizActionPerformed
        
        if(this.FilasM1==this.FilasM2)
        {
            if(this.ColumnasM1==this.ColumnasM2)
            {
                if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
                {
                    if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
                    {
                        Resultado=ClaseOperaciones.Suma(jTable1, jTable2, FilasM1, ColumnasM1);
                        //FrmResultado f=new FrmResultado(Resultado,FilasM1,ColumnasM1);
                        //f.JText.setText("OPERACION SUMA(A+B)");
                        //f.setLocationRelativeTo(null);
                        //f.show();
                        DialogoResultado f = new DialogoResultado(new javax.swing.JFrame(), true,Resultado,FilasM1,ColumnasM1);
                        f.JText.setText("OPERACION SUMA(A+B)");
                        f.setLocationRelativeTo(null);
                        f.show(); 
                    }
                    else
                    {
                        MuestraMensaje("Proxiamamente se aceptara mas tipos de valores ( ͡° ͜ʖ ͡°)","===>Matriz 2 Invalida ( ͡° ͜ʖ ͡°)");
                    }
                }
                else
                {
                    MuestraMensaje("Proxiamamente se aceptara mas tipos de valores ( ͡° ͜ʖ ͡°)","==>Matriz 1Invalida ( ͡° ͜ʖ ͡°)");
                }
            }
            else
            {
                    MuestraMensaje("El numero de Columnas de ambas Matrices deben ser iguales ( ͡° ͜ʖ ͡°)","==>Error ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            MuestraMensaje("El numero de Filas de ambas Matrices deben ser iguales ( ͡° ͜ʖ ͡°)","==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonSumaMatrizActionPerformed

    private void JBotonRestaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonRestaMatrizActionPerformed
        if(this.FilasM1==this.FilasM2)
        {
            if(this.ColumnasM1==this.ColumnasM2)
            {
                if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
                {
                    if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
                    {
                        Resultado=ClaseOperaciones.Resta(jTable1, jTable2, FilasM1, ColumnasM1);
                        /*
                        FrmResultado f=new FrmResultado(Resultado,FilasM1,ColumnasM1);
                        f.JText.setText("OPERACION RESTA(A-B)");
                        f.show();
                    */
                        DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Resultado,FilasM1,ColumnasM1);
                        f.JText.setText("OPERACION RESTA(A-B) ");
                        f.setLocationRelativeTo(null);
                        f.show();
                    }
                    else
                    {
                        MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
                    }
                }
                else
                {
                    MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
                }
            }
            else
            {
                MuestraMensaje("El numero de Columnas de ambas Matrices deben ser iguales ( ͡° ͜ʖ ͡°)","==>Error ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            MuestraMensaje("El numero de Filas de ambas Matrices deben ser iguales ( ͡° ͜ʖ ͡°)","==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonRestaMatrizActionPerformed

    private void JBotonMultiplicacionMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonMultiplicacionMatrizActionPerformed
        
        if(this.ColumnasM1==this.FilasM2)
        {
            if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
            {
                if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
                {
                     Resultado=ClaseOperaciones.Multiplicacion(jTable1, jTable2, FilasM1, FilasM2, ColumnasM1, ColumnasM2);
                     /*
                     FrmResultado f=new FrmResultado(Resultado,FilasM1,ColumnasM2);
                     f.JText.setText("OPERACION MULTIPLICACION(A*B)");
                     f.show();
                     */
                     DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Resultado,FilasM1,ColumnasM2);
                     f.setLocationRelativeTo(null);
                     f.JText.setText("MULTIPLICACION(A*B)");
                     f.show();
                }
                else
                {                
                    MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
                }
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
        this.MuestraMensaje("El numero de Columas de ambas Matrices deben ser iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonMultiplicacionMatrizActionPerformed

    private void JBotonLLenarM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonLLenarM1ActionPerformed
        // TODO add your handling code here:
        ClaseOperaciones.LlenaTablaRandom(jTable1, FilasM1, ColumnasM1);
    }//GEN-LAST:event_JBotonLLenarM1ActionPerformed

    private void JBotonLLenarM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonLLenarM2ActionPerformed
        // TODO add your handling code here:
               ClaseOperaciones.LlenaTablaRandom(jTable2, FilasM2, ColumnasM2);
    }//GEN-LAST:event_JBotonLLenarM2ActionPerformed

    private void JBotonTraspuestaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonTraspuestaM1ActionPerformed
       if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
       {
           Resultado=ClaseOperaciones.Traspuesta(jTable1, FilasM1, ColumnasM1);
           DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Resultado,ColumnasM1,FilasM1);
           f.setLocationRelativeTo(null);
           f.JText.setText("OPERACION TRASPUESTA A");
           f.show();
       }
       else
       {
           MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
       }
    }//GEN-LAST:event_JBotonTraspuestaM1ActionPerformed

    private void JBotonTraspuestaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonTraspuestaM2ActionPerformed
        if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
       {
           Resultado=ClaseOperaciones.Traspuesta(jTable2, FilasM2, ColumnasM2);
           DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Resultado,ColumnasM2,FilasM2);
           f.JText.setText("OPERACION TRASPUESTA B ");
           f.setLocationRelativeTo(null);
           f.show();
       }
       else
       {
           MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 2 Invalida ( ͡° ͜ʖ ͡°)");
       }
    }//GEN-LAST:event_JBotonTraspuestaM2ActionPerformed

    private void JBotonLimpiarM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonLimpiarM1ActionPerformed
        // TODO add your handling code here:
        ClaseOperaciones.LimpiaTabla(jTable1, FilasM1, ColumnasM1);
        
    }//GEN-LAST:event_JBotonLimpiarM1ActionPerformed

    private void JBotonLimpiarM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonLimpiarM2ActionPerformed
        // TODO add your handling code here:
        ClaseOperaciones.LimpiaTabla(jTable2, FilasM2, ColumnasM2);
        
    }//GEN-LAST:event_JBotonLimpiarM2ActionPerformed

    private void JBotonAdjuntaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAdjuntaM1ActionPerformed
        
        if(this.FilasM1==this.ColumnasM1)
        {
            if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
            {
                Double Matriz[][]=ClaseOperaciones.ObtenerMatriz(jTable1, FilasM1, ColumnasM1);
                Double[][]Adj=ClaseOperaciones.Adjunta(Matriz, FilasM1, ColumnasM1);
                Double[][]Tras=ClaseOperaciones.Traspuesta(Adj, FilasM1, ColumnasM1);
                DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Tras,FilasM1,ColumnasM1);
                f.setLocationRelativeTo(null);           
                f.JText.setText("OPERACION ADJUNTA DE A");
                f.show();
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            this.MuestraMensaje("El numero de Filas y  Columas deben ser  iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonAdjuntaM1ActionPerformed

    private void JBotonAdjuntaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAdjuntaM2ActionPerformed
        // TODO add your handling code here:
        if(this.FilasM2==this.ColumnasM2)
        {
            if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
            {
                Double Matriz[][]=ClaseOperaciones.ObtenerMatriz(jTable2, FilasM2, ColumnasM2);
                Double[][]Adj=ClaseOperaciones.Adjunta(Matriz, FilasM2, ColumnasM2);
                Double[][]Tras=ClaseOperaciones.Traspuesta(Adj, FilasM2, ColumnasM2);
                DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Tras,FilasM2,ColumnasM2);
                f.setLocationRelativeTo(null);
                f.JText.setText("OPERACION ADJUNTA DE B");
                f.show();
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 2 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            this.MuestraMensaje("El numero de Filas y  Columas deben ser  iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonAdjuntaM2ActionPerformed

    private void JBotonDeterminanteM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonDeterminanteM1ActionPerformed
        // TODO add your handling code here:
        if(this.FilasM1==this.ColumnasM1)
        {
            if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
            {
                Double Matriz[][]=ClaseOperaciones.ObtenerMatriz(jTable1, FilasM1, ColumnasM1);
                Double Dt=ClaseOperaciones.Deter(0, Matriz);
                MuestraMensaje(""+Dt,"");
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            this.MuestraMensaje("El numero de Filas y  Columas deben ser  iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonDeterminanteM1ActionPerformed

    private void JBotonInversaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonInversaM1ActionPerformed
        // TODO add your handling code here:
        if(this.FilasM1==this.ColumnasM1)
        {
            if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
            {
                Double Matriz[][]=ClaseOperaciones.ObtenerMatriz(jTable1, FilasM1, ColumnasM1);
                Double Dt=ClaseOperaciones.Deter(0, Matriz);
                Double[][]Adj=ClaseOperaciones.Adjunta(Matriz, FilasM1, ColumnasM1);
                Double[][]Tras=ClaseOperaciones.Traspuesta(Adj, FilasM1, ColumnasM1);
                Double[][]Inv=ClaseOperaciones.Inversa(Tras, FilasM1, ColumnasM1, Dt);
                DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Inv,FilasM1,ColumnasM1);
                f.setLocationRelativeTo(null);
                f.JText.setText("OPERACION INVERSA DE A");
                f.show();
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 1 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            this.MuestraMensaje("El numero de Filas y  Columas deben ser  iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonInversaM1ActionPerformed

    private void JBotonDeterminanteM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonDeterminanteM2ActionPerformed
        // TODO add your handling code here:
        if(this.FilasM2==this.ColumnasM2)
        {
            if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
            {
                Double Matriz[][]=ClaseOperaciones.ObtenerMatriz(jTable2, FilasM2, ColumnasM2);
                Double Dt=ClaseOperaciones.Deter(0, Matriz);
                MuestraMensaje(""+Dt,"");
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 2 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            this.MuestraMensaje("El numero de Filas y  Columas deben ser  iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonDeterminanteM2ActionPerformed

    private void JBotonInversaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonInversaM2ActionPerformed
        // TODO add your handling code here:
        if(this.FilasM2==this.ColumnasM2)
        {
            if(ClaseOperaciones.Aprobar(jTable2, FilasM2, ColumnasM2))
            {
                Double Matriz[][]=ClaseOperaciones.ObtenerMatriz(jTable1, FilasM2, ColumnasM2);
                Double Dt=ClaseOperaciones.Deter(0, Matriz);
                Double[][]Adj=ClaseOperaciones.Adjunta(Matriz, FilasM2, ColumnasM2);
                Double[][]Tras=ClaseOperaciones.Traspuesta(Adj, FilasM2, ColumnasM2);
                Double[][]Inv=ClaseOperaciones.Inversa(Tras, FilasM2, ColumnasM2, Dt);
                DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Inv,FilasM2,ColumnasM2);
                f.setLocationRelativeTo(null);
                f.JText.setText("OPERACION INVERSA DE B");
                f.show();
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 2 Invalida ( ͡° ͜ʖ ͡°)");
            }
        }
        else
        {
            this.MuestraMensaje("El numero de Filas y  Columas deben ser  iguales ( ͡° ͜ʖ ͡°)", "==>Error ( ͡° ͜ʖ ͡°)");
        }
    }//GEN-LAST:event_JBotonInversaM2ActionPerformed

    private void JBotonEsquinaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonEsquinaMatrizActionPerformed
        // TODO add your handling code here:
        if(ClaseOperaciones.Aprobar(jTable1, FilasM1, ColumnasM1))
        {
            Double [][] Original=ClaseOperaciones.ObtenerMatriz(jTable1, FilasM1, ColumnasM1);
            double v[]=comprobar(Original,FilasM1, ColumnasM1);
            
        //Una vez comprobado que la sumatoria de demanda y la de oferta son iguales o no 
        int o=(int)(v[0]); //Se necesita la cantidad de ofertantes debido a que se van a pasar a la siguiente matriz
        //o para realizar el calculo del costo total. 
        int d=(int)(v[1]);//Se necesita la cantidad de demandantes debido a que se van a pasar a la siguiente matriz
        //d para realizar el calculo del costo total. 
        double so=0,sd=0;
        so=v[2]; //Se capturan las sumatorias de las ofertas de ser necesario aplicar una compensación de oferta y demanda
        sd=v[3];
        //System.out.println(o+" "+d);
        if(so!=sd){ //Si las sumatorias no fueran iguales, se tiene que crear una matriz que compense esto.
        Double m2[][]=crear_nueva_matriz(Original,o,d,so,sd);
        ClaseOperaciones.LimpiaTabla(jTable2, o, d);
        ClaseOperaciones.LlenaTablaResultado(jTable2, m2, o, d);
           Resultado2=ClaseOperaciones.esquina_noroeste(jTable2, o, d);
        
            DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Resultado2,o,d);
            
            f.setLocationRelativeTo(null);
            
            f.JText.setText("Metodo Esquina Noroeste");
            
            f.JText1.setText("Costo Total: "+ClaseOperaciones.CostoTotal.toString());
            
            f.show();
        }else{
                    SinAdicionar();

        }
      
          
            }
            else
            {
                MuestraMensaje("Proximamente se aceptara mas tipos de Valores ( ͡° ͜ʖ ͡°)","==>Matriz 2 Invalida ( ͡° ͜ʖ ͡°)");
            }                                              

    }//GEN-LAST:event_JBotonEsquinaMatrizActionPerformed

    public void SinAdicionar()
    {
          Resultado2=ClaseOperaciones.esquina_noroeste(jTable1, FilasM1, ColumnasM1);
        
            DialogoResultado f=new DialogoResultado(new javax.swing.JFrame(),true,Resultado2,FilasM1,ColumnasM1);
            
            f.setLocationRelativeTo(null);
            
            f.JText.setText("Metodo Esquina Noroeste");
            
            f.JText1.setText("Costo Total: "+ClaseOperaciones.CostoTotal.toString());
            
            f.show();
    }
    
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
            java.util.logging.Logger.getLogger(FormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBotonAdjuntaM1;
    private javax.swing.JButton JBotonAdjuntaM2;
    private javax.swing.JButton JBotonAgregaColumnaM1;
    private javax.swing.JButton JBotonAgregaColumnaM2;
    private javax.swing.JButton JBotonAgregaFilaM1;
    private javax.swing.JButton JBotonAgregaFilaM2;
    private javax.swing.JButton JBotonBorraColumnaM1;
    private javax.swing.JButton JBotonBorraColumnaM2;
    private javax.swing.JButton JBotonDeterminanteM1;
    private javax.swing.JButton JBotonDeterminanteM2;
    private javax.swing.JButton JBotonEliminaFilaM1;
    private javax.swing.JButton JBotonEliminaFilaM2;
    private javax.swing.JButton JBotonEsquinaMatriz;
    private javax.swing.JButton JBotonInversaM1;
    private javax.swing.JButton JBotonInversaM2;
    private javax.swing.JButton JBotonLLenarM1;
    private javax.swing.JButton JBotonLLenarM2;
    private javax.swing.JButton JBotonLimpiarM1;
    private javax.swing.JButton JBotonLimpiarM2;
    private javax.swing.JButton JBotonMultiplicacionMatriz;
    private javax.swing.JButton JBotonRestaMatriz;
    private javax.swing.JButton JBotonSumaMatriz;
    private javax.swing.JButton JBotonTraspuestaM1;
    private javax.swing.JButton JBotonTraspuestaM2;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JPanel JPanelM1;
    private javax.swing.JPanel JPanelM2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
