
package Package1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_rango = new javax.swing.ButtonGroup();
        bg_tipo_Planta = new javax.swing.ButtonGroup();
        bg_tipo_zombie = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_test = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_entidades = new javax.swing.JTree();
        jl_planta_test = new javax.swing.JLabel();
        jl_zombie_test = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jp_plantas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rb_rango_bajo = new javax.swing.JRadioButton();
        rb_rango_medio = new javax.swing.JRadioButton();
        rb_rango_alto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rb_tipo_explosiva = new javax.swing.JRadioButton();
        rb_tipo_disparo = new javax.swing.JRadioButton();
        rb_tipo_defensa = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre_planta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        js_vida_planta = new javax.swing.JSpinner();
        js_ataque_planta = new javax.swing.JSpinner();
        bt_crear_planta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        js_magnitud_planta = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        js_altura_planta = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        tf_nombreProyectil_planta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_color_planta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        js_peso_planta = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        js_dureza_planta = new javax.swing.JSpinner();
        jp_zombies = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_nombre_zombie = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jf_ataque_zombie = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        js_vida_zombie = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        rb_tipo_clasico = new javax.swing.JRadioButton();
        rb_tipo_cargado = new javax.swing.JRadioButton();
        bt_crear_zombie = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        js_edad_zombie = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        js_tamano_zombie = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        js_experiencia_zombie = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        tf_colorBandera_zombie = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_direccion_zombie = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        js_enojo_zombie = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        tf_personaComida = new javax.swing.JTextField();
        bt_agregar_PersonaComida = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_PersonasComidas = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        bt_borrar_plantas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PLANTAS VS ZOMBIES");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Entidades");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Plantas");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Defensa");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Disparo");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Explosiva");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zombies");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clasico");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cargado");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jt_entidades.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_entidades);

        jl_planta_test.setText("-");

        jl_zombie_test.setText("-");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Testear");

        javax.swing.GroupLayout jp_testLayout = new javax.swing.GroupLayout(jp_test);
        jp_test.setLayout(jp_testLayout);
        jp_testLayout.setHorizontalGroup(
            jp_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_testLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jp_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_zombie_test, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_planta_test, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jp_testLayout.setVerticalGroup(
            jp_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_testLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_testLayout.createSequentialGroup()
                        .addComponent(jl_planta_test)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_zombie_test)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test", jp_test);

        jp_plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Rango");
        jp_plantas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        bg_rango.add(rb_rango_bajo);
        rb_rango_bajo.setText("Bajo");
        jp_plantas.add(rb_rango_bajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, -1, -1));

        bg_rango.add(rb_rango_medio);
        rb_rango_medio.setText("Medio");
        jp_plantas.add(rb_rango_medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, -1, -1));

        bg_rango.add(rb_rango_alto);
        rb_rango_alto.setText("Alto");
        jp_plantas.add(rb_rango_alto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tipo");
        jp_plantas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 11, -1, -1));

        bg_tipo_Planta.add(rb_tipo_explosiva);
        rb_tipo_explosiva.setText("Explosiva");
        jp_plantas.add(rb_tipo_explosiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 32, -1, -1));

        bg_tipo_Planta.add(rb_tipo_disparo);
        rb_tipo_disparo.setText("Disparo");
        jp_plantas.add(rb_tipo_disparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 58, -1, -1));

        bg_tipo_Planta.add(rb_tipo_defensa);
        rb_tipo_defensa.setText("Defensa");
        jp_plantas.add(rb_tipo_defensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 81, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre");
        jp_plantas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 11, -1, -1));
        jp_plantas.add(tf_nombre_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Vida");
        jp_plantas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ataque");
        jp_plantas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));
        jp_plantas.add(js_vida_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 130, -1));
        jp_plantas.add(js_ataque_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 140, -1));

        bt_crear_planta.setText("Crear");
        bt_crear_planta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_plantaMouseClicked(evt);
            }
        });
        jp_plantas.add(bt_crear_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 140, -1));

        jLabel7.setText("Magnitud de Explosion");
        jp_plantas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jp_plantas.add(js_magnitud_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, -1));

        jLabel8.setText("Altura");
        jp_plantas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jp_plantas.add(js_altura_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, -1));

        jLabel9.setText("Nombre Proyectil");
        jp_plantas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));
        jp_plantas.add(tf_nombreProyectil_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, -1));

        jLabel10.setText("Color");
        jp_plantas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));
        jp_plantas.add(tf_color_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, -1));

        jLabel11.setText("Peso");
        jp_plantas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));
        jp_plantas.add(js_peso_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, -1));

        jLabel12.setText("Dureza");
        jp_plantas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));
        jp_plantas.add(js_dureza_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 140, -1));

        jTabbedPane1.addTab("Plantas", jp_plantas);

        jp_zombies.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Nombre");
        jp_zombies.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jp_zombies.add(tf_nombre_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jLabel14.setText("Ataque");
        jp_zombies.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jp_zombies.add(jf_ataque_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        jLabel15.setText("Vida");
        jp_zombies.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jp_zombies.add(js_vida_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        jLabel16.setText("Tipo");
        jp_zombies.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        bg_tipo_zombie.add(rb_tipo_clasico);
        rb_tipo_clasico.setText("Clasico");
        jp_zombies.add(rb_tipo_clasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        bg_tipo_zombie.add(rb_tipo_cargado);
        rb_tipo_cargado.setText("Cargado");
        jp_zombies.add(rb_tipo_cargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        bt_crear_zombie.setText("Crear");
        jp_zombies.add(bt_crear_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        jLabel17.setText("Edad");
        jp_zombies.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));
        jp_zombies.add(js_edad_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));

        jLabel18.setText("Tamaño");
        jp_zombies.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));
        jp_zombies.add(js_tamano_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, -1));

        jLabel19.setText("Años de experiencia");
        jp_zombies.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));
        jp_zombies.add(js_experiencia_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, -1));

        jLabel20.setText("Color Bandera");
        jp_zombies.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));
        jp_zombies.add(tf_colorBandera_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, -1));

        jLabel21.setText("Direccion imagen");
        jp_zombies.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        jp_zombies.add(tf_direccion_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, -1));

        jLabel22.setText("Enojo");
        jp_zombies.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));
        jp_zombies.add(js_enojo_zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 160, -1));

        jLabel23.setText("Agregar Persona Comida ");
        jp_zombies.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));
        jp_zombies.add(tf_personaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 100, 20));

        bt_agregar_PersonaComida.setText("+");
        jp_zombies.add(bt_agregar_PersonaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 50, -1));

        jl_PersonasComidas.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_PersonasComidas);

        jp_zombies.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 160, -1));

        jTabbedPane1.addTab("Zombies", jp_zombies);

        bt_borrar_plantas.setText("Borrar todas las plantas");
        bt_borrar_plantas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_borrar_plantasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_borrar_plantas)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bt_borrar_plantas)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Más", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void bt_crear_plantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_plantaMouseClicked
        administrarPlantas ap = new administrarPlantas("./prueba.txt");
        
        Planta p;
        String rango;
        if(rb_rango_bajo.isSelected()){
            rango = rb_rango_bajo.getText();
        } else if(rb_rango_medio.isSelected()){
            rango = rb_rango_medio.getText();
        } else{
            rango = rb_rango_alto.getText();
        }
        String nombre = tf_nombre_planta.getText();
        double ataque = (Integer)js_ataque_planta.getValue();
        double vida = (Integer) js_vida_planta.getValue();
        if(rb_tipo_explosiva.isSelected()){
            double magnitud = (Integer)js_magnitud_planta.getValue();
            p= new Pexplosiva(magnitud, nombre, ataque, vida, rango);
        } else if(rb_tipo_disparo.isSelected()){
            String nomProyectil = tf_nombreProyectil_planta.getText();
            String color =tf_color_planta.getText();
            p= new Pdisparo(nomProyectil, color, nombre, ataque, vida, rango);
        } else{
            double altura =(double)js_altura_planta.getValue();
            double dureza = (double)js_dureza_planta.getValue();
            double peso = (double)js_peso_planta.getValue();
            p= new Pdefensa(altura, dureza, peso, nombre, ataque, vida, rango);
        }
        ap.getListaPlantas().add(p);
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
        }
        JOptionPane.showMessageDialog(this, "Planta agregada exitosamente!");
    }//GEN-LAST:event_bt_crear_plantaMouseClicked

    private void bt_borrar_plantasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_borrar_plantasMouseClicked
        
    }//GEN-LAST:event_bt_borrar_plantasMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_rango;
    private javax.swing.ButtonGroup bg_tipo_Planta;
    private javax.swing.ButtonGroup bg_tipo_zombie;
    private javax.swing.JButton bt_agregar_PersonaComida;
    private javax.swing.JButton bt_borrar_plantas;
    private javax.swing.JButton bt_crear_planta;
    private javax.swing.JButton bt_crear_zombie;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSpinner jf_ataque_zombie;
    private javax.swing.JList<String> jl_PersonasComidas;
    private javax.swing.JLabel jl_planta_test;
    private javax.swing.JLabel jl_zombie_test;
    private javax.swing.JPanel jp_plantas;
    private javax.swing.JPanel jp_test;
    private javax.swing.JPanel jp_zombies;
    private javax.swing.JSpinner js_altura_planta;
    private javax.swing.JSpinner js_ataque_planta;
    private javax.swing.JSpinner js_dureza_planta;
    private javax.swing.JSpinner js_edad_zombie;
    private javax.swing.JSpinner js_enojo_zombie;
    private javax.swing.JSpinner js_experiencia_zombie;
    private javax.swing.JSpinner js_magnitud_planta;
    private javax.swing.JSpinner js_peso_planta;
    private javax.swing.JSpinner js_tamano_zombie;
    private javax.swing.JSpinner js_vida_planta;
    private javax.swing.JSpinner js_vida_zombie;
    private javax.swing.JTree jt_entidades;
    private javax.swing.JRadioButton rb_rango_alto;
    private javax.swing.JRadioButton rb_rango_bajo;
    private javax.swing.JRadioButton rb_rango_medio;
    private javax.swing.JRadioButton rb_tipo_cargado;
    private javax.swing.JRadioButton rb_tipo_clasico;
    private javax.swing.JRadioButton rb_tipo_defensa;
    private javax.swing.JRadioButton rb_tipo_disparo;
    private javax.swing.JRadioButton rb_tipo_explosiva;
    private javax.swing.JTextField tf_colorBandera_zombie;
    private javax.swing.JTextField tf_color_planta;
    private javax.swing.JTextField tf_direccion_zombie;
    private javax.swing.JTextField tf_nombreProyectil_planta;
    private javax.swing.JTextField tf_nombre_planta;
    private javax.swing.JTextField tf_nombre_zombie;
    private javax.swing.JTextField tf_personaComida;
    // End of variables declaration//GEN-END:variables
}
