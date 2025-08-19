package com.example;

public class Main {
    public static void main(String[] args) {

        Profesor prof1 = new Profesor();
        Profesor prof2 = new Profesor("Esther Twigy", "40607080");
        Profesor prof3 = new Profesor("Jaime Florez", "67890430", 2000);
        Profesor prof4 = new Profesor("Carmen Soto", "78934023", 0, 0, false);

        System.out.println("============================= Info profesores==================================");

        prof1.mostrarInformacion();
        prof2.mostrarInformacion();
        prof3.mostrarInformacion();
        prof4.mostrarInformacion();

        System.out.println(
                "================================== Salario Anual y sus respectivos bonos=======================");

        System.out.println(prof3.calcularSalarioAnual());
        System.out.println(prof3.calcularSalarioAnual(4));
        System.out.println(prof3.calcularSalarioAnual(5));

        System.out.println("==================== Carga horaria==========================");

        System.out.println(prof2.evaluarCargaHoraria());
        System.out.println(prof2.evaluarCargaHoraria(20));

        System.out.println("=============Horas anuales======================");

        System.out.println(prof1.calcularHorasAnuales());


        Curso curso1=new Curso("Matemáticas", prof4);


        System.out.println("====================Info curso=================");

        curso1.asignarProfesor(prof4);

        System.out.println("==================Asignación de horas semanales====================");

        prof1.asignarHorasSemanales(35);



    }
}