package com.mycompany.gestordeempleados.igu;

import com.mycompany.gestordeempleados.logica.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    private final Conexion conexion;

    public Principal() {
        this.conexion = Conexion.getInstancia();
        initComponents();
        actualizarInfoEnPantalla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadEmpleados = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalSueldos = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de Empleados");

        jLabel2.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel5.setText("Edad:");

        jLabel6.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel6.setText("Sueldo($):");

        txtId.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSueldo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtNombre))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cant. Empleados");

        txtCantidadEmpleados.setEditable(false);
        txtCantidadEmpleados.setFont(new java.awt.Font("Fira Code", 0, 24)); // NOI18N
        txtCantidadEmpleados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Sueldos");

        txtTotalSueldos.setEditable(false);
        txtTotalSueldos.setFont(new java.awt.Font("Fira Code", 0, 24)); // NOI18N
        txtTotalSueldos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnLimpiar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clean.png"))); // NOI18N
        btnLimpiar.setText("Limpiar  ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(txtCantidadEmpleados)
                    .addComponent(txtTotalSueldos))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalSueldos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btnActualizar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        try {
            
            Connection conectado = conexion.conectar();
            
            String instruccionSql = "insert into empleados values (?,?,?,?,?)";
            
            PreparedStatement consulta = conectado.prepareStatement(instruccionSql);
            
            consulta.setString(1, null);
            consulta.setString(2, txtNombre.getText());
            consulta.setString(3, txtApellido.getText());
            consulta.setInt(4, Integer.parseInt(txtEdad.getText()));
            consulta.setInt(5, Integer.parseInt(txtSueldo.getText()));
            
            consulta.executeUpdate();
            
            actualizarInfoEnPantalla();
            
            JOptionPane.showMessageDialog(null, "Empelado registrado exitosamente", "Registro agregado", JOptionPane.INFORMATION_MESSAGE);
            
            conexion.desconectar();    
        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Verifique los datos ingresados", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        try {
            
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado a buscar"));

            try {

                Connection conectado = conexion.conectar();

                String instruccionSql = "select * from empleados where id = ?";

                PreparedStatement consulta = conectado.prepareStatement(instruccionSql);

                consulta.setInt(1, id);

                ResultSet tabla = consulta.executeQuery();

                if (tabla.next()) {

                    txtId.setText(String.valueOf(tabla.getInt("id"))); //OBTNENER VALOR MEDIANTE NOMBRE DE COLUMNA
                    txtNombre.setText(tabla.getString(2)); //OBTENER VALOR MEDIANTE INDICE DE COLUMNA
                    txtApellido.setText(tabla.getString("apellido"));
                    txtEdad.setText(String.valueOf(tabla.getInt("edad")));
                    txtSueldo.setText(String.valueOf(tabla.getInt("sueldo")));
                } 
                else {

                    JOptionPane.showMessageDialog(null, "No se encontro un empleado asociado al ID: " + id, "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No ingreso ningun ID", "Busqueda Cancelada", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        try {
            Connection conectado = conexion.conectar();
            
            String instruccionSql = "update empleados set nombre = ?, apellido = ?, edad = ?, sueldo = ? where id = ?";
            
            PreparedStatement consulta = conectado.prepareStatement(instruccionSql);
            
            consulta.setString(1, txtNombre.getText());
            consulta.setString(2, txtApellido.getText());
            consulta.setInt(3, Integer.parseInt(txtEdad.getText()));
            consulta.setInt(4, Integer.parseInt(txtSueldo.getText()));   
            
            consulta.setInt(5, Integer.parseInt(txtId.getText()));
            
            consulta.executeUpdate();
            
            actualizarInfoEnPantalla();
            
            JOptionPane.showMessageDialog(null, "Datos de empleado actualizado exitosamente", "Registro modificado", JOptionPane.INFORMATION_MESSAGE);

            conexion.desconectar();  
        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Verifique los datos ingresados", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado a eliminar"));
        
            try {

                Connection conectado = conexion.conectar();

                // BUSQUEDA:

                String instruccionSql1 = "select * from empleados where id = ?";

                PreparedStatement consulta1 = conectado.prepareStatement(instruccionSql1);

                consulta1.setInt(1, id);

                ResultSet tabla = consulta1.executeQuery();

                if (tabla.next()) {

                    //ELIMINACION

                    String instruccionSql2 = "delete from empleados where id = ?";

                    PreparedStatement consulta2 = conectado.prepareStatement(instruccionSql2);

                    consulta2.setInt(1, id);

                    consulta2.executeUpdate();
                    
                    actualizarInfoEnPantalla();

                    JOptionPane.showMessageDialog(null, "Datos de empleado borrados exitosamente", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
                } 
                else {

                    JOptionPane.showMessageDialog(null, "No existe un empleado con ID: " + id, "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                conexion.desconectar();
            } 
            catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } 
        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No ingreso ningun ID", "Eliminacion Cancelada", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarTabla(){
        
        //DEFINIR EL MODELO DE LA TABLA:
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //DETERMINO QUE FILAS Y COLUMNAS NO SEAN EDITABLES:
            @Override
            public boolean isCellEditable(int row, int coluimn){
                return false;
            }   
        };
        
        //ESTABLECER NOMBRE DE COLUMNAS:
        String[] titulos = {"ID", "Nombre", "Apellido", "Edad", "Sueldo"};
        modeloTabla.setColumnIdentifiers(titulos);

        try {
            
            Connection conectado = conexion.conectar();
            
            PreparedStatement consulta = conectado.prepareStatement("select * from empleados");
            
            ResultSet tabla = consulta.executeQuery();
            
            ResultSetMetaData data = tabla.getMetaData();
            
            int cantidadColumnas = data.getColumnCount();
            
            while(tabla.next()){
                
                Object [] registroEmpleado = new Object[cantidadColumnas];
                
                for(int i = 0; i < registroEmpleado.length; i++ ){
                    
                    registroEmpleado[i] = tabla.getObject(i + 1);
                }
                
                modeloTabla.addRow(registroEmpleado);
            }
            
            //ASIGNAR MODELO DE TABLA A LA "TABLA DE MASCOTAS":
            tablaEmpleados.setModel(modeloTabla);
        } 
        catch (Exception e) {
            
            System.out.println(e.getMessage());
        }     
    }
    
    private void mostrarCantEmpleados(){
        
        try {
            
            Connection conectado = conexion.conectar();
            
            PreparedStatement consulta = conectado.prepareStatement("select count(*) as totalEmpleados from empleados");
            
            ResultSet tabla = consulta.executeQuery();
            
            while(tabla.next()){
                
                txtCantidadEmpleados.setText(String.valueOf(tabla.getObject("totalEmpleados")));
            }      
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void mostrarTotalSueldos(){
        
        try {
            
            Connection conectado = conexion.conectar();
            
            PreparedStatement consulta = conectado.prepareStatement("select sum(sueldo) as totalSueldos from empleados");
            
            ResultSet tabla = consulta.executeQuery();
            
            while(tabla.next()){
                
                txtTotalSueldos.setText("$" + String.valueOf(tabla.getObject("totalSueldos")));
            }      
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void limpiarCampos() {
        
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtSueldo.setText("");
    }
    
    private void actualizarInfoEnPantalla() {      
        cargarTabla();
        mostrarCantEmpleados();
        mostrarTotalSueldos();
        limpiarCampos();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantidadEmpleados;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTotalSueldos;
    // End of variables declaration//GEN-END:variables

}

