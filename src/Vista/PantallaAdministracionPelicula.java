
package Vista;
//se usa la biblioteca JOptionPane para imprimir un mensaje y para agregar un icono
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;

import java.util.List;

//importamos las clases
import Clases.Pelicula;
import Clases.Genero;
import Clases.Calificacion;
import Clases.PaisDeOrigen;
import Clases.Personaje;
import Cine.controller.GestorPelicula;


import java.awt.event.WindowEvent;


//biblioteca de sonido
import java.applet.AudioClip;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
/**
 *
 * @author luciano
 */



public final class PantallaAdministracionPelicula extends javax.swing.JFrame {
    private final List<Genero> generos;
    private final List<Calificacion> calificaciones;
    private final List<PaisDeOrigen> paises;
    
    private List<Personaje> personajes;
    
    private final GestorPelicula gestor;
    
    public void transparenteboton () {
       salir.setOpaque(false);
       salir.setContentAreaFilled(false);
       salir.setBorderPainted(false);
       registrar.setOpaque(false);
       registrar.setContentAreaFilled(false);
       registrar.setBorderPainted(false);
        
    }
    
   
    
    
    public PantallaAdministracionPelicula (List<Genero> generos, List<Calificacion> calificaciones, List<PaisDeOrigen> paises, GestorPelicula gestor) {
        this.generos = generos;
        this.calificaciones = calificaciones;
        this.paises = paises;
        this.gestor = gestor;
       
        initComponents();
        transparenteboton ();
        validacion1.setVisible(false);
        validacion2.setVisible(false);
        validacion3.setVisible(false); 
        validacion4.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setSize(850, 489);
        this.setTitle("CINE");
        this.setLocationRelativeTo(PantallaAdministracionPelicula.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        //DIMENSIONES DE LA VENTANA Y CENTRAR
        
         //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato =new SimpleDateFormat("dd MMMMM YYYY");
        fecha.setText(formato.format(sistFecha));
        
        //HORA DEL SISTEMA
        Timer tiempo =new Timer(100, new PantallaAdministracionPelicula.horas());
        tiempo.start();
        
    }

    class horas implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e){
            Date sistHora=new Date();
            String pmAm="hh:mm:ss a";
            SimpleDateFormat format=new SimpleDateFormat(pmAm);
            Calendar hoy=Calendar.getInstance();
            hora.setText(String.format(format.format(sistHora),hoy));
            
                  
        }
        
        
    }
        
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        selGenero = new javax.swing.JComboBox<>();
        selCalificación = new javax.swing.JComboBox<>();
        selPais = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registrar = new javax.swing.JToggleButton();
        radioSiDisponible = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTituloOriginal = new javax.swing.JTextField();
        txtAnioEstreno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        validacion2 = new javax.swing.JLabel();
        validacion3 = new javax.swing.JLabel();
        validacion4 = new javax.swing.JLabel();
        validacion1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        gif = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textnombreFocusLost(evt);
            }
        });
        textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombreActionPerformed(evt);
            }
        });
        textnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textnombreKeyPressed(evt);
            }
        });
        getContentPane().add(textnombre);
        textnombre.setBounds(140, 33, 630, 20);

        jLabel1.setText("INGRESE EL NOMBRE:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 36, 130, 14);

        selGenero.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        selGenero.setModel(new javax.swing.DefaultComboBoxModel(generos.toArray()));
        selGenero.setToolTipText("");
        selGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(selGenero);
        selGenero.setBounds(70, 110, 180, 19);

        selCalificación.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        selCalificación.setModel(new javax.swing.DefaultComboBoxModel(calificaciones.toArray()));
        selCalificación.setToolTipText("");
        selCalificación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selCalificación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selCalificaciónActionPerformed(evt);
            }
        });
        getContentPane().add(selCalificación);
        selCalificación.setBounds(360, 110, 180, 19);

        selPais.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        selPais.setModel(new javax.swing.DefaultComboBoxModel(paises.toArray()));
        selPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(selPais);
        selPais.setBounds(660, 110, 180, 19);

        jLabel3.setText("GENÉRO :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 110, 60, 20);

        jLabel4.setText("CALIFICACIÓN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 110, 80, 20);

        jLabel5.setText("PAÍS DE ORIGEN :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 110, 100, 20);

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_registrar.jpg"))); // NOI18N
        registrar.setBorder(null);
        registrar.setBorderPainted(false);
        registrar.setContentAreaFilled(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrar.setIconTextGap(-5);
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(140, 380, 170, 50);

        radioSiDisponible.setText("SI");
        radioSiDisponible.setBorder(null);
        radioSiDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiDisponibleActionPerformed(evt);
            }
        });
        getContentPane().add(radioSiDisponible);
        radioSiDisponible.setBounds(440, 390, 40, 20);

        jRadioButton2.setText("NO");
        jRadioButton2.setInheritsPopupMenu(true);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(490, 390, 50, 20);
        jRadioButton2.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setText("DISPONIBLE :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 390, 80, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 152, 830, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 80, 830, 11);

        jLabel7.setText("DURACION (MINUTOS) :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 210, 140, 14);

        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDuracion);
        txtDuracion.setBounds(200, 210, 250, 20);

        jLabel8.setText("TITULO ORIGINAL :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 240, 140, 14);

        txtTituloOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloOriginalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTituloOriginal);
        txtTituloOriginal.setBounds(200, 240, 250, 20);

        txtAnioEstreno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioEstrenoKeyTyped(evt);
            }
        });
        getContentPane().add(txtAnioEstreno);
        txtAnioEstreno.setBounds(200, 270, 250, 20);

        jLabel9.setText("AÑO DE ESTRENO :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 270, 150, 14);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 320, 830, 2);

        validacion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        validacion2.setText("*");
        getContentPane().add(validacion2);
        validacion2.setBounds(470, 210, 9, 17);

        validacion3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        validacion3.setText("*");
        getContentPane().add(validacion3);
        validacion3.setBounds(470, 240, 30, 20);

        validacion4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        validacion4.setText("*");
        getContentPane().add(validacion4);
        validacion4.setBounds(470, 270, 30, 20);

        validacion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        validacion1.setText("*");
        getContentPane().add(validacion1);
        validacion1.setBounds(800, 40, 9, 17);

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setDefaultCapable(false);
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(750, 390, 80, 70);

        jLabel11.setText("REGISTRAR ELENCO:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 390, 130, 20);

        jLabel10.setText("seleccione los siguientes datos");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 80, 210, 14);

        jLabel12.setText("ingrese los datos restantes");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 160, 210, 14);

        aceptar.setBackground(new java.awt.Color(255, 255, 255));
        aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.jpg"))); // NOI18N
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar);
        aceptar.setBounds(550, 380, 160, 50);

        fecha.setText("fecha");
        getContentPane().add(fecha);
        fecha.setBounds(10, 10, 100, 14);

        hora.setText("hora");
        getContentPane().add(hora);
        hora.setBounds(120, 10, 80, 14);

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cine.gif"))); // NOI18N
        gif.setText("jLabel14");
        getContentPane().add(gif);
        gif.setBounds(-30, 100, 260, 240);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocine.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 850, 490);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 210, 73, 23);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 850, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void textnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnombreActionPerformed

    private void selGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selGeneroActionPerformed

    private void radioSiDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSiDisponibleActionPerformed

    private void selCalificaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selCalificaciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selCalificaciónActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtTituloOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloOriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloOriginalActionPerformed

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
     
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        char  c =evt.getKeyChar();
        
        if (c<'0' || c >'9' )evt.consume();
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtAnioEstrenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioEstrenoKeyTyped
       char  c =evt.getKeyChar();
        
        if (c<'0' || c >'9' )evt.consume();
    }//GEN-LAST:event_txtAnioEstrenoKeyTyped

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
       personajes = gestor.obtenerElenco();
        
        JOptionPane.showMessageDialog(null, "Se ha registrado el elenco: " + personajes.get(0));
    }//GEN-LAST:event_registrarMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
       
    }//GEN-LAST:event_salirMouseClicked

    private void textnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnombreKeyPressed

    private void textnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textnombreFocusLost
      if (gestor.buscarPelicula(textnombre.getText())) {
            JOptionPane.showMessageDialog(null, "Ya existe una Película con ese nombre");
      }
    }//GEN-LAST:event_textnombreFocusLost

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
         AudioClip Cin ;
          Cin = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Click.wav"));  
          Cin.play();
        // validamos los datos minimos
        if (textnombre.getText().isEmpty() || txtAnioEstreno.getText().isEmpty() ||
            txtDuracion.getText().isEmpty() || txtTituloOriginal.getText().isEmpty( )) {
            
            validacion1.setVisible(true);
            validacion2.setVisible(true);
            validacion3.setVisible(true); 
            validacion4.setVisible(true);
            
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS (*)");
        }
         else {
            if (gestor.buscarPelicula(textnombre.getText())) {
                JOptionPane.showMessageDialog(null, "Ya existe una Película con ese nombre");
            }
           else {
              
                int anioEstreno = Integer.parseInt(txtAnioEstreno.getText());
                boolean disponible = radioSiDisponible.isSelected();
                int duracion = Integer.parseInt(txtDuracion.getText());
                String nombre = textnombre.getText();
                String tituloOriginal = txtTituloOriginal.getText();
        
                //creamos la instancia de una nueva pelicula
                Pelicula nueva = new Pelicula(anioEstreno, disponible, duracion, nombre, tituloOriginal );
                nueva.setGenero((Genero) selGenero.getSelectedItem());
                nueva.setCalificacion((Calificacion) selCalificación.getSelectedItem());
                nueva.setPaisDeOrigen((PaisDeOrigen) selPais.getSelectedItem());
                nueva.setPersonajes(personajes);

                // delegamos al gestor 
                gestor.guardarPelicula(nueva);
                
                // notificamos al usuario
                JOptionPane.showMessageDialog(null, " La Película " + nueva.getNombre() + " ha sido agregada con éxito");
            }
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton radioSiDisponible;
    private javax.swing.JToggleButton registrar;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> selCalificación;
    private javax.swing.JComboBox<String> selGenero;
    private javax.swing.JComboBox<String> selPais;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField txtAnioEstreno;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtTituloOriginal;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    private javax.swing.JLabel validacion3;
    private javax.swing.JLabel validacion4;
    // End of variables declaration//GEN-END:variables
   }


    
    
    
           
            
              
   
   
    
  
