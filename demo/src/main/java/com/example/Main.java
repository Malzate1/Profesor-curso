package com.example;

public class Main {
    public static void main(String[] args) {

        Profesor prof1 = new Profesor();
        Profesor prof2 = new Profesor("Esther Twigy", "40607080");
        Profesor prof3 = new Profesor("Jaime Florez", "67890430", 2000);
        Profesor prof4 = new Profesor("Carmen Soto", "78934023", 0, 0, false);



        prof1.mostrarInformacion();
        prof2.mostrarInformacion();
        prof3.mostrarInformacion();
        prof4.mostrarInformacion();
    

        prof2.calcularSalarioAnual();
        prof2.calcularSalarioAnual(4);
        prof2.calcularSalarioAnual(5000);

    }
}