package model;

public class Mamifero {
    public int nivelDeEnergia;

    public int getNivelDeEnergia() {
        return this.nivelDeEnergia;
    }
    public void setNivelDeEnergia(int nivele) {
        this.nivelDeEnergia = nivele;
        mostrarEnergia();
    }
    public void mostrarEnergia() {
        System.out.println("El nivel de Energia es: "+getNivelDeEnergia());
    }
}
