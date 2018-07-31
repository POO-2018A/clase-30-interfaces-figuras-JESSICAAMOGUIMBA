
package interfaces;

public class PrincipalFiguras extends javax.swing.JFrame {

    /**
     * Creates new form VentanaFiguras
     */
    public PrincipalFiguras() {
        initComponents();
        this.setTitle("***  FIGURAS  ***");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbxFiguras = new javax.swing.JComboBox<>();
        lblElijaFigura = new javax.swing.JLabel();
        panelCuadrado = new javax.swing.JPanel();
        lblLadoCuadrado = new javax.swing.JLabel();
        txtLadoCuadrado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelRectangulo = new javax.swing.JPanel();
        lblLadoA = new javax.swing.JLabel();
        lblLadoB = new javax.swing.JLabel();
        txtLadoARectangulo = new javax.swing.JTextField();
        txtLadoBRectangulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelTriangulo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblBaseTriangulo = new javax.swing.JLabel();
        lblAlturaTriangulo = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        txtAlturaTriangulo = new javax.swing.JTextField();
        lblResultadoArea = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        panelCirculo = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblResultadoPerimetro = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbxFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo" }));
        cmbxFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxFigurasActionPerformed(evt);
            }
        });

        lblElijaFigura.setText("Elija la Figura :");

        panelCuadrado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLadoCuadrado.setText("Lado");

        jLabel3.setText("CUADRADO");

        javax.swing.GroupLayout panelCuadradoLayout = new javax.swing.GroupLayout(panelCuadrado);
        panelCuadrado.setLayout(panelCuadradoLayout);
        panelCuadradoLayout.setHorizontalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLadoCuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panelCuadradoLayout.setVerticalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLadoCuadrado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRectangulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLadoA.setText("Lado a");

        lblLadoB.setText("Lado b");

        txtLadoBRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoBRectanguloActionPerformed(evt);
            }
        });

        jLabel4.setText("RECTANGULO");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLadoB)
                    .addComponent(lblLadoA))
                .addGap(30, 30, 30)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtLadoARectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLadoBRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoA)
                    .addComponent(txtLadoARectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoB)
                    .addComponent(txtLadoBRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelTriangulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("TRIANGULO");

        lblBaseTriangulo.setText("Base");

        lblAlturaTriangulo.setText("Altura");

        javax.swing.GroupLayout panelTrianguloLayout = new javax.swing.GroupLayout(panelTriangulo);
        panelTriangulo.setLayout(panelTrianguloLayout);
        panelTrianguloLayout.setHorizontalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlturaTriangulo)
                    .addComponent(lblBaseTriangulo))
                .addGap(20, 20, 20)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelTrianguloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelTrianguloLayout.setVerticalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseTriangulo)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaTriangulo)
                    .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblResultadoArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        panelCirculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRadio.setText("Radio");

        jLabel5.setText("CIRCULO");

        javax.swing.GroupLayout panelCirculoLayout = new javax.swing.GroupLayout(panelCirculo);
        panelCirculo.setLayout(panelCirculoLayout);
        panelCirculoLayout.setHorizontalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRadio)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5))
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelCirculoLayout.setVerticalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRadio))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        lblResultadoPerimetro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblElijaFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cmbxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(266, 266, 266)
                            .addComponent(btnCalcular))
                        .addComponent(lblResultadoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultadoPerimetro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElijaFigura))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(panelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(36, 36, 36)
                .addComponent(lblResultadoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblResultadoPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxFigurasActionPerformed
     
            panelCirculo.setVisible(true);
            panelTriangulo.setVisible(true);
            panelRectangulo.setVisible(true);
            panelCuadrado.setVisible(true);
        
        
        if(cmbxFiguras.getSelectedItem().equals("Cuadrado")){
            panelCirculo.setVisible(false);
            panelTriangulo.setVisible(false);
            panelRectangulo.setVisible(false);
            
        }else if(cmbxFiguras.getSelectedItem().equals("Rectangulo")){
            panelCirculo.setVisible(false);
            panelTriangulo.setVisible(false);
            panelCuadrado.setVisible(false);
            
        }else if(cmbxFiguras.getSelectedItem().equals("Triangulo")){
            panelRectangulo.setVisible(false);
            panelCirculo.setVisible(false);
            panelCuadrado.setVisible(false);
            
        }else if(cmbxFiguras.getSelectedItem().equals("Circulo")){
            panelRectangulo.setVisible(false);
            panelTriangulo.setVisible(false);
            panelCuadrado.setVisible(false);
            
        }

        
    }//GEN-LAST:event_cmbxFigurasActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
   
        if (cmbxFiguras.getSelectedItem().equals("Cuadrado")) {
            Figura f1 = new Cuadrado();
            double lado = Double.parseDouble(txtLadoCuadrado.getText());
            double cuadrado = f1.calcularArea(lado,0);
            String Cuadrado = String.valueOf(cuadrado);
            lblResultadoArea.setText("El Area del Cuadrado es : "+Cuadrado+ "   m2");
            //perimetero
            double ladoP = Double.parseDouble(txtLadoCuadrado.getText());
            double cuadrado1 = f1.calcularPerimetro(ladoP,0,0);
            String CuadradoP = String.valueOf(cuadrado1);
            lblResultadoPerimetro.setText("El Perimetro del Cuadrado es : "+CuadradoP+ "   m");
            
            
        } else if (cmbxFiguras.getSelectedItem().equals("Rectangulo")) {
            Figura f1 = new Rectangulo();
            double lado1 = Double.parseDouble(txtLadoARectangulo.getText());
            double lado2 = Double.parseDouble(txtLadoBRectangulo.getText());
            double rectangulo = f1.calcularArea(lado1,lado2);
            String Rectangulo = String.valueOf(rectangulo);
            lblResultadoArea.setText("El Area del Rectangulo es : "+Rectangulo+ "   m2");
            //perimetro
            double lado1P = Double.parseDouble(txtLadoARectangulo.getText());
            double lado2P = Double.parseDouble(txtLadoBRectangulo.getText());
            double rectanguloP = f1.calcularPerimetro(lado1P,lado2P,1);
                String RectanguloP = String.valueOf(rectanguloP);
            lblResultadoPerimetro.setText("El Perimetro del Rectangulo es : "+RectanguloP+ "   m");
            
            
        } else if (cmbxFiguras.getSelectedItem().equals("Triangulo")) {
            Figura f1 = new Triangulo();
            double baseT = Double.parseDouble(txtBaseTriangulo.getText());
            double alturaT = Double.parseDouble(txtAlturaTriangulo.getText());
            double triangulo = f1.calcularArea(baseT,alturaT);
            String Triangulo = String.valueOf(triangulo);
            lblResultadoArea.setText("El Area del Triangulo es : "+Triangulo+ "   m2");
            //perimetro
            double base = Double.parseDouble(txtBaseTriangulo.getText());
            double trianguloP = f1.calcularPerimetro(base,base,base);
            String TrianguloP = String.valueOf(trianguloP);
            lblResultadoPerimetro.setText("El Perimetro del Triangulo es : "+TrianguloP+ "   m");
            
            
        } else if (cmbxFiguras.getSelectedItem().equals("Circulo")) {
            Figura f1 = new Circulo();
            double radio = Double.parseDouble(txtRadio.getText());
            double circulo = f1.calcularArea(radio,0);
            String Circulo = String.valueOf(circulo);
            lblResultadoArea.setText("El Area del Circulo es : "+Circulo+ "   m2");
            //perimetro
            double radioP = Double.parseDouble(txtRadio.getText());
            double circuloP = f1.calcularPerimetro(radioP,0,0);
            String CirculoP = String.valueOf(circuloP);
            lblResultadoPerimetro.setText("El Perimetro del Circulo es : "+CirculoP+ "   m");
           
            
        } 
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtLadoBRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoBRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoBRectanguloActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbxFiguras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAlturaTriangulo;
    private javax.swing.JLabel lblBaseTriangulo;
    private javax.swing.JLabel lblElijaFigura;
    private javax.swing.JLabel lblLadoA;
    private javax.swing.JLabel lblLadoB;
    private javax.swing.JLabel lblLadoCuadrado;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblResultadoArea;
    private javax.swing.JLabel lblResultadoPerimetro;
    private javax.swing.JPanel panelCirculo;
    private javax.swing.JPanel panelCuadrado;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JPanel panelTriangulo;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLadoARectangulo;
    private javax.swing.JTextField txtLadoBRectangulo;
    private javax.swing.JTextField txtLadoCuadrado;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
