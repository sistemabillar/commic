package Vistas;

import Modelos.Cliente;
import Modelos.ClienteD;
import Modelos.Detalle;
import Modelos.Empleado;
import Modelos.EmpleadoD;
import Modelos.Factura;
import Modelos.FacturaD;
import Modelos.Productos;
import Modelos.ProductosD;
import Modelos.Proveedor;
import Modelos.ProveedorD;
import Modelos.Sala;
import Modelos.SalaDao;
import Reportes.Excel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author pc
 */
public class sistema extends javax.swing.JFrame {
    
//instancias de clases
    Cliente cl = new Cliente();
    ClienteD client = new ClienteD();
    Proveedor pr = new Proveedor();
    ProveedorD PrD = new ProveedorD();
    Productos pro = new Productos();
    ProductosD proD = new ProductosD();
    Factura f = new Factura();
    FacturaD Fda = new FacturaD();
    Detalle Df = new Detalle();
    DefaultTableModel modelo = new DefaultTableModel();
    Sala Sl = new Sala();
    SalaDao slD = new SalaDao();
    Empleado ep = new Empleado();
    EmpleadoD epD = new EmpleadoD();
    int item;
    double TotalPagar = 0.00;
    

    /**
     * Creates new form sistema
     */
    public sistema() {
        initComponents();
        //para poner nuestro diseno en el centro de la pantalla carmelo
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(cbxProvedorpro);
        proD.ConsultarProveedor(cbxProvedorpro);
        
        //carmelo esto es para que el Id 
        //del cliente este oculto para poder modificarlos//
    }
    //metodos aqui 
    public void ListarCliente(){
        List<Cliente> ListarCl = client.ListarCliente();
        modelo = (DefaultTableModel) TableCliente.getModel();
        //aqui tuve que hacer un casteo
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarCl.size(); i++) {
            ob[0] = ListarCl.get(i).getId();
            ob[1] = ListarCl.get(i).getCodigo();
            ob[2] = ListarCl.get(i).getNombre();
            ob[3] = ListarCl.get(i).getTelefono();
            modelo.addRow(ob);
        }
        TableCliente.setModel(modelo);
    }
    
    public void ListarProveedor(){
        List<Proveedor> ListarPr = PrD.ListarProvedor();
        modelo = (DefaultTableModel)  TableProveedores.getModel();
        //aqui tuve que hacer un casteo
        Object[] ob = new Object[5];
        for (int i = 0; i < ListarPr.size(); i++) {
            ob[0] = ListarPr.get(i).getId();
            ob[1] = ListarPr.get(i).getCodigo();
            ob[2] = ListarPr.get(i).getNombre();
            ob[3] = ListarPr.get(i).getCompañia();
            ob[4] = ListarPr.get(i).getTelefono();
            modelo.addRow(ob);
        }
        TableProveedores.setModel(modelo);
    }
    
    public void ListarProductos(){
        List<Productos> ListarPro = proD.ListarProductos();
        modelo = (DefaultTableModel)  TableProductos.getModel();
        //aqui tuve que hacer un casteo
        Object[] ob = new Object[7];
        for (int i = 0; i < ListarPro.size(); i++) {
            ob[0] = ListarPro.get(i).getId();
            ob[1] = ListarPro.get(i).getCodigo();
            ob[2] = ListarPro.get(i).getNombre();
            ob[3] = ListarPro.get(i).getProveedor();
            ob[4] = ListarPro.get(i).getPreciocompra();
            ob[5] = ListarPro.get(i).getPrecioventa();
            ob[6] = ListarPro.get(i).getCantidad();
            modelo.addRow(ob);
        }
        TableProductos.setModel(modelo);
    }
    
    public void ListarEmpleado(){
        List<Empleado> Listarep = epD.ListarEmpleado();
        modelo = (DefaultTableModel)  TableEmpleado.getModel();
        //aqui tuve que hacer un casteo
        Object[] ob = new Object[7];
        for (int i = 0; i < Listarep.size(); i++) {
            ob[0] = Listarep.get(i).getId();
            ob[1] = Listarep.get(i).getCodigo();
            ob[2] = Listarep.get(i).getNombre();
            ob[3] = Listarep.get(i).getCedula();
            ob[4] = Listarep.get(i).getTelefono();
            ob[5] = Listarep.get(i).getSueldo();
            ob[6] = Listarep.get(i).getRol();
            modelo.addRow(ob);
        }
        TableEmpleado.setModel(modelo);
    }
    
    public void ListarSalas(){
        List<Sala> ListarSl = slD.ListarSalas();
        modelo = (DefaultTableModel)  TableSala.getModel();
        //aqui tuve que hacer un casteo
        Object[] ob = new Object[3];
        for (int i = 0; i < ListarSl.size(); i++) {
            ob[0] = ListarSl.get(i).getId();
            ob[1] = ListarSl.get(i).getNombre();
            ob[2] = ListarSl.get(i).getCantidad();
            modelo.addRow(ob);
        }
        TableSala.setModel(modelo);
    }
    
    public void LimpiarTable(){
        //aqui vamos a poner un bucle form para recorrer la tabla y limpiarla 
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnProductosmenu = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        bntSalas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelSala = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStockventa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        b = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cant = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        LebelTotalpagar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoclient = new javax.swing.JTextField();
        txtNombreclienteventa = new javax.swing.JTextField();
        btnEliminarProductos = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtEmpleadoventa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtIdpro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCodigopro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNombrepro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cbxProvedorpro = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtPricioproco = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPreciocove = new javax.swing.JTextField();
        btnGuardarPro = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        txtCantidadpro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        bntGuardarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtCodigoEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtCedulaEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        txtSueldoEmpleado = new javax.swing.JTextField();
        txtRolEmpleado = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnNuevoempleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnActuralizarEmpleado = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableEmpleado = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        panelSalas = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNombreSala = new javax.swing.JTextField();
        txtCantidadMesas = new javax.swing.JTextField();
        btnAgregarSala = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableSala = new javax.swing.JTable();
        btnVerMesas = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtCodigoProvedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtCompaniProvedor = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        btnNuevoProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
        btnGuardarProveedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableProveedores = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo1.jpg.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel2.setText("BILLAR 75 GRADOS");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CAJA");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VENTAS");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PROVEEDORES");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CLIENTES");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnProductosmenu.setBackground(new java.awt.Color(0, 0, 0));
        btnProductosmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProductosmenu.setForeground(new java.awt.Color(255, 255, 255));
        btnProductosmenu.setText("PRODUCTOS");
        btnProductosmenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnProductosmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductosmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosmenuActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CONFIGURACION");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("USUARIOS");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("EMPLEADOS");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        bntSalas.setBackground(new java.awt.Color(0, 0, 0));
        bntSalas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntSalas.setForeground(new java.awt.Color(255, 255, 255));
        bntSalas.setText("SALAS");
        bntSalas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        bntSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductosmenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntSalas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductosmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 680));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1190, 30));

        panelSala.setForeground(new java.awt.Color(0, 102, 51));
        panelSala.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel14.setBackground(new java.awt.Color(0, 153, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CODIGO");

        txtCodigoVenta.setBackground(new java.awt.Color(51, 51, 51));
        txtCodigoVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodigoVenta.setForeground(new java.awt.Color(255, 255, 0));
        txtCodigoVenta.setCaretColor(new java.awt.Color(0, 153, 0));
        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("DESCIPCION");

        txtDescripcionVenta.setEditable(false);
        txtDescripcionVenta.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcionVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcionVenta.setForeground(new java.awt.Color(0, 255, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("CANTIDAD");

        txtCantidadVenta.setBackground(new java.awt.Color(0, 0, 0));
        txtCantidadVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCantidadVenta.setForeground(new java.awt.Color(0, 255, 0));
        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("STOCK");

        txtStockventa.setEditable(false);
        txtStockventa.setBackground(new java.awt.Color(51, 51, 51));
        txtStockventa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtStockventa.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("PRECIO");

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecioVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPrecioVenta.setForeground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStockventa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TableVentas);
        if (TableVentas.getColumnModel().getColumnCount() > 0) {
            TableVentas.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableVentas.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableVentas.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableVentas.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableVentas.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        b.setBackground(new java.awt.Color(51, 51, 51));
        b.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b.setForeground(new java.awt.Color(0, 255, 102));
        b.setText("FACTURAR");
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("SUB TOTAL ");

        cant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cant.setForeground(new java.awt.Color(0, 204, 204));
        cant.setText("---------------");

        LabelTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(0, 204, 153));
        LabelTotal.setText("TOTAL A PAGAR");

        LebelTotalpagar.setBackground(new java.awt.Color(204, 204, 204));
        LebelTotalpagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LebelTotalpagar.setForeground(new java.awt.Color(51, 255, 102));
        LebelTotalpagar.setText("---------------");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 102));
        jLabel12.setText("CODIGO CLIENTE");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 102));
        jLabel13.setText("NOMBRE CLIENTE");

        txtCodigoclient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoclientKeyPressed(evt);
            }
        });

        btnEliminarProductos.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarProductos.setForeground(new java.awt.Color(204, 51, 0));
        btnEliminarProductos.setText("Eliminar Producto");
        btnEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductosActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 204, 102));
        jLabel35.setText("VENDEDOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCodigoclient, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtNombreclienteventa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpleadoventa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(209, 209, 209)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(LabelTotal)
                                        .addGap(18, 18, 18)
                                        .addComponent(LebelTotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarProductos)))
                        .addGap(0, 164, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(LebelTotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreclienteventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleadoventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        panelSala.addTab("Caja", jPanel3);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setForeground(new java.awt.Color(102, 102, 102));

        TableProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "NOMBRE", "PORVEEDOR", "COMPRA", " VENTA", "CANTIDAD"
            }
        ));
        TableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableProductos);
        if (TableProductos.getColumnModel().getColumnCount() > 0) {
            TableProductos.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableProductos.getColumnModel().getColumn(1).setPreferredWidth(30);
            TableProductos.getColumnModel().getColumn(2).setPreferredWidth(40);
            TableProductos.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableProductos.getColumnModel().getColumn(4).setPreferredWidth(20);
            TableProductos.getColumnModel().getColumn(5).setPreferredWidth(20);
            TableProductos.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 204, 0));
        jLabel18.setText("ID");

        txtIdpro.setEditable(false);
        txtIdpro.setBackground(new java.awt.Color(0, 0, 0));
        txtIdpro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIdpro.setForeground(new java.awt.Color(0, 255, 102));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 204, 0));
        jLabel19.setText("CODIGO");

        txtCodigopro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 204, 0));
        jLabel20.setText("NOMBRE");

        txtNombrepro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 204, 0));
        jLabel21.setText("PROVEEDOR");

        cbxProvedorpro.setBackground(new java.awt.Color(204, 204, 204));
        cbxProvedorpro.setEditable(true);
        cbxProvedorpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProvedorproActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 204, 0));
        jLabel22.setText("COMPRA");

        txtPricioproco.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 204, 0));
        jLabel23.setText(" VENTA");

        txtPreciocove.setBackground(new java.awt.Color(204, 204, 204));

        btnGuardarPro.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardarPro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarPro.setForeground(new java.awt.Color(0, 255, 102));
        btnGuardarPro.setText("Guardar");
        btnGuardarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 204, 0));
        jButton12.setText("Nuevo");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(204, 51, 0));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 153, 102));
        jButton15.setText("Reporte Exel");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        btnActualizarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 153, 153));
        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        txtCantidadpro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 204, 0));
        jLabel24.setText("CANTIDAD");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servesa1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(txtIdpro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNombrepro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxProvedorpro, javax.swing.GroupLayout.Alignment.LEADING, 0, 206, Short.MAX_VALUE)
                                        .addComponent(txtPricioproco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPreciocove, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCantidadpro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigopro, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jButton15))
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(257, 257, 257))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnGuardarPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIdpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(txtCodigopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtNombrepro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxProvedorpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtPricioproco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreciocove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPro)
                    .addComponent(btnEliminarProducto)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarProducto)
                    .addComponent(jButton12))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelSala.addTab("RegistroProductos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CODIGO");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NOMBRE");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TELEFONO");

        txtCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoClienteKeyTyped(evt);
            }
        });

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });

        bntGuardarCliente.setBackground(new java.awt.Color(0, 0, 0));
        bntGuardarCliente.setForeground(new java.awt.Color(0, 204, 51));
        bntGuardarCliente.setText("Guardar");
        bntGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoCliente.setForeground(new java.awt.Color(0, 204, 51));
        btnNuevoCliente.setText("Nuevo");
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarCliente.setForeground(new java.awt.Color(0, 204, 51));
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarCliente.setForeground(new java.awt.Color(0, 204, 51));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID");

        txtIdCliente.setEditable(false);
        txtIdCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtIdCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(bntGuardarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCliente)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente)
                                    .addComponent(txtTelefonoCliente)
                                    .addComponent(txtCodigoCliente))
                                .addGap(89, 89, 89))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardarCliente)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnActualizarCliente)
                    .addComponent(btnEliminarCliente))
                .addGap(15, 15, 15))
        );

        TableCliente.setBackground(new java.awt.Color(0, 204, 0));
        TableCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0)));
        TableCliente.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        TableCliente.setForeground(new java.awt.Color(255, 255, 0));
        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Tefelfono"
            }
        ));
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableCliente);
        if (TableCliente.getColumnModel().getColumnCount() > 0) {
            TableCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableCliente.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableCliente.getColumnModel().getColumn(2).setPreferredWidth(80);
            TableCliente.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientesR.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel25)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        panelSala.addTab("RegistroClientes", jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("REPORTE DE VENTA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "EMPLEADO", "TOTAL"
            }
        ));
        jScrollPane6.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        panelSala.addTab("HistorialVentas", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("ID");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 0));
        jLabel10.setText("CODIGO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 0));
        jLabel11.setText("NOMBRE");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 255, 0));
        jLabel36.setText("CEDULA");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 255, 0));
        jLabel37.setText("TELEFONO");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 255, 0));
        jLabel38.setText("SUELDO");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 255, 0));
        jLabel39.setText("ROL");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        txtCedulaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaEmpleadoActionPerformed(evt);
            }
        });

        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyPressed(evt);
            }
        });

        btnGuardarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarEmpleado.setForeground(new java.awt.Color(255, 255, 51));
        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        btnNuevoempleado.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevoempleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoempleado.setForeground(new java.awt.Color(255, 255, 51));
        btnNuevoempleado.setText("Nuevo");

        btnEliminarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 51));
        btnEliminarEmpleado.setText("Eliminar");

        btnActuralizarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        btnActuralizarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActuralizarEmpleado.setForeground(new java.awt.Color(255, 255, 51));
        btnActuralizarEmpleado.setText("Actualizar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtSueldoEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRolEmpleado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnActuralizarEmpleado)
                        .addGap(237, 237, 237))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtSueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txtRolEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEmpleado)
                    .addComponent(btnNuevoempleado)
                    .addComponent(btnEliminarEmpleado)
                    .addComponent(btnActuralizarEmpleado))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TableEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        TableEmpleado.setForeground(new java.awt.Color(255, 255, 0));
        TableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nombre", "Cedula", "Telefono", "Sueldo", "Rol"
            }
        ));
        jScrollPane7.setViewportView(TableEmpleado);
        if (TableEmpleado.getColumnModel().getColumnCount() > 0) {
            TableEmpleado.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableEmpleado.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableEmpleado.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableEmpleado.getColumnModel().getColumn(3).setPreferredWidth(40);
            TableEmpleado.getColumnModel().getColumn(4).setPreferredWidth(30);
            TableEmpleado.getColumnModel().getColumn(5).setPreferredWidth(30);
            TableEmpleado.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        panelSala.addTab("RegistroEmpleados", jPanel8);

        panelSalas.setBackground(new java.awt.Color(0, 0, 0));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 255, 0));
        jLabel26.setText("NOMBRE");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 255, 0));
        jLabel27.setText("CANTIDAD");

        txtNombreSala.setBackground(new java.awt.Color(204, 204, 204));

        txtCantidadMesas.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidadMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadMesasActionPerformed(evt);
            }
        });

        btnAgregarSala.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregarSala.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarSala.setForeground(new java.awt.Color(0, 153, 153));
        btnAgregarSala.setText("Agregar Sala");
        btnAgregarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalaActionPerformed(evt);
            }
        });

        TableSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE ", "CANTIDAD "
            }
        ));
        jScrollPane2.setViewportView(TableSala);
        if (TableSala.getColumnModel().getColumnCount() > 0) {
            TableSala.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableSala.getColumnModel().getColumn(1).setPreferredWidth(40);
            TableSala.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        btnVerMesas.setBackground(new java.awt.Color(102, 102, 102));
        btnVerMesas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerMesas.setForeground(new java.awt.Color(255, 255, 51));
        btnVerMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo1.jpg.png"))); // NOI18N
        btnVerMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtId.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelSalasLayout = new javax.swing.GroupLayout(panelSalas);
        panelSalas.setLayout(panelSalasLayout);
        panelSalasLayout.setHorizontalGroup(
            panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalasLayout.createSequentialGroup()
                .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addGap(68, 68, 68))
                    .addGroup(panelSalasLayout.createSequentialGroup()
                        .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSalasLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVerMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnAgregarSala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtCantidadMesas, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSalasLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel26)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        panelSalasLayout.setVerticalGroup(
            panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalasLayout.createSequentialGroup()
                        .addComponent(btnVerMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarSala))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSala.addTab("Registro De Salas", jPanel9);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(45, 190, 45));
        jLabel28.setText("ID");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(45, 190, 45));
        jLabel29.setText("CODIGO");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(45, 190, 45));
        jLabel30.setText("NOMBRE");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(45, 190, 45));
        jLabel31.setText("COMPAÑIA");

        txtIdProveedor.setEditable(false);
        txtIdProveedor.setBackground(new java.awt.Color(51, 51, 51));
        txtIdProveedor.setForeground(new java.awt.Color(255, 0, 0));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(45, 190, 45));
        jLabel32.setText("TELEFONO");

        btnNuevoProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoProveedor.setForeground(new java.awt.Color(0, 153, 153));
        btnNuevoProveedor.setText("Nuevo");
        btnNuevoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(0, 153, 153));
        btnEliminarProveedor.setText("Delete");
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnActualizarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizarProveedor.setForeground(new java.awt.Color(0, 153, 153));
        btnActualizarProveedor.setText("Actualizar");
        btnActualizarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedorActionPerformed(evt);
            }
        });

        btnGuardarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarProveedor.setForeground(new java.awt.Color(0, 153, 153));
        btnGuardarProveedor.setText("Guardar");
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompaniProvedor)
                            .addComponent(txtTelefonoProveedor)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoProvedor)
                            .addComponent(txtNombreProveedor)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 151, Short.MAX_VALUE)))))
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtCodigoProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtCompaniProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarProveedor)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "NOMBRE", "COMPAÑIA", "TELEFONO"
            }
        ));
        TableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableProveedores);
        if (TableProveedores.getColumnModel().getColumnCount() > 0) {
            TableProveedores.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableProveedores.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableProveedores.getColumnModel().getColumn(2).setPreferredWidth(40);
            TableProveedores.getColumnModel().getColumn(3).setPreferredWidth(40);
            TableProveedores.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        panelSala.addTab("RegistroProveedor", jPanel6);

        jPanel12.setBackground(new java.awt.Color(0, 204, 204));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("RNC");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("NOMBRE");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("DIRECION");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("TELEFONO");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(0, 204, 204));
        jButton8.setText("Actualizar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel43))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jButton8)))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        panelSala.addTab("Datos Emplesa", jPanel12);

        getContentPane().add(panelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 1200, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        panelSala.setSelectedIndex(3);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarEmpleado();
        panelSala.setSelectedIndex(4);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductosActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel) TableVentas.getModel();
        modelo.removeRow(TableVentas.getSelectedRow());
        TotalPagar();
        txtCodigoVenta.requestFocus();
        
    }//GEN-LAST:event_btnEliminarProductosActionPerformed

    private void cbxProvedorproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProvedorproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProvedorproActionPerformed

    private void bntGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarClienteActionPerformed
        
        if (!"".equals(txtCodigoCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText())) {
            
            
            cl.setCodigo(Integer.parseInt(txtCodigoCliente.getText()));
            cl.setNombre(txtNombreCliente.getText());
            cl.setTelefono(txtTelefonoCliente.getText());
            client.RegistrarCliente(cl);
            LimpiarTable();
            LimpiarCliente();
            ListarCliente();
            JOptionPane.showMessageDialog(null, "Cliente Registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Llene los campos porfavor");
            
        }
         
           
    }//GEN-LAST:event_bntGuardarClienteActionPerformed
    
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LimpiarTable();
        ListarCliente();
        panelSala.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtCodigoVenta.requestFocus();
        panelSala.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProductosmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosmenuActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarProductos();
        panelSala.setSelectedIndex(1);
    }//GEN-LAST:event_btnProductosmenuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarProveedor();
        panelSala.setSelectedIndex(6);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCodigoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtCodigoClienteKeyTyped

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A')|c>'Z') evt.consume();
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
    LimpiarCliente();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        // aqui voy a capturar una fila de la tabla para eliminar una informacion celecionada
        //con un int y un rowatpoint con un click me mostrara los campos con la informacion 
        int fila = TableCliente.rowAtPoint(evt.getPoint());
        txtIdCliente.setText(TableCliente.getValueAt(fila, 0).toString());
        txtCodigoCliente.setText(TableCliente.getValueAt(fila, 1).toString());
        txtNombreCliente.setText(TableCliente.getValueAt(fila, 2).toString());
        txtTelefonoCliente.setText(TableCliente.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_TableClienteMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdCliente.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas Seguro Que Desea Eliminar Esta informacion");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdCliente.getText());
                client.EliminarCliente(id);
                LimpiarTable();
                LimpiarCliente();
                ListarCliente();
                
            }
        }  
        
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        // TODO add your handling code here:
        if("".equals(txtIdCliente.getText())){
            JOptionPane.showMessageDialog(null, "Selecione una Fila Porfavor");
        }else{
            if (!"".equals(txtCodigoCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText())) {
                
                cl.setCodigo(Integer.parseInt(txtCodigoCliente.getText()));
                cl.setNombre(txtNombreCliente.getText());
                cl.setTelefono(txtTelefonoCliente.getText());
                cl.setId(Integer.parseInt(txtIdCliente.getText()));
                client.ModificarCliente(cl);
                LimpiarTable();
                LimpiarCliente();
                ListarCliente();
                
            }else{
                JOptionPane.showMessageDialog(null, "Cliente Modificado Exitosamente");
            }
        }
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void txtCantidadMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadMesasActionPerformed

    private void btnAgregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalaActionPerformed
        // TODO add your handling code here:
       if (!"".equals(txtNombreSala.getText()) || !"".equals(txtCantidadMesas.getText())) {
            
            Sl.setNombre(txtNombreSala.getText());
            Sl.setCantidad(Integer.parseInt(txtCantidadMesas.getText()));
            slD.agregarSala(Sl);
            ListarSalas();
            
            JOptionPane.showMessageDialog(null, "Sala Registrada");
        }else{
            JOptionPane.showMessageDialog(null, "Llene los campos porfavor");
            
        }                                                  
       
    }//GEN-LAST:event_btnAgregarSalaActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        RegistrarFactura();
        RegistrarDetalle();
        
        
    }//GEN-LAST:event_bActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        //aqui utilisare un equals para verificar que los campos no esten vacios con un if:
        if (!"".equals(txtCodigoProvedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtCompaniProvedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) ){
           
            pr.setCodigo(Integer.parseInt(txtCodigoProvedor.getText()));
            pr.setNombre(txtNombreProveedor.getText());
            pr.setCompañia(txtCompaniProvedor.getText());
            pr.setTelefono(txtTelefonoProveedor.getText());
            PrD.RegistrarProveedor(pr);
            LimpiarTable();
            ListarProveedor();
            
        }else{
            JOptionPane.showMessageDialog(null, "Llene Los Campos Porfavor");
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        // TODO add your handling code here:
        LimpiarProveedor();
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void TableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProveedoresMouseClicked
        // aqui voy a hacer el metodo eliminar para poder eliminar un provveedor carmelo:
        int fila = TableProveedores.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(TableProveedores.getValueAt(fila, 0).toString());
        txtCodigoProvedor.setText(TableProveedores.getValueAt(fila, 1).toString());
        txtNombreProveedor.setText(TableProveedores.getValueAt(fila, 2).toString());
        txtCompaniProvedor.setText(TableProveedores.getValueAt(fila, 3).toString());
        txtTelefonoProveedor.setText(TableProveedores.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_TableProveedoresMouseClicked

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // aqui el codigo para eliminar el proveedor utilisando un if para que recorra por el Id indicando que esun numero 
        //entero y mandando un mensaje por pantalla como aviso con JOptionPaneMessageDialog:
        if (!"".equals(txtIdProveedor.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas Seguro Que Desea Eliminar Esta informacion");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdProveedor.getText());
                PrD.EliminarProveedor(id);
                LimpiarTable();
                LimpiarProveedor();
                ListarProveedor();
                
            }else{
                JOptionPane.showConfirmDialog(null, "Selecione correctamente porfavor ");
            }
        }                                                   
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed
        // TODO add your handling code here:
        if("".equals(txtIdProveedor.getText())){
            JOptionPane.showMessageDialog(null, "Selecione una Fila Porfavor");
        }else{
            if (!"".equals(txtCodigoProvedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtCompaniProvedor.getText()) || !"".equals(txtTelefonoCliente.getText())) {
                
                pr.setCodigo(Integer.parseInt(txtCodigoProvedor.getText()));
                pr.setNombre(txtNombreProveedor.getText());
                pr.setCompañia(txtCompaniProvedor.getText());
                pr.setTelefono(txtTelefonoProveedor.getText());
                pr.setId(Integer.parseInt(txtIdProveedor.getText()));
                PrD.ModificarProveedor(pr);
                LimpiarTable();
                LimpiarProveedor();
                ListarProveedor();
                
            }else{
                JOptionPane.showMessageDialog(null, "Proveedor Modificado Exitosamente");
            }
        }                                                        
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed

    private void btnGuardarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(txtCodigopro.getText()) || !"".equals(txtNombrepro.getText()) || !"".equals(cbxProvedorpro.getSelectedItem()) || !"".equals(txtPricioproco.getText()) || !"".equals(txtPreciocove.getText()) || !"".equals(txtCantidadpro.getText())) {
            
          
            pro.setCodigo(txtCodigopro.getText());
            pro.setNombre(txtNombrepro.getText());
            pro.setProveedor(cbxProvedorpro.getSelectedItem().toString());
            pro.setPreciocompra(Double.parseDouble(txtPricioproco.getText()));
            pro.setPrecioventa(Double.parseDouble(txtPreciocove.getText()));
            pro.setCantidad(Integer.parseInt(txtCantidadpro.getText()));
            proD.RegistrarProductos(pro);
            LimpiarTable();
            ListarProductos();
            
            
            JOptionPane.showMessageDialog(null, "Producto Registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Llene los campos porfavor");
            
        }                                                
    }//GEN-LAST:event_btnGuardarProActionPerformed

    private void TableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductosMouseClicked
        // TODO add your handling code here:
        int fila = TableProductos.rowAtPoint(evt.getPoint());
        txtIdpro.setText(TableProductos.getValueAt(fila, 0).toString());
        txtCodigopro.setText(TableProductos.getValueAt(fila, 1).toString());
        txtNombrepro.setText(TableProductos.getValueAt(fila, 2).toString());
        cbxProvedorpro.setSelectedItem(TableProductos.getValueAt(fila, 3).toString());
        txtPricioproco.setText(TableProductos.getValueAt(fila, 4).toString());
        txtPreciocove.setText(TableProductos.getValueAt(fila, 5).toString());
        txtCantidadpro.setText(TableProductos.getValueAt(fila, 6).toString());
        
    }//GEN-LAST:event_TableProductosMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdpro.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas Seguro Que Desea Eliminar Esta informacion");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdpro.getText());
                proD.EliminarProductos(id);
                LimpiarTable();
                LimpiarProductos();
                ListarProductos();
                
                
            }else{
                JOptionPane.showConfirmDialog(null, "Selecione correctamente porfavor ");
            }
        }                                                   
        
        
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        LimpiarProductos();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
        if("".equals(txtIdpro.getText())){
            JOptionPane.showMessageDialog(null, "Selecione una Fila Porfavor");
        }else{
            if (!"".equals(txtCodigopro.getText()) || !"".equals(txtNombrepro.getText()) || !"".equals(cbxProvedorpro.getSelectedItem()) || !"".equals(txtPricioproco.getText()) || !"".equals(txtPreciocove.getText()) || !"".equals(txtCantidadpro.getText())) {
                
                
                pro.setCodigo(txtCodigopro.getText());
                pro.setNombre(txtNombrepro.getText());
                pro.setProveedor(cbxProvedorpro.getSelectedItem().toString());
                pro.setPreciocompra(Double.parseDouble(txtPricioproco.getText()));
                pro.setPrecioventa(Double.parseDouble(txtPreciocove.getText()));
                pro.setCantidad(Integer.parseInt(txtCantidadpro.getText()));
                pro.setId(Integer.parseInt(txtIdpro.getText()));
                proD.ModificarProductos(pro);
                
                LimpiarTable();
                LimpiarProductos();
                ListarProductos();
                
            }else{
                JOptionPane.showMessageDialog(null, "Producto Modificado Exitosamente");
            }
        }                                                        
        
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        Excel.reporte();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigoVenta.getText())) {
                String cod = txtCodigoVenta.getText();
                pro = proD.BuscarProductos(cod);
                if (pro.getNombre() !=null) {
                    txtDescripcionVenta.setText(""+pro.getNombre());
                    txtPrecioVenta.setText(""+pro.getPrecioventa());
                    txtStockventa.setText(""+pro.getCantidad());
                    txtCantidadVenta.requestFocus(); 
                }else{
                    //se lo enviamos vacio 
                    LimpiarVenta();
                    txtCodigoVenta.requestFocus();
                }
            }else{
                JOptionPane.showConfirmDialog(null, "Codigo De Producto Porfavor");
                txtCodigoVenta.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        // Carmelo aqui vamos a verificar con un if utiliasando un equals si la tecla enter fue precionada 
        //para agragar el producto a la tabla 
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidadVenta.getText())) {
                String cod = txtCodigoVenta.getText();
                String descripcion = txtDescripcionVenta.getText();
                int cantidad = Integer.parseInt(txtCantidadVenta.getText());
                double precio = Double.parseDouble(txtPrecioVenta.getText());
                double total = cantidad * precio;
                int stock = Integer.parseInt(txtStockventa.getText());
                if (stock >=cantidad) {
                    item = item + 1;
                    modelo = (DefaultTableModel) TableVentas.getModel();
                    //carmelo aqui vamos a trabajar la validadcion de los productos// 
                    //con un bucle for para que los productos no se repitan en la table ventas //
                    //para realizar una nueva venta//
                    for (int i = 0; i < TableVentas.getRowCount(); i++) {
                        //carmelo aqui evaluamos los valores de los campos para hacer la comparacion
                        if (TableVentas.getValueAt(i, 1).equals(txtDescripcionVenta.getText())) {
                           JOptionPane.showMessageDialog(null, "El Producto Ya esta registrado");
                           return;
                        }
                    }
                    ArrayList lista =new ArrayList();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(descripcion);
                    lista.add(cantidad);
                    lista.add(precio);
                    lista.add(total);
                    Object[]O =new Object[5];
                        O[0] = lista.get(1);
                        O[1] = lista.get(2);
                        O[2] = lista.get(3);
                        O[3] = lista.get(4);
                        O[4] = lista.get(4);
                        modelo.addRow(O);
                        TableVentas.setModel(modelo);
                        TotalPagar();
                        LimpiarVenta();
                        txtCodigoVenta.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "Cantidad no Disponible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad");
            }
        }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void txtCodigoclientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoclientKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigoclient.getText())) {
                int codigo = Integer.parseInt(txtCodigoclient.getText());
                cl = client.Buscarcliente(codigo);
                if (cl.getNombre() != null) {
                    txtNombreclienteventa.setText(""+cl.getNombre());
                    txtEmpleadoventa.requestFocus();
                }else{
                    txtCodigoclient.setText("");
                    JOptionPane.showMessageDialog(null, "Elcliente no Existe");
                    
                }
            }
        }
    }//GEN-LAST:event_txtCodigoclientKeyPressed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtCedulaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaEmpleadoActionPerformed

    private void bntSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalasActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        panelSala.setSelectedIndex(5);
       
    }//GEN-LAST:event_bntSalasActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtCodigoEmpleado.getText()) || !"".equals(txtNombreEmpleado.getText()) || !"".equals(txtCedulaEmpleado.getText()) || !"".equals(txtTelefonoEmpleado.getText()) || !"".equals(txtSueldoEmpleado.getText()) || !"".equals(txtRolEmpleado.getText())) {
            
            
            ep.setCodigo(txtCodigoEmpleado.getText());
            ep.setNombre(txtNombreEmpleado.getText());
            ep.setCedula(txtCedulaEmpleado.getText());
            ep.setTelefono(txtTelefonoEmpleado.getText());
            ep.setSueldo(Double.parseDouble(txtSueldoEmpleado.getText()));
            ep.setRol(txtRolEmpleado.getText());
            epD.RegistrarEmpleado(ep);
            LimpiarTable();
            ListarEmpleado();
            JOptionPane.showMessageDialog(null, "Empleado Registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Llene los campos porfavor");
            
        }
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void txtTelefonoEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LebelTotalpagar;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableEmpleado;
    private javax.swing.JTable TableProductos;
    private javax.swing.JTable TableProveedores;
    private javax.swing.JTable TableSala;
    private javax.swing.JTable TableVentas;
    private javax.swing.JButton b;
    private javax.swing.JButton bntGuardarCliente;
    private javax.swing.JButton bntSalas;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarProveedor;
    private javax.swing.JButton btnActuralizarEmpleado;
    private javax.swing.JButton btnAgregarSala;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProductos;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnGuardarPro;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnNuevoempleado;
    private javax.swing.JButton btnProductosmenu;
    private javax.swing.JButton btnVerMesas;
    private javax.swing.JLabel cant;
    private javax.swing.JComboBox<String> cbxProvedorpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTabbedPane panelSala;
    private javax.swing.JPanel panelSalas;
    private javax.swing.JTextField txtCantidadMesas;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCantidadpro;
    private javax.swing.JTextField txtCedulaEmpleado;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtCodigoProvedor;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtCodigoclient;
    private javax.swing.JTextField txtCodigopro;
    private javax.swing.JTextField txtCompaniProvedor;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtEmpleadoventa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtIdpro;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNombreSala;
    private javax.swing.JTextField txtNombreclienteventa;
    private javax.swing.JTextField txtNombrepro;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtPreciocove;
    private javax.swing.JTextField txtPricioproco;
    private javax.swing.JTextField txtRolEmpleado;
    private javax.swing.JTextField txtStockventa;
    private javax.swing.JTextField txtSueldoEmpleado;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables

    
    
