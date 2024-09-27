package ig;

import metodos.CrearMatrizAleatoria;

public class VentanaPractica11 extends javax.swing.JFrame {

    public VentanaPractica11() {
        initComponents();
        setTitle("Practica 11");
        setResizable(false);
        setLocationRelativeTo(null);
        jTextAreaMatriz.setEditable(false);
        jTextAreaFilasSuma.setEditable(false);
        jTextAreaFilasPromedio.setEditable(false);
        jTextAreaColumnas.setEditable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        verMatriz();
    }
    private void verMatriz(){
        CrearMatrizAleatoria matriz = new CrearMatrizAleatoria();
        matriz.generaMatrizAleatoria();
        matriz.imprimirMatriz(jTextAreaMatriz);
        matriz.imprimirSumaFilas(jTextAreaFilasSuma);
        matriz.imprimirPromedioFilas(jTextAreaFilasPromedio);
        matriz.imprimirSumaColumnas(jTextAreaColumnas);
        matriz.imprimirPromedioColumnas(jTextAreaColumnas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMatriz = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaColumnas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaFilasPromedio = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaFilasSuma = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaMatriz.setColumns(20);
        jTextAreaMatriz.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMatriz);

        jTextAreaColumnas.setColumns(20);
        jTextAreaColumnas.setRows(5);
        jScrollPane2.setViewportView(jTextAreaColumnas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextAreaFilasPromedio.setColumns(20);
        jTextAreaFilasPromedio.setRows(5);
        jScrollPane3.setViewportView(jTextAreaFilasPromedio);

        jTextAreaFilasSuma.setColumns(20);
        jTextAreaFilasSuma.setRows(5);
        jScrollPane4.setViewportView(jTextAreaFilasSuma);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaColumnas;
    private javax.swing.JTextArea jTextAreaFilasPromedio;
    private javax.swing.JTextArea jTextAreaFilasSuma;
    private javax.swing.JTextArea jTextAreaMatriz;
    // End of variables declaration//GEN-END:variables
}
