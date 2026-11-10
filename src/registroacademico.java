/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jocab
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class registroacademico extends JFrame implements ActionListener {

    private JTextField txtNombre = new JTextField();
    private JTextField txtMatricula = new JTextField();
    private JTextField txtCarrera = new JTextField();
    private JTextField txtPracticas = new JTextField();
    private JTextField txtParciales = new JTextField();
    private JTextField txtAsignaciones = new JTextField();
    private JTextField txtExamen = new JTextField();
    private JButton btnCalcular = new JButton("Calcular Resultado");
    private JLabel lblNota = new JLabel("Nota total: ", SwingConstants.CENTER);
    private JLabel lblResultado = new JLabel("", SwingConstants.CENTER);


    public registroacademico() {
        setTitle("Registro Académico");
        setSize(400, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2, 5, 5));

        add(new JLabel("Nombre completo:"));
        add(txtNombre);
        add(new JLabel("Matrícula:"));
        add(txtMatricula);
        add(new JLabel("Carrera:"));
        add(txtCarrera);
        add(new JLabel("Prácticas (0-40):"));
        add(txtPracticas);
        add(new JLabel("Parciales (0-20):"));
        add(txtParciales);
        add(new JLabel("Asignaciones (0-20):"));
        add(txtAsignaciones);
        add(new JLabel("Examen Final (0-20):"));
        add(txtExamen);
        add(btnCalcular);
        add(new JLabel(""));
        add(lblNota);
        add(lblResultado);

        btnCalcular.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (txtNombre.getText().trim().isEmpty()
                || txtMatricula.getText().trim().isEmpty()
                || txtCarrera.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete nombre, matrícula y carrera.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
    
            double practicas = leerNota(txtPracticas, 40);
            double parciales = leerNota(txtParciales, 20);
            double asignaciones = leerNota(txtAsignaciones, 20);
            double examen = leerNota(txtExamen, 20);

      
            Estudiante est = new Estudiante(txtNombre.getText().trim(),
                    txtMatricula.getText().trim(), txtCarrera.getText().trim(),
                    practicas, parciales, asignaciones, examen);

            lblNota.setText("Nota total: " + est.calcularNotaTotal());

            if (est.estaAprobado()) {
                lblResultado.setText("APROBADO");
                lblResultado.setForeground(Color.GREEN.darker());
            } else {
                lblResultado.setText("REPROBADO");
                lblResultado.setForeground(Color.RED);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Las notas deben ser números válidos dentro de su rango (0 hasta el máximo).",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

 
    private double leerNota(JTextField campo, double maximo) {
        double valor = Double.parseDouble(campo.getText().trim());
        if (valor < 0 || valor > maximo) {
            throw new NumberFormatException("Fuera de rango");
        }
        return valor;
    }
}