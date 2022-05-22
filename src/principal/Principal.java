package principal;

import model.Gorila;
import model.Mamifero;

public class Principal {
    public static void main(String[] args) {
        System.out.println("principal class working!!");

        Mamifero m = new Mamifero();
        m.setNivelDeEnergia(500);

        Gorila gorila = new Gorila();
        gorila.setNivelDeEnergia(200);
        gorila.lanzarAlgo();
        gorila.lanzarAlgo();
        gorila.lanzarAlgo();
        gorila.comerBananas();
        gorila.comerBananas();
        gorila.escalar();
        gorila.mostrarEnergia();
        gorila.lanzarAlgo();
        gorila.lanzarAlgo();
        gorila.lanzarAlgo();
        gorila.mostrarEnergia();
    }
}
