/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ean.tallerordenamiento;

import com.opencsv.CSVReader;
import ean.collections.IList;
import ean.collections.LinkedList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;

/**
 * @author luisc
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        centeredFrame(this);
    }

    /**
     * Centra el Frame en la pantalla actual
     *
     * @param objFrame el frame a ser centrado
     */
    public void centeredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpCriterios = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        pnlSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbAlgoritmos = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnOrdenarPorNombre = new javax.swing.JRadioButton();
        btnOrdenarPorApellido = new javax.swing.JRadioButton();
        btnOrdenarPorApellidoYNombre = new javax.swing.JRadioButton();
        btnOrdenarPorEdad = new javax.swing.JRadioButton();
        btnOrdenarPorCodigo = new javax.swing.JRadioButton();
        btnOrdenarPorSueldo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pnlInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taller de Ordenamiento");
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));

        pnlSuperior.setName("pnlSuperior"); // NOI18N
        pnlSuperior.setPreferredSize(new java.awt.Dimension(679, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Algoritmo de Ordenamiento:");

        cmbAlgoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Burbuja", "Inserción", "Selección", "Merge Sort", "Quick Sort"}));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterios de ordenamiento:"));

        grpCriterios.add(btnOrdenarPorNombre);
        btnOrdenarPorNombre.setText("Nombre");

        grpCriterios.add(btnOrdenarPorApellido);
        btnOrdenarPorApellido.setText("Apellidos");

        grpCriterios.add(btnOrdenarPorApellidoYNombre);
        btnOrdenarPorApellidoYNombre.setText("Apellidos y nombres");

        grpCriterios.add(btnOrdenarPorEdad);
        btnOrdenarPorEdad.setText("Edad");

        grpCriterios.add(btnOrdenarPorCodigo);
        btnOrdenarPorCodigo.setSelected(true);
        btnOrdenarPorCodigo.setText("Código");

        grpCriterios.add(btnOrdenarPorSueldo);
        btnOrdenarPorSueldo.setText("Sueldo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnOrdenarPorNombre)
                                                        .addGap(28, 28, 28))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnOrdenarPorCodigo)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnOrdenarPorApellido)
                                                .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnOrdenarPorSueldo)
                                        .addComponent(btnOrdenarPorEdad)
                                        .addComponent(btnOrdenarPorApellidoYNombre)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnOrdenarPorApellidoYNombre)
                                        .addComponent(btnOrdenarPorCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnOrdenarPorEdad)
                                        .addComponent(btnOrdenarPorNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnOrdenarPorApellido)
                                        .addComponent(btnOrdenarPorSueldo))
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        jButton1.setMnemonic('O');
        jButton1.setText("Ordenar Ascendentemente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Acciones:");

        jButton2.setMnemonic('D');
        jButton2.setText("Ordenar Descendentemente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
                pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                                .addComponent(jSeparator1)
                                                .addContainerGap())
                                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                                                                .addComponent(jButton1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton2))
                                                                        .addComponent(cmbAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 58, Short.MAX_VALUE))))
        );
        pnlSuperiorLayout.setVerticalGroup(
                pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlSuperiorLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlSuperior, java.awt.BorderLayout.PAGE_START);

        pnlInferior.setName("pnlInferior"); // NOI18N
        pnlInferior.setLayout(new java.awt.BorderLayout());

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null}
                },
                new String[]{
                        "Código", "Nombre", "Apellido", "Edad", "Sueldo"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonas);
        if (tblPersonas.getColumnModel().getColumnCount() > 0) {
            tblPersonas.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblPersonas.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblPersonas.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblPersonas.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblPersonas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        pnlInferior.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnlInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        applySorting(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        applySorting(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void applySorting(boolean reversed) {
        int opcion = 0;

        if (btnOrdenarPorCodigo.isSelected()) {
            opcion = 0;
        }
        else if (btnOrdenarPorNombre.isSelected()) {
            opcion = 1;
        }
        else if (btnOrdenarPorApellido.isSelected()) {
            opcion = 2;
        }
        else if (btnOrdenarPorApellidoYNombre.isSelected()) {
            opcion = 3;
        }
        else if (btnOrdenarPorEdad.isSelected()) {
            opcion = 4;
        }
        else {
            opcion = 5;
        }

        Comparator<Empleado> c = AlgoritmosOrdenamiento.INSTANCE.obtenerComparador(opcion);
        if (reversed) {
            if (c == null) {
                c = AlgoritmosOrdenamiento.INSTANCE.obtenerComparador(-1);
            }
            else {
                c = c.reversed();
            }
        }

        switch (cmbAlgoritmos.getSelectedIndex()) {
            case 0:
                if (c == null) {
                    AlgoritmosOrdenamiento.INSTANCE.bubbleSort(empleados);
                }
                else {
                    AlgoritmosOrdenamiento.INSTANCE.bubbleSort(empleados, c);
                }
                break;

            case 1:
                if (c == null) {
                    AlgoritmosOrdenamiento.INSTANCE.insertionSort(empleados);
                }
                else {
                    AlgoritmosOrdenamiento.INSTANCE.insertionSort(empleados, c);
                }
                break;

            case 2:
                if (c == null) {
                    AlgoritmosOrdenamiento.INSTANCE.selectionSort(empleados);
                }
                else {
                    AlgoritmosOrdenamiento.INSTANCE.selectionSort(empleados, c);
                }
                break;

            case 3:
                if (c == null) {
                    AlgoritmosOrdenamiento.INSTANCE.mergeSort(empleados);
                }
                else {
                    AlgoritmosOrdenamiento.INSTANCE.mergeSort(empleados, c);
                }
                break;

            case 4:
                if (c == null) {
                    AlgoritmosOrdenamiento.INSTANCE.quickSort(empleados);
                }
                else {
                    AlgoritmosOrdenamiento.INSTANCE.quickSort(empleados, c);
                }
                break;
        }
        showEmpleados();

    }

    /**
     * Singleton del formulario principal de la aplicacion
     */
    public static FrmMain mainForm = null;

    /**
     * La lista donde guardaremos los objetos empleados
     */
    public static IList<Empleado> empleados;

    /**
     * Llena la lista con los empleados que se encuentran en el archivo
     */
    public static void loadEmployees() {
        String ARCHIVO_EMPLEADOS = "data/empleados.csv";
        int n = 0;

        empleados = new LinkedList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(ARCHIVO_EMPLEADOS));
            String[] linea;

            while ((linea = reader.readNext()) != null) {
                if (n > 0) {
                    int codigo = Integer.parseInt(linea[0]);
                    String nombre = linea[1].toUpperCase();
                    String apellido = linea[2].toUpperCase();
                    String departamento = linea[3].toUpperCase();
                    String cargo = linea[4].toUpperCase();
                    int edad = Integer.parseInt(linea[5]);
                    double sueldo = Double.parseDouble(linea[6]);

                    Empleado emp = new Empleado();
                    emp.setCodigo(codigo);
                    emp.setNombre(nombre);
                    emp.setApellido(apellido);
                    emp.setCargo(cargo);
                    emp.setDepartamento(departamento);
                    emp.setEdad(edad);
                    emp.setSueldo(sueldo);

                    empleados.add(emp);

                }
                n++;
            }
            System.out.printf("Tenemos %d empleados\n", n);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deleteAllRows(final DefaultTableModel model) {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
    }

    public void showEmpleados() {
        DefaultTableModel dm;
        dm = (DefaultTableModel) tblPersonas.getModel();

        // Limpiar la tabla
        deleteAllRows(dm);

        // Obtenemos los datos de los empleados y los guardamos en la tabla
        for (Empleado emp: empleados) {
            Object[] data = new Object[] {
                String.valueOf(emp.getCodigo()),
                emp.getNombre(),
                emp.getApellido(),
                String.valueOf(emp.getEdad()),
                NumberFormat.getCurrencyInstance().format(emp.getSueldo())
            };
            dm.addRow(data);
        }
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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainForm = new FrmMain();
                loadEmployees();
                mainForm.setVisible(true);
                mainForm.showEmpleados();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnOrdenarPorApellido;
    private javax.swing.JRadioButton btnOrdenarPorApellidoYNombre;
    private javax.swing.JRadioButton btnOrdenarPorCodigo;
    private javax.swing.JRadioButton btnOrdenarPorEdad;
    private javax.swing.JRadioButton btnOrdenarPorNombre;
    private javax.swing.JRadioButton btnOrdenarPorSueldo;
    private javax.swing.JComboBox<String> cmbAlgoritmos;
    private javax.swing.ButtonGroup grpCriterios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlInferior;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables
}
