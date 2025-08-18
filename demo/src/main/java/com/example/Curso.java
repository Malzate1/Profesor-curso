package com.example;

public class Curso {

    private String nombreCurso;
    private Profesor profesorAsignado;

    public Curso(String nombreCurso, Profesor profesorAsignado) {
        this.nombreCurso = nombreCurso;
        this.profesorAsignado = profesorAsignado;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public void asignarProfesor(Profesor profesor) {

        this.profesorAsignado = profesor;
        System.out.println("El profesor " + profesor.getNombre() + "dictará la clase de " + this.nombreCurso);
    }

    public void mostrarInformacionCurso() {

        System.out.println("Curso: " + nombreCurso);

        if (profesorAsignado != null) {
            System.out.println("Profesor asigando= " + profesorAsignado.getNombre());
        }else{
            System.out.println("No hay profesor asignado aún. ");
        }
    }

}
