package model;

public class Gorila extends Mamifero{
    // Atributos

    // Metodos o Funciones
    public void lanzarAlgo() {
        System.out.println("Lanzando...");
        this.nivelDeEnergia -= 5;
    }

    public void comerBananas() {
        System.out.println("Delicious...");
        this.nivelDeEnergia += 10;
    }

    public void escalar() {
        System.out.println("Escalando...");
        this.nivelDeEnergia -= 10;
    }
}