//estos carmelos son metodos privados //
private void LimpiarCliente(){
    txtIdCliente.setText("");
    txtCodigoCliente.setText("");
    txtNombreCliente.setText("");
    txtTelefonoCliente.setText("");   
}
private void LimpiarProveedor(){
    
    txtCodigoProvedor.setText("");
    txtNombreProveedor.setText("");
    txtCompaniProvedor.setText("");
    txtTelefonoProveedor.setText("");
}
private void LimpiarProductos(){
    
    txtIdpro.setText("");
    txtCodigopro.setText("");
    txtNombrepro.setText("");
    cbxProvedorpro.setSelectedItem(null);
    txtPricioproco.setText("");
    txtPreciocove.setText("");
    txtCantidadpro.setText("");   
}
private void TotalPagar(){
    TotalPagar = 0.00;
    int numFila = TableVentas.getRowCount();
    for (int i = 0; i < numFila; i++) {
        double cal = Double.parseDouble(String.valueOf(TableVentas.getModel().getValueAt(i, 4)));
        TotalPagar = TotalPagar + cal;
    }
    LebelTotalpagar.setText(String.format("%.2f", TotalPagar));
    cant.setText(String.format("%.2f", TotalPagar));
}
private void LimpiarVenta(){
    
    txtCodigoVenta.setText("");
    txtDescripcionVenta.setText("");
    txtCantidadVenta.setText("");
    txtPrecioVenta.setText(""); 
    txtStockventa.setText("");
}
private void RegistrarFactura(){
    String cliente = txtNombreclienteventa.getText();
    String empleado = txtEmpleadoventa.getText();
    double monto = TotalPagar;
    f.setCliente(cliente);
    f.setEmpleado(empleado);
    f.setTotal(monto);
    Fda.RegistrarFactura(f);
}
private void RegistrarDetalle(){
    //para recorrer todos los valores de la tabla//
    for (int i = 0; i < TableVentas.getRowCount(); i++) {
        String codigo = TableVentas.getValueAt(i, 0).toString();
        String decripcion = TableVentas.getValueAt(i, 2).toString();
        String cantidad = TableVentas.getValueAt(i, 3).toString();
        double precio = Double.parseDouble(TableVentas.getValueAt(i, 4).toString());
        int    id =1;
        Df.setCodigo(codigo);
        Df.setDecripcion(decripcion);
        Df.setCantidad(cantidad);
        Df.setPrecio(precio);
        Df.setId_facturas(id);
        Fda.RegistrarDetalle(Df);
        
    }
}
}