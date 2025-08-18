package com.example;

public class Profesor {

    private String nombre;
    private String numeroIdentificacion;
    private double salarioMensual;
    private int horasSemanales;
    private boolean esTiempoCompleto;


    public Profesor(String nombre, String numeroIdentificacion, double salarioMensual, int horasSemanales,
            boolean esTiempoCompleto) {

        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.salarioMensual = salarioMensual;
        this.horasSemanales = horasSemanales;
        this.esTiempoCompleto = esTiempoCompleto;

    }

    public Profesor(String nombre, String numeroIdentificacion, double salarioMensual) {

        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.salarioMensual = salarioMensual;
        this.horasSemanales = 20;
        this.esTiempoCompleto = false;

    }

    public Profesor() {

        this.nombre = "sin nombre";
        this.numeroIdentificacion = "sin identificacion";
        this.salarioMensual = 0.0;
        this.horasSemanales = 0;
        this.esTiempoCompleto = false;

    }

    public Profesor(String nombre, String numeroIdentificacion) {

        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.salarioMensual = 0.0;
        this.horasSemanales = 10;
        this.esTiempoCompleto = false;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            System.out.println("El salario no puede ser negativo. Se le asignará 0.0");
            this.salarioMensual = 0.0;
        } else {
            this.salarioMensual = salarioMensual;
        }
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        if (horasSemanales > 40) {
            System.out.println("El máximo de horas por semana es de 40.");
            this.horasSemanales = 40;
        } else if (horasSemanales < 0) {
            System.out.println("El rango de horas no puede ser negativo. Se le asignará 0 HRS. ");
            this.horasSemanales = 0;
        } else {
            this.horasSemanales = horasSemanales;
            System.out.println("El total de horas semanales es de: " + horasSemanales);
        }
    }

    public boolean isEsTiempoCompleto() {
        return esTiempoCompleto;
    }

    public void setEsTiempoCompleto(boolean esTiempoCompleto) {
        this.esTiempoCompleto = esTiempoCompleto;
    }

    

    public void mostrarInformacion() {

        System.out.println("Nombre del profesor: " + nombre);
        System.out.println("Número de identificación: " + numeroIdentificacion);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Horas semanales laboradas: " + horasSemanales);
        System.out.println("Jornada de tiempo completo: " + esTiempoCompleto);
    }

    public double calcularSalarioAnual() {

        return salarioMensual * 12;
    }

    public double calcularSalarioAnual(double bonoAnual) {

        return (salarioMensual * 12) + bonoAnual;
    }

    public double calcularSalarioAnual(int meses) {

        return salarioMensual * meses;
    }

    public void asignarHorasSemanales(int horas) {

        if (horas > 40) {
            System.out.println("El máximo de horas por semana es de 40.");
            this.horasSemanales = 40;
        } else if (horas < 0) {
            System.out.println("El rango de horas no puede ser negativo. Se le asignará 0 HRS. ");
            this.horasSemanales = 0;
        } else {
            this.horasSemanales = horas;
            System.out.println("El total de horas semanales es de: " + horas);
        }

    }

    public String evaluarCargaHoraria() {
        return horasSemanales <= 20 ? "Carga normal" : "Carga Alta";
    }

    public String evaluarCargaHoraria(int limiteHoras) {
        return horasSemanales <= limiteHoras ? "Carga normal" : "Carga Alta";
    }

    public void asignarCurso(Curso curso) {

        curso.asignarProfesor(this);

    }

    public int calcularHorasAnuales() {

        return horasSemanales * 40;
    }

}
