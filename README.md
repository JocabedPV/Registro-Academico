# Registro Académico

Aplicación de escritorio en Java Swing que captura los datos personales de un estudiante y sus calificaciones, calcula la nota total y muestra si **aprobó** (≥ 60) o **reprobó**.

## Estructura

```
src/
├── Estudiante.java            // Clase POO (datos y lógica)
├── RegistroAcademicoGUI.java  // Interfaz Swing
└── Main.java                  // Punto de entrada
```

## Calificación

| Categoría    | Máximo |
|--------------|--------|
| Prácticas    | 40     |
| Parciales    | 20     |
| Asignaciones | 20     |
| Examen Final | 20     |

## Validación

- Nombre, matrícula y carrera no pueden estar vacíos.
- Las notas deben ser números entre 0 y su máximo.
- Si hay un error, se muestra un mensaje.

## Ejecución

Requiere Java JDK instalado.

```
cd src
javac *.java
java Main
```

También se puede abrir en NetBeans o IntelliJ y ejecutar `Main.java`.

## Capturas

Agregar aquí las capturas (datos ingresados, APROBADO, REPROBADO y error).

## Autor

Jocabed
