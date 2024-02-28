package consola;

public class Usuario extends javax.swing.JFrame {

    public Usuario() {
        initComponents();
    }
public class Persona
{
    int cedula;
    String nombre;
    double estatura;
    double edad;
    
    public Persona(int cedula, String nombre, double estatura, double edad)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.estatura=estatura;
        this.edad=edad;
    }
    
    public String GetNombre()
    {
        return nombre;
    }
    
    public int GetCedula()
    {
        return cedula;
    }
    
    public double GetEstatura()
    {
        return estatura;
    }
    
    public double GetEdad()
    {
        return edad;
    }
    
}    

Persona personas[] = new Persona[4]; 
Ordena organizar = new Ordena();
boolean e=false;
boolean ed=false;
boolean burbuja=false;
boolean merge=false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        CrearVector = new javax.swing.JButton();
        Ordenar = new javax.swing.JButton();
        ConfirmaEstatura = new javax.swing.JCheckBox();
        ConfirmaEdad = new javax.swing.JCheckBox();
        ConfirmaBurbuja = new javax.swing.JCheckBox();
        ConfirmaMErge = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaOrganizada = new javax.swing.JTable();
        texto1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Edad", "Estatura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        CrearVector.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CrearVector.setText("Guardar personas");
        CrearVector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearVectorActionPerformed(evt);
            }
        });

        Ordenar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Ordenar.setText("Ordenar");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        ConfirmaEstatura.setText("Estatura");
        ConfirmaEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaEstaturaActionPerformed(evt);
            }
        });

        ConfirmaEdad.setText("Edad");
        ConfirmaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaEdadActionPerformed(evt);
            }
        });

        ConfirmaBurbuja.setText("Burbuja");
        ConfirmaBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaBurbujaActionPerformed(evt);
            }
        });

        ConfirmaMErge.setText("Merge");
        ConfirmaMErge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaMErgeActionPerformed(evt);
            }
        });

        TablaOrganizada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Edad", "Estatura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaOrganizada);

        texto1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        texto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto1.setText("Tabla desorganizada");
        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Tabla organizada");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearVector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaEstatura)
                    .addComponent(ConfirmaEdad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaMErge)
                    .addComponent(ConfirmaBurbuja))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmaEstatura)
                            .addComponent(ConfirmaBurbuja))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmaEdad)
                            .addComponent(ConfirmaMErge)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearVector, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearVectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearVectorActionPerformed

        String texto;
        double altura;
        int c;
        double a;
        for(int i=0; i<4; i++){
        c = (int)Tabla.getValueAt(i, 0);
        
        texto = (String)Tabla.getValueAt(i, 1);
        
        a = (int)Tabla.getValueAt(i, 2);
        
        altura = (double)Tabla.getValueAt(i, 3);
        
        personas[i]= new Persona(c, texto, altura, a);
        }
        
        for(Persona personas1 : personas)
        {
            System.out.println("nombre: "+personas1.GetNombre()+"\n Edad " +personas1.GetEdad()+"\n cedula: "+personas1.GetCedula()+"\n Altura: "+personas1.GetEstatura());
            System.out.println("********************");
        }

    }//GEN-LAST:event_CrearVectorActionPerformed

    private void ConfirmaEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaEstaturaActionPerformed
        e = true;
        ed = false;
    }//GEN-LAST:event_ConfirmaEstaturaActionPerformed

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        if(e==true)
        {
        double[] Vestatura = new double[4];
        for (int i = 0; i < 4; i++) {
            Vestatura[i]=personas[i].estatura;
        }  
        if(burbuja == true)
        {
            organizar.burbuja(Vestatura);
        }
        if(merge == true)
        {
            organizar.mergeSort(Vestatura);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(Vestatura[i]==personas[j].estatura)
                {
                    Persona temp = personas[i];
                    personas[i]=personas[j];
                    personas[j]=temp;
                }
            }
        }  
        }
        if(ed==true)
        {
        double[] Vedad = new double[4];
        for (int i = 0; i < 4; i++) {
            Vedad[i]=personas[i].edad;
        }  
        if(burbuja == true)
        {
            organizar.burbuja(Vedad);
        }
        if(merge == true)
        {
            organizar.mergeSort(Vedad);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(Vedad[i]==personas[j].edad)
                {
                    Persona temp = personas[i];
                    personas[i]=personas[j];
                    personas[j]=temp;
                }
            }
        } 
        }
        
        for (int i = 0; i < 4; i++) {
            TablaOrganizada.setValueAt(personas[i].cedula, i, 0);
            TablaOrganizada.setValueAt(personas[i].nombre, i, 1);
            TablaOrganizada.setValueAt(personas[i].edad, i, 2);
            TablaOrganizada.setValueAt(personas[i].estatura, i, 3);
        }
        
        for(Persona personas1 : personas)
        {
            System.out.println("nombre: "+personas1.GetNombre()+"\n Edad " +personas1.GetEdad()+"\n cedula: "+personas1.GetCedula()+"\n Altura: "+personas1.GetEstatura());
            System.out.println("********************");
        }
        
    }//GEN-LAST:event_OrdenarActionPerformed

    private void ConfirmaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaEdadActionPerformed
        ed = true;
        e = false;
    }//GEN-LAST:event_ConfirmaEdadActionPerformed

    private void ConfirmaBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaBurbujaActionPerformed
        burbuja = true;
        merge = false;
    }//GEN-LAST:event_ConfirmaBurbujaActionPerformed

    private void ConfirmaMErgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaMErgeActionPerformed
        merge = true;
        burbuja = false;
    }//GEN-LAST:event_ConfirmaMErgeActionPerformed

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ConfirmaBurbuja;
    private javax.swing.JCheckBox ConfirmaEdad;
    private javax.swing.JCheckBox ConfirmaEstatura;
    private javax.swing.JCheckBox ConfirmaMErge;
    private javax.swing.JButton CrearVector;
    private javax.swing.JButton Ordenar;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable TablaOrganizada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField texto1;
    // End of variables declaration//GEN-END:variables
}
