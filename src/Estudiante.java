/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jocab
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jocab
 */

public class Estudiante {


    public static final double MAX_PRACTICAS = 40;
    public static final double MAX_PARCIALES = 20;
    public static final double MAX_ASIGNACIONES = 20;
    public static final double MAX_EXAMEN_FINAL = 20;


    public static final double NOTA_MINIMA_APROBACION = 60;

    private String nombreCompleto;
    private String matricula;
    private String carrera;
    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examenFinal;

    public Estudiante(String nombreCompleto, String matricula, String carrera,
                      double practicas, double parciales,
                      double asignaciones, double examenFinal) {
        this.nombreCompleto = nombreCompleto;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public String getMatricula() {
        return matricula;
    }


    public String getCarrera() {
        return carrera;
    }

 
    public double getPracticas() {
        return practicas;
    }

    
    public double getParciales() {
        return parciales;
    }


    public double getAsignaciones() {
        return asignaciones;
    }

    
    public double getExamenFinal() {
        return examenFinal;
    }

    public double calcularNotaTotal() {
        return practicas + parciales + asignaciones + examenFinal;
    }

  
    public boolean estaAprobado() {
        return calcularNotaTotal() >= NOTA_MINIMA_APROBACION;
    }
}