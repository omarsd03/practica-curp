/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacurp;

import Componentes.MisComponentes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class Ventana {
    
    static JLabel lblNombre, lblApaterno, lblAmaterno, lblEstado, lblGenero, lblNacimiento, lblCurp;
    static JTextField txtNombre, txtApaterno, txtAmaterno, txtNacimiento;
    static JComboBox cbEstados;
    static JRadioButton radioH, radioM;
    static ButtonGroup bgGenero;
    static JButton btnGenerarCurp;
    
    Ventana() {
        
        JFrame f = new JFrame("Consulta tu CURP");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblNombre = c.getLabel("Nombre: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblNombre, restricciones);
        
        p.add(lblNombre);
        
        txtNombre = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtNombre, restricciones);
        
        p.add(txtNombre);
        
        lblApaterno = c.getLabel("Apellido Paterno: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblApaterno, restricciones);
        
        p.add(lblApaterno);
        
        txtApaterno = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtApaterno, restricciones);
        
        p.add(txtApaterno);
        
        lblAmaterno = c.getLabel("Apellido Materno: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblAmaterno, restricciones);
        
        p.add(lblAmaterno);
        
        txtAmaterno = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtAmaterno, restricciones);
        
        p.add(txtAmaterno);
        
        lblEstado = c.getLabel("Estado: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblEstado, restricciones);
        
        p.add(lblEstado);
        
        cbEstados = new JComboBox();
        
        cbEstados.addItem("--- Seleccione un estado ---");
        cbEstados.addItem("AGUASCALIENTES");
        cbEstados.addItem("BAJA CALIFORNIA");
        cbEstados.addItem("BAJA CALIFORNIA SUR");
        cbEstados.addItem("CAMPECHE");
        cbEstados.addItem("CHIAPAS");
        cbEstados.addItem("CHIHUAHUA");
        cbEstados.addItem("COAHUILA");
        cbEstados.addItem("COLIMA");
        cbEstados.addItem("CIUDAD");
        cbEstados.addItem("DURANGO");
        cbEstados.addItem("GUANAJUATO");
        cbEstados.addItem("GUERRERO");
        cbEstados.addItem("HIDALGO");
        cbEstados.addItem("JALISCO");
        cbEstados.addItem("ESTADO");
        cbEstados.addItem("MICHOACAN");
        cbEstados.addItem("MORELOS");
        cbEstados.addItem("NAYARIT");
        cbEstados.addItem("NUEVO");
        cbEstados.addItem("OAXACA");
        cbEstados.addItem("PUEBLA");
        cbEstados.addItem("QUERETARO");
        cbEstados.addItem("QUINTANA");
        cbEstados.addItem("SAN");
        cbEstados.addItem("SINALOA");
        cbEstados.addItem("SONORA");
        cbEstados.addItem("TABASCO");
        cbEstados.addItem("TAMAULIPAS");
        cbEstados.addItem("TLAXCALA");
        cbEstados.addItem("VERACRUZ");
        cbEstados.addItem("YUCATAN");
        cbEstados.addItem("ZACATECAS");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(cbEstados, restricciones);
        
        p.add(cbEstados);
        
        lblGenero = c.getLabel("Genero: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblGenero, restricciones);
        
        p.add(lblGenero);
        
        bgGenero = new ButtonGroup();
        
        radioH = new JRadioButton("Hombre");
        radioH.setActionCommand("H");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(radioH, restricciones);
        
        bgGenero.add(radioH);
        p.add(radioH);
        
        radioM = new JRadioButton("Mujer");
        radioM.setActionCommand("M");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(radioM, restricciones);
        
        bgGenero.add(radioM);
        p.add(radioM);
        
        lblNacimiento = c.getLabel("Nacimiento: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblNacimiento, restricciones);
        
        p.add(lblNacimiento);
        
        txtNacimiento = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtNacimiento, restricciones);
        
        p.add(txtNacimiento);
        
        btnGenerarCurp = c.getButton("Obtiene Curp");
        btnGenerarCurp.addActionListener(new Eventos());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnGenerarCurp, restricciones);
        
        p.add(btnGenerarCurp);
        
        lblCurp = c.getLabel("Tu curp es: ");
        
        restricciones.fill = GridBagConstraints.CENTER;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblCurp, restricciones);
        
        p.add(lblCurp);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
