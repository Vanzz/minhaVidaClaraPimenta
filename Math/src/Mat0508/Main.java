/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mat0508;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;

/**
 *
 * @author tiagoketzer
 */
public class Main extends javax.swing.JFrame implements ActionListener{

    /*
    final int linha = 4;
    final int coluna = 4;  
    int x1, x2, x3, x4;
    int first = 1;
    int last = coluna;
    final double matrix [][] =  new double[linha][coluna];
    double [] array = {1, 2, 3, 4, 0, -3, -4, -5, 0, 0, -8/3, -10/3, 0, 0, 0, -5/2};
    double [] b = {10, -13, -6.66666, -5};
    */
    
    
    
    double matrix [][] = {
        {3,2,6,18},
        {0,16,12,-55},
        {0,0,-0.75,-12.979167}
    };
//                          {1,2,3,4, 10},
//                          {0, -3, -4, -5, -13},
//                          {0, 0, -2.66666, -3.33333, -6.66666},
//                          {0, 0, 0, -2.5, -5}};
    
    double [] sltn = new double[matrix.length];
    final int buffer = matrix[1].length;
    final int n = matrix.length;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        btnCalcula.setFocusable(true);
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
    }
    
    /*
    public double[][] criarMatrix(){
       int buffer = 0;
       for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < matrix[i].length; j++){
               matrix[i][j] = array[buffer++];
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println("");
       }
       return matrix;
    }
    */
    
    public int conta(double matrix[][]) {
        
        for(int x = 0; x < matrix.length; x++){
           for(int y = 0; y < matrix[x].length; y++){
               //System.out.print(matrix[x][y]+" ");
           }
           //System.out.println("");
        }
           
        //sltn[n - 1] = matrix[3][matrix[1].length - 1]/(matrix[n - 1][n - 1]);
        
        for(int i = n - 1; i != -1; i--){
            if (i == (n - 1)) {
                sltn[i] = (matrix[i][buffer - 1]) / matrix[i][i];
            } else {
                sltn[i] = (matrix[i][buffer - 1] - somatoria(i)) / matrix[i][i];
            }
        }
        
        for(int i = 0; i < n; i++){
             //System.out.println(sltn[i]);
        }
        
        return 0;
    }
    
    public double somatoria(int i){
        double somatoria = 0;
        for(int j = i + 1; j != n; j++){
                somatoria += (matrix[i][j])*sltn[j];
        }
        return somatoria;
    }
    
    public void doMeth() {
        conta(matrix);
        
        resultadoTxt.setText(""+sltn[0]);
        resultadoTxt1.setText(""+sltn[1]);
        resultadoTxt2.setText(""+sltn[2]);
        resultadoTxt3.setText(""+sltn[3]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        btnCalcula = new javax.swing.JButton();
        resultadoTxt = new javax.swing.JTextField();
        resultadoTxt1 = new javax.swing.JTextField();
        resultadoTxt2 = new javax.swing.JTextField();
        resultadoTxt3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 140)); // NOI18N
        jLabel1.setText("]");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 140)); // NOI18N
        jLabel2.setText("[");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jTextField1.setText("0");
        jTextField1.setFocusable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jTextField2.setText("-5");
        jTextField2.setFocusable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jTextField3.setText("-20/3");
        jTextField3.setFocusable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jTextField4.setText("-13");
        jTextField4.setFocusable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jTextField5.setText("10");
        jTextField5.setFocusable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jTextField6.setText("4");
        jTextField6.setFocusable(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jTextField7.setText("3");
        jTextField7.setFocusable(false);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jTextField8.setText("2");
        jTextField8.setFocusable(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jTextField9.setText("1");
        jTextField9.setFocusable(false);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jTextField10.setText("-5");
        jTextField10.setFocusable(false);
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jTextField11.setText("-4");
        jTextField11.setFocusable(false);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jTextField12.setText("-3");
        jTextField12.setFocusable(false);
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jTextField13.setText("0");
        jTextField13.setFocusable(false);
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jTextField14.setText("0");
        jTextField14.setFocusable(false);
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jTextField15.setText("0");
        jTextField15.setFocusable(false);
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jTextField16.setText("-8/3");
        jTextField16.setFocusable(false);
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jTextField17.setText("-10/3");
        jTextField17.setFocusable(false);
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jTextField18.setText("-5/2");
        jTextField18.setToolTipText("");
        jTextField18.setFocusable(false);
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jTextField19.setText("0");
        jTextField19.setFocusable(false);
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jTextField20.setText("0");
        jTextField20.setFocusable(false);
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        btnCalcula.setText("Calcular");
        btnCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        resultadoTxt.setText("Resultado");
        resultadoTxt.setFocusable(false);
        getContentPane().add(resultadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        resultadoTxt1.setText("Resultado");
        resultadoTxt1.setFocusable(false);
        getContentPane().add(resultadoTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        resultadoTxt2.setText("Resultado");
        resultadoTxt2.setFocusable(false);
        getContentPane().add(resultadoTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        resultadoTxt3.setText("Resultado");
        resultadoTxt3.setFocusable(false);
        getContentPane().add(resultadoTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel3.setText("x4");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel4.setText("x1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel5.setText("x2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel6.setText("x3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed
        doMeth();
    }//GEN-LAST:event_btnCalculaActionPerformed

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
    private javax.swing.JButton btnCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField resultadoTxt;
    private javax.swing.JTextField resultadoTxt1;
    private javax.swing.JTextField resultadoTxt2;
    private javax.swing.JTextField resultadoTxt3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btnCalcula)
        doMeth();
    }
}
